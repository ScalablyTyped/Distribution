package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when loading resource.
  */
@js.native
trait WebViewOnLoadResourceEvent extends WebViewBaseEvent {
  
  /**
    * The url of the resource that will load.
    */
  var url: String = js.native
}
object WebViewOnLoadResourceEvent {
  
  @scala.inline
  def apply(source: WebView, url: String): WebViewOnLoadResourceEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewOnLoadResourceEvent]
  }
  
  @scala.inline
  implicit class WebViewOnLoadResourceEventMutableBuilder[Self <: WebViewOnLoadResourceEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
