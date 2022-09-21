package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemDetails extends StObject {
  
  var CurrencyID: String
  
  var ItemID: String
  
  var ItemTitle: String
  
  var ItemType: Double
  
  var Period: Double
  
  var Price: Double
  
  var Seq: Double
  
  var SubscriptionInfo: ProductSubscriptionInfo
}
object ItemDetails {
  
  inline def apply(
    CurrencyID: String,
    ItemID: String,
    ItemTitle: String,
    ItemType: Double,
    Period: Double,
    Price: Double,
    Seq: Double,
    SubscriptionInfo: ProductSubscriptionInfo
  ): ItemDetails = {
    val __obj = js.Dynamic.literal(CurrencyID = CurrencyID.asInstanceOf[js.Any], ItemID = ItemID.asInstanceOf[js.Any], ItemTitle = ItemTitle.asInstanceOf[js.Any], ItemType = ItemType.asInstanceOf[js.Any], Period = Period.asInstanceOf[js.Any], Price = Price.asInstanceOf[js.Any], Seq = Seq.asInstanceOf[js.Any], SubscriptionInfo = SubscriptionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemDetails]
  }
  
  extension [Self <: ItemDetails](x: Self) {
    
    inline def setCurrencyID(value: String): Self = StObject.set(x, "CurrencyID", value.asInstanceOf[js.Any])
    
    inline def setItemID(value: String): Self = StObject.set(x, "ItemID", value.asInstanceOf[js.Any])
    
    inline def setItemTitle(value: String): Self = StObject.set(x, "ItemTitle", value.asInstanceOf[js.Any])
    
    inline def setItemType(value: Double): Self = StObject.set(x, "ItemType", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: Double): Self = StObject.set(x, "Period", value.asInstanceOf[js.Any])
    
    inline def setPrice(value: Double): Self = StObject.set(x, "Price", value.asInstanceOf[js.Any])
    
    inline def setSeq(value: Double): Self = StObject.set(x, "Seq", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionInfo(value: ProductSubscriptionInfo): Self = StObject.set(x, "SubscriptionInfo", value.asInstanceOf[js.Any])
  }
}
