package typings.swaggerJsdoc.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuthFlows
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var authorizationCode: js.UndefOr[OAuthFlow] = js.undefined
  
  var clientCredentials: js.UndefOr[OAuthFlow] = js.undefined
  
  var `implicit`: js.UndefOr[OAuthFlow] = js.undefined
  
  var password: js.UndefOr[OAuthFlow] = js.undefined
}
object OAuthFlows {
  
  inline def apply(): OAuthFlows = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuthFlows]
  }
  
  extension [Self <: OAuthFlows](x: Self) {
    
    inline def setAuthorizationCode(value: OAuthFlow): Self = StObject.set(x, "authorizationCode", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationCodeUndefined: Self = StObject.set(x, "authorizationCode", js.undefined)
    
    inline def setClientCredentials(value: OAuthFlow): Self = StObject.set(x, "clientCredentials", value.asInstanceOf[js.Any])
    
    inline def setClientCredentialsUndefined: Self = StObject.set(x, "clientCredentials", js.undefined)
    
    inline def setImplicit(value: OAuthFlow): Self = StObject.set(x, "implicit", value.asInstanceOf[js.Any])
    
    inline def setImplicitUndefined: Self = StObject.set(x, "implicit", js.undefined)
    
    inline def setPassword(value: OAuthFlow): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
  }
}
