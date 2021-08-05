package typings.stripe.mod.resources

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebHookGenerateTestHeaderStringOptions extends StObject {
  
  /**
    * JSON stringified payload object, containing the 'id' and 'object' parameters
    */
  var payload: js.UndefOr[String] = js.undefined
  
  /**
    * Version of API to hit. Defaults to 'v1'.
    */
  var scheme: js.UndefOr[String] = js.undefined
  
  /**
    * Stripe webhook secret 'whsec_...'
    */
  var secret: js.UndefOr[String] = js.undefined
  
  /**
    * Computed webhook signature
    */
  var signature: js.UndefOr[String] = js.undefined
  
  /**
    * Timestamp of the header. Defaults to Date.now()
    */
  var timestamp: js.UndefOr[Double] = js.undefined
}
object IWebHookGenerateTestHeaderStringOptions {
  
  inline def apply(): IWebHookGenerateTestHeaderStringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWebHookGenerateTestHeaderStringOptions]
  }
  
  extension [Self <: IWebHookGenerateTestHeaderStringOptions](x: Self) {
    
    inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
