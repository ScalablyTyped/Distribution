package typings.wonderJs

import typings.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015EventFactoryEventBinderFactoryMod {
  
  @JSImport("wonder.js/dist/es2015/event/factory/EventBinderFactory", "EventBinderFactory")
  @js.native
  open class EventBinderFactory () extends StObject
  /* static members */
  object EventBinderFactory {
    
    @JSImport("wonder.js/dist/es2015/event/factory/EventBinderFactory", "EventBinderFactory")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createEventBinder(eventName: EEventName): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createEventBinder")(eventName.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
}
