package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebviewPortMapping extends js.Object {
  /**
  		 * Destination port. The `webviewPort` is resolved to this port.
  		 */
  val extensionHostPort: scala.Double
  /**
  		 * Localhost port to remap inside the webview.
  		 */
  val webviewPort: scala.Double
}

object WebviewPortMapping {
  @scala.inline
  def apply(extensionHostPort: scala.Double, webviewPort: scala.Double): WebviewPortMapping = {
    val __obj = js.Dynamic.literal(extensionHostPort = extensionHostPort, webviewPort = webviewPort)
  
    __obj.asInstanceOf[WebviewPortMapping]
  }
}

