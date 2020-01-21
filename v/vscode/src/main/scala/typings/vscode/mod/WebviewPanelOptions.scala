package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebviewPanelOptions extends js.Object {
  /**
  		 * Controls if the find widget is enabled in the panel.
  		 *
  		 * Defaults to false.
  		 */
  val enableFindWidget: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Controls if the webview panel's content (iframe) is kept around even when the panel
  		 * is no longer visible.
  		 *
  		 * Normally the webview panel's html context is created when the panel becomes visible
  		 * and destroyed when it is hidden. Extensions that have complex state
  		 * or UI can set the `retainContextWhenHidden` to make VS Code keep the webview
  		 * context around, even when the webview moves to a background tab. When a webview using
  		 * `retainContextWhenHidden` becomes hidden, its scripts and other dynamic content are suspended.
  		 * When the panel becomes visible again, the context is automatically restored
  		 * in the exact same state it was in originally. You cannot send messages to a
  		 * hidden webview, even with `retainContextWhenHidden` enabled.
  		 *
  		 * `retainContextWhenHidden` has a high memory overhead and should only be used if
  		 * your panel's context cannot be quickly saved and restored.
  		 */
  val retainContextWhenHidden: js.UndefOr[Boolean] = js.undefined
}

object WebviewPanelOptions {
  @scala.inline
  def apply(
    enableFindWidget: js.UndefOr[Boolean] = js.undefined,
    retainContextWhenHidden: js.UndefOr[Boolean] = js.undefined
  ): WebviewPanelOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableFindWidget)) __obj.updateDynamic("enableFindWidget")(enableFindWidget.asInstanceOf[js.Any])
    if (!js.isUndefined(retainContextWhenHidden)) __obj.updateDynamic("retainContextWhenHidden")(retainContextWhenHidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebviewPanelOptions]
  }
}

