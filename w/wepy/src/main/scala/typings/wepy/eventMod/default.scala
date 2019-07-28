package typings.wepy.eventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wepy/event", JSImport.Default)
@js.native
class default protected () extends event {
  def this(name: String, source: js.Any, `type`: js.Any) = this()
  /* CompleteClass */
  override var active: Boolean = js.native
  /* CompleteClass */
  @JSName("$destroy")
  override def $destroy(): Unit = js.native
  /* CompleteClass */
  @JSName("$transfor")
  override def $transfor(wxevent: js.Array[_]): Unit = js.native
}

