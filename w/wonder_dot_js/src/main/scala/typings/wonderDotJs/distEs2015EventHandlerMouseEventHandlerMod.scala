package typings.wonderDotJs

import typings.std.HTMLElement
import typings.wonderDotJs.distEs2015EventHandlerPointEventHandlerMod.PointEventHandler
import typings.wonderDotJs.distEs2015EventInterfaceIEventDataMod.IMouseEventData
import typings.wonderDotJs.distEs2015EventObjectEventNameHandlerMod.EEventName
import typings.wonderDotJs.distEs2015EventObjectMouseEventMod.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/handler/MouseEventHandler", JSImport.Namespace)
@js.native
object distEs2015EventHandlerMouseEventHandlerMod extends js.Object {
  @js.native
  class MouseEventHandler () extends PointEventHandler {
    /* protected */ def addEngineHandler(eventName: EEventName, handler: js.Function1[/* event */ MouseEvent, Unit]): js.Any = js.native
    /* protected */ def createEventObject(dom: HTMLElement, event: IMouseEventData, eventName: EEventName): MouseEvent = js.native
  }
  
  /* static members */
  @js.native
  object MouseEventHandler extends js.Object {
    def getInstance(): js.Any = js.native
  }
  
}

