package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AadOauthTokenResult extends StObject {
  
  var accessToken: String
  
  var refreshTokenCache: String
}
object AadOauthTokenResult {
  
  @scala.inline
  def apply(accessToken: String, refreshTokenCache: String): AadOauthTokenResult = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], refreshTokenCache = refreshTokenCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[AadOauthTokenResult]
  }
  
  @scala.inline
  implicit class AadOauthTokenResultMutableBuilder[Self <: AadOauthTokenResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshTokenCache(value: String): Self = StObject.set(x, "refreshTokenCache", value.asInstanceOf[js.Any])
  }
}
