package typings
package stripeLib.stripeMod.StripeNs.refundsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRefund extends js.Object {
  /**
    * Amount in cents/pence.
    */
  var amount: scala.Double
  /**
    * Balance transaction that describes the impact of this reversal on your account balance.
    */
  var balance_transaction: java.lang.String | stripeLib.stripeMod.StripeNs.balanceNs.IBalanceTransaction
  /**
    * ID of the charge that was refunded. [Expandable]
    */
  var charge: java.lang.String | stripeLib.stripeMod.StripeNs.chargesNs.ICharge
  var created: scala.Double
  /**
    * Three-letter ISO currency code representing the currency in which the charge was made.
    */
  var currency: java.lang.String
  var description: java.lang.String
  /**
    * If the refund failed, the reason for refund failure if known.
    */
  var failure_reason: js.UndefOr[
    stripeLib.stripeLibStrings.lost_or_stolen_card | stripeLib.stripeLibStrings.expired_or_canceled_card | stripeLib.stripeLibStrings.unknown
  ] = js.undefined
  var id: java.lang.String
  /**
    * A set of key/value pairs that you can attach to the object. It can be useful
    * for storing additional information in a structured format.
    */
  var metadata: stripeLib.stripeMod.StripeNs.IMetadata
  /**
    * Value is 'refund'
    */
  var `object`: java.lang.String
  /**
    * Reason for the refund. If set, possible values are "duplicate", "fraudulent", and "requested_by_customer".
    */
  var reason: java.lang.String
  /**
    * This is the transaction number that appears on email receipts sent for this refund.
    */
  var receipt_number: java.lang.String
  /**
    * Status of the refund. For credit card refunds, this can be succeeded or failed.
    * For other types of refunds, it can be pending, succeeded, failed, or canceled.
    */
  var status: stripeLib.stripeLibStrings.pending | stripeLib.stripeLibStrings.succeeded | stripeLib.stripeLibStrings.failed | stripeLib.stripeLibStrings.canceled
}

