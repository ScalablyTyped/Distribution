package typings
package winrtLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CaretType extends js.Object

@JSGlobal("Windows.UI.Text.CaretType")
@js.native
object CaretType extends js.Object {
  @js.native
  sealed trait normal
    extends winrtLib.WindowsNs.UINs.TextNs.CaretType
  
  @js.native
  sealed trait null_
    extends winrtLib.WindowsNs.UINs.TextNs.CaretType
  
  val normal: normal with java.lang.String = js.native
  val null_ : null_ with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.CaretType with java.lang.String] = js.native
}

