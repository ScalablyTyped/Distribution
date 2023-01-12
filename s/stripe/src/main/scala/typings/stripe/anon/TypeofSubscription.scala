package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSubscription extends StObject {
  
  val PauseCollection: Any
  
  val PaymentSettings: TypeofPaymentSettingsPaymentMethodOptionsTypeofPaymentMethodOptionCustomerBalance
  
  val PendingInvoiceItemInterval: Any
}
object TypeofSubscription {
  
  inline def apply(
    PauseCollection: Any,
    PaymentSettings: TypeofPaymentSettingsPaymentMethodOptionsTypeofPaymentMethodOptionCustomerBalance,
    PendingInvoiceItemInterval: Any
  ): TypeofSubscription = {
    val __obj = js.Dynamic.literal(PauseCollection = PauseCollection.asInstanceOf[js.Any], PaymentSettings = PaymentSettings.asInstanceOf[js.Any], PendingInvoiceItemInterval = PendingInvoiceItemInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSubscription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSubscription] (val x: Self) extends AnyVal {
    
    inline def setPauseCollection(value: Any): Self = StObject.set(x, "PauseCollection", value.asInstanceOf[js.Any])
    
    inline def setPaymentSettings(value: TypeofPaymentSettingsPaymentMethodOptionsTypeofPaymentMethodOptionCustomerBalance): Self = StObject.set(x, "PaymentSettings", value.asInstanceOf[js.Any])
    
    inline def setPendingInvoiceItemInterval(value: Any): Self = StObject.set(x, "PendingInvoiceItemInterval", value.asInstanceOf[js.Any])
  }
}
