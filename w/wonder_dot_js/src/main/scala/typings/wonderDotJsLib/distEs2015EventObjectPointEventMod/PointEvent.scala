package typings
package wonderDotJsLib.distEs2015EventObjectPointEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/object/PointEvent", "PointEvent")
@js.native
abstract class PointEvent ()
  extends wonderDotJsLib.distEs2015EventObjectDomEventMod.DomEvent {
  var button: scala.Double | scala.Null = js.native
  var eventObj: wonderDotJsLib.distEs2015EventObjectMouseEventMod.MouseEvent | wonderDotJsLib.distEs2015EventObjectTouchEventMod.TouchEvent = js.native
  @JSName("event")
  var event_PointEvent: wonderDotJsLib.distEs2015EventInterfaceIEventDataMod.IPointEventData = js.native
  var lastX: scala.Double = js.native
  var lastY: scala.Double = js.native
  var location: wonderDotJsLib.distEs2015StructurePointMod.Point = js.native
  var locationInView: wonderDotJsLib.distEs2015StructurePointMod.Point = js.native
  val movementDelta: wonderDotJsLib.distEs2015StructurePointMod.Point = js.native
  val wheel: scala.Double | scala.Null = js.native
  /* protected */ def cloneHelper(eventObj: PointEvent): PointEvent = js.native
  def getDataFromEventObj(eventObj: wonderDotJsLib.distEs2015EventObjectMouseEventMod.MouseEvent): scala.Unit = js.native
  def getDataFromEventObj(eventObj: wonderDotJsLib.distEs2015EventObjectTouchEventMod.TouchEvent): scala.Unit = js.native
}

