package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDocumentContentProvider extends js.Object {
  /**
  		 * An event to signal a resource has changed.
  		 */
  var onDidChange: js.UndefOr[Event[Uri]] = js.undefined
  /**
  		 * Provide textual content for a given uri.
  		 *
  		 * The editor will use the returned string-content to create a readonly
  		 * [document](#TextDocument). Resources allocated should be released when
  		 * the corresponding document has been [closed](#workspace.onDidCloseTextDocument).
  		 *
  		 * **Note**: The contents of the created [document](#TextDocument) might not be
  		 * identical to the provided text due to end-of-line-sequence normalization.
  		 *
  		 * @param uri An uri which scheme matches the scheme this provider was [registered](#workspace.registerTextDocumentContentProvider) for.
  		 * @param token A cancellation token.
  		 * @return A string or a thenable that resolves to such.
  		 */
  def provideTextDocumentContent(uri: Uri, token: CancellationToken): ProviderResult[String]
}

object TextDocumentContentProvider {
  @scala.inline
  def apply(
    provideTextDocumentContent: (Uri, CancellationToken) => ProviderResult[String],
    onDidChange: (/* listener */ js.Function1[Uri, js.Any], /* thisArgs */ js.UndefOr[js.Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable = null
  ): TextDocumentContentProvider = {
    val __obj = js.Dynamic.literal(provideTextDocumentContent = js.Any.fromFunction2(provideTextDocumentContent))
    if (onDidChange != null) __obj.updateDynamic("onDidChange")(js.Any.fromFunction3(onDidChange))
    __obj.asInstanceOf[TextDocumentContentProvider]
  }
}

