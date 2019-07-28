package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldingRangeProvider extends js.Object {
  /**
  		 * Returns a list of folding ranges or null and undefined if the provider
  		 * does not want to participate or was cancelled.
  		 * @param document The document in which the command was invoked.
  		 * @param context Additional context information (for future use)
  		 * @param token A cancellation token.
  		 */
  def provideFoldingRanges(document: TextDocument, context: FoldingContext, token: CancellationToken): ProviderResult[js.Array[FoldingRange]]
}

object FoldingRangeProvider {
  @scala.inline
  def apply(
    provideFoldingRanges: (TextDocument, FoldingContext, CancellationToken) => ProviderResult[js.Array[FoldingRange]]
  ): FoldingRangeProvider = {
    val __obj = js.Dynamic.literal(provideFoldingRanges = js.Any.fromFunction3(provideFoldingRanges))
  
    __obj.asInstanceOf[FoldingRangeProvider]
  }
}

