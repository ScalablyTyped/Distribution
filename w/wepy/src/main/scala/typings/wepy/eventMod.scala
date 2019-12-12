package typings.wepy

import typings.wepy.eventMod.event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wepy/event", JSImport.Namespace)
@js.native
object eventMod extends js.Object {
  @js.native
  class default protected () extends event {
    def this(name: String, source: js.Any, `type`: js.Any) = this()
  }
  
  @js.native
  trait event extends js.Object {
    var active: Boolean = js.native
    @JSName("$destroy")
    def $destroy(): Unit = js.native
    @JSName("$transfor")
    def $transfor(wxevent: js.Array[_]): Unit = js.native
  }
  
}

