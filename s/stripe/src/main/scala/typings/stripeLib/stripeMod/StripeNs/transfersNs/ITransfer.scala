package typings
package stripeLib.stripeMod.StripeNs.transfersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ITransfer
  extends stripeLib.stripeMod.StripeNs.IResourceObject {
  /**
               * Amount (in cents) to be transferred to your bank account
               */
  var amount: scala.Double
  /**
               * Amount in cents reversed (can be less than the amount attribute on the transfer if a partial reversal was issued).
               */
  var amount_reversed: scala.Double
  var application_fee: java.lang.String
  /**
               * Balance transaction that describes the impact of this transfer on your account balance. [Expandable]
               */
  var balance_transaction: java.lang.String | stripeLib.stripeMod.StripeNs.balanceNs.IBalanceTransaction
  /**
               * Time that this record of the transfer was first created.
               */
  var created: scala.Double
  /**
               * Three-letter ISO currency code representing the currency.
               */
  var currency: java.lang.String
  /**
               * Date the transfer is scheduled to arrive in the bank. This factors in delays like weekends or bank holidays.
               */
  var date: scala.Double
  /**
               * Internal-only description of the transfer
               */
  var description: java.lang.String
  /**
               * ID of the bank account, card, or Stripe account the transfer was sent to. [Expandable]
               */
  var destination: java.lang.String | stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount | stripeLib.stripeMod.StripeNs.cardsNs.ICardHash | stripeLib.stripeMod.StripeNs.accountsNs.IAccount
  /**
               * If the destination is a Stripe account, this will be the ID of the
               * payment that the destination account received for the transfer. [Expandable]
               */
  var destination_payment: java.lang.String
  /**
               * Error code explaining reason for transfer failure if available. See Types of transfer failures for a
               * list of failure codes: https://stripe.com/docs/api#transfer_failures
               */
  var failure_code: java.lang.String
  /**
               * Message to user further explaining reason for transfer failure if available.
               */
  var failure_message: java.lang.String
  var livemode: scala.Boolean
  var metadata: stripeLib.stripeMod.StripeNs.IMetadata
  /**
               * Value is "transfer"
               */
  @JSName("object")
  var object_ITransfer: stripeLib.stripeLibStrings.transfer
  /**
               * A list of reversals that have been applied to the transfer.
               */
  var reversals: ITransferReversals
  /**
               * Whether or not the transfer has been fully reversed. If the transfer is only partially reversed, this attribute
               * will still be false.
               */
  var reversed: scala.Boolean
  /**
               * ID of the charge (or other transaction) that was used to fund the
               * transfer. If null, the transfer was funded from the available
               * balance. [Expandable]
               */
  var source_transaction: java.lang.String | stripeLib.stripeMod.StripeNs.chargesNs.ICharge
  /**
               * The source balance this transfer came from.
               * One of card, bank_account, bitcoin_receiver, or alipay_account
               */
  var source_type: SourceTypes
  /**
               * Extra information about a transfer to be displayed on the user's bank statement.
               */
  var statement_descriptor: java.lang.String
  /**
               * Current status of the transfer (paid, pending, in_transit, canceled or failed).
               * A transfer will be pending until it is submitted to the bank, at which point
               * it becomes in_transit. It will then change to paid if the transaction goes
               * through. If it does not go through successfully, its status will change to
               * failed or canceled.
               */
  var status: Statuses
  /**
               * Can be card, bank_account, or stripe_account.
               */
  var `type`: stripeLib.stripeLibStrings.card | stripeLib.stripeLibStrings.bank_account | stripeLib.stripeLibStrings.stripe_account
}

