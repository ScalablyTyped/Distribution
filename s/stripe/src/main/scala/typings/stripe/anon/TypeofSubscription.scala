package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSubscription extends StObject {
  
  val CancellationDetails: Any
  
  val PauseCollection: Any
  
  val PaymentSettings: TypeofPaymentSettingsPaymentMethodOptionsTypeofPaymentMethodOptionAcssDebitBancontact
  
  val PendingInvoiceItemInterval: Any
  
  val TrialSettings: TypeofTrialSettings
}
object TypeofSubscription {
  
  inline def apply(
    CancellationDetails: Any,
    PauseCollection: Any,
    PaymentSettings: TypeofPaymentSettingsPaymentMethodOptionsTypeofPaymentMethodOptionAcssDebitBancontact,
    PendingInvoiceItemInterval: Any,
    TrialSettings: TypeofTrialSettings
  ): TypeofSubscription = {
    val __obj = js.Dynamic.literal(CancellationDetails = CancellationDetails.asInstanceOf[js.Any], PauseCollection = PauseCollection.asInstanceOf[js.Any], PaymentSettings = PaymentSettings.asInstanceOf[js.Any], PendingInvoiceItemInterval = PendingInvoiceItemInterval.asInstanceOf[js.Any], TrialSettings = TrialSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSubscription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSubscription] (val x: Self) extends AnyVal {
    
    inline def setCancellationDetails(value: Any): Self = StObject.set(x, "CancellationDetails", value.asInstanceOf[js.Any])
    
    inline def setPauseCollection(value: Any): Self = StObject.set(x, "PauseCollection", value.asInstanceOf[js.Any])
    
    inline def setPaymentSettings(value: TypeofPaymentSettingsPaymentMethodOptionsTypeofPaymentMethodOptionAcssDebitBancontact): Self = StObject.set(x, "PaymentSettings", value.asInstanceOf[js.Any])
    
    inline def setPendingInvoiceItemInterval(value: Any): Self = StObject.set(x, "PendingInvoiceItemInterval", value.asInstanceOf[js.Any])
    
    inline def setTrialSettings(value: TypeofTrialSettings): Self = StObject.set(x, "TrialSettings", value.asInstanceOf[js.Any])
  }
}
