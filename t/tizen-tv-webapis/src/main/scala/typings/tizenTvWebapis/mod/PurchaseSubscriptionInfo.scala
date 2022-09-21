package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchaseSubscriptionInfo extends StObject {
  
  var SubsEndTime: String
  
  var SubsStartTime: String
  
  var SubsStatus: String
  
  var SubscriptionId: String
}
object PurchaseSubscriptionInfo {
  
  inline def apply(SubsEndTime: String, SubsStartTime: String, SubsStatus: String, SubscriptionId: String): PurchaseSubscriptionInfo = {
    val __obj = js.Dynamic.literal(SubsEndTime = SubsEndTime.asInstanceOf[js.Any], SubsStartTime = SubsStartTime.asInstanceOf[js.Any], SubsStatus = SubsStatus.asInstanceOf[js.Any], SubscriptionId = SubscriptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseSubscriptionInfo]
  }
  
  extension [Self <: PurchaseSubscriptionInfo](x: Self) {
    
    inline def setSubsEndTime(value: String): Self = StObject.set(x, "SubsEndTime", value.asInstanceOf[js.Any])
    
    inline def setSubsStartTime(value: String): Self = StObject.set(x, "SubsStartTime", value.asInstanceOf[js.Any])
    
    inline def setSubsStatus(value: String): Self = StObject.set(x, "SubsStatus", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionId(value: String): Self = StObject.set(x, "SubscriptionId", value.asInstanceOf[js.Any])
  }
}
