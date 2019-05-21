package typings
package workboxDashWindowLib.utilsEventTargetShimMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A minimal `EventTarget` shim.
  * This is necessary because not all browsers support constructable
  * `EventTarget`, so using a real `EventTarget` will error.
  */
@JSImport("workbox-window/utils/EventTargetShim", "EventTargetShim")
@js.native
class EventTargetShim () extends js.Object {
  def addEventListener(`type`: java.lang.String, listener: EventListenerShim): scala.Unit = js.native
  def dispatchEvent(evt: workboxDashWindowLib.utilsWorkboxEventMod.WorkboxEvent): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: EventListenerShim): scala.Unit = js.native
}

