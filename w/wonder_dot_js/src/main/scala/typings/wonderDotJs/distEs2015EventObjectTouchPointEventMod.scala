package typings.wonderDotJs

import typings.wonderDotJs.distEs2015EventObjectEventNameHandlerMod.EEventName
import typings.wonderDotJs.distEs2015EventObjectPointEventMod.PointEvent
import typings.wonderDotJs.distEs2015EventObjectTouchEventMod.TouchEvent
import typings.wonderDotJs.distEs2015EventObjectTouchPointEventMod.TouchPointEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/object/TouchPointEvent", JSImport.Namespace)
@js.native
object distEs2015EventObjectTouchPointEventMod extends js.Object {
  @js.native
  class TouchPointEvent () extends PointEvent {
    @JSName("button")
    var button_TouchPointEvent: Double = js.native
    @JSName("eventObj")
    var eventObj_TouchPointEvent: TouchEvent = js.native
    @JSName("movementDelta")
    val movementDelta_TouchPointEvent: Anon_X = js.native
  }
  
  /* static members */
  @js.native
  object TouchPointEvent extends js.Object {
    def create(eventName: EEventName): TouchPointEvent = js.native
  }
  
}

