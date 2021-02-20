package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextEditorLineNumbersStyle extends StObject
@JSImport("vscode", "TextEditorLineNumbersStyle")
@js.native
object TextEditorLineNumbersStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextEditorLineNumbersStyle with Double] = js.native
  
  /**
    * Do not render the line numbers.
    */
  @js.native
  sealed trait Off extends TextEditorLineNumbersStyle
  /* 0 */ val Off: typings.vscode.mod.TextEditorLineNumbersStyle.Off with Double = js.native
  
  /**
    * Render the line numbers.
    */
  @js.native
  sealed trait On extends TextEditorLineNumbersStyle
  /* 1 */ val On: typings.vscode.mod.TextEditorLineNumbersStyle.On with Double = js.native
  
  /**
    * Render the line numbers with values relative to the primary cursor location.
    */
  @js.native
  sealed trait Relative extends TextEditorLineNumbersStyle
  /* 2 */ val Relative: typings.vscode.mod.TextEditorLineNumbersStyle.Relative with Double = js.native
}
