package typings.vscode.vscodeMod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Webview extends js.Object {
  /**
  		 * Content security policy source for webview resources.
  		 *
  		 * This is the origin that should be used in a content security policy rule:
  		 *
  		 * ```
  		 * img-src https: ${webview.cspSource} ...;
  		 * ```
  		 */
  val cspSource: String = js.native
  /**
  		 * Contents of the webview.
  		 *
  		 * Should be a complete html document.
  		 */
  var html: String = js.native
  /**
  		 * Content settings for the webview.
  		 */
  var options: WebviewOptions = js.native
  /**
  		 * Convert a uri for the local file system to one that can be used inside webviews.
  		 *
  		 * Webviews cannot directly load resources from the workspace or local file system using `file:` uris. The
  		 * `asWebviewUri` function takes a local `file:` uri and converts it into a uri that can be used inside of
  		 * a webview to load the same resource:
  		 *
  		 * ```ts
  		 * webview.html = `<img src="${webview.asWebviewUri(vscode.Uri.file('/Users/codey/workspace/cat.gif'))}">`
  		 * ```
  		 */
  def asWebviewUri(localResource: Uri): Uri = js.native
  /**
  		 * Fired when the webview content posts a message.
  		 *
  		 * Webview content can post strings or json serilizable objects back to a VS Code extension. They cannot
  		 * post `Blob`, `File`, `ImageData` and other DOM specific objects since the extension that receives the
  		 * message does not run in a browser environment.
  		 */
  def onDidReceiveMessage(listener: js.Function1[/* e */ js.Any, _]): Disposable = js.native
  def onDidReceiveMessage(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any): Disposable = js.native
  def onDidReceiveMessage(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  /**
  		 * Post a message to the webview content.
  		 *
  		 * Messages are only delivered if the webview is live (either visible or in the
  		 * background with `retainContextWhenHidden`).
  		 *
  		 * @param message Body of the message. This must be a string or other json serilizable object.
  		 */
  def postMessage(message: js.Any): Thenable[Boolean] = js.native
}

