package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired before the web view starts loading its content.
  */
trait WebViewBeforeloadEvent extends WebViewBaseEvent {
  /**
    * Indicate if the event was generated from the main page or an iframe.
    */
  var isMainFrame: Boolean
  /**
    * Constant indicating the user's action.
    */
  var navigationType: Double
  /**
    * URL of the web document being loaded.
    */
  var url: String
}

object WebViewBeforeloadEvent {
  @scala.inline
  def apply(isMainFrame: Boolean, navigationType: Double, source: WebView, url: String): WebViewBeforeloadEvent = {
    val __obj = js.Dynamic.literal(isMainFrame = isMainFrame.asInstanceOf[js.Any], navigationType = navigationType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewBeforeloadEvent]
  }
}

