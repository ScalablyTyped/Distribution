package typings.wonderJs

import typings.std.HTMLElement
import typings.wonderJs.eventNameHandlerMod.EEventName
import typings.wonderJs.ieventdataMod.IMouseEventData
import typings.wonderJs.mouseEventMod.MouseEvent
import typings.wonderJs.pointEventHandlerMod.PointEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mouseEventHandlerMod {
  
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
