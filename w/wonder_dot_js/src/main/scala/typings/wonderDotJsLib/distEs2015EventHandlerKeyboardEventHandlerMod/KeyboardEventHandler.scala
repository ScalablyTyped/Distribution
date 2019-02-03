package typings
package wonderDotJsLib.distEs2015EventHandlerKeyboardEventHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/handler/KeyboardEventHandler", "KeyboardEventHandler")
@js.native
class KeyboardEventHandler ()
  extends wonderDotJsLib.distEs2015EventHandlerDomEventHandlerMod.DomEventHandler {
  /* protected */ def addEngineHandler(
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function1[
      /* event */ wonderDotJsLib.distEs2015EventObjectKeyboardEventMod.KeyboardEvent, 
      scala.Unit
    ]
  ): js.Any = js.native
  def on(
    dom: stdLib.HTMLElement,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function1[
      /* event */ wonderDotJsLib.distEs2015EventObjectKeyboardEventMod.KeyboardEvent, 
      scala.Unit
    ],
    priority: scala.Double
  ): js.Any = js.native
  def on(
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function1[
      /* event */ wonderDotJsLib.distEs2015EventObjectKeyboardEventMod.KeyboardEvent, 
      scala.Unit
    ],
    priority: scala.Double
  ): js.Any = js.native
  /* protected */ def triggerDomEvent(
    dom: stdLib.HTMLElement,
    event: wonderDotJsLib.distEs2015EventInterfaceIEventDataMod.IKeyboardEventData,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName
  ): scala.Unit = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/event/handler/KeyboardEventHandler", "KeyboardEventHandler")
@js.native
object KeyboardEventHandler extends js.Object {
  def getInstance(): js.Any = js.native
}

