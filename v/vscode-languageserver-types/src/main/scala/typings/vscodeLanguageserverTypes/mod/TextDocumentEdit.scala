package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDocumentEdit extends StObject {
  
  /**
    * The edits to be applied.
    */
  var edits: js.Array[TextEdit]
  
  /**
    * The text document to change.
    */
  var textDocument: VersionedTextDocumentIdentifier
}
object TextDocumentEdit {
  
  inline def apply(edits: js.Array[TextEdit], textDocument: VersionedTextDocumentIdentifier): TextDocumentEdit = {
    val __obj = js.Dynamic.literal(edits = edits.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentEdit]
  }
  
  @JSImport("vscode-languageserver-types", "TextDocumentEdit")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new `TextDocumentEdit`
    */
  inline def create(textDocument: VersionedTextDocumentIdentifier, edits: js.Array[TextEdit]): TextDocumentEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(textDocument.asInstanceOf[js.Any], edits.asInstanceOf[js.Any])).asInstanceOf[TextDocumentEdit]
  
  inline def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextDocumentEdit */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.TextDocumentEdit */ Boolean]
  
  extension [Self <: TextDocumentEdit](x: Self) {
    
    inline def setEdits(value: js.Array[TextEdit]): Self = StObject.set(x, "edits", value.asInstanceOf[js.Any])
    
    inline def setEditsVarargs(value: TextEdit*): Self = StObject.set(x, "edits", js.Array(value :_*))
    
    inline def setTextDocument(value: VersionedTextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
  }
}
