package typings
package wonderDotJsLib.distEs2015EventHandlerMouseEventHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/handler/MouseEventHandler", "MouseEventHandler")
@js.native
class MouseEventHandler ()
  extends wonderDotJsLib.distEs2015EventHandlerPointEventHandlerMod.PointEventHandler {
  /* protected */ def addEngineHandler(
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function1[
      /* event */ wonderDotJsLib.distEs2015EventObjectMouseEventMod.MouseEvent, 
      scala.Unit
    ]
  ): js.Any = js.native
  /* protected */ def createEventObject(
    dom: stdLib.HTMLElement,
    event: wonderDotJsLib.distEs2015EventInterfaceIEventDataMod.IMouseEventData,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName
  ): wonderDotJsLib.distEs2015EventObjectMouseEventMod.MouseEvent = js.native
}

@JSImport("wonder.js/dist/es2015/event/handler/MouseEventHandler", "MouseEventHandler")
@js.native
object MouseEventHandler extends js.Object {
  def getInstance(): js.Any = js.native
}

