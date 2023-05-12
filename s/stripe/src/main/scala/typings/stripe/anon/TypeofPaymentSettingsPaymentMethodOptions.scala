package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPaymentSettingsPaymentMethodOptions extends StObject {
  
  val PaymentMethodOptions: TypeofPaymentMethodOptionCustomerBalance
}
object TypeofPaymentSettingsPaymentMethodOptions {
  
  inline def apply(PaymentMethodOptions: TypeofPaymentMethodOptionCustomerBalance): TypeofPaymentSettingsPaymentMethodOptions = {
    val __obj = js.Dynamic.literal(PaymentMethodOptions = PaymentMethodOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPaymentSettingsPaymentMethodOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofPaymentSettingsPaymentMethodOptions] (val x: Self) extends AnyVal {
    
    inline def setPaymentMethodOptions(value: TypeofPaymentMethodOptionCustomerBalance): Self = StObject.set(x, "PaymentMethodOptions", value.asInstanceOf[js.Any])
  }
}
