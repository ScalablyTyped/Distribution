package typings.stripe.mod.oauth

import typings.stripe.stripeStrings.bearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOAuthToken extends js.Object {
  
  /**
    * The access token you can use to make requests on behalf of this Stripe account. Use it as you would any Stripe secret API key.
    *
    * This key does not expire, but may be revoked by the user at any time (you'll get a account.application.deauthorized webhook event when this happens).
    */
  var access_token: String = js.native
  
  /**
    * The live mode indicator for the token. If true, the access_token can be used as a live secret key. If false, the access_token can be used as a test secret key.
    *
    * Depends on the mode of the secret API key used to make the request.
    */
  var livemode: Boolean = js.native
  
  /**
    * Can be used to get a new access token of an equal or lesser scope, or of a different live mode (where applicable).
    */
  var refresh_token: String = js.native
  
  /**
    * The scope granted to the access token, depending on the scope of the authorization code and scope parameter.
    */
  var scope: String = js.native
  
  /**
    * A publishable key that can be used with this account. Matches the mode—live or test—of the token.
    */
  var stripe_publishable_key: String = js.native
  
  /**
    * The unique id of the account you have been granted access to, as a string.
    */
  var stripe_user_id: String = js.native
  
  /**
    * Will always have a value of bearer.
    */
  var token_type: bearer = js.native
}
object IOAuthToken {
  
  @scala.inline
  def apply(
    access_token: String,
    livemode: Boolean,
    refresh_token: String,
    scope: String,
    stripe_publishable_key: String,
    stripe_user_id: String,
    token_type: bearer
  ): IOAuthToken = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], refresh_token = refresh_token.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], stripe_publishable_key = stripe_publishable_key.asInstanceOf[js.Any], stripe_user_id = stripe_user_id.asInstanceOf[js.Any], token_type = token_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOAuthToken]
  }
  
  @scala.inline
  implicit class IOAuthTokenOps[Self <: IOAuthToken] (val x: Self) extends AnyVal {
    
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
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh_token(value: String): Self = this.set("refresh_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripe_publishable_key(value: String): Self = this.set("stripe_publishable_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripe_user_id(value: String): Self = this.set("stripe_user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken_type(value: bearer): Self = this.set("token_type", value.asInstanceOf[js.Any])
  }
}
