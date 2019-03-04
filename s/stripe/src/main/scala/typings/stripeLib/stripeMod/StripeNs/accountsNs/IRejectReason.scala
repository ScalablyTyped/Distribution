package typings
package stripeLib.stripeMod.StripeNs.accountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRejectReason extends js.Object {
  /**
    * The reason for rejecting the account. May be one of "fraud",
    * "terms_of_service", or "other".
    */
  var reason: stripeLib.stripeLibStrings.fraud | stripeLib.stripeLibStrings.terms_of_service | stripeLib.stripeLibStrings.other
}

object IRejectReason {
  @scala.inline
  def apply(
    reason: stripeLib.stripeLibStrings.fraud | stripeLib.stripeLibStrings.terms_of_service | stripeLib.stripeLibStrings.other
  ): IRejectReason = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRejectReason]
  }
}

