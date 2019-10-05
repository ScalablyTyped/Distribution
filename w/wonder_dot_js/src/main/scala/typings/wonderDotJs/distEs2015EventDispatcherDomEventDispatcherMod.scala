package typings.wonderDotJs

import typings.std.HTMLElement
import typings.wonderDotJs.distEs2015EventDispatcherEventDispatcherMod.EventDispatcher
import typings.wonderDotJs.distEs2015EventObjectEventMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/dispatcher/DomEventDispatcher", JSImport.Namespace)
@js.native
object distEs2015EventDispatcherDomEventDispatcherMod extends js.Object {
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

