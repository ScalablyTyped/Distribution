package typings.stripe.mod.issuing.cardholders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Limit the spending with rules based on time intervals and categories.
  */
@js.native
trait ISpendingLimit extends js.Object {
  /**
    * Maximum amount allowed to spend per time interval.
    */
  var amount: Double = js.native
  /**
    * Array of strings containing categories on which to apply the spending limit. Leave this blank to limit all charges.
    */
  var categories: js.Array[String] = js.native
  /**
    * The time interval with which to apply this spending limit towards. Allowed values are per_authorization, daily, weekly, monthly, yearly, or all_time.
    */
  var interval: SpendingLimitInterval = js.native
}

object ISpendingLimit {
  @scala.inline
  def apply(amount: Double, categories: js.Array[String], interval: SpendingLimitInterval): ISpendingLimit = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpendingLimit]
  }
  @scala.inline
  implicit class ISpendingLimitOps[Self <: ISpendingLimit] (val x: Self) extends AnyVal {
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
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[String]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterval(value: SpendingLimitInterval): Self = this.set("interval", value.asInstanceOf[js.Any])
  }
  
}

