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
  
  /* 0 */ val normal: normal with scala.Double = js.native
  /* 1 */ val null_ : null_ with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.CaretType with scala.Double] = js.native
}

