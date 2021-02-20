package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextEdit extends StObject {
  
  /**
    * The string to be inserted. For delete operations use an
    * empty string.
    */
  var newText: String = js.native
  
  /**
    * The range of the text document to be manipulated. To insert
    * text into a document create a range where start === end.
    */
  var range: Range = js.native
}
object TextEdit {
  
  @scala.inline
  def apply(newText: String, range: Range): TextEdit = {
    val __obj = js.Dynamic.literal(newText = newText.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEdit]
  }
  
  /**
    * Creates a delete text edit.
    * @param range The range of text to be deleted.
    */
  @JSImport("vscode-languageserver-types", "TextEdit.del")
  @js.native
  def del(range: Range): TextEdit = js.native
  
  /**
    * Creates a insert text edit.
    * @param position The position to insert the text at.
    * @param newText The text to be inserted.
    */
  @JSImport("vscode-languageserver-types", "TextEdit.insert")
  @js.native
  def insert(position: Position, newText: String): TextEdit = js.native
  
  @JSImport("vscode-languageserver-types", "TextEdit.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextEdit */ Boolean = js.native
  
  /**
    * Creates a replace text edit.
    * @param range The range of text to be replaced.
    * @param newText The new text.
    */
  @JSImport("vscode-languageserver-types", "TextEdit.replace")
  @js.native
  def replace(range: Range, newText: String): TextEdit = js.native
  
  @scala.inline
  implicit class TextEditMutableBuilder[Self <: TextEdit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewText(value: String): Self = StObject.set(x, "newText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
