package typings.stripe.stripeMod.accountsNs

import typings.stripe.stripeStrings.fraud
import typings.stripe.stripeStrings.other
import typings.stripe.stripeStrings.terms_of_service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRejectReason extends js.Object {
  /**
    * The reason for rejecting the account. May be one of "fraud",
    * "terms_of_service", or "other".
    */
  var reason: fraud | terms_of_service | other
}

object IRejectReason {
  @scala.inline
  def apply(reason: fraud | terms_of_service | other): IRejectReason = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRejectReason]
  }
}

