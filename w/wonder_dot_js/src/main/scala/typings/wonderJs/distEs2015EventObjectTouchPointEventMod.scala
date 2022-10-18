package typings.wonderJs

import typings.wonderJs.anon.X
import typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName
import typings.wonderJs.distEs2015EventObjectPointEventMod.PointEvent
import typings.wonderJs.distEs2015EventObjectTouchEventMod.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015EventObjectTouchPointEventMod {
  
  @JSImport("wonder.js/dist/es2015/event/object/TouchPointEvent", "TouchPointEvent")
  @js.native
  open class TouchPointEvent protected () extends PointEvent {
    def this(event: Any, eventName: EEventName) = this()
    
    @JSName("button")
    var button_TouchPointEvent: Double = js.native
    
    @JSName("eventObj")
    var eventObj_TouchPointEvent: TouchEvent = js.native
    
    @JSName("movementDelta")
    val movementDelta_TouchPointEvent: X = js.native
  }
  /* static members */
  object TouchPointEvent {
    
    @JSImport("wonder.js/dist/es2015/event/object/TouchPointEvent", "TouchPointEvent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(eventName: EEventName): TouchPointEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(eventName.asInstanceOf[js.Any]).asInstanceOf[TouchPointEvent]
  }
}
