package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebviewPortMapping extends js.Object {
  /**
    * Destination port. The `webviewPort` is resolved to this port.
    */
  val extensionHostPort: Double = js.native
  /**
    * Localhost port to remap inside the webview.
    */
  val webviewPort: Double = js.native
}

object WebviewPortMapping {
  @scala.inline
  def apply(extensionHostPort: Double, webviewPort: Double): WebviewPortMapping = {
    val __obj = js.Dynamic.literal(extensionHostPort = extensionHostPort.asInstanceOf[js.Any], webviewPort = webviewPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebviewPortMapping]
  }
  @scala.inline
  implicit class WebviewPortMappingOps[Self <: WebviewPortMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExtensionHostPort(value: Double): Self = this.set("extensionHostPort", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebviewPort(value: Double): Self = this.set("webviewPort", value.asInstanceOf[js.Any])
  }
  
}

