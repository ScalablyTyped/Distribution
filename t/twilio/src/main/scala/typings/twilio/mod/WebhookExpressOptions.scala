package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebhookExpressOptions extends StObject {
  
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
  implicit class WebhookExpressOptionsMutableBuilder[Self <: WebhookExpressOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
