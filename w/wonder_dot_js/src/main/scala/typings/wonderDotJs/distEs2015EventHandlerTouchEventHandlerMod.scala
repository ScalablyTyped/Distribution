package typings.wonderDotJs

import typings.std.HTMLElement
import typings.wonderDotJs.distEs2015EventHandlerPointEventHandlerMod.PointEventHandler
import typings.wonderDotJs.distEs2015EventInterfaceIEventDataMod.ITouchEventData
import typings.wonderDotJs.distEs2015EventObjectEventNameHandlerMod.EEventName
import typings.wonderDotJs.distEs2015EventObjectTouchEventMod.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/handler/TouchEventHandler", JSImport.Namespace)
@js.native
object distEs2015EventHandlerTouchEventHandlerMod extends js.Object {
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

