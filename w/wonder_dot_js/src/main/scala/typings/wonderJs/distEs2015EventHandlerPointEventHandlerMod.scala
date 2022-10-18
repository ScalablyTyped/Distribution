package typings.wonderJs

import typings.std.HTMLElement
import typings.wonderJs.distEs2015EventHandlerDomEventHandlerMod.DomEventHandler
import typings.wonderJs.distEs2015EventInterfaceIeventdataMod.IEventData
import typings.wonderJs.distEs2015EventObjectDomEventMod.DomEvent
import typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName
import typings.wonderJs.distEs2015EventObjectMouseEventMod.MouseEvent
import typings.wonderJs.distEs2015EventObjectTouchEventMod.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015EventHandlerPointEventHandlerMod {
  
  /* note: abstract class */ @JSImport("wonder.js/dist/es2015/event/handler/PointEventHandler", "PointEventHandler")
  @js.native
  open class PointEventHandler () extends DomEventHandler {
    
    /* protected */ def createEventObject(dom: HTMLElement, event: IEventData, eventName: EEventName): DomEvent = js.native
    
    /* protected */ def handleMove(handler: js.Function1[/* event */ MouseEvent | TouchEvent, Unit]): js.Function2[
        /* event */ MouseEvent | TouchEvent, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hash<any> */ /* eventData */ Any, 
        Unit
      ] = js.native
    
    def on(
      dom: HTMLElement,
      eventName: EEventName,
      handler: js.Function1[/* event */ DomEvent, Unit],
      priority: Double
    ): Any = js.native
    def on(eventName: EEventName, handler: js.Function1[/* event */ DomEvent, Unit], priority: Double): Any = js.native
  }
}
