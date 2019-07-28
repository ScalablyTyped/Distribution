package typings.wonderDotJs.distEs2015EventHandlerMouseEventHandlerMod

import typings.std.HTMLElement
import typings.wonderDotJs.distEs2015EventHandlerPointEventHandlerMod.PointEventHandler
import typings.wonderDotJs.distEs2015EventInterfaceIEventDataMod.IMouseEventData
import typings.wonderDotJs.distEs2015EventObjectEventNameHandlerMod.EEventName
import typings.wonderDotJs.distEs2015EventObjectMouseEventMod.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/handler/MouseEventHandler", "MouseEventHandler")
@js.native
class MouseEventHandler () extends PointEventHandler {
  /* protected */ def addEngineHandler(eventName: EEventName, handler: js.Function1[/* event */ MouseEvent, Unit]): js.Any = js.native
  /* protected */ def createEventObject(dom: HTMLElement, event: IMouseEventData, eventName: EEventName): MouseEvent = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/event/handler/MouseEventHandler", "MouseEventHandler")
@js.native
object MouseEventHandler extends js.Object {
  def getInstance(): js.Any = js.native
}

