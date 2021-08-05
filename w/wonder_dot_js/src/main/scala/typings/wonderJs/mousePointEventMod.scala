package typings.wonderJs

import typings.wonderJs.anon.X
import typings.wonderJs.eventNameHandlerMod.EEventName
import typings.wonderJs.mouseEventMod.MouseEvent
import typings.wonderJs.pointEventMod.PointEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mousePointEventMod {
  
  @JSImport("wonder.js/dist/es2015/event/object/MousePointEvent", "MousePointEvent")
  @js.native
  class MousePointEvent protected () extends PointEvent {
    def this(event: js.Any, eventName: EEventName) = this()
    
    @JSName("button")
    var button_MousePointEvent: Double = js.native
    
    @JSName("eventObj")
    var eventObj_MousePointEvent: MouseEvent = js.native
    
    @JSName("movementDelta")
    val movementDelta_MousePointEvent: X = js.native
    
    @JSName("wheel")
    val wheel_MousePointEvent: Double = js.native
  }
  /* static members */
  object MousePointEvent {
    
    @JSImport("wonder.js/dist/es2015/event/object/MousePointEvent", "MousePointEvent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(eventName: EEventName): MousePointEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(eventName.asInstanceOf[js.Any]).asInstanceOf[MousePointEvent]
  }
}
