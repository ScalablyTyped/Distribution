package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when a blacklisted URL is stopped.
		 */
trait WebViewBlacklisturlEvent extends WebViewBaseEvent {
  /**
  			 * The URL of the web document that is stopped.
  			 */
  var url: String
}

object WebViewBlacklisturlEvent {
  @scala.inline
  def apply(source: WebView, url: String): WebViewBlacklisturlEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewBlacklisturlEvent]
  }
}

