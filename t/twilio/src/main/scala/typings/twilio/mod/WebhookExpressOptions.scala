package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebhookExpressOptions extends StObject {
  
  // manually specify the host name used by Twilio in a number's webhook config
  var host: js.UndefOr[String] = js.undefined
  
  // manually specify the protocol used by Twilio in a number's webhook config
  var protocol: js.UndefOr[String] = js.undefined
  
  // The full URL (with query string) you used to configure the webhook with Twilio - overrides host/protocol options
  var url: js.UndefOr[String] = js.undefined
}
object WebhookExpressOptions {
  
  inline def apply(): WebhookExpressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebhookExpressOptions]
  }
  
  extension [Self <: WebhookExpressOptions](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
