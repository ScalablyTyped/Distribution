package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDestinationPaymentM extends StObject {
  
  val UsBankAccount: Any
}
object TypeofDestinationPaymentM {
  
  inline def apply(UsBankAccount: Any): TypeofDestinationPaymentM = {
    val __obj = js.Dynamic.literal(UsBankAccount = UsBankAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDestinationPaymentM]
  }
  
  extension [Self <: TypeofDestinationPaymentM](x: Self) {
    
    inline def setUsBankAccount(value: Any): Self = StObject.set(x, "UsBankAccount", value.asInstanceOf[js.Any])
  }
}
