package typings.workboxDashWindow.workboxMod

import typings.std.Event
import typings.workboxDashWindow.utilsWorkboxEventMod.WorkboxEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkboxMessageEvent extends WorkboxEvent {
  /**
    * The `data` property from the original `message` event.
    */
  val data: js.Any
}

object WorkboxMessageEvent {
  @scala.inline
  def apply(data: js.Any, originalEvent: Event, target: Workbox, `type`: String): WorkboxMessageEvent = {
    val __obj = js.Dynamic.literal(data = data, originalEvent = originalEvent, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WorkboxMessageEvent]
  }
}

