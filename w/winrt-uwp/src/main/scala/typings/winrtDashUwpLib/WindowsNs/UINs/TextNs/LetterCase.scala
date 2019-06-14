package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LetterCase extends js.Object

/** Represents the character case formatting. */
@JSGlobal("Windows.UI.Text.LetterCase")
@js.native
object LetterCase extends js.Object {
  /** Lowercase characters. */
  @js.native
  sealed trait lower
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.LetterCase
  
  /** Uppercase characters. */
  @js.native
  sealed trait upper
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.LetterCase
  
  /* 0 */ val lower: lower with scala.Double = js.native
  /* 1 */ val upper: upper with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.TextNs.LetterCase with scala.Double] = js.native
}

