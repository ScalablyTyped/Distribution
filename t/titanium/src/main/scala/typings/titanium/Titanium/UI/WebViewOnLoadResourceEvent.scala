package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when loading resource.
		 */
trait WebViewOnLoadResourceEvent extends WebViewBaseEvent {
  /**
  			 * The url of the resource that will load.
  			 */
  var url: String
}

object WebViewOnLoadResourceEvent {
  @scala.inline
  def apply(source: WebView, url: String): WebViewOnLoadResourceEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewOnLoadResourceEvent]
  }
}

