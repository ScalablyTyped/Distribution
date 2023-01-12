package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentFormattingEditProvider extends StObject {
  
  /**
    * Provide formatting edits for a whole document.
    *
    * @param document The document in which the command was invoked.
    * @param options Options controlling formatting.
    * @param token A cancellation token.
    * @return A set of text edits or a thenable that resolves to such. The lack of a result can be
    * signaled by returning `undefined`, `null`, or an empty array.
    */
  def provideDocumentFormattingEdits(document: TextDocument, options: FormattingOptions, token: CancellationToken): ProviderResult[js.Array[TextEdit]]
}
object DocumentFormattingEditProvider {
  
  inline def apply(
    provideDocumentFormattingEdits: (TextDocument, FormattingOptions, CancellationToken) => ProviderResult[js.Array[TextEdit]]
  ): DocumentFormattingEditProvider = {
    val __obj = js.Dynamic.literal(provideDocumentFormattingEdits = js.Any.fromFunction3(provideDocumentFormattingEdits))
    __obj.asInstanceOf[DocumentFormattingEditProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentFormattingEditProvider] (val x: Self) extends AnyVal {
    
    inline def setProvideDocumentFormattingEdits(value: (TextDocument, FormattingOptions, CancellationToken) => ProviderResult[js.Array[TextEdit]]): Self = StObject.set(x, "provideDocumentFormattingEdits", js.Any.fromFunction3(value))
  }
}
