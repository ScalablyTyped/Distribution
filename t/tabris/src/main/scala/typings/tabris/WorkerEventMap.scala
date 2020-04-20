package typings.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerEventMap extends js.Object {
  var error: Event
  var message: MessageEvent
  var messageerror: Event
}

object WorkerEventMap {
  @scala.inline
  def apply(error: Event, message: MessageEvent, messageerror: Event): WorkerEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerEventMap]
  }
}

