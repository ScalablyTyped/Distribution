package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSubscriptionCreateP extends StObject {
  
  val AddInvoiceItem: TypeofAddInvoiceItem
  
  val Item: TypeofItem
  
  val PaymentSettings: TypeofPaymentSettingsPaymentMethodOptions
  
  val PendingInvoiceItemInterval: Any
  
  val TrialSettings: TypeofTrialSettings
}
object TypeofSubscriptionCreateP {
  
  inline def apply(
    AddInvoiceItem: TypeofAddInvoiceItem,
    Item: TypeofItem,
    PaymentSettings: TypeofPaymentSettingsPaymentMethodOptions,
    PendingInvoiceItemInterval: Any,
    TrialSettings: TypeofTrialSettings
  ): TypeofSubscriptionCreateP = {
    val __obj = js.Dynamic.literal(AddInvoiceItem = AddInvoiceItem.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], PaymentSettings = PaymentSettings.asInstanceOf[js.Any], PendingInvoiceItemInterval = PendingInvoiceItemInterval.asInstanceOf[js.Any], TrialSettings = TrialSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSubscriptionCreateP]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSubscriptionCreateP] (val x: Self) extends AnyVal {
    
    inline def setAddInvoiceItem(value: TypeofAddInvoiceItem): Self = StObject.set(x, "AddInvoiceItem", value.asInstanceOf[js.Any])
    
    inline def setItem(value: TypeofItem): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setPaymentSettings(value: TypeofPaymentSettingsPaymentMethodOptions): Self = StObject.set(x, "PaymentSettings", value.asInstanceOf[js.Any])
    
    inline def setPendingInvoiceItemInterval(value: Any): Self = StObject.set(x, "PendingInvoiceItemInterval", value.asInstanceOf[js.Any])
    
    inline def setTrialSettings(value: TypeofTrialSettings): Self = StObject.set(x, "TrialSettings", value.asInstanceOf[js.Any])
  }
}
