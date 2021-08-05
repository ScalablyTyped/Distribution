package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessTokenOptions extends StObject {
  
  var identity: String
  
  var nbf: Double
  
  var ttl: Double
}
object AccessTokenOptions {
  
  inline def apply(identity: String, nbf: Double, ttl: Double): AccessTokenOptions = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], nbf = nbf.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessTokenOptions]
  }
  
  extension [Self <: AccessTokenOptions](x: Self) {
    
    inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setNbf(value: Double): Self = StObject.set(x, "nbf", value.asInstanceOf[js.Any])
    
    inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
  }
}
