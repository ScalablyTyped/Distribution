package typings.workboxDashWindow.utilsEventTargetShimMod

import typings.workboxDashWindow.utilsWorkboxEventMod.WorkboxEvent
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
  def addEventListener(`type`: String, listener: EventListenerShim): Unit = js.native
  def dispatchEvent(evt: WorkboxEvent): Unit = js.native
  def removeEventListener(`type`: String, listener: EventListenerShim): Unit = js.native
}

