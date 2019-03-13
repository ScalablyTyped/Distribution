package typings
package vscodeLib.vscodeMod

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
  		 * @param uri An uri which scheme matches the scheme this provider was [registered](#workspace.registerTextDocumentContentProvider) for.
  		 * @param token A cancellation token.
  		 * @return A string or a thenable that resolves to such.
  		 */
  def provideTextDocumentContent(uri: Uri, token: CancellationToken): ProviderResult[java.lang.String]
}

object TextDocumentContentProvider {
  @scala.inline
  def apply(
    provideTextDocumentContent: (Uri, CancellationToken) => ProviderResult[java.lang.String],
    onDidChange: Event[Uri] = null
  ): TextDocumentContentProvider = {
    val __obj = js.Dynamic.literal(provideTextDocumentContent = js.Any.fromFunction2(provideTextDocumentContent))
    if (onDidChange != null) __obj.updateDynamic("onDidChange")(onDidChange)
    __obj.asInstanceOf[TextDocumentContentProvider]
  }
}

