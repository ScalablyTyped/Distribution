package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when webpage download progresses.
		 */
trait WebViewProgressEvent extends WebViewBaseEvent {
  /**
  			 * URL of the web document being loaded.
  			 */
  var url: String
  /**
  			 * An estimate of what fraction of the current navigation has been loaded.
  			 */
  var value: Double
}

object WebViewProgressEvent {
  @scala.inline
  def apply(source: WebView, url: String, value: Double): WebViewProgressEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewProgressEvent]
  }
}

