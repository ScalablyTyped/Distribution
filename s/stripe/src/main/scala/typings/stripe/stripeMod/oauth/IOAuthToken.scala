package typings.stripe.stripeMod.oauth

import typings.stripe.stripeStrings.bearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOAuthToken extends js.Object {
  /**
    * The access token you can use to make requests on behalf of this Stripe account. Use it as you would any Stripe secret API key.
    *
    * This key does not expire, but may be revoked by the user at any time (you'll get a account.application.deauthorized webhook event when this happens).
    */
  var access_token: String
  /**
    * The live mode indicator for the token. If true, the access_token can be used as a live secret key. If false, the access_token can be used as a test secret key.
    *
    * Depends on the mode of the secret API key used to make the request.
    */
  var livemode: Boolean
  /**
    * Can be used to get a new access token of an equal or lesser scope, or of a different live mode (where applicable).
    */
  var refresh_token: String
  /**
    * The scope granted to the access token, depending on the scope of the authorization code and scope parameter.
    */
  var scope: String
  /**
    * A publishable key that can be used with this account. Matches the mode—live or test—of the token.
    */
  var stripe_publishable_key: String
  /**
    * The unique id of the account you have been granted access to, as a string.
    */
  var stripe_user_id: String
  /**
    * Will always have a value of bearer.
    */
  var token_type: bearer
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
    val __obj = js.Dynamic.literal(access_token = access_token, livemode = livemode, refresh_token = refresh_token, scope = scope, stripe_publishable_key = stripe_publishable_key, stripe_user_id = stripe_user_id, token_type = token_type)
  
    __obj.asInstanceOf[IOAuthToken]
  }
}

