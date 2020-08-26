package typings.stripe.anon

import typings.stripe.stripeStrings.listed
import typings.stripe.stripeStrings.rejectedDotlisted
import typings.stripe.stripeStrings.under_review
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pastdue extends js.Object {
  /**
    * If the cardholder is disabled, this string describes why. Can be one of listed, rejected.listed, or under_review.
    */
  var disabled_reason: listed | rejectedDotlisted | under_review = js.native
  /**
    * If not empty, this field contains the list of fields that need to be collected in order to verify and re-enabled the cardholder.
    */
  var past_due: js.Array[String] = js.native
}

object Pastdue {
  @scala.inline
  def apply(disabled_reason: listed | rejectedDotlisted | under_review, past_due: js.Array[String]): Pastdue = {
    val __obj = js.Dynamic.literal(disabled_reason = disabled_reason.asInstanceOf[js.Any], past_due = past_due.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pastdue]
  }
  @scala.inline
  implicit class PastdueOps[Self <: Pastdue] (val x: Self) extends AnyVal {
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
    def setDisabled_reason(value: listed | rejectedDotlisted | under_review): Self = this.set("disabled_reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setPast_dueVarargs(value: String*): Self = this.set("past_due", js.Array(value :_*))
    @scala.inline
    def setPast_due(value: js.Array[String]): Self = this.set("past_due", value.asInstanceOf[js.Any])
  }
  
}

