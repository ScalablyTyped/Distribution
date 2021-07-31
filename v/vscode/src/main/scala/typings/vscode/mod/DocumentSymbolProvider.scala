package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentSymbolProvider extends StObject {
  
  /**
    * Provide symbol information for the given document.
    *
    * @param document The document in which the command was invoked.
    * @param token A cancellation token.
    * @return An array of document highlights or a thenable that resolves to such. The lack of a result can be
    * signaled by returning `undefined`, `null`, or an empty array.
    */
  def provideDocumentSymbols(document: TextDocument, token: CancellationToken): ProviderResult[js.Array[DocumentSymbol | SymbolInformation]]
}
object DocumentSymbolProvider {
  
  @scala.inline
  def apply(
    provideDocumentSymbols: (TextDocument, CancellationToken) => ProviderResult[js.Array[DocumentSymbol | SymbolInformation]]
  ): DocumentSymbolProvider = {
    val __obj = js.Dynamic.literal(provideDocumentSymbols = js.Any.fromFunction2(provideDocumentSymbols))
    __obj.asInstanceOf[DocumentSymbolProvider]
  }
  
  @scala.inline
  implicit class DocumentSymbolProviderMutableBuilder[Self <: DocumentSymbolProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvideDocumentSymbols(
      value: (TextDocument, CancellationToken) => ProviderResult[js.Array[DocumentSymbol | SymbolInformation]]
    ): Self = StObject.set(x, "provideDocumentSymbols", js.Any.fromFunction2(value))
  }
}
