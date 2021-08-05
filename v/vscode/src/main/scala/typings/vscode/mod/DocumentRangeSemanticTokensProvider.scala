package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentRangeSemanticTokensProvider extends StObject {
  
  /**
    * @see [provideDocumentSemanticTokens](#DocumentSemanticTokensProvider.provideDocumentSemanticTokens).
    */
  def provideDocumentRangeSemanticTokens(document: TextDocument, range: Range, token: CancellationToken): ProviderResult[SemanticTokens]
}
object DocumentRangeSemanticTokensProvider {
  
  inline def apply(
    provideDocumentRangeSemanticTokens: (TextDocument, Range, CancellationToken) => ProviderResult[SemanticTokens]
  ): DocumentRangeSemanticTokensProvider = {
    val __obj = js.Dynamic.literal(provideDocumentRangeSemanticTokens = js.Any.fromFunction3(provideDocumentRangeSemanticTokens))
    __obj.asInstanceOf[DocumentRangeSemanticTokensProvider]
  }
  
  extension [Self <: DocumentRangeSemanticTokensProvider](x: Self) {
    
    inline def setProvideDocumentRangeSemanticTokens(value: (TextDocument, Range, CancellationToken) => ProviderResult[SemanticTokens]): Self = StObject.set(x, "provideDocumentRangeSemanticTokens", js.Any.fromFunction3(value))
  }
}
