package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebviewPanelOptions extends js.Object {
  /**
    * Controls if the find widget is enabled in the panel.
    *
    * Defaults to false.
    */
  val enableFindWidget: js.UndefOr[Boolean] = js.native
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
  val retainContextWhenHidden: js.UndefOr[Boolean] = js.native
}

object WebviewPanelOptions {
  @scala.inline
  def apply(): WebviewPanelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebviewPanelOptions]
  }
  @scala.inline
  implicit class WebviewPanelOptionsOps[Self <: WebviewPanelOptions] (val x: Self) extends AnyVal {
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
    def setEnableFindWidget(value: Boolean): Self = this.set("enableFindWidget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableFindWidget: Self = this.set("enableFindWidget", js.undefined)
    @scala.inline
    def setRetainContextWhenHidden(value: Boolean): Self = this.set("retainContextWhenHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetainContextWhenHidden: Self = this.set("retainContextWhenHidden", js.undefined)
  }
  
}

