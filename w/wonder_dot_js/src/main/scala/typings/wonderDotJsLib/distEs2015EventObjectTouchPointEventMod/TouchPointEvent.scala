package typings
package wonderDotJsLib.distEs2015EventObjectTouchPointEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/object/TouchPointEvent", "TouchPointEvent")
@js.native
class TouchPointEvent ()
  extends wonderDotJsLib.distEs2015EventObjectPointEventMod.PointEvent {
  @JSName("button")
  var button_TouchPointEvent: scala.Double = js.native
  @JSName("eventObj")
  var eventObj_TouchPointEvent: wonderDotJsLib.distEs2015EventObjectTouchEventMod.TouchEvent = js.native
  @JSName("movementDelta")
  val movementDelta_TouchPointEvent: wonderDotJsLib.Anon_X = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/event/object/TouchPointEvent", "TouchPointEvent")
@js.native
object TouchPointEvent extends js.Object {
  def create(eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName): wonderDotJsLib.distEs2015EventObjectTouchPointEventMod.TouchPointEvent = js.native
}

