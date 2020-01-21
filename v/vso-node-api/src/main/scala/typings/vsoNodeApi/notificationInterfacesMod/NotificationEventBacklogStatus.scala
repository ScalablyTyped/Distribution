package typings.vsoNodeApi.notificationInterfacesMod

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
    val __obj = js.Dynamic.literal(eventBacklogStatus = eventBacklogStatus.asInstanceOf[js.Any], notificationBacklogStatus = notificationBacklogStatus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NotificationEventBacklogStatus]
  }
}

