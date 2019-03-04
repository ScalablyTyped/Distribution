package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationSubscriptionTemplate extends js.Object {
  var description: java.lang.String
  var filter: ISubscriptionFilter
  var id: java.lang.String
  var notificationEventInformation: NotificationEventType
  var `type`: SubscriptionTemplateType
}

object NotificationSubscriptionTemplate {
  @scala.inline
  def apply(
    description: java.lang.String,
    filter: ISubscriptionFilter,
    id: java.lang.String,
    notificationEventInformation: NotificationEventType,
    `type`: SubscriptionTemplateType
  ): NotificationSubscriptionTemplate = {
    val __obj = js.Dynamic.literal(description = description, filter = filter, id = id, notificationEventInformation = notificationEventInformation)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NotificationSubscriptionTemplate]
  }
}

