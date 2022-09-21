package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDocumentEdit extends StObject {
  
  /**
    * The edits to be applied.
    *
    * @since 3.16.0 - support for AnnotatedTextEdit. This is guarded using a
    * client capability.
    */
  var edits: js.Array[TextEdit | AnnotatedTextEdit]
  
  /**
    * The text document to change.
    */
  var textDocument: OptionalVersionedTextDocumentIdentifier
}
object TextDocumentEdit {
  
  inline def apply(
    edits: js.Array[TextEdit | AnnotatedTextEdit],
    textDocument: OptionalVersionedTextDocumentIdentifier
  ): TextDocumentEdit = {
    val __obj = js.Dynamic.literal(edits = edits.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentEdit]
  }
  
  @JSImport("vscode-languageserver-types", "TextDocumentEdit")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new `TextDocumentEdit`
    */
  inline def create(
    textDocument: OptionalVersionedTextDocumentIdentifier,
    edits: js.Array[TextEdit | AnnotatedTextEdit]
  ): TextDocumentEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(textDocument.asInstanceOf[js.Any], edits.asInstanceOf[js.Any])).asInstanceOf[TextDocumentEdit]
  
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextDocumentEdit */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.TextDocumentEdit */ Boolean]
  
  extension [Self <: TextDocumentEdit](x: Self) {
    
    inline def setEdits(value: js.Array[TextEdit | AnnotatedTextEdit]): Self = StObject.set(x, "edits", value.asInstanceOf[js.Any])
    
    inline def setEditsVarargs(value: (TextEdit | AnnotatedTextEdit)*): Self = StObject.set(x, "edits", js.Array(value*))
    
    inline def setTextDocument(value: OptionalVersionedTextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
  }
}
