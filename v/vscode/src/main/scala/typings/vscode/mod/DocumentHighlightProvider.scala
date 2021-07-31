package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentHighlightProvider extends StObject {
  
  /**
    * Provide a set of document highlights, like all occurrences of a variable or
    * all exit-points of a function.
    *
    * @param document The document in which the command was invoked.
    * @param position The position at which the command was invoked.
    * @param token A cancellation token.
    * @return An array of document highlights or a thenable that resolves to such. The lack of a result can be
    * signaled by returning `undefined`, `null`, or an empty array.
    */
  def provideDocumentHighlights(document: TextDocument, position: Position, token: CancellationToken): ProviderResult[js.Array[DocumentHighlight]]
}
object DocumentHighlightProvider {
  
  @scala.inline
  def apply(
    provideDocumentHighlights: (TextDocument, Position, CancellationToken) => ProviderResult[js.Array[DocumentHighlight]]
  ): DocumentHighlightProvider = {
    val __obj = js.Dynamic.literal(provideDocumentHighlights = js.Any.fromFunction3(provideDocumentHighlights))
    __obj.asInstanceOf[DocumentHighlightProvider]
  }
  
  @scala.inline
  implicit class DocumentHighlightProviderMutableBuilder[Self <: DocumentHighlightProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvideDocumentHighlights(value: (TextDocument, Position, CancellationToken) => ProviderResult[js.Array[DocumentHighlight]]): Self = StObject.set(x, "provideDocumentHighlights", js.Any.fromFunction3(value))
  }
}
