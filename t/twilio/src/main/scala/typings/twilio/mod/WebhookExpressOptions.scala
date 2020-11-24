package typings.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebhookExpressOptions extends js.Object {
  
  // manually specify the host name used by Twilio in a number's webhook config
  var host: js.UndefOr[String] = js.native
  
  // manually specify the protocol used by Twilio in a number's webhook config
  var protocol: js.UndefOr[String] = js.native
  
  // The full URL (with query string) you used to configure the webhook with Twilio - overrides host/protocol options
  var url: js.UndefOr[String] = js.native
}
object WebhookExpressOptions {
  
  @scala.inline
  def apply(): WebhookExpressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebhookExpressOptions]
  }
  
  @scala.inline
  implicit class WebhookExpressOptionsOps[Self <: WebhookExpressOptions] (val x: Self) extends AnyVal {
    
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
