package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionManagement extends StObject {
  
  var serviceInstanceType: String
  
  var url: String
}
object SubscriptionManagement {
  
  @scala.inline
  def apply(serviceInstanceType: String, url: String): SubscriptionManagement = {
    val __obj = js.Dynamic.literal(serviceInstanceType = serviceInstanceType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionManagement]
  }
  
  @scala.inline
  implicit class SubscriptionManagementMutableBuilder[Self <: SubscriptionManagement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceInstanceType(value: String): Self = StObject.set(x, "serviceInstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
