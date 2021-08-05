package typings.wonderJs

import typings.std.HTMLElement
import typings.wonderJs.eventDispatcherMod.EventDispatcher
import typings.wonderJs.eventMod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domEventDispatcherMod {
  
  @JSImport("wonder.js/dist/es2015/event/dispatcher/DomEventDispatcher", "DomEventDispatcher")
  @js.native
  class DomEventDispatcher () extends EventDispatcher {
    
    def trigger(dom: HTMLElement, event: Event): Unit = js.native
    def trigger(event: Event): Unit = js.native
  }
  /* static members */
  object DomEventDispatcher {
    
    @JSImport("wonder.js/dist/es2015/event/dispatcher/DomEventDispatcher", "DomEventDispatcher")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getInstance(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[js.Any]
  }
}
