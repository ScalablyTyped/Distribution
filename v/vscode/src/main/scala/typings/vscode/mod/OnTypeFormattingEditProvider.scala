package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnTypeFormattingEditProvider extends js.Object {
  /**
  		 * Provide formatting edits after a character has been typed.
  		 *
  		 * The given position and character should hint to the provider
  		 * what range the position to expand to, like find the matching `{`
  		 * when `}` has been entered.
  		 *
  		 * @param document The document in which the command was invoked.
  		 * @param position The position at which the command was invoked.
  		 * @param ch The character that has been typed.
  		 * @param options Options controlling formatting.
  		 * @param token A cancellation token.
  		 * @return A set of text edits or a thenable that resolves to such. The lack of a result can be
  		 * signaled by returning `undefined`, `null`, or an empty array.
  		 */
  def provideOnTypeFormattingEdits(
    document: TextDocument,
    position: Position,
    ch: String,
    options: FormattingOptions,
    token: CancellationToken
  ): ProviderResult[js.Array[TextEdit]]
}

object OnTypeFormattingEditProvider {
  @scala.inline
  def apply(
    provideOnTypeFormattingEdits: (TextDocument, Position, String, FormattingOptions, CancellationToken) => ProviderResult[js.Array[TextEdit]]
  ): OnTypeFormattingEditProvider = {
    val __obj = js.Dynamic.literal(provideOnTypeFormattingEdits = js.Any.fromFunction5(provideOnTypeFormattingEdits))
    __obj.asInstanceOf[OnTypeFormattingEditProvider]
  }
}

