package typings.wonderDotJs

import typings.std.HTMLElement
import typings.wonderDotJs.distEs2015EventHandlerDomEventHandlerMod.DomEventHandler
import typings.wonderDotJs.distEs2015EventInterfaceIEventDataMod.IEventData
import typings.wonderDotJs.distEs2015EventObjectDomEventMod.DomEvent
import typings.wonderDotJs.distEs2015EventObjectEventNameHandlerMod.EEventName
import typings.wonderDotJs.distEs2015EventObjectMouseEventMod.MouseEvent
import typings.wonderDotJs.distEs2015EventObjectTouchEventMod.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/handler/PointEventHandler", JSImport.Namespace)
@js.native
object distEs2015EventHandlerPointEventHandlerMod extends js.Object {
  @js.native
  abstract class PointEventHandler () extends DomEventHandler {
    /* protected */ def createEventObject(dom: HTMLElement, event: IEventData, eventName: EEventName): DomEvent = js.native
    /* protected */ def handleMove(handler: js.Function1[/* event */ MouseEvent | TouchEvent, Unit]): js.Function2[
        /* event */ MouseEvent | TouchEvent, 
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Hash<any> */ /* eventData */ js.Any, 
        Unit
      ] = js.native
    def on(
      dom: HTMLElement,
      eventName: EEventName,
      handler: js.Function1[/* event */ DomEvent, Unit],
      priority: Double
    ): js.Any = js.native
    def on(eventName: EEventName, handler: js.Function1[/* event */ DomEvent, Unit], priority: Double): js.Any = js.native
  }
  
}

