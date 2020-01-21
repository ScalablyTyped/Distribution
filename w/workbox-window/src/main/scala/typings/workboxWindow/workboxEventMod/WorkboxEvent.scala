package typings.workboxWindow.workboxEventMod

import typings.std.Event_
import typings.workboxWindow.workboxMod.Workbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkboxEvent extends js.Object {
  val originalEvent: Event_
  val target: Workbox
  val `type`: String
}

object WorkboxEvent {
  @scala.inline
  def apply(originalEvent: Event_, target: Workbox, `type`: String): WorkboxEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkboxEvent]
  }
}

