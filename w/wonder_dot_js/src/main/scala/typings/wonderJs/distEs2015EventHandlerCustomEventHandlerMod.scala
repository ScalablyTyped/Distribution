package typings.wonderJs

import typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject
import typings.wonderJs.distEs2015EventHandlerEventHandlerMod.EventHandler
import typings.wonderJs.distEs2015EventObjectEventMod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015EventHandlerCustomEventHandlerMod {
  
  @JSImport("wonder.js/dist/es2015/event/handler/CustomEventHandler", "CustomEventHandler")
  @js.native
  open class CustomEventHandler () extends EventHandler {
    
    def off(eventName: String): Unit = js.native
    def off(eventName: String, handler: js.Function): Unit = js.native
    def off(target: EntityObject, eventName: String, handler: js.Function): Unit = js.native
    def off(uid: Double, eventName: String): Unit = js.native
    
    def on(eventName: String, handler: js.Function, priority: Double): Unit = js.native
    def on(target: EntityObject, eventName: String, handler: js.Function, priority: Double): Unit = js.native
    
    def trigger(event: Event): Boolean = js.native
    def trigger(event: Event, userData: Any): Boolean = js.native
    def trigger(target: EntityObject, event: Event, notSetTarget: Boolean): Boolean = js.native
    def trigger(target: EntityObject, event: Event, userData: Any, notSetTarget: Boolean): Boolean = js.native
  }
  /* static members */
  object CustomEventHandler {
    
    @JSImport("wonder.js/dist/es2015/event/handler/CustomEventHandler", "CustomEventHandler")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getInstance(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[Any]
  }
}
