package typings.stripejs.sourceMod

import typings.stripejs.stripejsStrings.declined
import typings.stripejs.stripejsStrings.failed
import typings.stripejs.stripejsStrings.not_required
import typings.stripejs.stripejsStrings.pending
import typings.stripejs.stripejsStrings.processing_error
import typings.stripejs.stripejsStrings.succeeded
import typings.stripejs.stripejsStrings.user_abort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Redirect extends js.Object {
  /**
    * The failure reason for the redirect
    * Present only if the redirect status is `'failed'`
    */
  var failure_reason: js.UndefOr[user_abort | declined | processing_error] = js.undefined
  /**
    * The URL you provide to redirect the customer to after they authenticated their payment
    */
  var return_url: String
  /**
    * The status of the redirect
    * - Pending: ready to be used by your customer to authenticate the transaction
    * - succeeded: succesful authentication, cannot be reused
    * - not_required: redirect should not be used
    * - failed: failed authentication, cannot be reused
    */
  var status: pending | succeeded | not_required | failed
  /**
    * The URL provided to you to redirect a customer to as part of a redirect
    * authentication flow
    */
  var url: String
}

object Redirect {
  @scala.inline
  def apply(
    return_url: String,
    status: pending | succeeded | not_required | failed,
    url: String,
    failure_reason: user_abort | declined | processing_error = null
  ): Redirect = {
    val __obj = js.Dynamic.literal(return_url = return_url, status = status.asInstanceOf[js.Any], url = url)
    if (failure_reason != null) __obj.updateDynamic("failure_reason")(failure_reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Redirect]
  }
}

