package typings.vscode.anon

import typings.vscode.mod.WebviewPanelOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebviewOptions extends js.Object {
  val webviewOptions: js.UndefOr[WebviewPanelOptions] = js.undefined
}

object WebviewOptions {
  @scala.inline
  def apply(webviewOptions: WebviewPanelOptions = null): WebviewOptions = {
    val __obj = js.Dynamic.literal()
    if (webviewOptions != null) __obj.updateDynamic("webviewOptions")(webviewOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebviewOptions]
  }
}

