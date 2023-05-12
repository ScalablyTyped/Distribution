package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPaymentSettingsPaymentMethodOptionsTypeofPaymentMethodOptionAcssDebitBancontact extends StObject {
  
  val PaymentMethodOptions: TypeofPaymentMethodOptionAcssDebitBancontact
}
object TypeofPaymentSettingsPaymentMethodOptionsTypeofPaymentMethodOptionAcssDebitBancontact {
  
  inline def apply(PaymentMethodOptions: TypeofPaymentMethodOptionAcssDebitBancontact): TypeofPaymentSettingsPaymentMethodOptionsTypeofPaymentMethodOptionAcssDebitBancontact = {
    val __obj = js.Dynamic.literal(PaymentMethodOptions = PaymentMethodOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPaymentSettingsPaymentMethodOptionsTypeofPaymentMethodOptionAcssDebitBancontact]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofPaymentSettingsPaymentMethodOptionsTypeofPaymentMethodOptionAcssDebitBancontact] (val x: Self) extends AnyVal {
    
    inline def setPaymentMethodOptions(value: TypeofPaymentMethodOptionAcssDebitBancontact): Self = StObject.set(x, "PaymentMethodOptions", value.asInstanceOf[js.Any])
  }
}
