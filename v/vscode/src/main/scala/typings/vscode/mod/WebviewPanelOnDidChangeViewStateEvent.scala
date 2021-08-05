package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebviewPanelOnDidChangeViewStateEvent extends StObject {
  
  /**
    * Webview panel whose view state changed.
    */
  val webviewPanel: WebviewPanel
}
object WebviewPanelOnDidChangeViewStateEvent {
  
  inline def apply(webviewPanel: WebviewPanel): WebviewPanelOnDidChangeViewStateEvent = {
    val __obj = js.Dynamic.literal(webviewPanel = webviewPanel.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebviewPanelOnDidChangeViewStateEvent]
  }
  
  extension [Self <: WebviewPanelOnDidChangeViewStateEvent](x: Self) {
    
    inline def setWebviewPanel(value: WebviewPanel): Self = StObject.set(x, "webviewPanel", value.asInstanceOf[js.Any])
  }
}
