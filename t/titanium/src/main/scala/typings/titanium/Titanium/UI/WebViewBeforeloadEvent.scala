package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired before the web view starts loading its content.
  */
@js.native
trait WebViewBeforeloadEvent extends WebViewBaseEvent {
  
  /**
    * Indicate if the event was generated from the main page or an iframe.
    */
  var isMainFrame: Boolean = js.native
  
  /**
    * Constant indicating the user's action.
    */
  var navigationType: Double = js.native
  
  /**
    * URL of the web document being loaded.
    */
  var url: String = js.native
}
object WebViewBeforeloadEvent {
  
  @scala.inline
  def apply(isMainFrame: Boolean, navigationType: Double, source: WebView, url: String): WebViewBeforeloadEvent = {
    val __obj = js.Dynamic.literal(isMainFrame = isMainFrame.asInstanceOf[js.Any], navigationType = navigationType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewBeforeloadEvent]
  }
  
  @scala.inline
  implicit class WebViewBeforeloadEventMutableBuilder[Self <: WebViewBeforeloadEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsMainFrame(value: Boolean): Self = StObject.set(x, "isMainFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationType(value: Double): Self = StObject.set(x, "navigationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
