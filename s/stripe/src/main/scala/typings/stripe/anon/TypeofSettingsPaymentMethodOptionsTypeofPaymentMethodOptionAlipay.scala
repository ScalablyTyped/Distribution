package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSettingsPaymentMethodOptionsTypeofPaymentMethodOptionAlipay extends StObject {
  
  val PaymentMethodOptions: TypeofPaymentMethodOptionAlipay
}
object TypeofSettingsPaymentMethodOptionsTypeofPaymentMethodOptionAlipay {
  
  inline def apply(PaymentMethodOptions: TypeofPaymentMethodOptionAlipay): TypeofSettingsPaymentMethodOptionsTypeofPaymentMethodOptionAlipay = {
    val __obj = js.Dynamic.literal(PaymentMethodOptions = PaymentMethodOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSettingsPaymentMethodOptionsTypeofPaymentMethodOptionAlipay]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSettingsPaymentMethodOptionsTypeofPaymentMethodOptionAlipay] (val x: Self) extends AnyVal {
    
    inline def setPaymentMethodOptions(value: TypeofPaymentMethodOptionAlipay): Self = StObject.set(x, "PaymentMethodOptions", value.asInstanceOf[js.Any])
  }
}
