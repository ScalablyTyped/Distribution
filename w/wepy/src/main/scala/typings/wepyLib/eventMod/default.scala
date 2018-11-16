package typings
package wepyLib.eventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wepy/event", JSImport.Default)
@js.native
class default protected () extends event {
  def this(name: java.lang.String, source: js.Any, `type`: js.Any) = this()
  /* CompleteClass */
  override var active: scala.Boolean = js.native
  /* CompleteClass */
  @JSName("$destroy")
  override def $destroy(): scala.Unit = js.native
  /* CompleteClass */
  @JSName("$transfor")
  override def $transfor(wxevent: js.Array[_]): scala.Unit = js.native
}

