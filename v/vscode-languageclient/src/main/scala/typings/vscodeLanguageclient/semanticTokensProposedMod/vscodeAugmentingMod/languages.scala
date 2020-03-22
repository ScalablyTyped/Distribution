package typings.vscodeLanguageclient.semanticTokensProposedMod.vscodeAugmentingMod

import typings.vscode.mod.Disposable
import typings.vscode.mod.DocumentSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "languages")
@js.native
object languages extends js.Object {
  /**
    * Register a semantic tokens provider for a document range.
    *
    * Multiple providers can be registered for a language. In that case providers are sorted
    * by their [score](#languages.match) and the best-matching provider is used. Failure
    * of the selected provider will cause a failure of the whole operation.
    *
    * @param selector A selector that defines the documents this provider is applicable to.
    * @param provider A document range semantic tokens provider.
    * @return A [disposable](#Disposable) that unregisters this provider when being disposed.
    */
  def registerDocumentRangeSemanticTokensProvider(
    selector: DocumentSelector,
    provider: DocumentRangeSemanticTokensProvider,
    legend: SemanticTokensLegend
  ): Disposable = js.native
  /**
    * Register a semantic tokens provider for a whole document.
    *
    * Multiple providers can be registered for a language. In that case providers are sorted
    * by their [score](#languages.match) and the best-matching provider is used. Failure
    * of the selected provider will cause a failure of the whole operation.
    *
    * @param selector A selector that defines the documents this provider is applicable to.
    * @param provider A document semantic tokens provider.
    * @return A [disposable](#Disposable) that unregisters this provider when being disposed.
    */
  def registerDocumentSemanticTokensProvider(selector: DocumentSelector, provider: DocumentSemanticTokensProvider, legend: SemanticTokensLegend): Disposable = js.native
}

