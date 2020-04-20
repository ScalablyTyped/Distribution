package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the web view content is loaded.
		 */
trait WebViewLoadEvent extends WebViewBaseEvent {
  /**
  			 * URL of the web document.
  			 */
  var url: String
}

object WebViewLoadEvent {
  @scala.inline
  def apply(source: WebView, url: String): WebViewLoadEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewLoadEvent]
  }
}

