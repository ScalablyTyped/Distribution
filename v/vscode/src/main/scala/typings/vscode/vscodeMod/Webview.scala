package typings.vscode.vscodeMod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Webview extends js.Object {
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
  		 * Fired when the webview content posts a message.
  		 */
  def onDidReceiveMessage(listener: js.Function1[/* e */ js.Any, _]): Disposable = js.native
  def onDidReceiveMessage(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any): Disposable = js.native
  def onDidReceiveMessage(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  /**
  		 * Post a message to the webview content.
  		 *
  		 * Messages are only delivered if the webview is visible.
  		 *
  		 * @param message Body of the message.
  		 */
  def postMessage(message: js.Any): Thenable[Boolean] = js.native
}

