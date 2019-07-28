package typings.winrt.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LetterCase extends js.Object

@JSGlobal("Windows.UI.Text.LetterCase")
@js.native
object LetterCase extends js.Object {
  @js.native
  sealed trait lower extends LetterCase
  
  @js.native
  sealed trait upper extends LetterCase
  
  /* 0 */ val lower: typings.winrt.WindowsNs.UINs.TextNs.LetterCase.lower with Double = js.native
  /* 1 */ val upper: typings.winrt.WindowsNs.UINs.TextNs.LetterCase.upper with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LetterCase with Double] = js.native
}

