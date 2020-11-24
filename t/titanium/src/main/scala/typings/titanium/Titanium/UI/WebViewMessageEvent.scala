package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when a script message is received from a webpage.
  */
@js.native
trait WebViewMessageEvent extends WebViewBaseEvent {
  
  /**
    * The body of the message sent from webview.
    */
  var body: String = js.native
  
  /**
    * A Boolean value indicating whether the frame is the web site's main frame or a subframe.
    */
  var isMainFrame: Boolean = js.native
  
  /**
    * The name of the message handler to which the message is sent.
    */
  var name: String = js.native
  
  /**
    * URL of the web document being loaded.
    */
  var url: String = js.native
}
object WebViewMessageEvent {
  
  @scala.inline
  def apply(body: String, isMainFrame: Boolean, name: String, source: WebView, url: String): WebViewMessageEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], isMainFrame = isMainFrame.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewMessageEvent]
  }
  
  @scala.inline
  implicit class WebViewMessageEventOps[Self <: WebViewMessageEvent] (val x: Self) extends AnyVal {
    
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMainFrame(value: Boolean): Self = this.set("isMainFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
