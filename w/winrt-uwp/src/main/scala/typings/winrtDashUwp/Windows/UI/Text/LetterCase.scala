package typings.winrtDashUwp.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.UI.Text.LetterCase.lower
import typings.winrtDashUwp.Windows.UI.Text.LetterCase.upper
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LetterCase with Double] = js.native
  /* 0 */ @js.native
  object lower extends TopLevel[lower with Double]
  
  /* 1 */ @js.native
  object upper extends TopLevel[upper with Double]
  
}

