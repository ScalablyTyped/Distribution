package typings.stripe.mod.oauth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOAuthDeauthorizationResponse extends js.Object {
  /**
    * The unique id of the account you have revoked access to, as a string. This is the same as the stripe_user_id you passed in. If this is returned, the revocation was successful.
    */
  var stripe_user_id: String
}

object IOAuthDeauthorizationResponse {
  @scala.inline
  def apply(stripe_user_id: String): IOAuthDeauthorizationResponse = {
    val __obj = js.Dynamic.literal(stripe_user_id = stripe_user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOAuthDeauthorizationResponse]
  }
}

