package typings.vscode.mod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomTextEditorProvider extends js.Object {
  /**
  		 * Resolve a custom editor for a given text resource.
  		 *
  		 * This is called when a user first opens a resource for a `CustomTextEditorProvider`, or if they reopen an
  		 * existing editor using this `CustomTextEditorProvider`.
  		 *
  		 * To resolve a custom editor, the provider must fill in its initial html content and hook up all
  		 * the event listeners it is interested it. The provider can also hold onto the `WebviewPanel` to use later,
  		 * for example in a command. See [`WebviewPanel`](#WebviewPanel) for additional details.
  		 *
  		 * @param document Document for the resource to resolve.
  		 * @param webviewPanel Webview to resolve.
  		 * @param token A cancellation token that indicates the result is no longer needed.
  		 *
  		 * @return Thenable indicating that the custom editor has been resolved.
  		 */
  def resolveCustomTextEditor(document: TextDocument, webviewPanel: WebviewPanel, token: CancellationToken): Thenable[Unit] | Unit
}

object CustomTextEditorProvider {
  @scala.inline
  def apply(resolveCustomTextEditor: (TextDocument, WebviewPanel, CancellationToken) => Thenable[Unit] | Unit): CustomTextEditorProvider = {
    val __obj = js.Dynamic.literal(resolveCustomTextEditor = js.Any.fromFunction3(resolveCustomTextEditor))
    __obj.asInstanceOf[CustomTextEditorProvider]
  }
}

