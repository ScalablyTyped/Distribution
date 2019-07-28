package typings.wonderDotJs.distEs2015EventObjectMousePointEventMod

import typings.wonderDotJs.Anon_X
import typings.wonderDotJs.distEs2015EventObjectEventNameHandlerMod.EEventName
import typings.wonderDotJs.distEs2015EventObjectMouseEventMod.MouseEvent
import typings.wonderDotJs.distEs2015EventObjectPointEventMod.PointEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/object/MousePointEvent", "MousePointEvent")
@js.native
class MousePointEvent () extends PointEvent {
  @JSName("button")
  var button_MousePointEvent: Double = js.native
  @JSName("eventObj")
  var eventObj_MousePointEvent: MouseEvent = js.native
  @JSName("movementDelta")
  val movementDelta_MousePointEvent: Anon_X = js.native
  @JSName("wheel")
  val wheel_MousePointEvent: Double = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/event/object/MousePointEvent", "MousePointEvent")
@js.native
object MousePointEvent extends js.Object {
  def create(eventName: EEventName): MousePointEvent = js.native
}

