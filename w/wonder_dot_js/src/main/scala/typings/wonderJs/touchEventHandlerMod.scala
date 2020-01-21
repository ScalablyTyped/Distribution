package typings.wonderJs

import typings.std.HTMLElement
import typings.wonderJs.eventNameHandlerMod.EEventName
import typings.wonderJs.ieventdataMod.ITouchEventData
import typings.wonderJs.pointEventHandlerMod.PointEventHandler
import typings.wonderJs.touchEventMod.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/handler/TouchEventHandler", JSImport.Namespace)
@js.native
object touchEventHandlerMod extends js.Object {
  @js.native
  class TouchEventHandler () extends PointEventHandler {
    /* protected */ def addEngineHandler(eventName: EEventName, handler: js.Function1[/* event */ TouchEvent, Unit]): js.Any = js.native
    /* protected */ def createEventObject(dom: HTMLElement, event: ITouchEventData, eventName: EEventName): TouchEvent = js.native
  }
  
  /* static members */
  @js.native
  object TouchEventHandler extends js.Object {
    def getInstance(): js.Any = js.native
  }
  
}

