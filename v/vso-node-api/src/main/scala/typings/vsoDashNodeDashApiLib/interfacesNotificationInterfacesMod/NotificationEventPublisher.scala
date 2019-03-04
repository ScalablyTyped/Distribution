package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationEventPublisher extends js.Object {
  var id: java.lang.String
  var subscriptionManagementInfo: SubscriptionManagement
  var url: java.lang.String
}

object NotificationEventPublisher {
  @scala.inline
  def apply(id: java.lang.String, subscriptionManagementInfo: SubscriptionManagement, url: java.lang.String): NotificationEventPublisher = {
    val __obj = js.Dynamic.literal(id = id, subscriptionManagementInfo = subscriptionManagementInfo, url = url)
  
    __obj.asInstanceOf[NotificationEventPublisher]
  }
}

