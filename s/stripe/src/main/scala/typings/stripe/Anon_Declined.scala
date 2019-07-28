package typings.stripe

import typings.stripe.stripeStrings.declined
import typings.stripe.stripeStrings.failed
import typings.stripe.stripeStrings.not_required
import typings.stripe.stripeStrings.pending
import typings.stripe.stripeStrings.processing_error
import typings.stripe.stripeStrings.succeeded
import typings.stripe.stripeStrings.user_abort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Declined extends js.Object {
  var failure_reason: js.UndefOr[user_abort | declined | processing_error] = js.undefined
  var return_url: String
  var status: pending | succeeded | not_required | failed
  var url: String
}

object Anon_Declined {
  @scala.inline
  def apply(
    return_url: String,
    status: pending | succeeded | not_required | failed,
    url: String,
    failure_reason: user_abort | declined | processing_error = null
  ): Anon_Declined = {
    val __obj = js.Dynamic.literal(return_url = return_url, status = status.asInstanceOf[js.Any], url = url)
    if (failure_reason != null) __obj.updateDynamic("failure_reason")(failure_reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Declined]
  }
}

