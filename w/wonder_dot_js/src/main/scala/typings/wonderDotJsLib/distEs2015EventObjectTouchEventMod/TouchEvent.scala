package typings
package wonderDotJsLib.distEs2015EventObjectTouchEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/object/TouchEvent", "TouchEvent")
@js.native
class TouchEvent ()
  extends wonderDotJsLib.distEs2015EventObjectDomEventMod.DomEvent {
  @JSName("event")
  var event_TouchEvent: wonderDotJsLib.distEs2015EventInterfaceIEventDataMod.ITouchEventData = js.native
  var lastX: scala.Double = js.native
  var lastY: scala.Double = js.native
  var location: wonderDotJsLib.distEs2015StructurePointMod.Point = js.native
  var locationInView: wonderDotJsLib.distEs2015StructurePointMod.Point = js.native
  val movementDelta: wonderDotJsLib.Anon_X = js.native
  val touchData: wonderDotJsLib.distEs2015EventInterfaceIEventDataMod.ITouchData = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/event/object/TouchEvent", "TouchEvent")
@js.native
object TouchEvent extends js.Object {
  def create(
    event: wonderDotJsLib.distEs2015EventInterfaceIEventDataMod.ITouchEventData,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName
  ): wonderDotJsLib.distEs2015EventObjectTouchEventMod.TouchEvent = js.native
}

