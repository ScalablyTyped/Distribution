package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a web view receives a server redirect.
  */
@js.native
trait WebViewRedirectEvent extends WebViewBaseEvent {
  /**
    * Page title of webpage.
    */
  var title: String = js.native
  /**
    * URL of the web document being loaded.
    */
  var url: String = js.native
}

object WebViewRedirectEvent {
  @scala.inline
  def apply(source: WebView, title: String, url: String): WebViewRedirectEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewRedirectEvent]
  }
  @scala.inline
  implicit class WebViewRedirectEventOps[Self <: WebViewRedirectEvent] (val x: Self) extends AnyVal {
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

