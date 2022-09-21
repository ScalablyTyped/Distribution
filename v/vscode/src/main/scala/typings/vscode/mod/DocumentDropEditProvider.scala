package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentDropEditProvider extends StObject {
  
  /**
    * Provide edits which inserts the content being dragged and dropped into the document.
    *
    * @param document The document in which the drop occurred.
    * @param position The position in the document where the drop occurred.
    * @param dataTransfer A {@link DataTransfer} object that holds data about what is being dragged and dropped.
    * @param token A cancellation token.
    *
    * @return A {@link DocumentDropEdit} or a thenable that resolves to such. The lack of a result can be
    * signaled by returning `undefined` or `null`.
    */
  def provideDocumentDropEdits(document: TextDocument, position: Position, dataTransfer: DataTransfer, token: CancellationToken): ProviderResult[DocumentDropEdit]
}
object DocumentDropEditProvider {
  
  inline def apply(
    provideDocumentDropEdits: (TextDocument, Position, DataTransfer, CancellationToken) => ProviderResult[DocumentDropEdit]
  ): DocumentDropEditProvider = {
    val __obj = js.Dynamic.literal(provideDocumentDropEdits = js.Any.fromFunction4(provideDocumentDropEdits))
    __obj.asInstanceOf[DocumentDropEditProvider]
  }
  
  extension [Self <: DocumentDropEditProvider](x: Self) {
    
    inline def setProvideDocumentDropEdits(
      value: (TextDocument, Position, DataTransfer, CancellationToken) => ProviderResult[DocumentDropEdit]
    ): Self = StObject.set(x, "provideDocumentDropEdits", js.Any.fromFunction4(value))
  }
}
