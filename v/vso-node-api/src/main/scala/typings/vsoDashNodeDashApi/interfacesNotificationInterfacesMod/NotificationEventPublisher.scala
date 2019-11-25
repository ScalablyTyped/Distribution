package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationEventPublisher extends js.Object {
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
}

