package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvoiceDetails extends StObject {
  
  var AppliedStatus: Boolean
  
  var AppliedTime: String
  
  var CancelStatus: Boolean
  
  var InvoiceID: String
  
  var ItemID: String
  
  var ItemTitle: String
  
  var ItemType: Double
  
  var LimitEndTime: String
  
  var OrderCurrencyID: String
  
  var OrderTime: String
  
  var Period: Double
  
  var Price: Double
  
  var RemainTime: String
  
  var Seq: Double
  
  var SubscriptionInfo: PurchaseSubscriptionInfo
}
object InvoiceDetails {
  
  inline def apply(
    AppliedStatus: Boolean,
    AppliedTime: String,
    CancelStatus: Boolean,
    InvoiceID: String,
    ItemID: String,
    ItemTitle: String,
    ItemType: Double,
    LimitEndTime: String,
    OrderCurrencyID: String,
    OrderTime: String,
    Period: Double,
    Price: Double,
    RemainTime: String,
    Seq: Double,
    SubscriptionInfo: PurchaseSubscriptionInfo
  ): InvoiceDetails = {
    val __obj = js.Dynamic.literal(AppliedStatus = AppliedStatus.asInstanceOf[js.Any], AppliedTime = AppliedTime.asInstanceOf[js.Any], CancelStatus = CancelStatus.asInstanceOf[js.Any], InvoiceID = InvoiceID.asInstanceOf[js.Any], ItemID = ItemID.asInstanceOf[js.Any], ItemTitle = ItemTitle.asInstanceOf[js.Any], ItemType = ItemType.asInstanceOf[js.Any], LimitEndTime = LimitEndTime.asInstanceOf[js.Any], OrderCurrencyID = OrderCurrencyID.asInstanceOf[js.Any], OrderTime = OrderTime.asInstanceOf[js.Any], Period = Period.asInstanceOf[js.Any], Price = Price.asInstanceOf[js.Any], RemainTime = RemainTime.asInstanceOf[js.Any], Seq = Seq.asInstanceOf[js.Any], SubscriptionInfo = SubscriptionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvoiceDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InvoiceDetails] (val x: Self) extends AnyVal {
    
    inline def setAppliedStatus(value: Boolean): Self = StObject.set(x, "AppliedStatus", value.asInstanceOf[js.Any])
    
    inline def setAppliedTime(value: String): Self = StObject.set(x, "AppliedTime", value.asInstanceOf[js.Any])
    
    inline def setCancelStatus(value: Boolean): Self = StObject.set(x, "CancelStatus", value.asInstanceOf[js.Any])
    
    inline def setInvoiceID(value: String): Self = StObject.set(x, "InvoiceID", value.asInstanceOf[js.Any])
    
    inline def setItemID(value: String): Self = StObject.set(x, "ItemID", value.asInstanceOf[js.Any])
    
    inline def setItemTitle(value: String): Self = StObject.set(x, "ItemTitle", value.asInstanceOf[js.Any])
    
    inline def setItemType(value: Double): Self = StObject.set(x, "ItemType", value.asInstanceOf[js.Any])
    
    inline def setLimitEndTime(value: String): Self = StObject.set(x, "LimitEndTime", value.asInstanceOf[js.Any])
    
    inline def setOrderCurrencyID(value: String): Self = StObject.set(x, "OrderCurrencyID", value.asInstanceOf[js.Any])
    
    inline def setOrderTime(value: String): Self = StObject.set(x, "OrderTime", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: Double): Self = StObject.set(x, "Period", value.asInstanceOf[js.Any])
    
    inline def setPrice(value: Double): Self = StObject.set(x, "Price", value.asInstanceOf[js.Any])
    
    inline def setRemainTime(value: String): Self = StObject.set(x, "RemainTime", value.asInstanceOf[js.Any])
    
    inline def setSeq(value: Double): Self = StObject.set(x, "Seq", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionInfo(value: PurchaseSubscriptionInfo): Self = StObject.set(x, "SubscriptionInfo", value.asInstanceOf[js.Any])
  }
}
