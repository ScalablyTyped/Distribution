package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessTokenOptions extends StObject {
  
  var identity: String = js.native
  
  var nbf: Double = js.native
  
  var ttl: Double = js.native
}
object AccessTokenOptions {
  
  @scala.inline
  def apply(identity: String, nbf: Double, ttl: Double): AccessTokenOptions = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], nbf = nbf.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessTokenOptions]
  }
  
  @scala.inline
  implicit class AccessTokenOptionsMutableBuilder[Self <: AccessTokenOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNbf(value: Double): Self = StObject.set(x, "nbf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
  }
}
