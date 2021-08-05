package typings.wonderJs

import typings.wonderJs.anon.X
import typings.wonderJs.domEventMod.DomEvent
import typings.wonderJs.eventNameHandlerMod.EEventName
import typings.wonderJs.ieventdataMod.ITouchData
import typings.wonderJs.ieventdataMod.ITouchEventData
import typings.wonderJs.pointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object touchEventMod {
  
  @JSImport("wonder.js/dist/es2015/event/object/TouchEvent", "TouchEvent")
  @js.native
  class TouchEvent protected () extends DomEvent {
    def this(event: js.Any, eventName: EEventName) = this()
    
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
  object TouchEvent {
    
    @JSImport("wonder.js/dist/es2015/event/object/TouchEvent", "TouchEvent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(event: ITouchEventData, eventName: EEventName): TouchEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(event.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[TouchEvent]
  }
}
