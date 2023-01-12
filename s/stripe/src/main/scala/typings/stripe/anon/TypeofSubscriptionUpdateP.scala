package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSubscriptionUpdateP extends StObject {
  
  val AddInvoiceItem: TypeofAddInvoiceItem
  
  val Item: TypeofItem
  
  val PauseCollection: Any
  
  val PaymentSettings: TypeofPaymentSettingsPaymentMethodOptionsTypeofPaymentMethodOptionUsBankAccount
  
  val PendingInvoiceItemInterval: Any
}
object TypeofSubscriptionUpdateP {
  
  inline def apply(
    AddInvoiceItem: TypeofAddInvoiceItem,
    Item: TypeofItem,
    PauseCollection: Any,
    PaymentSettings: TypeofPaymentSettingsPaymentMethodOptionsTypeofPaymentMethodOptionUsBankAccount,
    PendingInvoiceItemInterval: Any
  ): TypeofSubscriptionUpdateP = {
    val __obj = js.Dynamic.literal(AddInvoiceItem = AddInvoiceItem.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], PauseCollection = PauseCollection.asInstanceOf[js.Any], PaymentSettings = PaymentSettings.asInstanceOf[js.Any], PendingInvoiceItemInterval = PendingInvoiceItemInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSubscriptionUpdateP]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSubscriptionUpdateP] (val x: Self) extends AnyVal {
    
    inline def setAddInvoiceItem(value: TypeofAddInvoiceItem): Self = StObject.set(x, "AddInvoiceItem", value.asInstanceOf[js.Any])
    
    inline def setItem(value: TypeofItem): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setPauseCollection(value: Any): Self = StObject.set(x, "PauseCollection", value.asInstanceOf[js.Any])
    
    inline def setPaymentSettings(value: TypeofPaymentSettingsPaymentMethodOptionsTypeofPaymentMethodOptionUsBankAccount): Self = StObject.set(x, "PaymentSettings", value.asInstanceOf[js.Any])
    
    inline def setPendingInvoiceItemInterval(value: Any): Self = StObject.set(x, "PendingInvoiceItemInterval", value.asInstanceOf[js.Any])
  }
}
