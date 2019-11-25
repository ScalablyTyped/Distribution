package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebviewPanelOnDidChangeViewStateEvent extends js.Object {
  /**
  		 * Webview panel whose view state changed.
  		 */
  val webviewPanel: WebviewPanel
}

object WebviewPanelOnDidChangeViewStateEvent {
  @scala.inline
  def apply(webviewPanel: WebviewPanel): WebviewPanelOnDidChangeViewStateEvent = {
    val __obj = js.Dynamic.literal(webviewPanel = webviewPanel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebviewPanelOnDidChangeViewStateEvent]
  }
}

