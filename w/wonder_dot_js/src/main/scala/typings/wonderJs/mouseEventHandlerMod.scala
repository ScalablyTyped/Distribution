package typings.wonderJs

import typings.std.HTMLElement
import typings.wonderJs.eventNameHandlerMod.EEventName
import typings.wonderJs.ieventdataMod.IMouseEventData
import typings.wonderJs.mouseEventMod.MouseEvent
import typings.wonderJs.pointEventHandlerMod.PointEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/handler/MouseEventHandler", JSImport.Namespace)
@js.native
object mouseEventHandlerMod extends js.Object {
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

