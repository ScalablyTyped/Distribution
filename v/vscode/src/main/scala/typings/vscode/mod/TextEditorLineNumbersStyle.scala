package typings.vscode.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextEditorLineNumbersStyle extends js.Object
@JSImport("vscode", "TextEditorLineNumbersStyle")
@js.native
object TextEditorLineNumbersStyle extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextEditorLineNumbersStyle with Double] = js.native
  
  /**
    * Do not render the line numbers.
    */
  @js.native
  sealed trait Off extends TextEditorLineNumbersStyle
  /* 0 */ @js.native
  object Off extends TopLevel[Off with Double]
  
  /**
    * Render the line numbers.
    */
  @js.native
  sealed trait On extends TextEditorLineNumbersStyle
  /* 1 */ @js.native
  object On extends TopLevel[On with Double]
  
  /**
    * Render the line numbers with values relative to the primary cursor location.
    */
  @js.native
  sealed trait Relative extends TextEditorLineNumbersStyle
  /* 2 */ @js.native
  object Relative extends TopLevel[Relative with Double]
}
