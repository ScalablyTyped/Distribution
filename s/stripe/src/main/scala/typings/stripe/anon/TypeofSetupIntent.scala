package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSetupIntent extends StObject {
  
  val LastSetupError: Any
  
  val NextAction: TypeofNextActionVerifyWithMicrodeposits
  
  val PaymentMethodOptions: TypeofPaymentMethodOptionBlik
}
object TypeofSetupIntent {
  
  inline def apply(
    LastSetupError: Any,
    NextAction: TypeofNextActionVerifyWithMicrodeposits,
    PaymentMethodOptions: TypeofPaymentMethodOptionBlik
  ): TypeofSetupIntent = {
    val __obj = js.Dynamic.literal(LastSetupError = LastSetupError.asInstanceOf[js.Any], NextAction = NextAction.asInstanceOf[js.Any], PaymentMethodOptions = PaymentMethodOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSetupIntent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSetupIntent] (val x: Self) extends AnyVal {
    
    inline def setLastSetupError(value: Any): Self = StObject.set(x, "LastSetupError", value.asInstanceOf[js.Any])
    
    inline def setNextAction(value: TypeofNextActionVerifyWithMicrodeposits): Self = StObject.set(x, "NextAction", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodOptions(value: TypeofPaymentMethodOptionBlik): Self = StObject.set(x, "PaymentMethodOptions", value.asInstanceOf[js.Any])
  }
}
