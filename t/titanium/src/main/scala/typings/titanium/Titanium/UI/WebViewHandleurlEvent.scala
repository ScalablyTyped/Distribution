package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when <Titanium.UI.WebView.allowedURLSchemes> contains scheme of opening url.
  */
trait WebViewHandleurlEvent extends WebViewBaseEvent {
  /**
    * Handler <Titanium.UI.iOS.WebViewDecisionHandler>.
    */
  var handler: String
  /**
    * URL of the web document being loaded.
    */
  var url: String
}

object WebViewHandleurlEvent {
  @scala.inline
  def apply(handler: String, source: WebView, url: String): WebViewHandleurlEvent = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewHandleurlEvent]
  }
}

