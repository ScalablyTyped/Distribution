package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebhookOptions extends StObject {
  
  var host: js.UndefOr[String] = js.undefined
  
  var includeHelpers: js.UndefOr[Boolean] = js.undefined
  
  var protocol: js.UndefOr[String] = js.undefined
  
  var validate: js.UndefOr[Boolean] = js.undefined
}
object WebhookOptions {
  
  inline def apply(): WebhookOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebhookOptions]
  }
  
  extension [Self <: WebhookOptions](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setIncludeHelpers(value: Boolean): Self = StObject.set(x, "includeHelpers", value.asInstanceOf[js.Any])
    
    inline def setIncludeHelpersUndefined: Self = StObject.set(x, "includeHelpers", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
