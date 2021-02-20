package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDocumentEdit extends StObject {
  
  /**
    * The edits to be applied.
    */
  var edits: js.Array[TextEdit] = js.native
  
  /**
    * The text document to change.
    */
  var textDocument: VersionedTextDocumentIdentifier = js.native
}
object TextDocumentEdit {
  
  @scala.inline
  def apply(edits: js.Array[TextEdit], textDocument: VersionedTextDocumentIdentifier): TextDocumentEdit = {
    val __obj = js.Dynamic.literal(edits = edits.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentEdit]
  }
  
  /**
    * Creates a new `TextDocumentEdit`
    */
  @JSImport("vscode-languageserver-types", "TextDocumentEdit.create")
  @js.native
  def create(textDocument: VersionedTextDocumentIdentifier, edits: js.Array[TextEdit]): TextDocumentEdit = js.native
  
  @JSImport("vscode-languageserver-types", "TextDocumentEdit.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextDocumentEdit */ Boolean = js.native
  
  @scala.inline
  implicit class TextDocumentEditMutableBuilder[Self <: TextDocumentEdit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdits(value: js.Array[TextEdit]): Self = StObject.set(x, "edits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditsVarargs(value: TextEdit*): Self = StObject.set(x, "edits", js.Array(value :_*))
    
    @scala.inline
    def setTextDocument(value: VersionedTextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
  }
}
