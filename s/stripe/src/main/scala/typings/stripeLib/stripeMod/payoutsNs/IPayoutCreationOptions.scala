package typings
package stripeLib.stripeMod.payoutsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPayoutCreationOptions
  extends stripeLib.stripeMod.IDataOptionsWithMetadata {
  /**
    * A positive integer in cents representing how much to payout.
    */
  var amount: scala.Double
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    * https://stripe.com/docs/currencies
    */
  var currency: java.lang.String
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    * This can be unset by updating the value to null and then saving.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of a bank account or a card to send the payout to. If no destination is supplied,
    * the default external account for the specified currency will be used.
    */
  var destination: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The method used to send this payout, which can be standard or instant.
    * instant is only supported for payouts to debit cards.
    */
  var method: js.UndefOr[PayoutMethods] = js.undefined
  /**
    * The source balance to draw this payout from. Balances for different payment sources are
    * kept separately. You can find the amounts with the balances API.
    * Valid options are: alipay_account, bank_account, and card.
    */
  var source_type: js.UndefOr[
    stripeLib.stripeLibStrings.alipay_account | stripeLib.stripeLibStrings.bank_account | stripeLib.stripeLibStrings.card
  ] = js.undefined
  /**
    * A string to be displayed on the recipient’s bank or card statement. This may be at most 22 characters.
    * Attempting to use a statement_descriptor longer than 22 characters will return an error.
    * Note: Most banks will truncate this information and/or display it inconsistently. Some may not display it at all.
    */
  var statement_descriptor: js.UndefOr[java.lang.String] = js.undefined
}

object IPayoutCreationOptions {
  @scala.inline
  def apply(
    amount: scala.Double,
    currency: java.lang.String,
    description: java.lang.String = null,
    destination: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    metadata: stripeLib.stripeMod.IOptionsMetadata = null,
    method: PayoutMethods = null,
    source_type: stripeLib.stripeLibStrings.alipay_account | stripeLib.stripeLibStrings.bank_account | stripeLib.stripeLibStrings.card = null,
    statement_descriptor: java.lang.String = null
  ): IPayoutCreationOptions = {
    val __obj = js.Dynamic.literal(amount = amount, currency = currency)
    if (description != null) __obj.updateDynamic("description")(description)
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (method != null) __obj.updateDynamic("method")(method)
    if (source_type != null) __obj.updateDynamic("source_type")(source_type.asInstanceOf[js.Any])
    if (statement_descriptor != null) __obj.updateDynamic("statement_descriptor")(statement_descriptor)
    __obj.asInstanceOf[IPayoutCreationOptions]
  }
}

