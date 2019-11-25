package typings.stripe.stripeMod.customerTaxIds

import typings.stripe.stripeStrings.pending
import typings.stripe.stripeStrings.unavailable
import typings.stripe.stripeStrings.unverified
import typings.stripe.stripeStrings.verified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITaxIdVerification extends js.Object {
  /**
    * Verification status, one of pending, unavailable, unverified, or verified.
    */
  var status: pending | unavailable | unverified | verified
  /**
    * Verified address.
    */
  var verified_address: String
  /**
    * Verified name.
    */
  var verified_name: String
}

object ITaxIdVerification {
  @scala.inline
  def apply(
    status: pending | unavailable | unverified | verified,
    verified_address: String,
    verified_name: String
  ): ITaxIdVerification = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], verified_address = verified_address.asInstanceOf[js.Any], verified_name = verified_name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITaxIdVerification]
  }
}

