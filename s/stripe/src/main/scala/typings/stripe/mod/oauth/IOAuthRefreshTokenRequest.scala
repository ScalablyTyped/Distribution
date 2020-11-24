package typings.stripe.mod.oauth

import typings.stripe.stripeStrings.refresh_token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOAuthRefreshTokenRequest extends js.Object {
  
  /**
    * Check whether the suggested_capabilities were applied to the connected account.
    */
  var assert_capabilities: js.UndefOr[String] = js.native
  
  /**
    * use a refresh token to get a new access token.
    */
  var grant_type: refresh_token = js.native
  
  /**
    * The value of the refresh_token
    */
  var refresh_token: String = js.native
  
  /**
    * When requesting a new access token from a refresh token, any scope that has an equal or lesser scope as the refresh token.
    *
    * Defaults to the scope of the refresh token.
    */
  var scope: js.UndefOr[String] = js.native
}
object IOAuthRefreshTokenRequest {
  
  @scala.inline
  def apply(grant_type: refresh_token, refresh_token: String): IOAuthRefreshTokenRequest = {
    val __obj = js.Dynamic.literal(grant_type = grant_type.asInstanceOf[js.Any], refresh_token = refresh_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOAuthRefreshTokenRequest]
  }
  
  @scala.inline
  implicit class IOAuthRefreshTokenRequestOps[Self <: IOAuthRefreshTokenRequest] (val x: Self) extends AnyVal {
    
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
    def setGrant_type(value: refresh_token): Self = this.set("grant_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh_token(value: String): Self = this.set("refresh_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssert_capabilities(value: String): Self = this.set("assert_capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssert_capabilities: Self = this.set("assert_capabilities", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
}
