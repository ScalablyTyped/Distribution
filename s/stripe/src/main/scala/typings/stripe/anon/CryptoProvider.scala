package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CryptoProvider extends StObject {
  
  /**
    * Optional CryptoProvider to use for computing HMAC signatures, if no
    * signature is given.
    */
  var cryptoProvider: js.UndefOr[typings.stripe.mod.Stripe.CryptoProvider] = js.undefined
  
  /**
    * JSON stringified payload object, containing the 'id' and 'object' parameters.
    */
  var payload: String
  
  /**
    * Version of API to hit. Defaults to 'v1'.
    */
  var scheme: js.UndefOr[String] = js.undefined
  
  /**
    * Stripe webhook secret, e.g., 'whsec_...'.
    */
  var secret: String
  
  /**
    * Computed webhook signature.
    */
  var signature: js.UndefOr[String] = js.undefined
  
  /**
    * Timestamp of the header. Defaults to Date.now().
    */
  var timestamp: js.UndefOr[Double] = js.undefined
}
object CryptoProvider {
  
  inline def apply(payload: String, secret: String): CryptoProvider = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoProvider]
  }
  
  extension [Self <: CryptoProvider](x: Self) {
    
    inline def setCryptoProvider(value: typings.stripe.mod.Stripe.CryptoProvider): Self = StObject.set(x, "cryptoProvider", value.asInstanceOf[js.Any])
    
    inline def setCryptoProviderUndefined: Self = StObject.set(x, "cryptoProvider", js.undefined)
    
    inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
