package typings
package wonderDotJsLib.distEs2015EventHandlerTouchEventHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/handler/TouchEventHandler", "TouchEventHandler")
@js.native
class TouchEventHandler ()
  extends wonderDotJsLib.distEs2015EventHandlerPointEventHandlerMod.PointEventHandler {
  /* protected */ def addEngineHandler(
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function1[
      /* event */ wonderDotJsLib.distEs2015EventObjectTouchEventMod.TouchEvent, 
      scala.Unit
    ]
  ): js.Any = js.native
  /* protected */ def createEventObject(
    dom: stdLib.HTMLElement,
    event: wonderDotJsLib.distEs2015EventInterfaceIEventDataMod.ITouchEventData,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName
  ): wonderDotJsLib.distEs2015EventObjectTouchEventMod.TouchEvent = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/event/handler/TouchEventHandler", "TouchEventHandler")
@js.native
object TouchEventHandler extends js.Object {
  def getInstance(): js.Any = js.native
}

