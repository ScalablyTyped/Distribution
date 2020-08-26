package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FoldingRangeProvider extends js.Object {
  /**
    * Returns a list of folding ranges or null and undefined if the provider
    * does not want to participate or was cancelled.
    * @param document The document in which the command was invoked.
    * @param context Additional context information (for future use)
    * @param token A cancellation token.
    */
  def provideFoldingRanges(document: TextDocument, context: FoldingContext, token: CancellationToken): ProviderResult[js.Array[FoldingRange]] = js.native
}

object FoldingRangeProvider {
  @scala.inline
  def apply(
    provideFoldingRanges: (TextDocument, FoldingContext, CancellationToken) => ProviderResult[js.Array[FoldingRange]]
  ): FoldingRangeProvider = {
    val __obj = js.Dynamic.literal(provideFoldingRanges = js.Any.fromFunction3(provideFoldingRanges))
    __obj.asInstanceOf[FoldingRangeProvider]
  }
  @scala.inline
  implicit class FoldingRangeProviderOps[Self <: FoldingRangeProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProvideFoldingRanges(value: (TextDocument, FoldingContext, CancellationToken) => ProviderResult[js.Array[FoldingRange]]): Self = this.set("provideFoldingRanges", js.Any.fromFunction3(value))
  }
  
}

