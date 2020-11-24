package typings.stripe.mod.oauth

import typings.stripe.stripeStrings.authorization_code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOAuthAuthorizationCodeTokenRequest extends js.Object {
  
  /**
    * Check whether the suggested_capabilities were applied to the connected account.
    */
  var assert_capabilities: js.UndefOr[String] = js.native
  
  /**
    * The value of the code
    */
  var code: String = js.native
  
  /**
    * authorization_code when turning an authorization code into an access token
    */
  var grant_type: authorization_code = js.native
  
  /**
    * Has no effect when requesting an access token from an authorization code.
    */
  var scope: js.UndefOr[String] = js.native
}
object IOAuthAuthorizationCodeTokenRequest {
  
  @scala.inline
  def apply(code: String, grant_type: authorization_code): IOAuthAuthorizationCodeTokenRequest = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], grant_type = grant_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOAuthAuthorizationCodeTokenRequest]
  }
  
  @scala.inline
  implicit class IOAuthAuthorizationCodeTokenRequestOps[Self <: IOAuthAuthorizationCodeTokenRequest] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrant_type(value: authorization_code): Self = this.set("grant_type", value.asInstanceOf[js.Any])
    
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
