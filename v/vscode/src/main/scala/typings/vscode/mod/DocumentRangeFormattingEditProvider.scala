package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentRangeFormattingEditProvider extends js.Object {
  /**
  		 * Provide formatting edits for a range in a document.
  		 *
  		 * The given range is a hint and providers can decide to format a smaller
  		 * or larger range. Often this is done by adjusting the start and end
  		 * of the range to full syntax nodes.
  		 *
  		 * @param document The document in which the command was invoked.
  		 * @param range The range which should be formatted.
  		 * @param options Options controlling formatting.
  		 * @param token A cancellation token.
  		 * @return A set of text edits or a thenable that resolves to such. The lack of a result can be
  		 * signaled by returning `undefined`, `null`, or an empty array.
  		 */
  def provideDocumentRangeFormattingEdits(document: TextDocument, range: Range, options: FormattingOptions, token: CancellationToken): ProviderResult[js.Array[TextEdit]]
}

object DocumentRangeFormattingEditProvider {
  @scala.inline
  def apply(
    provideDocumentRangeFormattingEdits: (TextDocument, Range, FormattingOptions, CancellationToken) => ProviderResult[js.Array[TextEdit]]
  ): DocumentRangeFormattingEditProvider = {
    val __obj = js.Dynamic.literal(provideDocumentRangeFormattingEdits = js.Any.fromFunction4(provideDocumentRangeFormattingEdits))
  
    __obj.asInstanceOf[DocumentRangeFormattingEditProvider]
  }
}

