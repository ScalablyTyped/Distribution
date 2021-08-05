package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Authenticated extends StObject {
  
  /**
    * Whether or not authentication was performed. 3D Secure will succeed without authentication when the
    * card is not enrolled.
    */
  var authenticated: Boolean
  
  /**
    * Whether or not 3D Secure succeeded.
    */
  var succeeded: Boolean
  
  /**
    * The version of 3D Secure that was used for this payment.
    */
  var version: String
}
object Authenticated {
  
  inline def apply(authenticated: Boolean, succeeded: Boolean, version: String): Authenticated = {
    val __obj = js.Dynamic.literal(authenticated = authenticated.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authenticated]
  }
  
  extension [Self <: Authenticated](x: Self) {
    
    inline def setAuthenticated(value: Boolean): Self = StObject.set(x, "authenticated", value.asInstanceOf[js.Any])
    
    inline def setSucceeded(value: Boolean): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
