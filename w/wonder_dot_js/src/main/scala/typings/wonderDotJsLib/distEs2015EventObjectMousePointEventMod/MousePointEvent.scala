package typings
package wonderDotJsLib.distEs2015EventObjectMousePointEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/object/MousePointEvent", "MousePointEvent")
@js.native
class MousePointEvent ()
  extends wonderDotJsLib.distEs2015EventObjectPointEventMod.PointEvent {
  @JSName("button")
  var button_MousePointEvent: scala.Double = js.native
  @JSName("eventObj")
  var eventObj_MousePointEvent: wonderDotJsLib.distEs2015EventObjectMouseEventMod.MouseEvent = js.native
  @JSName("movementDelta")
  val movementDelta_MousePointEvent: wonderDotJsLib.Anon_X = js.native
  @JSName("wheel")
  val wheel_MousePointEvent: scala.Double = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/event/object/MousePointEvent", "MousePointEvent")
@js.native
object MousePointEvent extends js.Object {
  def create(eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName): wonderDotJsLib.distEs2015EventObjectMousePointEventMod.MousePointEvent = js.native
}

