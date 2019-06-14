package typings
package winrtLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LetterCase extends js.Object

@JSGlobal("Windows.UI.Text.LetterCase")
@js.native
object LetterCase extends js.Object {
  @js.native
  sealed trait lower
    extends winrtLib.WindowsNs.UINs.TextNs.LetterCase
  
  @js.native
  sealed trait upper
    extends winrtLib.WindowsNs.UINs.TextNs.LetterCase
  
  /* 0 */ val lower: lower with scala.Double = js.native
  /* 1 */ val upper: upper with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.LetterCase with scala.Double] = js.native
}

