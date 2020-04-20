package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when a web view receives a server redirect.
		 */
trait WebViewRedirectEvent extends WebViewBaseEvent {
  /**
  			 * Page title of webpage.
  			 */
  var title: String
  /**
  			 * URL of the web document being loaded.
  			 */
  var url: String
}

object WebViewRedirectEvent {
  @scala.inline
  def apply(source: WebView, title: String, url: String): WebViewRedirectEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewRedirectEvent]
  }
}

