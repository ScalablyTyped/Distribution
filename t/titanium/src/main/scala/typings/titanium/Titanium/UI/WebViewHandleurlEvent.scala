package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when <Titanium.UI.WebView.allowedURLSchemes> contains scheme of opening url.
  */
@js.native
trait WebViewHandleurlEvent extends WebViewBaseEvent {
  
  /**
    * Handler <Titanium.UI.iOS.WebViewDecisionHandler>.
    */
  var handler: String = js.native
  
  /**
    * URL of the web document being loaded.
    */
  var url: String = js.native
}
object WebViewHandleurlEvent {
  
  @scala.inline
  def apply(handler: String, source: WebView, url: String): WebViewHandleurlEvent = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewHandleurlEvent]
  }
  
  @scala.inline
  implicit class WebViewHandleurlEventMutableBuilder[Self <: WebViewHandleurlEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandler(value: String): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
