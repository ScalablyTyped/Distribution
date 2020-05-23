package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Debitnegativebalances extends js.Object {
  /**
    * A Boolean indicating if Stripe should try to reclaim negative balances from
    * an attached bank account. See our Understanding Connect Account Balances
    * documentation for details. Default value is true for Express accounts and
    * false for Custom accounts.
    */
  var debit_negative_balances: js.UndefOr[Boolean] = js.undefined
  /**
    * Details on when funds from charges are available, and when they are paid out
    * to an external account. See our Setting Bank and Debit Card Payouts
    * documentation for details.
    */
  var schedule: js.UndefOr[Delaydays] = js.undefined
  /**
    * The text that appears on the bank account statement for payouts. If not set,
    * this defaults to the platform’s bank descriptor as set in the Dashboard.
    */
  var statement_descriptor: js.UndefOr[String] = js.undefined
}

object Debitnegativebalances {
  @scala.inline
  def apply(
    debit_negative_balances: js.UndefOr[Boolean] = js.undefined,
    schedule: Delaydays = null,
    statement_descriptor: String = null
  ): Debitnegativebalances = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debit_negative_balances)) __obj.updateDynamic("debit_negative_balances")(debit_negative_balances.get.asInstanceOf[js.Any])
    if (schedule != null) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    if (statement_descriptor != null) __obj.updateDynamic("statement_descriptor")(statement_descriptor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Debitnegativebalances]
  }
}

