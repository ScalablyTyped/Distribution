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
  
  val lower: lower with java.lang.String = js.native
  val upper: upper with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.TextNs.LetterCase with java.lang.String] = js.native
}

