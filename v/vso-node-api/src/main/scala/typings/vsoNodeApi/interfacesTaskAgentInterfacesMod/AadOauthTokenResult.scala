package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AadOauthTokenResult extends StObject {
  
  var accessToken: String
  
  var refreshTokenCache: String
}
object AadOauthTokenResult {
  
  inline def apply(accessToken: String, refreshTokenCache: String): AadOauthTokenResult = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], refreshTokenCache = refreshTokenCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[AadOauthTokenResult]
  }
  
  extension [Self <: AadOauthTokenResult](x: Self) {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenCache(value: String): Self = StObject.set(x, "refreshTokenCache", value.asInstanceOf[js.Any])
  }
}
