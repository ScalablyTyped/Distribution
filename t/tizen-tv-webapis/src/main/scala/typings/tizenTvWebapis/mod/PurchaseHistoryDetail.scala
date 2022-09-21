package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchaseHistoryDetail extends StObject {
  
  var InvoiceRefundCount: String
  
  var InvoiceRefundList: String
  
  var SubscriptionCancelCount: String
  
  var SubscriptionCancelList: String
}
object PurchaseHistoryDetail {
  
  inline def apply(
    InvoiceRefundCount: String,
    InvoiceRefundList: String,
    SubscriptionCancelCount: String,
    SubscriptionCancelList: String
  ): PurchaseHistoryDetail = {
    val __obj = js.Dynamic.literal(InvoiceRefundCount = InvoiceRefundCount.asInstanceOf[js.Any], InvoiceRefundList = InvoiceRefundList.asInstanceOf[js.Any], SubscriptionCancelCount = SubscriptionCancelCount.asInstanceOf[js.Any], SubscriptionCancelList = SubscriptionCancelList.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseHistoryDetail]
  }
  
  extension [Self <: PurchaseHistoryDetail](x: Self) {
    
    inline def setInvoiceRefundCount(value: String): Self = StObject.set(x, "InvoiceRefundCount", value.asInstanceOf[js.Any])
    
    inline def setInvoiceRefundList(value: String): Self = StObject.set(x, "InvoiceRefundList", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionCancelCount(value: String): Self = StObject.set(x, "SubscriptionCancelCount", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionCancelList(value: String): Self = StObject.set(x, "SubscriptionCancelList", value.asInstanceOf[js.Any])
  }
}
