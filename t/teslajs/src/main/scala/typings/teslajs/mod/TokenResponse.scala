package typings.teslajs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenResponse extends js.Object {
  
  var authToken: String = js.native
  
  var body: js.Object = js.native
  
  var refreshToken: String = js.native
  
  var response: js.Object = js.native
}
object TokenResponse {
  
  @scala.inline
  def apply(authToken: String, body: js.Object, refreshToken: String, response: js.Object): TokenResponse = {
    val __obj = js.Dynamic.literal(authToken = authToken.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenResponse]
  }
  
  @scala.inline
  implicit class TokenResponseOps[Self <: TokenResponse] (val x: Self) extends AnyVal {
    
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
    def setAuthToken(value: String): Self = this.set("authToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: js.Object): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshToken(value: String): Self = this.set("refreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: js.Object): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
