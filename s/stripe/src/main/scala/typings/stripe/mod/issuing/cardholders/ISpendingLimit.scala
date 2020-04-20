package typings.stripe.mod.issuing.cardholders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Limit the spending with rules based on time intervals and categories.
  */
trait ISpendingLimit extends js.Object {
  /**
    * Maximum amount allowed to spend per time interval.
    */
  var amount: Double
  /**
    * Array of strings containing categories on which to apply the spending limit. Leave this blank to limit all charges.
    */
  var categories: js.Array[String]
  /**
    * The time interval with which to apply this spending limit towards. Allowed values are per_authorization, daily, weekly, monthly, yearly, or all_time.
    */
  var interval: SpendingLimitInterval
}

object ISpendingLimit {
  @scala.inline
  def apply(amount: Double, categories: js.Array[String], interval: SpendingLimitInterval): ISpendingLimit = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpendingLimit]
  }
}

