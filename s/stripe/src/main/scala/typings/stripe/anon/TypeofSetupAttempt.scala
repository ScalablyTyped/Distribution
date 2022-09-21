package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSetupAttempt extends StObject {
  
  val PaymentMethodDetails: TypeofPaymentMethodDetailBancontact
  
  val SetupError: Any
}
object TypeofSetupAttempt {
  
  inline def apply(PaymentMethodDetails: TypeofPaymentMethodDetailBancontact, SetupError: Any): TypeofSetupAttempt = {
    val __obj = js.Dynamic.literal(PaymentMethodDetails = PaymentMethodDetails.asInstanceOf[js.Any], SetupError = SetupError.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSetupAttempt]
  }
  
  extension [Self <: TypeofSetupAttempt](x: Self) {
    
    inline def setPaymentMethodDetails(value: TypeofPaymentMethodDetailBancontact): Self = StObject.set(x, "PaymentMethodDetails", value.asInstanceOf[js.Any])
    
    inline def setSetupError(value: Any): Self = StObject.set(x, "SetupError", value.asInstanceOf[js.Any])
  }
}
