package typings.wonderJs

import typings.wonderJs.eventNameHandlerMod.EEventName
import typings.wonderJs.pointEventMod.PointEvent
import typings.wonderJs.touchEventMod.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/object/TouchPointEvent", JSImport.Namespace)
@js.native
object touchPointEventMod extends js.Object {
  @js.native
  class TouchPointEvent () extends PointEvent {
    @JSName("button")
    var button_TouchPointEvent: Double = js.native
    @JSName("eventObj")
    var eventObj_TouchPointEvent: TouchEvent = js.native
    @JSName("movementDelta")
    val movementDelta_TouchPointEvent: AnonX = js.native
  }
  
  /* static members */
  @js.native
  object TouchPointEvent extends js.Object {
    def create(eventName: EEventName): TouchPointEvent = js.native
  }
  
}

