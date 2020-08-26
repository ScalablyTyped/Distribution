package typings.stripe.mod.payouts

import typings.stripe.mod.IDataOptionsWithMetadata
import typings.stripe.stripeStrings.alipay_account
import typings.stripe.stripeStrings.bank_account
import typings.stripe.stripeStrings.card
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPayoutCreationOptions extends IDataOptionsWithMetadata {
  /**
    * A positive integer in cents representing how much to payout.
    */
  var amount: Double = js.native
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    * https://stripe.com/docs/currencies
    */
  var currency: String = js.native
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    * This can be unset by updating the value to null and then saving.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The ID of a bank account or a card to send the payout to. If no destination is supplied,
    * the default external account for the specified currency will be used.
    */
  var destination: js.UndefOr[String] = js.native
  /**
    * The method used to send this payout, which can be standard or instant.
    * instant is only supported for payouts to debit cards.
    */
  var method: js.UndefOr[PayoutMethods] = js.native
  /**
    * The source balance to draw this payout from. Balances for different payment sources are
    * kept separately. You can find the amounts with the balances API.
    * Valid options are: alipay_account, bank_account, and card.
    */
  var source_type: js.UndefOr[alipay_account | bank_account | card] = js.native
  /**
    * A string to be displayed on the recipient’s bank or card statement. This may be at most 22 characters.
    * Attempting to use a statement_descriptor longer than 22 characters will return an error.
    * Note: Most banks will truncate this information and/or display it inconsistently. Some may not display it at all.
    */
  var statement_descriptor: js.UndefOr[String] = js.native
}

object IPayoutCreationOptions {
  @scala.inline
  def apply(amount: Double, currency: String): IPayoutCreationOptions = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPayoutCreationOptions]
  }
  @scala.inline
  implicit class IPayoutCreationOptionsOps[Self <: IPayoutCreationOptions] (val x: Self) extends AnyVal {
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
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    @scala.inline
    def setMethod(value: PayoutMethods): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setSource_type(value: alipay_account | bank_account | card): Self = this.set("source_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource_type: Self = this.set("source_type", js.undefined)
    @scala.inline
    def setStatement_descriptor(value: String): Self = this.set("statement_descriptor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatement_descriptor: Self = this.set("statement_descriptor", js.undefined)
  }
  
}

