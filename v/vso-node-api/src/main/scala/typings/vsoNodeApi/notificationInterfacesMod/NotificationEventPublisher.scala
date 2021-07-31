package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationEventPublisher extends StObject {
  
  var id: String
  
  var subscriptionManagementInfo: SubscriptionManagement
  
  var url: String
}
object NotificationEventPublisher {
  
  @scala.inline
  def apply(id: String, subscriptionManagementInfo: SubscriptionManagement, url: String): NotificationEventPublisher = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], subscriptionManagementInfo = subscriptionManagementInfo.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationEventPublisher]
  }
  
  @scala.inline
  implicit class NotificationEventPublisherMutableBuilder[Self <: NotificationEventPublisher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionManagementInfo(value: SubscriptionManagement): Self = StObject.set(x, "subscriptionManagementInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
