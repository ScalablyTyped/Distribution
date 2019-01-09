package typings
package vorpalLib.vorpalMod.VorpalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UI extends js.Object {
  @JSName("redraw")
  var redraw_Original: vorpalLib.Anon_Clear = js.native
  def cancel(): scala.Unit = js.native
  def delimiter(): java.lang.String = js.native
  def delimiter(text: java.lang.String): java.lang.String = js.native
  def imprint(): scala.Unit = js.native
  def input(): java.lang.String = js.native
  def input(text: java.lang.String): java.lang.String = js.native
  def redraw(text: java.lang.String, texts: java.lang.String*): scala.Unit = js.native
  def submit(command: java.lang.String): java.lang.String = js.native
}

