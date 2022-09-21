package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPaymentSettingsPaymentMethodOptionsTypeofPaymentMethodOptionCustomerBalance extends StObject {
  
  val PaymentMethodOptions: TypeofPaymentMethodOptionCustomerBalance
}
object TypeofPaymentSettingsPaymentMethodOptionsTypeofPaymentMethodOptionCustomerBalance {
  
  inline def apply(PaymentMethodOptions: TypeofPaymentMethodOptionCustomerBalance): TypeofPaymentSettingsPaymentMethodOptionsTypeofPaymentMethodOptionCustomerBalance = {
    val __obj = js.Dynamic.literal(PaymentMethodOptions = PaymentMethodOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPaymentSettingsPaymentMethodOptionsTypeofPaymentMethodOptionCustomerBalance]
  }
  
  extension [Self <: TypeofPaymentSettingsPaymentMethodOptionsTypeofPaymentMethodOptionCustomerBalance](x: Self) {
    
    inline def setPaymentMethodOptions(value: TypeofPaymentMethodOptionCustomerBalance): Self = StObject.set(x, "PaymentMethodOptions", value.asInstanceOf[js.Any])
  }
}
