package typings.wonderJs

import typings.std.HTMLElement
import typings.wonderJs.distEs2015EventHandlerDomEventHandlerMod.DomEventHandler
import typings.wonderJs.distEs2015EventInterfaceIeventdataMod.IKeyboardEventData
import typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName
import typings.wonderJs.distEs2015EventObjectKeyboardEventMod.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015EventHandlerKeyboardEventHandlerMod {
  
  @JSImport("wonder.js/dist/es2015/event/handler/KeyboardEventHandler", "KeyboardEventHandler")
  @js.native
  open class KeyboardEventHandler () extends DomEventHandler {
    
    /* protected */ def addEngineHandler(eventName: EEventName, handler: js.Function1[/* event */ KeyboardEvent, Unit]): Any = js.native
    
    def on(
      dom: HTMLElement,
      eventName: EEventName,
      handler: js.Function1[/* event */ KeyboardEvent, Unit],
      priority: Double
    ): Any = js.native
    def on(eventName: EEventName, handler: js.Function1[/* event */ KeyboardEvent, Unit], priority: Double): Any = js.native
    
    /* protected */ def triggerDomEvent(dom: HTMLElement, event: IKeyboardEventData, eventName: EEventName): Unit = js.native
  }
  /* static members */
  object KeyboardEventHandler {
    
    @JSImport("wonder.js/dist/es2015/event/handler/KeyboardEventHandler", "KeyboardEventHandler")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getInstance(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[Any]
  }
}
