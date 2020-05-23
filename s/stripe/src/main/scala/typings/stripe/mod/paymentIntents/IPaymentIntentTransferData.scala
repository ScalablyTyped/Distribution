package typings.stripe.mod.paymentIntents

import typings.stripe.mod.accounts.IAccountCreationOptions
import typings.stripe.mod.bankAccounts.IBankAccount
import typings.stripe.mod.cards.ICardHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaymentIntentTransferData extends js.Object {
  /**
    * The amount that will be transferred automatically when a charge succeeds. The amount is capped at the total transaction amount and if no amount is set, the full amount is transferred.
    * If you intend to collect a fee and you need a more robust reporting experience, using application_fee_amount might be a better fit for your integration.
    */
  var amount: js.UndefOr[Double] = js.undefined
  /**
    * The account (if any) the payment will be attributed to for tax reporting, and where funds from the payment will be transferred to upon payment success. [Expandable]
    */
  var destination: String | IBankAccount | ICardHash | IAccountCreationOptions
}

object IPaymentIntentTransferData {
  @scala.inline
  def apply(
    destination: String | IBankAccount | ICardHash | IAccountCreationOptions,
    amount: js.UndefOr[Double] = js.undefined
  ): IPaymentIntentTransferData = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    if (!js.isUndefined(amount)) __obj.updateDynamic("amount")(amount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentIntentTransferData]
  }
}

