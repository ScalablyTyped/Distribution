package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired before the web view starts loading its content.
  */
@js.native
trait WebViewBeforeloadEvent extends WebViewBaseEvent {
  /**
    * Indicate if the event was generated from the main page or an iframe.
    */
  var isMainFrame: Boolean = js.native
  /**
    * Constant indicating the user's action.
    */
  var navigationType: Double = js.native
  /**
    * URL of the web document being loaded.
    */
  var url: String = js.native
}

object WebViewBeforeloadEvent {
  @scala.inline
  def apply(isMainFrame: Boolean, navigationType: Double, source: WebView, url: String): WebViewBeforeloadEvent = {
    val __obj = js.Dynamic.literal(isMainFrame = isMainFrame.asInstanceOf[js.Any], navigationType = navigationType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewBeforeloadEvent]
  }
  @scala.inline
  implicit class WebViewBeforeloadEventOps[Self <: WebViewBeforeloadEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsMainFrame(value: Boolean): Self = this.set("isMainFrame", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavigationType(value: Double): Self = this.set("navigationType", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

