package typings.wonderJs

import typings.std.HTMLElement
import typings.wonderJs.eventNameHandlerMod.EEventName
import typings.wonderJs.ieventdataMod.ITouchEventData
import typings.wonderJs.pointEventHandlerMod.PointEventHandler
import typings.wonderJs.touchEventMod.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object touchEventHandlerMod {
  
  @JSImport("wonder.js/dist/es2015/event/handler/TouchEventHandler", "TouchEventHandler")
  @js.native
  class TouchEventHandler () extends PointEventHandler {
    
    /* protected */ def addEngineHandler(eventName: EEventName, handler: js.Function1[/* event */ TouchEvent, Unit]): js.Any = js.native
    
    /* protected */ def createEventObject(dom: HTMLElement, event: ITouchEventData, eventName: EEventName): TouchEvent = js.native
  }
  /* static members */
  object TouchEventHandler {
    
    @JSImport("wonder.js/dist/es2015/event/handler/TouchEventHandler", "TouchEventHandler")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getInstance(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[js.Any]
  }
}
