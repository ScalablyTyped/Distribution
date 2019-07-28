package typings.workboxDashWindow.utilsWorkboxEventMod

import typings.std.Event
import typings.workboxDashWindow.workboxMod.Workbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A minimal `Event` subclass shim.
  * This doesn't *actually* subclass `Event` because not all browsers support
  * constructable `EventTarget`, and using a real `Event` will error.
  */
trait WorkboxEvent extends js.Object {
  /**
    * The original event.
    */
  val originalEvent: Event
  /**
    * The `Workbox` instance.
    */
  val target: Workbox
  /**
    * The event type.
    */
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

