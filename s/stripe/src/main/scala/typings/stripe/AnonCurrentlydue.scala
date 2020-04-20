package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrentlydue extends js.Object {
  /**
    * Fields that need to be collected to keep the person’s account enabled.
    * If not collected by the account’s current_deadline, these fields appear in past_due as well, and the account is disabled.
    */
  var currently_due: js.Array[String]
  /**
    * Fields that need to be collected assuming all volume thresholds are reached.
    * As fields are needed, they are moved to currently_due and the account’s current_deadline is set.
    */
  var eventually_due: js.Array[String]
  /**
    * Fields that weren’t collected by the account’s current_deadline.
    * These fields need to be collected to enable payouts for the person’s account.
    */
  var past_due: js.Array[String]
  /**
    * Fields that may become required depending on the results of verification or review.
    * An empty array unless an asynchronous verification is pending.
    * If verification fails, the fields in this array become required and move to currently_due or past_due.
    */
  var pending_verification: js.Array[String]
}

object AnonCurrentlydue {
  @scala.inline
  def apply(
    currently_due: js.Array[String],
    eventually_due: js.Array[String],
    past_due: js.Array[String],
    pending_verification: js.Array[String]
  ): AnonCurrentlydue = {
    val __obj = js.Dynamic.literal(currently_due = currently_due.asInstanceOf[js.Any], eventually_due = eventually_due.asInstanceOf[js.Any], past_due = past_due.asInstanceOf[js.Any], pending_verification = pending_verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrentlydue]
  }
}

