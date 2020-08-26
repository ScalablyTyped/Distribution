package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when webpage download progresses.
  */
@js.native
trait WebViewProgressEvent extends WebViewBaseEvent {
  /**
    * URL of the web document being loaded.
    */
  var url: String = js.native
  /**
    * An estimate of what fraction of the current navigation has been loaded.
    */
  var value: Double = js.native
}

object WebViewProgressEvent {
  @scala.inline
  def apply(source: WebView, url: String, value: Double): WebViewProgressEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewProgressEvent]
  }
  @scala.inline
  implicit class WebViewProgressEventOps[Self <: WebViewProgressEvent] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

