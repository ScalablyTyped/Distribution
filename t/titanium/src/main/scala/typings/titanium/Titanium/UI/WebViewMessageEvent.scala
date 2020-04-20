package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when a script message is received from a webpage.
		 */
trait WebViewMessageEvent extends WebViewBaseEvent {
  /**
  			 * The body of the message sent from webview.
  			 */
  var body: String
  /**
  			 * A Boolean value indicating whether the frame is the web site's main frame or a subframe.
  			 */
  var isMainFrame: Boolean
  /**
  			 * The name of the message handler to which the message is sent.
  			 */
  var name: String
  /**
  			 * URL of the web document being loaded.
  			 */
  var url: String
}

object WebViewMessageEvent {
  @scala.inline
  def apply(body: String, isMainFrame: Boolean, name: String, source: WebView, url: String): WebViewMessageEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], isMainFrame = isMainFrame.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewMessageEvent]
  }
}

