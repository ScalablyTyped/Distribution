package typings.wonderDotJs.distEs2015EventObjectPointEventMod

import typings.wonderDotJs.distEs2015EventInterfaceIEventDataMod.IPointEventData
import typings.wonderDotJs.distEs2015EventObjectDomEventMod.DomEvent
import typings.wonderDotJs.distEs2015EventObjectMouseEventMod.MouseEvent
import typings.wonderDotJs.distEs2015EventObjectTouchEventMod.TouchEvent
import typings.wonderDotJs.distEs2015StructurePointMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/object/PointEvent", "PointEvent")
@js.native
abstract class PointEvent () extends DomEvent {
  var button: Double | Null = js.native
  var eventObj: MouseEvent | TouchEvent = js.native
  @JSName("event")
  var event_PointEvent: IPointEventData = js.native
  var lastX: Double = js.native
  var lastY: Double = js.native
  var location: Point = js.native
  var locationInView: Point = js.native
  val movementDelta: Point = js.native
  val wheel: Double | Null = js.native
  /* protected */ def cloneHelper(eventObj: PointEvent): PointEvent = js.native
  def getDataFromEventObj(eventObj: MouseEvent): Unit = js.native
  def getDataFromEventObj(eventObj: TouchEvent): Unit = js.native
}

