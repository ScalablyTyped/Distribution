package typings.wonderJs

import typings.std.HTMLElement
import typings.wonderJs.distEs2015EventHandlerPointEventHandlerMod.PointEventHandler
import typings.wonderJs.distEs2015EventInterfaceIeventdataMod.ITouchEventData
import typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName
import typings.wonderJs.distEs2015EventObjectTouchEventMod.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015EventHandlerTouchEventHandlerMod {
  
  @JSImport("wonder.js/dist/es2015/event/handler/TouchEventHandler", "TouchEventHandler")
  @js.native
  open class TouchEventHandler () extends PointEventHandler {
    
    /* protected */ def addEngineHandler(eventName: EEventName, handler: js.Function1[/* event */ TouchEvent, Unit]): Any = js.native
    
    /* protected */ def createEventObject(dom: HTMLElement, event: ITouchEventData, eventName: EEventName): TouchEvent = js.native
  }
  /* static members */
  object TouchEventHandler {
    
    @JSImport("wonder.js/dist/es2015/event/handler/TouchEventHandler", "TouchEventHandler")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getInstance(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[Any]
  }
}
