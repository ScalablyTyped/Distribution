package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextEditorLineNumbersStyle extends StObject
@JSImport("vscode", "TextEditorLineNumbersStyle")
@js.native
object TextEditorLineNumbersStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextEditorLineNumbersStyle & Double] = js.native
  
  /**
  		 * Do not render the line numbers.
  		 */
  @js.native
  sealed trait Off
    extends StObject
       with TextEditorLineNumbersStyle
  /* 0 */ val Off: typings.vscode.mod.TextEditorLineNumbersStyle.Off & Double = js.native
  
  /**
  		 * Render the line numbers.
  		 */
  @js.native
  sealed trait On
    extends StObject
       with TextEditorLineNumbersStyle
  /* 1 */ val On: typings.vscode.mod.TextEditorLineNumbersStyle.On & Double = js.native
  
  /**
  		 * Render the line numbers with values relative to the primary cursor location.
  		 */
  @js.native
  sealed trait Relative
    extends StObject
       with TextEditorLineNumbersStyle
  /* 2 */ val Relative: typings.vscode.mod.TextEditorLineNumbersStyle.Relative & Double = js.native
}
