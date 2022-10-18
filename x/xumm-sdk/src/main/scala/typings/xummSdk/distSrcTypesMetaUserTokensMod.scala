package typings.xummSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesMetaUserTokensMod {
  
  trait UserTokenResponse extends StObject {
    
    var tokens: js.Array[UserTokenValidity]
  }
  object UserTokenResponse {
    
    inline def apply(tokens: js.Array[UserTokenValidity]): UserTokenResponse = {
      val __obj = js.Dynamic.literal(tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserTokenResponse]
    }
    
    extension [Self <: UserTokenResponse](x: Self) {
      
      inline def setTokens(value: js.Array[UserTokenValidity]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensVarargs(value: UserTokenValidity*): Self = StObject.set(x, "tokens", js.Array(value*))
    }
  }
  
  trait UserTokenValidity extends StObject {
    
    var active: Boolean
    
    var expires: js.UndefOr[Double] = js.undefined
    
    var issued: js.UndefOr[Double] = js.undefined
    
    var user_token: String
  }
  object UserTokenValidity {
    
    inline def apply(active: Boolean, user_token: String): UserTokenValidity = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], user_token = user_token.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserTokenValidity]
    }
    
    extension [Self <: UserTokenValidity](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setIssued(value: Double): Self = StObject.set(x, "issued", value.asInstanceOf[js.Any])
      
      inline def setIssuedUndefined: Self = StObject.set(x, "issued", js.undefined)
      
      inline def setUser_token(value: String): Self = StObject.set(x, "user_token", value.asInstanceOf[js.Any])
    }
  }
}
