package typings
package stripeLib.stripeMod.StripeNs.balanceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBalanceTransaction
  extends stripeLib.stripeMod.StripeNs.IResourceObject {
  /**
    * Gross amount of the transaction, in cents/pence.
    */
  var amount: scala.Double
  /**
    * The date the transaction's net funds will become available in the Stripe balance.
    */
  var available_on: scala.Double
  var created: scala.Double
  /**
    * Three-letter ISO currency code representing the currency.
    */
  var currency: java.lang.String
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Fee (in cents/pence) paid for this transaction
    */
  var fee: scala.Double
  /**
    * Detailed breakdown of fees (in cents/pence) paid for this transaction
    */
  var fee_details: js.Array[stripeLib.Anon_Amount]
  /**
    * Net amount of the transaction, in cents.
    */
  var net: scala.Double
  /**
    * The Stripe object this transaction is related to. [Expandable]
    */
  var source: java.lang.String | stripeLib.stripeMod.StripeNs.IResourceObject
  /**
    * The transfers (if any) for which source is a source_transaction.
    */
  var source_transfers: stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer]
  /**
    * If the transaction's net funds are available in the Stripe balance yet. Either "available" or "pending".
    */
  var status: java.lang.String
  /**
    * Transaction type: "adjustment", "application_fee",
    * "application_fee_refund", "charge", "payment", "payment_refund",
    * "refund", "transfer", "transfer_cancel", "transfer_failure", or
    * "transfer_refund".
    */
  var `type`: java.lang.String
}

object IBalanceTransaction {
  @scala.inline
  def apply(
    amount: scala.Double,
    available_on: scala.Double,
    created: scala.Double,
    currency: java.lang.String,
    fee: scala.Double,
    fee_details: js.Array[stripeLib.Anon_Amount],
    id: java.lang.String,
    net: scala.Double,
    `object`: java.lang.String,
    source: java.lang.String | stripeLib.stripeMod.StripeNs.IResourceObject,
    source_transfers: stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.transfersNs.ITransfer],
    status: java.lang.String,
    `type`: java.lang.String,
    description: java.lang.String = null
  ): IBalanceTransaction = {
    val __obj = js.Dynamic.literal(`object` = `object`, `type` = `type`)
    __obj.updateDynamic("amount")(amount)
    __obj.updateDynamic("available_on")(available_on)
    __obj.updateDynamic("created")(created)
    __obj.updateDynamic("currency")(currency)
    __obj.updateDynamic("fee")(fee)
    __obj.updateDynamic("fee_details")(fee_details)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("net")(net)
    __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.updateDynamic("source_transfers")(source_transfers)
    __obj.updateDynamic("status")(status)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[IBalanceTransaction]
  }
}

