package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebviewPanelOnDidChangeViewStateEvent extends js.Object {
  
  /**
    * Webview panel whose view state changed.
    */
  val webviewPanel: WebviewPanel = js.native
}
object WebviewPanelOnDidChangeViewStateEvent {
  
  @scala.inline
  def apply(webviewPanel: WebviewPanel): WebviewPanelOnDidChangeViewStateEvent = {
    val __obj = js.Dynamic.literal(webviewPanel = webviewPanel.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebviewPanelOnDidChangeViewStateEvent]
  }
  
  @scala.inline
  implicit class WebviewPanelOnDidChangeViewStateEventOps[Self <: WebviewPanelOnDidChangeViewStateEvent] (val x: Self) extends AnyVal {
    
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
    def setWebviewPanel(value: WebviewPanel): Self = this.set("webviewPanel", value.asInstanceOf[js.Any])
  }
}
