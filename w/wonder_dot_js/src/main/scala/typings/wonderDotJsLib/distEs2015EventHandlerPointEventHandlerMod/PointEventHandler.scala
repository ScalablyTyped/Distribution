package typings
package wonderDotJsLib.distEs2015EventHandlerPointEventHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/handler/PointEventHandler", "PointEventHandler")
@js.native
abstract class PointEventHandler ()
  extends wonderDotJsLib.distEs2015EventHandlerDomEventHandlerMod.DomEventHandler {
  /* protected */ def createEventObject(
    dom: stdLib.HTMLElement,
    event: wonderDotJsLib.distEs2015EventInterfaceIEventDataMod.IEventData,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName
  ): wonderDotJsLib.distEs2015EventObjectDomEventMod.DomEvent = js.native
  /* protected */ def handleMove(
    handler: js.Function1[
      /* event */ wonderDotJsLib.distEs2015EventObjectMouseEventMod.MouseEvent | wonderDotJsLib.distEs2015EventObjectTouchEventMod.TouchEvent, 
      scala.Unit
    ]
  ): js.Function2[
    /* event */ wonderDotJsLib.distEs2015EventObjectMouseEventMod.MouseEvent | wonderDotJsLib.distEs2015EventObjectTouchEventMod.TouchEvent, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Hash<any> */ /* eventData */ js.Any, 
    scala.Unit
  ] = js.native
  def on(
    dom: stdLib.HTMLElement,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function1[/* event */ wonderDotJsLib.distEs2015EventObjectDomEventMod.DomEvent, scala.Unit],
    priority: scala.Double
  ): js.Any = js.native
  def on(
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function1[/* event */ wonderDotJsLib.distEs2015EventObjectDomEventMod.DomEvent, scala.Unit],
    priority: scala.Double
  ): js.Any = js.native
}

