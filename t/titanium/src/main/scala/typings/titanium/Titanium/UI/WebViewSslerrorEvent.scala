package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when an SSL error occurred.
  */
@js.native
trait WebViewSslerrorEvent extends WebViewBaseEvent {
  
  /**
    * SSL error code.
    */
  var code: Double = js.native
}
object WebViewSslerrorEvent {
  
  @scala.inline
  def apply(code: Double, source: WebView): WebViewSslerrorEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewSslerrorEvent]
  }
  
  @scala.inline
  implicit class WebViewSslerrorEventMutableBuilder[Self <: WebViewSslerrorEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
