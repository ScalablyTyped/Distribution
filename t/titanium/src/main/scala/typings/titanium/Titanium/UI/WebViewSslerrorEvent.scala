package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when an SSL error occurred.
  */
trait WebViewSslerrorEvent extends WebViewBaseEvent {
  /**
    * SSL error code.
    */
  var code: Double
}

object WebViewSslerrorEvent {
  @scala.inline
  def apply(code: Double, source: WebView): WebViewSslerrorEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewSslerrorEvent]
  }
}

