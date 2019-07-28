package typings.wonderDotJs.distEs2015EventObjectMouseEventMod

import typings.wonderDotJs.Anon_X
import typings.wonderDotJs.distEs2015EventInterfaceIEventDataMod.IMouseEventData
import typings.wonderDotJs.distEs2015EventObjectDomEventMod.DomEvent
import typings.wonderDotJs.distEs2015EventObjectEventNameHandlerMod.EEventName
import typings.wonderDotJs.distEs2015StructurePointMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/object/MouseEvent", "MouseEvent")
@js.native
class MouseEvent () extends DomEvent {
  var button: Double = js.native
  @JSName("event")
  var event_MouseEvent: IMouseEventData = js.native
  var lastX: Double = js.native
  var lastY: Double = js.native
  var location: Point = js.native
  var locationInView: Point = js.native
  val movementDelta: Anon_X = js.native
  val wheel: Double = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/event/object/MouseEvent", "MouseEvent")
@js.native
object MouseEvent extends js.Object {
  def create(event: IMouseEventData, eventName: EEventName): MouseEvent = js.native
}

