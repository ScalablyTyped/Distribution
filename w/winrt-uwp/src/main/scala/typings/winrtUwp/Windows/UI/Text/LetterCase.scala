package typings.winrtUwp.Windows.UI.Text

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
  
}

