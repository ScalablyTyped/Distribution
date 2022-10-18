package typings.wonderJs

import typings.std.HTMLElement
import typings.wonderJs.distEs2015EventHandlerEventHandlerMod.EventHandler
import typings.wonderJs.distEs2015EventInterfaceIeventdataMod.IEventData
import typings.wonderJs.distEs2015EventObjectEventMod.Event
import typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015EventHandlerDomEventHandlerMod {
  
  /* note: abstract class */ @JSImport("wonder.js/dist/es2015/event/handler/DomEventHandler", "DomEventHandler")
  @js.native
  open class DomEventHandler () extends EventHandler {
    
    /* protected */ def addEngineHandler(eventName: EEventName, handler: js.Function): Any = js.native
    
    /* protected */ def buildDomHandler(dom: HTMLElement, eventName: EEventName): js.Function1[/* event */ Any, Any] = js.native
    
    /* protected */ def clearHandler(): Unit = js.native
    
    /* protected */ def createEventData(): Any = js.native
    
    /* protected */ def getDefaultDom(): HTMLElement = js.native
    
    /* protected */ def handler(dom: HTMLElement, eventName: EEventName, handler: js.Function, priority: Double): Unit = js.native
    
    def off(): Unit = js.native
    def off(dom: HTMLElement, eventName: EEventName): Unit = js.native
    def off(dom: HTMLElement, eventName: EEventName, handler: js.Function): Unit = js.native
    def off(eventName: EEventName): Unit = js.native
    def off(eventName: EEventName, handler: js.Function): Unit = js.native
    
    def trigger(dom: HTMLElement, event: Event): Unit = js.native
    def trigger(event: Event): Unit = js.native
    
    /* protected */ def triggerDomEvent(dom: HTMLElement, event: IEventData, eventName: EEventName): Any = js.native
  }
}
