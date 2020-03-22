package typings.vscodeLanguageclient.semanticTokensProposedMod

import typings.vscodeLanguageclient.semanticTokensProposedMod.vscodeAugmentingMod.DocumentRangeSemanticTokensProvider
import typings.vscodeLanguageclient.semanticTokensProposedMod.vscodeAugmentingMod.DocumentSemanticTokensProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SemanticTokensProviders extends js.Object {
  var document: DocumentSemanticTokensProvider
  var range: js.UndefOr[DocumentRangeSemanticTokensProvider] = js.undefined
}

object SemanticTokensProviders {
  @scala.inline
  def apply(document: DocumentSemanticTokensProvider, range: DocumentRangeSemanticTokensProvider = null): SemanticTokensProviders = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensProviders]
  }
}

