package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentFormattingEditProvider extends js.Object {
  /**
    * Provide formatting edits for a whole document.
    *
    * @param document The document in which the command was invoked.
    * @param options Options controlling formatting.
    * @param token A cancellation token.
    * @return A set of text edits or a thenable that resolves to such. The lack of a result can be
    * signaled by returning `undefined`, `null`, or an empty array.
    */
  def provideDocumentFormattingEdits(document: TextDocument, options: FormattingOptions, token: CancellationToken): ProviderResult[js.Array[TextEdit]]
}

object DocumentFormattingEditProvider {
  @scala.inline
  def apply(
    provideDocumentFormattingEdits: (TextDocument, FormattingOptions, CancellationToken) => ProviderResult[js.Array[TextEdit]]
  ): DocumentFormattingEditProvider = {
    val __obj = js.Dynamic.literal(provideDocumentFormattingEdits = js.Any.fromFunction3(provideDocumentFormattingEdits))
    __obj.asInstanceOf[DocumentFormattingEditProvider]
  }
}

