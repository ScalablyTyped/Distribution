package typings.wonderJs

import typings.wonderJs.distEs2015EventObjectEeventtypeMod.EEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015EventFactoryEventHandlerFactoryMod {
  
  @JSImport("wonder.js/dist/es2015/event/factory/EventHandlerFactory", "EventHandlerFactory")
  @js.native
  open class EventHandlerFactory () extends StObject
  /* static members */
  object EventHandlerFactory {
    
    @JSImport("wonder.js/dist/es2015/event/factory/EventHandlerFactory", "EventHandlerFactory")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createEventHandler(eventType: EEventType): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createEventHandler")(eventType.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
}
