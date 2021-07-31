package typings.wonderJs

import typings.std.HTMLElement
import typings.wonderJs.domEventHandlerMod.DomEventHandler
import typings.wonderJs.eventNameHandlerMod.EEventName
import typings.wonderJs.ieventdataMod.IKeyboardEventData
import typings.wonderJs.keyboardEventMod.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyboardEventHandlerMod {
  
  @JSImport("wonder.js/dist/es2015/event/handler/KeyboardEventHandler", "KeyboardEventHandler")
  @js.native
  class KeyboardEventHandler () extends DomEventHandler {
    
    /* protected */ def addEngineHandler(eventName: EEventName, handler: js.Function1[/* event */ KeyboardEvent, Unit]): js.Any = js.native
    
    def on(
      dom: HTMLElement,
      eventName: EEventName,
      handler: js.Function1[/* event */ KeyboardEvent, Unit],
      priority: Double
    ): js.Any = js.native
    def on(eventName: EEventName, handler: js.Function1[/* event */ KeyboardEvent, Unit], priority: Double): js.Any = js.native
    
    /* protected */ def triggerDomEvent(dom: HTMLElement, event: IKeyboardEventData, eventName: EEventName): Unit = js.native
  }
  /* static members */
  object KeyboardEventHandler {
    
    @JSImport("wonder.js/dist/es2015/event/handler/KeyboardEventHandler", "KeyboardEventHandler")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getInstance(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[js.Any]
  }
}
