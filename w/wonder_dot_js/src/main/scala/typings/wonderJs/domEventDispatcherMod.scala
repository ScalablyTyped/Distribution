package typings.wonderJs

import typings.std.HTMLElement
import typings.wonderJs.eventDispatcherMod.EventDispatcher
import typings.wonderJs.eventMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/dispatcher/DomEventDispatcher", JSImport.Namespace)
@js.native
object domEventDispatcherMod extends js.Object {
  @js.native
  class DomEventDispatcher () extends EventDispatcher {
    def trigger(dom: HTMLElement, event: Event): Unit = js.native
    def trigger(event: Event): Unit = js.native
  }
  
  /* static members */
  @js.native
  object DomEventDispatcher extends js.Object {
    def getInstance(): js.Any = js.native
  }
  
}

