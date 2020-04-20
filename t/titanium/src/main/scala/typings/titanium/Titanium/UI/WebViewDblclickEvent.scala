package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the device detects a double click against the view.
		 */
trait WebViewDblclickEvent extends WebViewBaseEvent {
  /**
  			 * X coordinate of the event from the `source` view's coordinate system.
  			 */
  var x: Double
  /**
  			 * Y coordinate of the event from the `source` view's coordinate system.
  			 */
  var y: Double
}

object WebViewDblclickEvent {
  @scala.inline
  def apply(source: WebView, x: Double, y: Double): WebViewDblclickEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewDblclickEvent]
  }
}

