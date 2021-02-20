package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthMechanism extends StObject {
  
  var authMechanism: String = js.native
}
object AuthMechanism {
  
  @scala.inline
  def apply(authMechanism: String): AuthMechanism = {
    val __obj = js.Dynamic.literal(authMechanism = authMechanism.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthMechanism]
  }
  
  @scala.inline
  implicit class AuthMechanismMutableBuilder[Self <: AuthMechanism] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthMechanism(value: String): Self = StObject.set(x, "authMechanism", value.asInstanceOf[js.Any])
  }
}
