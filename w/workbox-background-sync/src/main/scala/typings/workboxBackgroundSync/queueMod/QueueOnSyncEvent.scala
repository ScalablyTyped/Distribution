package typings.workboxBackgroundSync.queueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueOnSyncEvent extends js.Object {
  var queue: Queue = js.native
}

object QueueOnSyncEvent {
  @scala.inline
  def apply(queue: Queue): QueueOnSyncEvent = {
    val __obj = js.Dynamic.literal(queue = queue.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueOnSyncEvent]
  }
  @scala.inline
  implicit class QueueOnSyncEventOps[Self <: QueueOnSyncEvent] (val x: Self) extends AnyVal {
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
    def setQueue(value: Queue): Self = this.set("queue", value.asInstanceOf[js.Any])
  }
  
}

