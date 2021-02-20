package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when a URL has been blocked from loading.
  */
@js.native
trait WebViewBlockedurlEvent extends WebViewBaseEvent {
  
  /**
    * The URL of the web document that has been blocked from loading.
    */
  var url: String = js.native
}
object WebViewBlockedurlEvent {
  
  @scala.inline
  def apply(source: WebView, url: String): WebViewBlockedurlEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewBlockedurlEvent]
  }
  
  @scala.inline
  implicit class WebViewBlockedurlEventMutableBuilder[Self <: WebViewBlockedurlEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
