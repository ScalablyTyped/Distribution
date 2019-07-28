package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationQueryCondition extends js.Object {
  var eventInitiator: String
  var eventType: String
  var subscriber: String
  var subscriptionId: String
}

object NotificationQueryCondition {
  @scala.inline
  def apply(eventInitiator: String, eventType: String, subscriber: String, subscriptionId: String): NotificationQueryCondition = {
    val __obj = js.Dynamic.literal(eventInitiator = eventInitiator, eventType = eventType, subscriber = subscriber, subscriptionId = subscriptionId)
  
    __obj.asInstanceOf[NotificationQueryCondition]
  }
}

