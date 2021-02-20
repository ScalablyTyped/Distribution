package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebviewPanelOnDidChangeViewStateEvent extends StObject {
  
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
  implicit class WebviewPanelOnDidChangeViewStateEventMutableBuilder[Self <: WebviewPanelOnDidChangeViewStateEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWebviewPanel(value: WebviewPanel): Self = StObject.set(x, "webviewPanel", value.asInstanceOf[js.Any])
  }
}
