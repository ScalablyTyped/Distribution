package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentRangeSemanticTokensProvider extends js.Object {
  /**
  		 * @see [provideDocumentSemanticTokens](#DocumentSemanticTokensProvider.provideDocumentSemanticTokens).
  		 */
  def provideDocumentRangeSemanticTokens(document: TextDocument, range: Range, token: CancellationToken): ProviderResult[SemanticTokens]
}

object DocumentRangeSemanticTokensProvider {
  @scala.inline
  def apply(
    provideDocumentRangeSemanticTokens: (TextDocument, Range, CancellationToken) => ProviderResult[SemanticTokens]
  ): DocumentRangeSemanticTokensProvider = {
    val __obj = js.Dynamic.literal(provideDocumentRangeSemanticTokens = js.Any.fromFunction3(provideDocumentRangeSemanticTokens))
    __obj.asInstanceOf[DocumentRangeSemanticTokensProvider]
  }
}

