package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AadOauthTokenResult extends js.Object {
  
  var accessToken: String = js.native
  
  var refreshTokenCache: String = js.native
}
object AadOauthTokenResult {
  
  @scala.inline
  def apply(accessToken: String, refreshTokenCache: String): AadOauthTokenResult = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], refreshTokenCache = refreshTokenCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[AadOauthTokenResult]
  }
  
  @scala.inline
  implicit class AadOauthTokenResultOps[Self <: AadOauthTokenResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshTokenCache(value: String): Self = this.set("refreshTokenCache", value.asInstanceOf[js.Any])
  }
}
