package typings.workboxBackgroundSync.queueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueOnSyncEvent extends js.Object {
  var queue: Queue
}

object QueueOnSyncEvent {
  @scala.inline
  def apply(queue: Queue): QueueOnSyncEvent = {
    val __obj = js.Dynamic.literal(queue = queue.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueOnSyncEvent]
  }
}

