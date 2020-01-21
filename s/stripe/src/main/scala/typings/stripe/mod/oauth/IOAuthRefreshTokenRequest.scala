package typings.stripe.mod.oauth

import typings.stripe.stripeStrings.refresh_token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOAuthRefreshTokenRequest extends js.Object {
  /**
    * Check whether the suggested_capabilities were applied to the connected account.
    */
  var assert_capabilities: js.UndefOr[String] = js.undefined
  /**
    * use a refresh token to get a new access token.
    */
  var grant_type: refresh_token
  /**
    * The value of the refresh_token
    */
  var refresh_token: String
  /**
    * When requesting a new access token from a refresh token, any scope that has an equal or lesser scope as the refresh token.
    *
    * Defaults to the scope of the refresh token.
    */
  var scope: js.UndefOr[String] = js.undefined
}

object IOAuthRefreshTokenRequest {
  @scala.inline
  def apply(
    grant_type: refresh_token,
    refresh_token: String,
    assert_capabilities: String = null,
    scope: String = null
  ): IOAuthRefreshTokenRequest = {
    val __obj = js.Dynamic.literal(grant_type = grant_type.asInstanceOf[js.Any], refresh_token = refresh_token.asInstanceOf[js.Any])
    if (assert_capabilities != null) __obj.updateDynamic("assert_capabilities")(assert_capabilities.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOAuthRefreshTokenRequest]
  }
}

