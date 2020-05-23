package typings.wonderJs

import typings.wonderJs.anon.X
import typings.wonderJs.domEventMod.DomEvent
import typings.wonderJs.eventNameHandlerMod.EEventName
import typings.wonderJs.ieventdataMod.ITouchData
import typings.wonderJs.ieventdataMod.ITouchEventData
import typings.wonderJs.pointMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/object/TouchEvent", JSImport.Namespace)
@js.native
object touchEventMod extends js.Object {
  @js.native
  class TouchEvent () extends DomEvent {
    @JSName("event")
    var event_TouchEvent: ITouchEventData = js.native
    var lastX: Double = js.native
    var lastY: Double = js.native
    var location: Point = js.native
    var locationInView: Point = js.native
    val movementDelta: X = js.native
    val touchData: ITouchData = js.native
  }
  
  /* static members */
  @js.native
  object TouchEvent extends js.Object {
    def create(event: ITouchEventData, eventName: EEventName): TouchEvent = js.native
  }
  
}

