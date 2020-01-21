package typings.wonderJs

import typings.std.HTMLElement
import typings.wonderJs.domEventHandlerMod.DomEventHandler
import typings.wonderJs.eventNameHandlerMod.EEventName
import typings.wonderJs.ieventdataMod.IKeyboardEventData
import typings.wonderJs.keyboardEventMod.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/handler/KeyboardEventHandler", JSImport.Namespace)
@js.native
object keyboardEventHandlerMod extends js.Object {
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
  @js.native
  object KeyboardEventHandler extends js.Object {
    def getInstance(): js.Any = js.native
  }
  
}

