package typings
package stripeLib.stripeMod.disputesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A dispute occurs when a customer questions your charge with their bank or credit card company.
  * When a customer disputes your charge, you're given the opportunity to respond to the dispute with
  * evidence that shows the charge is legitimate. You can find more information about the dispute process
  * in our disputes FAQ: https://stripe.com/help/disputes
  */
trait IDispute
  extends stripeLib.stripeMod.IResourceObject {
  /**
    * Disputed amount. Usually the amount of the charge, but can differ (usually because of currency
    * fluctuation or because only part of the order is disputed).
    */
  var amount: scala.Double
  /**
    * List of zero, one, or two balance transactions that show funds withdrawn and reinstated to your
    * Stripe account as a result of this dispute.
    */
  var balance_transactions: js.Array[stripeLib.stripeMod.balanceNs.IBalanceTransaction]
  /**
    * ID of the charge that was disputed. [Expandable]
    */
  var charge: java.lang.String | stripeLib.stripeMod.chargesNs.ICharge
  /**
    * Date dispute was opened
    */
  var created: scala.Double
  /**
    * Three-letter ISO currency code representing the currency of the amount that was disputed.
    */
  var currency: java.lang.String
  /**
    * Evidence provided to respond to a dispute. Updating any field in the hash will submit all fields in the hash for review.
    */
  var evidence: IDisputeEvidence
  /**
    * Information about the evidence submission.
    */
  var evidence_details: js.UndefOr[stripeLib.Anon_Dueby] = js.undefined
  /**
    * If true, it is still possible to refund the disputed payment. Once the payment has been fully
    * refunded, no further funds will be withdrawn from your Stripe account as a result of this dispute.
    */
  var is_charge_refundable: scala.Boolean
  var livemode: scala.Boolean
  var metadata: stripeLib.stripeMod.IMetadata
  /**
    * Value is 'dispute'
    */
  @JSName("object")
  var object_IDispute: stripeLib.stripeLibStrings.dispute
  /**
    * Reason given by cardholder for dispute.
    * Possible values are duplicate, fraudulent, subscription_canceled, product_unacceptable,
    * product_not_received, unrecognized, credit_not_processed, incorrect_account_details,
    * insufficient_funds, bank_cannot_process, debit_not_authorized, general.
    * Read more about dispute reasons: https://stripe.com/help/disputes#reasons
    */
  var reason: stripeLib.stripeLibStrings.duplicate | stripeLib.stripeLibStrings.fraudulent | stripeLib.stripeLibStrings.subscription_canceled | stripeLib.stripeLibStrings.product_unacceptable | stripeLib.stripeLibStrings.product_not_received | stripeLib.stripeLibStrings.unrecognized | stripeLib.stripeLibStrings.credit_not_processed | stripeLib.stripeLibStrings.incorrect_account_details | stripeLib.stripeLibStrings.insufficient_funds | stripeLib.stripeLibStrings.bank_cannot_process | stripeLib.stripeLibStrings.debit_not_authorized | stripeLib.stripeLibStrings.general
  /**
    * Current status of dispute. Possible values are warning_needs_response, warning_under_review, warning_closed,
    * needs_response, response_disabled, under_review, charge_refunded, won, lost.
    */
  var status: stripeLib.stripeLibStrings.warning_needs_response | stripeLib.stripeLibStrings.warning_under_review | stripeLib.stripeLibStrings.warning_closed | stripeLib.stripeLibStrings.needs_response | stripeLib.stripeLibStrings.response_disabled | stripeLib.stripeLibStrings.under_review | stripeLib.stripeLibStrings.charge_refunded | stripeLib.stripeLibStrings.won | stripeLib.stripeLibStrings.lost
}

object IDispute {
  @scala.inline
  def apply(
    amount: scala.Double,
    balance_transactions: js.Array[stripeLib.stripeMod.balanceNs.IBalanceTransaction],
    charge: java.lang.String | stripeLib.stripeMod.chargesNs.ICharge,
    created: scala.Double,
    currency: java.lang.String,
    evidence: IDisputeEvidence,
    id: java.lang.String,
    is_charge_refundable: scala.Boolean,
    livemode: scala.Boolean,
    metadata: stripeLib.stripeMod.IMetadata,
    `object`: stripeLib.stripeLibStrings.dispute,
    reason: stripeLib.stripeLibStrings.duplicate | stripeLib.stripeLibStrings.fraudulent | stripeLib.stripeLibStrings.subscription_canceled | stripeLib.stripeLibStrings.product_unacceptable | stripeLib.stripeLibStrings.product_not_received | stripeLib.stripeLibStrings.unrecognized | stripeLib.stripeLibStrings.credit_not_processed | stripeLib.stripeLibStrings.incorrect_account_details | stripeLib.stripeLibStrings.insufficient_funds | stripeLib.stripeLibStrings.bank_cannot_process | stripeLib.stripeLibStrings.debit_not_authorized | stripeLib.stripeLibStrings.general,
    status: stripeLib.stripeLibStrings.warning_needs_response | stripeLib.stripeLibStrings.warning_under_review | stripeLib.stripeLibStrings.warning_closed | stripeLib.stripeLibStrings.needs_response | stripeLib.stripeLibStrings.response_disabled | stripeLib.stripeLibStrings.under_review | stripeLib.stripeLibStrings.charge_refunded | stripeLib.stripeLibStrings.won | stripeLib.stripeLibStrings.lost,
    evidence_details: stripeLib.Anon_Dueby = null
  ): IDispute = {
    val __obj = js.Dynamic.literal(amount = amount, balance_transactions = balance_transactions, charge = charge.asInstanceOf[js.Any], created = created, currency = currency, evidence = evidence, id = id, is_charge_refundable = is_charge_refundable, livemode = livemode, metadata = metadata, reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`)
    if (evidence_details != null) __obj.updateDynamic("evidence_details")(evidence_details)
    __obj.asInstanceOf[IDispute]
  }
}

