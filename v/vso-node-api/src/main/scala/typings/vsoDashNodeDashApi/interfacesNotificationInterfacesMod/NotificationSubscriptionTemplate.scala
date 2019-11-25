package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationSubscriptionTemplate extends js.Object {
  var description: String
  var filter: ISubscriptionFilter
  var id: String
  var notificationEventInformation: NotificationEventType
  var `type`: SubscriptionTemplateType
}

object NotificationSubscriptionTemplate {
  @scala.inline
  def apply(
    description: String,
    filter: ISubscriptionFilter,
    id: String,
    notificationEventInformation: NotificationEventType,
    `type`: SubscriptionTemplateType
  ): NotificationSubscriptionTemplate = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], notificationEventInformation = notificationEventInformation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationSubscriptionTemplate]
  }
}

