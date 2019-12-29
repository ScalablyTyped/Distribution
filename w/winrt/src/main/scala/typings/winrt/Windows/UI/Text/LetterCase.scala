package typings.winrt.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LetterCase with Double] = js.native
  /* 0 */ @js.native
  object lower extends TopLevel[lower with Double]
  
  /* 1 */ @js.native
  object upper extends TopLevel[upper with Double]
  
}

