package typings.wonderJs

import typings.wonderJs.entityObjectMod.EntityObject
import typings.wonderJs.eventHandlerMod.EventHandler
import typings.wonderJs.eventMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/handler/CustomEventHandler", JSImport.Namespace)
@js.native
object customEventHandlerMod extends js.Object {
  @js.native
  class CustomEventHandler () extends EventHandler {
    def off(eventName: String): Unit = js.native
    def off(eventName: String, handler: js.Function): Unit = js.native
    def off(target: EntityObject, eventName: String, handler: js.Function): Unit = js.native
    def off(uid: Double, eventName: String): Unit = js.native
    def on(eventName: String, handler: js.Function, priority: Double): Unit = js.native
    def on(target: EntityObject, eventName: String, handler: js.Function, priority: Double): Unit = js.native
    def trigger(event: Event): Boolean = js.native
    def trigger(event: Event, userData: js.Any): Boolean = js.native
    def trigger(target: EntityObject, event: Event, notSetTarget: Boolean): Boolean = js.native
    def trigger(target: EntityObject, event: Event, userData: js.Any, notSetTarget: Boolean): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object CustomEventHandler extends js.Object {
    def getInstance(): js.Any = js.native
  }
  
}

