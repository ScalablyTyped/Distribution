package typings.vscodeLanguageclient.semanticTokensProposedMod.vscodeAugmentingMod

import typings.vscode.mod.CancellationToken
import typings.vscode.mod.ProviderResult
import typings.vscode.mod.Range
import typings.vscode.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The document range semantic tokens provider interface defines the contract between extensions and
  * semantic tokens.
  */
trait DocumentRangeSemanticTokensProvider extends js.Object {
  /**
    * See [provideDocumentSemanticTokens](#DocumentSemanticTokensProvider.provideDocumentSemanticTokens).
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

