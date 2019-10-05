package typings.wonderDotJs

import typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject
import typings.wonderDotJs.distEs2015EventDispatcherEventDispatcherMod.EventDispatcher
import typings.wonderDotJs.distEs2015EventObjectEventMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/dispatcher/CustomEventDispatcher", JSImport.Namespace)
@js.native
object distEs2015EventDispatcherCustomEventDispatcherMod extends js.Object {
  @js.native
  class CustomEventDispatcher () extends EventDispatcher {
    def broadcast(target: EntityObject, eventObject: Event): Unit = js.native
    def broadcast(target: EntityObject, eventObject: Event, userData: js.Any): Unit = js.native
    def emit(target: EntityObject, eventObject: Event): Unit = js.native
    def emit(target: EntityObject, eventObject: Event, userData: js.Any): Unit = js.native
    def trigger(event: Event): Boolean = js.native
    def trigger(event: Event, userData: js.Any): Boolean = js.native
    def trigger(target: EntityObject, event: Event): Boolean = js.native
    def trigger(target: EntityObject, event: Event, notSetTarget: Boolean): Boolean = js.native
    def trigger(target: EntityObject, event: Event, userData: js.Any): Boolean = js.native
    def trigger(target: EntityObject, event: Event, userData: js.Any, notSetTarget: Boolean): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object CustomEventDispatcher extends js.Object {
    def getInstance(): js.Any = js.native
  }
  
}

