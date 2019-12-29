package typings.stripe.stripeMod.transfers

import typings.stripe.stripeMod.IMetadata
import typings.stripe.stripeMod.IResourceObject
import typings.stripe.stripeMod.accounts.IAccount
import typings.stripe.stripeMod.balance.IBalanceTransaction
import typings.stripe.stripeMod.bankAccounts.IBankAccount
import typings.stripe.stripeMod.cards.ICardHash
import typings.stripe.stripeMod.charges.ICharge
import typings.stripe.stripeStrings.bank_account
import typings.stripe.stripeStrings.card
import typings.stripe.stripeStrings.stripe_account
import typings.stripe.stripeStrings.transfer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransfer extends IResourceObject {
  /**
    * Amount (in cents) to be transferred to your bank account
    */
  var amount: Double
  /**
    * Amount in cents reversed (can be less than the amount attribute on the transfer if a partial reversal was issued).
    */
  var amount_reversed: Double
  var application_fee: String
  /**
    * Balance transaction that describes the impact of this transfer on your account balance. [Expandable]
    */
  var balance_transaction: String | IBalanceTransaction
  /**
    * Time that this record of the transfer was first created.
    */
  var created: Double
  /**
    * Three-letter ISO currency code representing the currency.
    */
  var currency: String
  /**
    * Date the transfer is scheduled to arrive in the bank. This factors in delays like weekends or bank holidays.
    */
  var date: Double
  /**
    * Internal-only description of the transfer
    */
  var description: String
  /**
    * ID of the bank account, card, or Stripe account the transfer was sent to. [Expandable]
    */
  var destination: String | IBankAccount | ICardHash | IAccount
  /**
    * If the destination is a Stripe account, this will be the ID of the
    * payment that the destination account received for the transfer. [Expandable]
    */
  var destination_payment: String
  /**
    * Error code explaining reason for transfer failure if available. See Types of transfer failures for a
    * list of failure codes: https://stripe.com/docs/api#transfer_failures
    */
  var failure_code: String
  /**
    * Message to user further explaining reason for transfer failure if available.
    */
  var failure_message: String
  var livemode: Boolean
  var metadata: IMetadata
  /**
    * Value is "transfer"
    */
  @JSName("object")
  var object_ITransfer: transfer
  /**
    * A list of reversals that have been applied to the transfer.
    */
  var reversals: ITransferReversals
  /**
    * Whether or not the transfer has been fully reversed. If the transfer is only partially reversed, this attribute
    * will still be false.
    */
  var reversed: Boolean
  /**
    * ID of the charge (or other transaction) that was used to fund the
    * transfer. If null, the transfer was funded from the available
    * balance. [Expandable]
    */
  var source_transaction: String | ICharge
  /**
    * The source balance this transfer came from.
    * One of card, bank_account, bitcoin_receiver, or alipay_account
    */
  var source_type: SourceTypes
  /**
    * Extra information about a transfer to be displayed on the user's bank statement.
    */
  var statement_descriptor: String
  /**
    * Current status of the transfer (paid, pending, in_transit, canceled or failed).
    * A transfer will be pending until it is submitted to the bank, at which point
    * it becomes in_transit. It will then change to paid if the transaction goes
    * through. If it does not go through successfully, its status will change to
    * failed or canceled.
    */
  var status: Statuses
  /**
    * A string that identifies this transaction as part of a group.
    */
  var transfer_group: String | Null
  /**
    *  Can be card, bank_account, or stripe_account.
    */
  var `type`: card | bank_account | stripe_account
}

object ITransfer {
  @scala.inline
  def apply(
    amount: Double,
    amount_reversed: Double,
    application_fee: String,
    balance_transaction: String | IBalanceTransaction,
    created: Double,
    currency: String,
    date: Double,
    description: String,
    destination: String | IBankAccount | ICardHash | IAccount,
    destination_payment: String,
    failure_code: String,
    failure_message: String,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: transfer,
    reversals: ITransferReversals,
    reversed: Boolean,
    source_transaction: String | ICharge,
    source_type: SourceTypes,
    statement_descriptor: String,
    status: Statuses,
    `type`: card | bank_account | stripe_account,
    transfer_group: String = null
  ): ITransfer = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], amount_reversed = amount_reversed.asInstanceOf[js.Any], application_fee = application_fee.asInstanceOf[js.Any], balance_transaction = balance_transaction.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], destination_payment = destination_payment.asInstanceOf[js.Any], failure_code = failure_code.asInstanceOf[js.Any], failure_message = failure_message.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], reversals = reversals.asInstanceOf[js.Any], reversed = reversed.asInstanceOf[js.Any], source_transaction = source_transaction.asInstanceOf[js.Any], source_type = source_type.asInstanceOf[js.Any], statement_descriptor = statement_descriptor.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (transfer_group != null) __obj.updateDynamic("transfer_group")(transfer_group.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransfer]
  }
}

