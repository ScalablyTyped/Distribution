package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPaymentSettingsPaymentMethodOptionsTypeofPaymentMethodOptionUsBankAccount extends StObject {
  
  val PaymentMethodOptions: TypeofPaymentMethodOptionUsBankAccount
}
object TypeofPaymentSettingsPaymentMethodOptionsTypeofPaymentMethodOptionUsBankAccount {
  
  inline def apply(PaymentMethodOptions: TypeofPaymentMethodOptionUsBankAccount): TypeofPaymentSettingsPaymentMethodOptionsTypeofPaymentMethodOptionUsBankAccount = {
    val __obj = js.Dynamic.literal(PaymentMethodOptions = PaymentMethodOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPaymentSettingsPaymentMethodOptionsTypeofPaymentMethodOptionUsBankAccount]
  }
  
  extension [Self <: TypeofPaymentSettingsPaymentMethodOptionsTypeofPaymentMethodOptionUsBankAccount](x: Self) {
    
    inline def setPaymentMethodOptions(value: TypeofPaymentMethodOptionUsBankAccount): Self = StObject.set(x, "PaymentMethodOptions", value.asInstanceOf[js.Any])
  }
}
