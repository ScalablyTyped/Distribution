package typings
package workboxDashWindowLib.utilsWorkboxEventMod

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
  val originalEvent: stdLib.Event
  /**
    * The `Workbox` instance.
    */
  val target: workboxDashWindowLib.workboxMod.Workbox
  /**
    * The event type.
    */
  val `type`: java.lang.String
}

object WorkboxEvent {
  @scala.inline
  def apply(
    originalEvent: stdLib.Event,
    target: workboxDashWindowLib.workboxMod.Workbox,
    `type`: java.lang.String
  ): WorkboxEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WorkboxEvent]
  }
}

