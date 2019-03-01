package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationEventBacklogStatus extends js.Object {
  var eventBacklogStatus: js.Array[EventBacklogStatus]
  var notificationBacklogStatus: js.Array[NotificationBacklogStatus]
}

object NotificationEventBacklogStatus {
  @scala.inline
  def apply(
    eventBacklogStatus: js.Array[EventBacklogStatus],
    notificationBacklogStatus: js.Array[NotificationBacklogStatus]
  ): NotificationEventBacklogStatus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("eventBacklogStatus")(eventBacklogStatus)
    __obj.updateDynamic("notificationBacklogStatus")(notificationBacklogStatus)
    __obj.asInstanceOf[NotificationEventBacklogStatus]
  }
}

