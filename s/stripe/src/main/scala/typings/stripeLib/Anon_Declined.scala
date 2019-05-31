package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Declined extends js.Object {
  var failure_reason: js.UndefOr[
    stripeLib.stripeLibStrings.user_abort | stripeLib.stripeLibStrings.declined | stripeLib.stripeLibStrings.processing_error
  ] = js.undefined
  var return_url: java.lang.String
  var status: stripeLib.stripeLibStrings.pending | stripeLib.stripeLibStrings.succeeded | stripeLib.stripeLibStrings.not_required | stripeLib.stripeLibStrings.failed
  var url: java.lang.String
}

object Anon_Declined {
  @scala.inline
  def apply(
    return_url: java.lang.String,
    status: stripeLib.stripeLibStrings.pending | stripeLib.stripeLibStrings.succeeded | stripeLib.stripeLibStrings.not_required | stripeLib.stripeLibStrings.failed,
    url: java.lang.String,
    failure_reason: stripeLib.stripeLibStrings.user_abort | stripeLib.stripeLibStrings.declined | stripeLib.stripeLibStrings.processing_error = null
  ): Anon_Declined = {
    val __obj = js.Dynamic.literal(return_url = return_url, status = status.asInstanceOf[js.Any], url = url)
    if (failure_reason != null) __obj.updateDynamic("failure_reason")(failure_reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Declined]
  }
}

