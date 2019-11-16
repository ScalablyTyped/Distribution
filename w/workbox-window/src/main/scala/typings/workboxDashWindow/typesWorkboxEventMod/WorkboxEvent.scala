package typings.workboxDashWindow.typesWorkboxEventMod

import typings.std.Event
import typings.workboxDashWindow.workboxMod.Workbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkboxEvent extends js.Object {
  val originalEvent: Event
  val target: Workbox
  val `type`: String
}

object WorkboxEvent {
  @scala.inline
  def apply(originalEvent: Event, target: Workbox, `type`: String): WorkboxEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WorkboxEvent]
  }
}

