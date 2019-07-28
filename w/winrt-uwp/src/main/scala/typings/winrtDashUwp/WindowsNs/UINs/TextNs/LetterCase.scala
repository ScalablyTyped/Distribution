package typings.winrtDashUwp.WindowsNs.UINs.TextNs

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
  sealed trait lower extends LetterCase
  
  /** Uppercase characters. */
  @js.native
  sealed trait upper extends LetterCase
  
  /* 0 */ val lower: typings.winrtDashUwp.WindowsNs.UINs.TextNs.LetterCase.lower with Double = js.native
  /* 1 */ val upper: typings.winrtDashUwp.WindowsNs.UINs.TextNs.LetterCase.upper with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LetterCase with Double] = js.native
}

