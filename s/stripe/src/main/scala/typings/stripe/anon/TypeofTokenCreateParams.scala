package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTokenCreateParams extends StObject {
  
  val Account: TypeofAccountCompany
  
  val BankAccount: Any
  
  val Person: TypeofPerson
}
object TypeofTokenCreateParams {
  
  inline def apply(Account: TypeofAccountCompany, BankAccount: Any, Person: TypeofPerson): TypeofTokenCreateParams = {
    val __obj = js.Dynamic.literal(Account = Account.asInstanceOf[js.Any], BankAccount = BankAccount.asInstanceOf[js.Any], Person = Person.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTokenCreateParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofTokenCreateParams] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: TypeofAccountCompany): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    inline def setBankAccount(value: Any): Self = StObject.set(x, "BankAccount", value.asInstanceOf[js.Any])
    
    inline def setPerson(value: TypeofPerson): Self = StObject.set(x, "Person", value.asInstanceOf[js.Any])
  }
}
