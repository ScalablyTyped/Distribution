package typings.wonderJs

import typings.std.HTMLElement
import typings.wonderJs.distEs2015EventHandlerPointEventHandlerMod.PointEventHandler
import typings.wonderJs.distEs2015EventInterfaceIeventdataMod.IMouseEventData
import typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName
import typings.wonderJs.distEs2015EventObjectMouseEventMod.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015EventHandlerMouseEventHandlerMod {
  
  @JSImport("wonder.js/dist/es2015/event/handler/MouseEventHandler", "MouseEventHandler")
  @js.native
  open class MouseEventHandler () extends PointEventHandler {
    
    /* protected */ def addEngineHandler(eventName: EEventName, handler: js.Function1[/* event */ MouseEvent, Unit]): Any = js.native
    
    /* protected */ def createEventObject(dom: HTMLElement, event: IMouseEventData, eventName: EEventName): MouseEvent = js.native
  }
  /* static members */
  object MouseEventHandler {
    
    @JSImport("wonder.js/dist/es2015/event/handler/MouseEventHandler", "MouseEventHandler")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getInstance(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[Any]
  }
}
