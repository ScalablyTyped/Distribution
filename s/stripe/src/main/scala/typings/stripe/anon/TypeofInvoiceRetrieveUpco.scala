package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofInvoiceRetrieveUpco extends StObject {
  
  val CustomerDetails: TypeofCustomerDetails
  
  val InvoiceItem: TypeofInvoiceItem
  
  val SubscriptionItem: TypeofSubscriptionItem
}
object TypeofInvoiceRetrieveUpco {
  
  inline def apply(
    CustomerDetails: TypeofCustomerDetails,
    InvoiceItem: TypeofInvoiceItem,
    SubscriptionItem: TypeofSubscriptionItem
  ): TypeofInvoiceRetrieveUpco = {
    val __obj = js.Dynamic.literal(CustomerDetails = CustomerDetails.asInstanceOf[js.Any], InvoiceItem = InvoiceItem.asInstanceOf[js.Any], SubscriptionItem = SubscriptionItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofInvoiceRetrieveUpco]
  }
  
  extension [Self <: TypeofInvoiceRetrieveUpco](x: Self) {
    
    inline def setCustomerDetails(value: TypeofCustomerDetails): Self = StObject.set(x, "CustomerDetails", value.asInstanceOf[js.Any])
    
    inline def setInvoiceItem(value: TypeofInvoiceItem): Self = StObject.set(x, "InvoiceItem", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionItem(value: TypeofSubscriptionItem): Self = StObject.set(x, "SubscriptionItem", value.asInstanceOf[js.Any])
  }
}
