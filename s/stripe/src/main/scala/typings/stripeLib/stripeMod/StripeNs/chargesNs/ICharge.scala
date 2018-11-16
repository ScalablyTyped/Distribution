package typings
package stripeLib.stripeMod.StripeNs.chargesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * To charge a credit or a debit card, you create a charge object. You can retrieve and refund individual
         * charges as well as list all charges. Charges are identified by a unique random ID.
         */

trait ICharge
  extends stripeLib.stripeMod.StripeNs.IResourceObject {
  /**
               * Amount charged in cents/pence, positive integer or zero.
               */
  var amount: scala.Double
  /**
               * Amount in cents/pence refunded (can be less than the amount attribute on the
               * charge if a partial refund was issued), positive integer or zero.
               */
  var amount_refunded: scala.Double
  /**
               * ID of the Connect application that created the charge. [Expandable]
               */
  var application: js.UndefOr[
    java.lang.String | stripeLib.stripeMod.StripeNs.applicationsNs.IApplication | scala.Null
  ] = js.undefined
  /**
               * The application fee (if any) for the charge. See the Connect documentation
               * for details. [Expandable]
               */
  var application_fee: js.UndefOr[
    java.lang.String | stripeLib.stripeMod.StripeNs.applicationFeesNs.IApplicationFee | scala.Null
  ] = js.undefined
  /**
               * ID of the balance transaction that describes the impact of this charge on
               * your account balance (not including refunds or disputes). [Expandable]
               */
  var balance_transaction: java.lang.String | stripeLib.stripeMod.StripeNs.balanceNs.IBalanceTransaction
  /**
               * If the charge was created without capturing, this boolean represents whether or not it is
               * still uncaptured or has since been captured.
               */
  var captured: scala.Boolean
  var created: scala.Double
  /**
               * Three-letter ISO currency code representing the currency in which the
               * charge was made.
               */
  var currency: java.lang.String
  /**
               * ID of the customer this charge is for if one exists. [Expandable]
               */
  var customer: java.lang.String | stripeLib.stripeMod.StripeNs.customersNs.ICustomer | scala.Null
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The account (if any) the charge was made on behalf of, with an automatic
               * transfer. See the [Connect documentation]
               * <https://stripe.com/docs/connect/destination-charges> for details.
               * [Expandable]
               */
  var destination: js.UndefOr[java.lang.String | stripeLib.stripeMod.StripeNs.accountsNs.IAccount | scala.Null] = js.undefined
  /**
               * Details about the dispute if the charge has been disputed.
               */
  var dispute: js.UndefOr[stripeLib.stripeMod.StripeNs.disputesNs.IDispute | scala.Null] = js.undefined
  /**
               * Error code explaining reason for charge failure if available (see the errors section for a list of
               * codes: https://stripe.com/docs/api#errors).
               */
  var failure_code: java.lang.String | scala.Null
  /**
               * Message to user further explaining reason for charge failure if available.
               */
  var failure_message: java.lang.String | scala.Null
  /**
               * Hash with information on fraud assessments for the charge.
               */
  var fraud_details: stripeLib.Anon_UserreportFraudulent
  /**
               * ID of the invoice this charge is for if one exists. [Expandable]
               */
  var invoice: java.lang.String | stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice | scala.Null
  var livemode: scala.Boolean
  var metadata: stripeLib.stripeMod.StripeNs.IMetadata
  /**
               * Value is 'charge'
               */
  @JSName("object")
  var object_ICharge: stripeLib.stripeLibStrings.charge
  /**
               * The Stripe account ID for which these funds are intended. Automatically
               * set if you use the destination parameter. For details, see [Creating
               * Separate Charges and Transfers]
               * <https://stripe.com/docs/connect/charges-transfers#on-behalf-of>.
               */
  var on_behalf_of: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
               * ID of the order this charge is for if one exists. [Expandable]
               */
  var order: java.lang.String | stripeLib.stripeMod.StripeNs.ordersNs.IOrder | scala.Null
  /**
               * Details about whether the payment was accepted, and why. See
               * understanding declines for details. [Expandable]
               */
  var outcome: js.UndefOr[IOutcome] = js.undefined
  /**
               * true if the charge succeeded, or was successfully authorized for later capture.
               */
  var paid: scala.Boolean
  /**
               * This is the email address that the receipt for this charge was sent to.
               */
  var receipt_email: java.lang.String | scala.Null
  /**
               * This is the transaction number that appears on email receipts sent for this charge.
               */
  var receipt_number: java.lang.String | scala.Null
  /**
               * Whether or not the charge has been fully refunded. If the charge is only partially refunded,
               * this attribute will still be false.
               */
  var refunded: scala.Boolean
  /**
               * A list of refunds that have been applied to the charge.
               */
  var refunds: IChargeRefunds
  /**
               * ID of the review associated with this charge if one exists. [Expandable]
               */
  var review: js.UndefOr[java.lang.String | stripeLib.stripeMod.StripeNs.reviewsNs.IReview | scala.Null] = js.undefined
  /**
               * Shipping information for the charge.
               */
  var shipping: js.UndefOr[stripeLib.stripeMod.StripeNs.IShippingInformation | scala.Null] = js.undefined
  /**
               * For most Stripe users, the source of every charge is a credit or debit card.
               * This hash is then the card object describing that card.
               */
  var source: stripeLib.stripeMod.StripeNs.cardsNs.ICard | stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiver | stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount
  /**
               * The transfer ID which created this charge. Only present if the charge came
               * from another Stripe account. See the Connect documentation for details.
               * [Expandable]
               */
  var source_transfer: java.lang.String | stripeLib.stripeMod.StripeNs.transfersNs.ITransfer | scala.Null
  /**
               * Extra information about a charge. This will appear on your customer’s
               * credit card statement.
               */
  var statement_descriptor: java.lang.String | scala.Null
  /**
               * The status of the payment is either "succeeded", "pending", or "failed".
               */
  var status: stripeLib.stripeLibStrings.succeeded | stripeLib.stripeLibStrings.pending | stripeLib.stripeLibStrings.failed
  /**
               * ID of the transfer to the destination account (only applicable if the
               * charge was created using the destination parameter). [Expandable]
               */
  var transfer: js.UndefOr[java.lang.String | stripeLib.stripeMod.StripeNs.transfersNs.ITransfer] = js.undefined
  /**
               * A string that identifies this transaction as part of a group.
               * See the [Connect documentation]
               * <https://stripe.com/docs/connect/charges-transfers#grouping-transactions>
               * for details.
               */
  var transfer_group: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

