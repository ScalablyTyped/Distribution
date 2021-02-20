package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the web view content is loaded.
  */
@js.native
trait WebViewLoadEvent extends WebViewBaseEvent {
  
  /**
    * URL of the web document.
    */
  var url: String = js.native
}
object WebViewLoadEvent {
  
  @scala.inline
  def apply(source: WebView, url: String): WebViewLoadEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewLoadEvent]
  }
  
  @scala.inline
  implicit class WebViewLoadEventMutableBuilder[Self <: WebViewLoadEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
