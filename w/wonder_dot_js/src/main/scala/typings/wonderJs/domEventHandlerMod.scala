package typings.wonderJs

import typings.std.HTMLElement
import typings.wonderJs.eventHandlerMod.EventHandler
import typings.wonderJs.eventMod.Event
import typings.wonderJs.eventNameHandlerMod.EEventName
import typings.wonderJs.ieventdataMod.IEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/handler/DomEventHandler", JSImport.Namespace)
@js.native
object domEventHandlerMod extends js.Object {
  @js.native
  abstract class DomEventHandler () extends EventHandler {
    /* protected */ def addEngineHandler(eventName: EEventName, handler: js.Function): js.Any = js.native
    /* protected */ def buildDomHandler(dom: HTMLElement, eventName: EEventName): js.Function1[/* event */ js.Any, _] = js.native
    /* protected */ def clearHandler(): Unit = js.native
    /* protected */ def createEventData(): js.Any = js.native
    /* protected */ def getDefaultDom(): HTMLElement = js.native
    /* protected */ def handler(dom: HTMLElement, eventName: EEventName, handler: js.Function, priority: Double): Unit = js.native
    def off(): Unit = js.native
    def off(dom: HTMLElement, eventName: EEventName): Unit = js.native
    def off(dom: HTMLElement, eventName: EEventName, handler: js.Function): Unit = js.native
    def off(eventName: EEventName): Unit = js.native
    def off(eventName: EEventName, handler: js.Function): Unit = js.native
    def trigger(dom: HTMLElement, event: Event): Unit = js.native
    def trigger(event: Event): Unit = js.native
    /* protected */ def triggerDomEvent(dom: HTMLElement, event: IEventData, eventName: EEventName): js.Any = js.native
  }
  
}

