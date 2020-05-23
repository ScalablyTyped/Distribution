package typings.stripe.mod.accounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccountRequirements extends js.Object {
  /**
    * The date the fields in currently_due must be collected by to keep payouts enabled for the account.
    * These fields might block payouts sooner if the next threshold is reached before these fields are collected.
    */
  var current_deadline: Double | Null
  /**
    * The fields that need to be collected to keep the account enabled. If not collected by the current_deadline, these fields appear in past_due as well, and the account is disabled.
    */
  var currently_due: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * If the account is disabled, this string describes why the account can’t create charges or receive payouts. Can be requirements.past_due, requirements.pending_verification, rejected.fraud, rejected.terms_of_service, rejected.listed, rejected.other, listed, under_review, or other.
    */
  var disabled_reason: js.UndefOr[String | Null] = js.undefined
  /**
    * The fields that need to be collected assuming all volume thresholds are reached. As they become required, these fields appear in currently_due as well, and the current_deadline is set.
    */
  var eventually_due: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The fields that weren’t collected by the current_deadline. These fields need to be collected to re-enable the account.
    */
  var past_due: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Fields that may become required depending on the results of verification or review. An empty array unless an asynchronous verification is pending. If verification fails, the fields in this array become required and move to currently_due or past_due.
    */
  var pending_verification: js.UndefOr[js.Array[String]] = js.undefined
}

object IAccountRequirements {
  @scala.inline
  def apply(
    current_deadline: Double = null.asInstanceOf[Double],
    currently_due: js.Array[String] = null,
    disabled_reason: js.UndefOr[Null | String] = js.undefined,
    eventually_due: js.Array[String] = null,
    past_due: js.Array[String] = null,
    pending_verification: js.Array[String] = null
  ): IAccountRequirements = {
    val __obj = js.Dynamic.literal(current_deadline = current_deadline.asInstanceOf[js.Any])
    if (currently_due != null) __obj.updateDynamic("currently_due")(currently_due.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled_reason)) __obj.updateDynamic("disabled_reason")(disabled_reason.asInstanceOf[js.Any])
    if (eventually_due != null) __obj.updateDynamic("eventually_due")(eventually_due.asInstanceOf[js.Any])
    if (past_due != null) __obj.updateDynamic("past_due")(past_due.asInstanceOf[js.Any])
    if (pending_verification != null) __obj.updateDynamic("pending_verification")(pending_verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccountRequirements]
  }
}

