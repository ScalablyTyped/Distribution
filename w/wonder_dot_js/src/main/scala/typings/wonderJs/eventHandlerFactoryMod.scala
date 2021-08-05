package typings.wonderJs

import typings.wonderJs.eeventtypeMod.EEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventHandlerFactoryMod {
  
  @JSImport("wonder.js/dist/es2015/event/factory/EventHandlerFactory", "EventHandlerFactory")
  @js.native
  class EventHandlerFactory () extends StObject
  /* static members */
  object EventHandlerFactory {
    
    @JSImport("wonder.js/dist/es2015/event/factory/EventHandlerFactory", "EventHandlerFactory")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createEventHandler(eventType: EEventType): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createEventHandler")(eventType.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
}
