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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("filter")(filter)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("notificationEventInformation")(notificationEventInformation)
    __obj.asInstanceOf[NotificationSubscriptionTemplate]
  }
}

