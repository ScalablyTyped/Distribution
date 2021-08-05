package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextEdit extends StObject {
  
  /**
    * The string to be inserted. For delete operations use an
    * empty string.
    */
  var newText: String
  
  /**
    * The range of the text document to be manipulated. To insert
    * text into a document create a range where start === end.
    */
  var range: Range
}
object TextEdit {
  
  inline def apply(newText: String, range: Range): TextEdit = {
    val __obj = js.Dynamic.literal(newText = newText.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEdit]
  }
  
  @JSImport("vscode-languageserver-types", "TextEdit")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a delete text edit.
    * @param range The range of text to be deleted.
    */
  inline def del(range: Range): TextEdit = ^.asInstanceOf[js.Dynamic].applyDynamic("del")(range.asInstanceOf[js.Any]).asInstanceOf[TextEdit]
  
  /**
    * Creates a insert text edit.
    * @param position The position to insert the text at.
    * @param newText The text to be inserted.
    */
  inline def insert(position: Position, newText: String): TextEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(position.asInstanceOf[js.Any], newText.asInstanceOf[js.Any])).asInstanceOf[TextEdit]
  
  inline def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextEdit */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.TextEdit */ Boolean]
  
  /**
    * Creates a replace text edit.
    * @param range The range of text to be replaced.
    * @param newText The new text.
    */
  inline def replace(range: Range, newText: String): TextEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(range.asInstanceOf[js.Any], newText.asInstanceOf[js.Any])).asInstanceOf[TextEdit]
  
  extension [Self <: TextEdit](x: Self) {
    
    inline def setNewText(value: String): Self = StObject.set(x, "newText", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
