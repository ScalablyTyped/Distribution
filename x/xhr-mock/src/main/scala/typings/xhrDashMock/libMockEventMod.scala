package typings.xhrDashMock

import typings.std.Element
import typings.std.Event
import typings.std.EventInit
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr-mock/lib/MockEvent", JSImport.Namespace)
@js.native
object libMockEventMod extends js.Object {
  @js.native
  trait MockEvent extends Event {
    @JSName("currentTarget")
    val currentTarget_MockEvent: EventTarget = js.native
    val scoped: Boolean = js.native
    @JSName("srcElement")
    val srcElement_MockEvent: Element | Null = js.native
    @JSName("target")
    val target_MockEvent: EventTarget = js.native
    def deepPath(): js.Array[EventTarget] = js.native
  }
  
  @js.native
  class default protected () extends MockEvent {
    def this(`type`: String) = this()
    def this(`type`: String, eventInitDict: EventInit) = this()
  }
  
}

