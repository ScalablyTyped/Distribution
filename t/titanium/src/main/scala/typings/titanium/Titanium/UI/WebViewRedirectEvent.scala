package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when a web view receives a server redirect.
  */
@js.native
trait WebViewRedirectEvent extends WebViewBaseEvent {
  
  /**
    * Page title of webpage.
    */
  var title: String = js.native
  
  /**
    * URL of the web document being loaded.
    */
  var url: String = js.native
}
object WebViewRedirectEvent {
  
  @scala.inline
  def apply(source: WebView, title: String, url: String): WebViewRedirectEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewRedirectEvent]
  }
  
  @scala.inline
  implicit class WebViewRedirectEventMutableBuilder[Self <: WebViewRedirectEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
