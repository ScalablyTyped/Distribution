package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthMechanism extends StObject {
  
  var authMechanism: String
}
object AuthMechanism {
  
  inline def apply(authMechanism: String): AuthMechanism = {
    val __obj = js.Dynamic.literal(authMechanism = authMechanism.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthMechanism]
  }
  
  extension [Self <: AuthMechanism](x: Self) {
    
    inline def setAuthMechanism(value: String): Self = StObject.set(x, "authMechanism", value.asInstanceOf[js.Any])
  }
}
