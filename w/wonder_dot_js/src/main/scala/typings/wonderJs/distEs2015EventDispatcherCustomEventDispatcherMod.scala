package typings.wonderJs

import typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject
import typings.wonderJs.distEs2015EventDispatcherEventDispatcherMod.EventDispatcher
import typings.wonderJs.distEs2015EventObjectEventMod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015EventDispatcherCustomEventDispatcherMod {
  
  @JSImport("wonder.js/dist/es2015/event/dispatcher/CustomEventDispatcher", "CustomEventDispatcher")
  @js.native
  open class CustomEventDispatcher () extends EventDispatcher {
    
    def broadcast(target: EntityObject, eventObject: Event): Unit = js.native
    def broadcast(target: EntityObject, eventObject: Event, userData: Any): Unit = js.native
    
    def emit(target: EntityObject, eventObject: Event): Unit = js.native
    def emit(target: EntityObject, eventObject: Event, userData: Any): Unit = js.native
    
    def trigger(event: Event): Boolean = js.native
    def trigger(event: Event, userData: Any): Boolean = js.native
    def trigger(target: EntityObject, event: Event): Boolean = js.native
    def trigger(target: EntityObject, event: Event, notSetTarget: Boolean): Boolean = js.native
    def trigger(target: EntityObject, event: Event, userData: Any): Boolean = js.native
    def trigger(target: EntityObject, event: Event, userData: Any, notSetTarget: Boolean): Boolean = js.native
  }
  /* static members */
  object CustomEventDispatcher {
    
    @JSImport("wonder.js/dist/es2015/event/dispatcher/CustomEventDispatcher", "CustomEventDispatcher")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getInstance(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[Any]
  }
}
