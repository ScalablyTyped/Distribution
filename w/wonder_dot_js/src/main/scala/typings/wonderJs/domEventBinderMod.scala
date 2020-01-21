package typings.wonderJs

import typings.std.HTMLElement
import typings.wonderJs.eventBinderMod.EventBinder
import typings.wonderJs.eventNameHandlerMod.EEventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/binder/DomEventBinder", JSImport.Namespace)
@js.native
object domEventBinderMod extends js.Object {
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
  @js.native
  object DomEventBinder extends js.Object {
    def getInstance(): js.Any = js.native
  }
  
}

