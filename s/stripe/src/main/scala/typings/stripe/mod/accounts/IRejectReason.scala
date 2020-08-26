package typings.stripe.mod.accounts

import typings.stripe.stripeStrings.fraud
import typings.stripe.stripeStrings.other
import typings.stripe.stripeStrings.terms_of_service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRejectReason extends js.Object {
  /**
    * The reason for rejecting the account. May be one of "fraud",
    * "terms_of_service", or "other".
    */
  var reason: fraud | terms_of_service | other = js.native
}

object IRejectReason {
  @scala.inline
  def apply(reason: fraud | terms_of_service | other): IRejectReason = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRejectReason]
  }
  @scala.inline
  implicit class IRejectReasonOps[Self <: IRejectReason] (val x: Self) extends AnyVal {
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
    def setReason(value: fraud | terms_of_service | other): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
  
}

