package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when a blacklisted URL is stopped.
  */
@js.native
trait WebViewBlacklisturlEvent extends WebViewBaseEvent {
  
  /**
    * The URL of the web document that is stopped.
    */
  var url: String = js.native
}
object WebViewBlacklisturlEvent {
  
  @scala.inline
  def apply(source: WebView, url: String): WebViewBlacklisturlEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewBlacklisturlEvent]
  }
  
  @scala.inline
  implicit class WebViewBlacklisturlEventMutableBuilder[Self <: WebViewBlacklisturlEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
