package typings.twit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options
  extends StObject
     with ConfigKeys {
  
  var app_only_auth: js.UndefOr[Boolean] = js.undefined
  
  var strictSSL: js.UndefOr[Boolean] = js.undefined
  
  var timeout_ms: js.UndefOr[Double] = js.undefined
  
  var trusted_cert_fingerprints: js.UndefOr[js.Array[String]] = js.undefined
}
object Options {
  
  inline def apply(consumer_key: String, consumer_secret: String): Options = {
    val __obj = js.Dynamic.literal(consumer_key = consumer_key.asInstanceOf[js.Any], consumer_secret = consumer_secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setApp_only_auth(value: Boolean): Self = StObject.set(x, "app_only_auth", value.asInstanceOf[js.Any])
    
    inline def setApp_only_authUndefined: Self = StObject.set(x, "app_only_auth", js.undefined)
    
    inline def setStrictSSL(value: Boolean): Self = StObject.set(x, "strictSSL", value.asInstanceOf[js.Any])
    
    inline def setStrictSSLUndefined: Self = StObject.set(x, "strictSSL", js.undefined)
    
    inline def setTimeout_ms(value: Double): Self = StObject.set(x, "timeout_ms", value.asInstanceOf[js.Any])
    
    inline def setTimeout_msUndefined: Self = StObject.set(x, "timeout_ms", js.undefined)
    
    inline def setTrusted_cert_fingerprints(value: js.Array[String]): Self = StObject.set(x, "trusted_cert_fingerprints", value.asInstanceOf[js.Any])
    
    inline def setTrusted_cert_fingerprintsUndefined: Self = StObject.set(x, "trusted_cert_fingerprints", js.undefined)
    
    inline def setTrusted_cert_fingerprintsVarargs(value: String*): Self = StObject.set(x, "trusted_cert_fingerprints", js.Array(value*))
  }
}
