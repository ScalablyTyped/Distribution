package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSetupIntentUpdatePa extends StObject {
  
  val PaymentMethodData: TypeofPaymentMethodData
  
  val PaymentMethodOptions: TypeofPaymentMethodOptionCard
}
object TypeofSetupIntentUpdatePa {
  
  inline def apply(PaymentMethodData: TypeofPaymentMethodData, PaymentMethodOptions: TypeofPaymentMethodOptionCard): TypeofSetupIntentUpdatePa = {
    val __obj = js.Dynamic.literal(PaymentMethodData = PaymentMethodData.asInstanceOf[js.Any], PaymentMethodOptions = PaymentMethodOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSetupIntentUpdatePa]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSetupIntentUpdatePa] (val x: Self) extends AnyVal {
    
    inline def setPaymentMethodData(value: TypeofPaymentMethodData): Self = StObject.set(x, "PaymentMethodData", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodOptions(value: TypeofPaymentMethodOptionCard): Self = StObject.set(x, "PaymentMethodOptions", value.asInstanceOf[js.Any])
  }
}
