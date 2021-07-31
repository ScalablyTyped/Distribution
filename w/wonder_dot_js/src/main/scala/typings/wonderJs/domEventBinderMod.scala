package typings.wonderJs

import typings.std.HTMLElement
import typings.wonderJs.eventBinderMod.EventBinder
import typings.wonderJs.eventNameHandlerMod.EEventName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domEventBinderMod {
  
  @JSImport("wonder.js/dist/es2015/event/binder/DomEventBinder", "DomEventBinder")
  @js.native
  class DomEventBinder () extends EventBinder {
    
    def off(): Unit = js.native
    def off(dom: HTMLElement): Unit = js.native
    def off(dom: HTMLElement, eventName: EEventName): Unit = js.native
    def off(dom: HTMLElement, eventName: EEventName, handler: js.Function): Unit = js.native
    def off(eventName: String): Unit = js.native
    def off(eventName: String, handler: js.Function): Unit = js.native
    def off(eventName: EEventName): Unit = js.native
    def off(eventName: EEventName, handler: js.Function): Unit = js.native
    
    def on(dom: HTMLElement, eventName: String, handler: js.Function): Unit = js.native
    def on(dom: HTMLElement, eventName: String, handler: js.Function, priority: Double): Unit = js.native
    def on(dom: HTMLElement, eventName: EEventName, handler: js.Function): Unit = js.native
    def on(dom: HTMLElement, eventName: EEventName, handler: js.Function, priority: Double): Unit = js.native
    def on(eventName: String, handler: js.Function): Unit = js.native
    def on(eventName: String, handler: js.Function, priority: Double): Unit = js.native
    def on(eventName: EEventName, handler: js.Function): Unit = js.native
    def on(eventName: EEventName, handler: js.Function, priority: Double): Unit = js.native
  }
  /* static members */
  object DomEventBinder {
    
    @JSImport("wonder.js/dist/es2015/event/binder/DomEventBinder", "DomEventBinder")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getInstance(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[js.Any]
  }
}
