package typings
package stripeLib.stripeMod.StripeNs.payoutsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPayout
  extends stripeLib.stripeMod.StripeNs.IResourceObject {
  /**
    * Amount (in cents) to be transferred to your bank account or debit card
    */
  var amount: scala.Double
  /**
    * Date the payout is expected to arrive in the bank. This factors in delays like weekends or bank holidays
    */
  var arrival_date: scala.Double
  /**
    * Returns true if the payout was created by an automated payout schedule, and false if it was requested manually.
    */
  var automatic: scala.Boolean
  /**
    * Balance transaction that describes the impact of this transfer on your account balance. [Expandable]
    */
  var balance_transaction: java.lang.String | stripeLib.stripeMod.StripeNs.balanceNs.IBalanceTransaction
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch
    */
  var created: scala.Double
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    * https://stripe.com/docs/currencies
    */
  var currency: java.lang.String
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users
    */
  var description: java.lang.String
  /**
    * ID of the bank account or card the payout was sent to. [Expandable]
    */
  var destination: java.lang.String | stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount | stripeLib.stripeMod.StripeNs.cardsNs.ICardHash
  /**
    * If the payout failed or was canceled, this will be the ID of the balance
    * transaction that reversed the initial balance transaction, and puts the
    * funds from the failed payout back in your balance. [Expandable]
    */
  var failure_balance_transaction: java.lang.String | stripeLib.stripeMod.StripeNs.balanceNs.IBalanceTransaction
  /**
    * Error code explaining reason for payout failure if available. See Types of payout failures for a
    * list of failure codes: https://stripe.com/docs/api#payout_failures
    */
  var failure_code: java.lang.String
  /**
    * Message to user further explaining reason for the payout failure if available
    */
  var failure_message: java.lang.String
  /**
    * Flag indicating whether the object exists in live mode or test mode
    */
  var livemode: scala.Boolean
  /**
    * Set of key/value pairs that you can attach to an object. It can be useful for storing additional
    * information about the object in a structured format.
    */
  var metadata: stripeLib.stripeMod.StripeNs.IMetadata
  /**
    * The method used to send this payout, which can be standard or instant. instant is only supported
    * for payouts to debit cards.
    */
  var method: PayoutMethods
  /**
    * Value is "payout"
    */
  @JSName("object")
  var object_IPayout: stripeLib.stripeLibStrings.payout
  /**
    * The source balance this payout came from.
    * One of card, bank_account, bitcoin_receiver, or alipay_account
    */
  var source_type: stripeLib.stripeLibStrings.alipay_account | stripeLib.stripeLibStrings.bank_account | stripeLib.stripeLibStrings.bitcoin_receiver | stripeLib.stripeLibStrings.card
  /**
    * Extra information about a payout to be displayed on the user's bank statement
    */
  var statement_descriptor: java.lang.String
  /**
    * Current status of the payout (paid, pending, in_transit, canceled or failed).
    * A payout will be pending until it is submitted to the bank, at which point it
    * becomes in_transit. It will then change to paid if the transaction goes through.
    * If it does not go through successfully, its status will change to failed or canceled.
    */
  var status: stripeLib.stripeLibStrings.canceled | stripeLib.stripeLibStrings.failed | stripeLib.stripeLibStrings.in_transit | stripeLib.stripeLibStrings.paid | stripeLib.stripeLibStrings.pending
  /**
    * Can be bank_account or card.
    */
  var `type`: PayoutTypes
}

object IPayout {
  @scala.inline
  def apply(
    amount: scala.Double,
    arrival_date: scala.Double,
    automatic: scala.Boolean,
    balance_transaction: java.lang.String | stripeLib.stripeMod.StripeNs.balanceNs.IBalanceTransaction,
    created: scala.Double,
    currency: java.lang.String,
    description: java.lang.String,
    destination: java.lang.String | stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount | stripeLib.stripeMod.StripeNs.cardsNs.ICardHash,
    failure_balance_transaction: java.lang.String | stripeLib.stripeMod.StripeNs.balanceNs.IBalanceTransaction,
    failure_code: java.lang.String,
    failure_message: java.lang.String,
    id: java.lang.String,
    livemode: scala.Boolean,
    metadata: stripeLib.stripeMod.StripeNs.IMetadata,
    method: PayoutMethods,
    `object`: stripeLib.stripeLibStrings.payout,
    source_type: stripeLib.stripeLibStrings.alipay_account | stripeLib.stripeLibStrings.bank_account | stripeLib.stripeLibStrings.bitcoin_receiver | stripeLib.stripeLibStrings.card,
    statement_descriptor: java.lang.String,
    status: stripeLib.stripeLibStrings.canceled | stripeLib.stripeLibStrings.failed | stripeLib.stripeLibStrings.in_transit | stripeLib.stripeLibStrings.paid | stripeLib.stripeLibStrings.pending,
    `type`: PayoutTypes
  ): IPayout = {
    val __obj = js.Dynamic.literal(amount = amount, arrival_date = arrival_date, automatic = automatic, balance_transaction = balance_transaction.asInstanceOf[js.Any], created = created, currency = currency, description = description, destination = destination.asInstanceOf[js.Any], failure_balance_transaction = failure_balance_transaction.asInstanceOf[js.Any], failure_code = failure_code, failure_message = failure_message, id = id, livemode = livemode, metadata = metadata, method = method, source_type = source_type.asInstanceOf[js.Any], statement_descriptor = statement_descriptor, status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IPayout]
  }
}

