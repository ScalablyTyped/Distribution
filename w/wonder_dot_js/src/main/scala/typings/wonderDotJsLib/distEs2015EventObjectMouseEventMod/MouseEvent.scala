package typings
package wonderDotJsLib.distEs2015EventObjectMouseEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/object/MouseEvent", "MouseEvent")
@js.native
class MouseEvent ()
  extends wonderDotJsLib.distEs2015EventObjectDomEventMod.DomEvent {
  var button: scala.Double = js.native
  @JSName("event")
  var event_MouseEvent: wonderDotJsLib.distEs2015EventInterfaceIEventDataMod.IMouseEventData = js.native
  var lastX: scala.Double = js.native
  var lastY: scala.Double = js.native
  var location: wonderDotJsLib.distEs2015StructurePointMod.Point = js.native
  var locationInView: wonderDotJsLib.distEs2015StructurePointMod.Point = js.native
  val movementDelta: wonderDotJsLib.Anon_X = js.native
  val wheel: scala.Double = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/event/object/MouseEvent", "MouseEvent")
@js.native
object MouseEvent extends js.Object {
  def create(
    event: wonderDotJsLib.distEs2015EventInterfaceIEventDataMod.IMouseEventData,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName
  ): wonderDotJsLib.distEs2015EventObjectMouseEventMod.MouseEvent = js.native
}

