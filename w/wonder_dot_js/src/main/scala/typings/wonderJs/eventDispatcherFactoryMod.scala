package typings.wonderJs

import typings.wonderJs.eventMod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventDispatcherFactoryMod {
  
  @JSImport("wonder.js/dist/es2015/event/factory/EventDispatcherFactory", "EventDispatcherFactory")
  @js.native
  class EventDispatcherFactory () extends StObject
  /* static members */
  object EventDispatcherFactory {
    
    @JSImport("wonder.js/dist/es2015/event/factory/EventDispatcherFactory", "EventDispatcherFactory")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def createEventDispatcher(event: Event): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createEventDispatcher")(event.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
}
