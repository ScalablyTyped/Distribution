package typings.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationEventPublisher extends js.Object {
  
  var id: String = js.native
  
  var subscriptionManagementInfo: SubscriptionManagement = js.native
  
  var url: String = js.native
}
object NotificationEventPublisher {
  
  @scala.inline
  def apply(id: String, subscriptionManagementInfo: SubscriptionManagement, url: String): NotificationEventPublisher = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], subscriptionManagementInfo = subscriptionManagementInfo.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationEventPublisher]
  }
  
  @scala.inline
  implicit class NotificationEventPublisherOps[Self <: NotificationEventPublisher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionManagementInfo(value: SubscriptionManagement): Self = this.set("subscriptionManagementInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
