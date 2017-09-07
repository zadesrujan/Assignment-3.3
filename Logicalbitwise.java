package assignment3;
//package : Package is name that organizes a set of related classes and interfaces similar to 
//different folders on my computer
public class Logicalbitwise {
//public : members which can access as public,public members are visible to all other classes.
//class : is a context of java that are used to create objects and to define object data types and methods.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System. out .println( "Logical AND Operator" );
		 //to initialize the values we have to take variables
		        int p =50;//110010
		        int q =60;//111100
		        int r =70;//1000110
		        int s =80;//1010000
		        
		        boolean ans = q>p && q<r && r<s;
		        /* here q is greater than p,
		           and q is less than r,
		           and r is less than s,here exp1,exp2 and exp3 are true so  the statement it is true
		        */
		        System. out .println( " answer is " +ans);
		       
		        boolean ans1 = q<p && q<r && r<s;
		        /* here q is less  than p,
		        and q is less than r,
		        and r is less than s,
		         expression1 false and exp2 and exp3 are true  so the given statement is false
		     */
		        System. out .println( " answer is " +ans1);
		 
		        boolean ans2 = q>p && q>r && r>s;
		        /* here q is greater  than p,
		        and q is greater than r,
		        and r is greater than s,
		         here exp1 is true and exp2,exp3 are false so the statement is false
		     */
		        System. out .println( " answer is " +ans2); 
		              
		        boolean ans3 = q<p && q>r && q<s && r<s;
		        /* here q is less  than p,
		        and q is greater than r,
		        q is less than s,
		        and r is less than s,
		         the given exp1,exp2 are false exp3and exp4 are there is  an error at q<p ,q>r so it is false
		     */
		        System. out .println( " answer is " +ans3);
		 
		        System. out .println("to show bitwise AND operator");
		        /* BITWISE AND OPERATOR*/
		        System. out .println( " answer is "  +(p&q));//here value is zero 
		        System. out .println( " answer is "  +(q&r));//here value is 60
		        System. out .println( " answer is "  +(q&s));/*after calculating the values it becomes 0
		        
		    */
		        System. out .println( " answer is "  +(r&s));
		        /*
		        r=11110
		        s=101000
		         =001000
		         =0010 
		         */
		        
			}

	}


