package typings.wonderDotJs.distEs2015EventHandlerKeyboardEventHandlerMod

import typings.std.HTMLElement
import typings.wonderDotJs.distEs2015EventHandlerDomEventHandlerMod.DomEventHandler
import typings.wonderDotJs.distEs2015EventInterfaceIEventDataMod.IKeyboardEventData
import typings.wonderDotJs.distEs2015EventObjectEventNameHandlerMod.EEventName
import typings.wonderDotJs.distEs2015EventObjectKeyboardEventMod.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSImport("wonder.js/dist/es2015/event/handler/KeyboardEventHandler", "KeyboardEventHandler")
@js.native
object KeyboardEventHandler extends js.Object {
  def getInstance(): js.Any = js.native
}

