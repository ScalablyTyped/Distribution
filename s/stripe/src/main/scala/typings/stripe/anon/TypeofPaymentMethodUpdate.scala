package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPaymentMethodUpdate extends StObject {
  
  val UsBankAccount: Any
}
object TypeofPaymentMethodUpdate {
  
  inline def apply(UsBankAccount: Any): TypeofPaymentMethodUpdate = {
    val __obj = js.Dynamic.literal(UsBankAccount = UsBankAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPaymentMethodUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofPaymentMethodUpdate] (val x: Self) extends AnyVal {
    
    inline def setUsBankAccount(value: Any): Self = StObject.set(x, "UsBankAccount", value.asInstanceOf[js.Any])
  }
}
