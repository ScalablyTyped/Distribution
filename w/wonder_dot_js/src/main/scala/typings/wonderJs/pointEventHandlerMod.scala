package typings.wonderJs

import typings.std.HTMLElement
import typings.wonderJs.domEventHandlerMod.DomEventHandler
import typings.wonderJs.domEventMod.DomEvent
import typings.wonderJs.eventNameHandlerMod.EEventName
import typings.wonderJs.ieventdataMod.IEventData
import typings.wonderJs.mouseEventMod.MouseEvent
import typings.wonderJs.touchEventMod.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointEventHandlerMod {
  
  @JSImport("wonder.js/dist/es2015/event/handler/PointEventHandler", "PointEventHandler")
  @js.native
  abstract class PointEventHandler () extends DomEventHandler {
    
    /* protected */ def createEventObject(dom: HTMLElement, event: IEventData, eventName: EEventName): DomEvent = js.native
    
    /* protected */ def handleMove(handler: js.Function1[/* event */ MouseEvent | TouchEvent, Unit]): js.Function2[
        /* event */ MouseEvent | TouchEvent, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hash<any> */ /* eventData */ js.Any, 
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
