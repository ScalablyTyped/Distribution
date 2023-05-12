package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "TextEdit")
@js.native
open class TextEdit protected () extends StObject {
  /**
  		 * Create a new TextEdit.
  		 *
  		 * @param range A range.
  		 * @param newText A string.
  		 */
  def this(range: Range, newText: String) = this()
  
  /**
  		 * The eol-sequence used in the document.
  		 *
  		 * *Note* that the eol-sequence will be applied to the
  		 * whole document.
  		 */
  var newEol: js.UndefOr[EndOfLine] = js.native
  
  /**
  		 * The string this edit will insert.
  		 */
  var newText: String = js.native
  
  /**
  		 * The range this edit applies to.
  		 */
  var range: Range = js.native
}
/* static members */
object TextEdit {
  
  @JSImport("vscode", "TextEdit")
  @js.native
  val ^ : js.Any = js.native
  
  /**
  		 * Utility to create a delete edit.
  		 *
  		 * @param range A range.
  		 * @return A new text edit object.
  		 */
  inline def delete(range: Range): TextEdit = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(range.asInstanceOf[js.Any]).asInstanceOf[TextEdit]
  
  /**
  		 * Utility to create an insert edit.
  		 *
  		 * @param position A position, will become an empty range.
  		 * @param newText A string.
  		 * @return A new text edit object.
  		 */
  inline def insert(position: Position, newText: String): TextEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(position.asInstanceOf[js.Any], newText.asInstanceOf[js.Any])).asInstanceOf[TextEdit]
  
  /**
  		 * Utility to create a replace edit.
  		 *
  		 * @param range A range.
  		 * @param newText A string.
  		 * @return A new text edit object.
  		 */
  inline def replace(range: Range, newText: String): TextEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(range.asInstanceOf[js.Any], newText.asInstanceOf[js.Any])).asInstanceOf[TextEdit]
  
  /**
  		 * Utility to create an eol-edit.
  		 *
  		 * @param eol An eol-sequence
  		 * @return A new text edit object.
  		 */
  inline def setEndOfLine(eol: EndOfLine): TextEdit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEndOfLine")(eol.asInstanceOf[js.Any]).asInstanceOf[TextEdit]
}
