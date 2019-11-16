package typings.workboxDashWindow.typesWorkboxEventMapMod

import typings.std.Event
import typings.workboxDashWindow.typesWorkboxEventMod.WorkboxEvent
import typings.workboxDashWindow.workboxMod.Workbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkboxMessageEvent extends WorkboxEvent {
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

