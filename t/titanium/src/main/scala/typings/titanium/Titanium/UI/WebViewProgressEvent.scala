package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when webpage download progresses.
  */
@js.native
trait WebViewProgressEvent extends WebViewBaseEvent {
  
  /**
    * URL of the web document being loaded.
    */
  var url: String = js.native
  
  /**
    * An estimate of what fraction of the current navigation has been loaded.
    */
  var value: Double = js.native
}
object WebViewProgressEvent {
  
  @scala.inline
  def apply(source: WebView, url: String, value: Double): WebViewProgressEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewProgressEvent]
  }
  
  @scala.inline
  implicit class WebViewProgressEventMutableBuilder[Self <: WebViewProgressEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
