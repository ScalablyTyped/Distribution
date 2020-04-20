package typings.vscode

import typings.vscode.mod.WebviewPanelOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWebviewOptions extends js.Object {
  val webviewOptions: js.UndefOr[WebviewPanelOptions] = js.undefined
}

object AnonWebviewOptions {
  @scala.inline
  def apply(webviewOptions: WebviewPanelOptions = null): AnonWebviewOptions = {
    val __obj = js.Dynamic.literal()
    if (webviewOptions != null) __obj.updateDynamic("webviewOptions")(webviewOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWebviewOptions]
  }
}

