package typings.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationEventBacklogStatus extends js.Object {
  var eventBacklogStatus: js.Array[EventBacklogStatus] = js.native
  var notificationBacklogStatus: js.Array[NotificationBacklogStatus] = js.native
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
  @scala.inline
  implicit class NotificationEventBacklogStatusOps[Self <: NotificationEventBacklogStatus] (val x: Self) extends AnyVal {
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
    def setEventBacklogStatusVarargs(value: EventBacklogStatus*): Self = this.set("eventBacklogStatus", js.Array(value :_*))
    @scala.inline
    def setEventBacklogStatus(value: js.Array[EventBacklogStatus]): Self = this.set("eventBacklogStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotificationBacklogStatusVarargs(value: NotificationBacklogStatus*): Self = this.set("notificationBacklogStatus", js.Array(value :_*))
    @scala.inline
    def setNotificationBacklogStatus(value: js.Array[NotificationBacklogStatus]): Self = this.set("notificationBacklogStatus", value.asInstanceOf[js.Any])
  }
  
}

