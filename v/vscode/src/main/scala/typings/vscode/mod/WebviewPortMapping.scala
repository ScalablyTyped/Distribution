package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebviewPortMapping extends js.Object {
  /**
  		 * Destination port. The `webviewPort` is resolved to this port.
  		 */
  val extensionHostPort: Double
  /**
  		 * Localhost port to remap inside the webview.
  		 */
  val webviewPort: Double
}

object WebviewPortMapping {
  @scala.inline
  def apply(extensionHostPort: Double, webviewPort: Double): WebviewPortMapping = {
    val __obj = js.Dynamic.literal(extensionHostPort = extensionHostPort.asInstanceOf[js.Any], webviewPort = webviewPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebviewPortMapping]
  }
}

