package typings.stripe

import typings.stripe.stripeStrings.listed
import typings.stripe.stripeStrings.rejectedDotlisted
import typings.stripe.stripeStrings.under_review
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPastdue extends js.Object {
  /**
    * If the cardholder is disabled, this string describes why. Can be one of listed, rejected.listed, or under_review.
    */
  var disabled_reason: listed | rejectedDotlisted | under_review
  /**
    * If not empty, this field contains the list of fields that need to be collected in order to verify and re-enabled the cardholder.
    */
  var past_due: js.Array[String]
}

object AnonPastdue {
  @scala.inline
  def apply(disabled_reason: listed | rejectedDotlisted | under_review, past_due: js.Array[String]): AnonPastdue = {
    val __obj = js.Dynamic.literal(disabled_reason = disabled_reason.asInstanceOf[js.Any], past_due = past_due.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPastdue]
  }
}

