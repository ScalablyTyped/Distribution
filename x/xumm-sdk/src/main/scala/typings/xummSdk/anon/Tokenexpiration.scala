package typings.xummSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tokenexpiration extends StObject {
  
  var token_expiration: Double
  
  var token_issued: Double
  
  var user_token: String
}
object Tokenexpiration {
  
  inline def apply(token_expiration: Double, token_issued: Double, user_token: String): Tokenexpiration = {
    val __obj = js.Dynamic.literal(token_expiration = token_expiration.asInstanceOf[js.Any], token_issued = token_issued.asInstanceOf[js.Any], user_token = user_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tokenexpiration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tokenexpiration] (val x: Self) extends AnyVal {
    
    inline def setToken_expiration(value: Double): Self = StObject.set(x, "token_expiration", value.asInstanceOf[js.Any])
    
    inline def setToken_issued(value: Double): Self = StObject.set(x, "token_issued", value.asInstanceOf[js.Any])
    
    inline def setUser_token(value: String): Self = StObject.set(x, "user_token", value.asInstanceOf[js.Any])
  }
}
