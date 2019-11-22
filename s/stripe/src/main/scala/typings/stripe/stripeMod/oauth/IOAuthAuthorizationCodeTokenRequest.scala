package typings.stripe.stripeMod.oauth

import typings.stripe.stripeStrings.authorization_code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOAuthAuthorizationCodeTokenRequest extends js.Object {
  /**
    * Check whether the suggested_capabilities were applied to the connected account.
    */
  var assert_capabilities: js.UndefOr[String] = js.undefined
  /**
    * The value of the code
    */
  var code: String
  /**
    * authorization_code when turning an authorization code into an access token
    */
  var grant_type: authorization_code
  /**
    * Has no effect when requesting an access token from an authorization code.
    */
  var scope: js.UndefOr[String] = js.undefined
}

object IOAuthAuthorizationCodeTokenRequest {
  @scala.inline
  def apply(
    code: String,
    grant_type: authorization_code,
    assert_capabilities: String = null,
    scope: String = null
  ): IOAuthAuthorizationCodeTokenRequest = {
    val __obj = js.Dynamic.literal(code = code, grant_type = grant_type)
    if (assert_capabilities != null) __obj.updateDynamic("assert_capabilities")(assert_capabilities)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[IOAuthAuthorizationCodeTokenRequest]
  }
}

