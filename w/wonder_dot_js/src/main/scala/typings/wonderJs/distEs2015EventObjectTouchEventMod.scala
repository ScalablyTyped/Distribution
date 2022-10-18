package typings.wonderJs

import typings.wonderJs.anon.X
import typings.wonderJs.distEs2015EventInterfaceIeventdataMod.ITouchData
import typings.wonderJs.distEs2015EventInterfaceIeventdataMod.ITouchEventData
import typings.wonderJs.distEs2015EventObjectDomEventMod.DomEvent
import typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName
import typings.wonderJs.distEs2015StructurePointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015EventObjectTouchEventMod {
  
  @JSImport("wonder.js/dist/es2015/event/object/TouchEvent", "TouchEvent")
  @js.native
  open class TouchEvent protected () extends DomEvent {
    def this(event: Any, eventName: EEventName) = this()
    
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
