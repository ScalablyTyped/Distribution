package typings.stripe.stripeMod.balanceNs

import typings.stripe.Anon_Amount
import typings.stripe.stripeMod.IList
import typings.stripe.stripeMod.IResourceObject
import typings.stripe.stripeMod.transfersNs.ITransfer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBalanceTransaction extends IResourceObject {
  /**
    * Gross amount of the transaction, in cents/pence.
    */
  var amount: Double
  /**
    * The date the transaction's net funds will become available in the Stripe balance.
    */
  var available_on: Double
  var created: Double
  /**
    * Three-letter ISO currency code representing the currency.
    */
  var currency: String
  var description: js.UndefOr[String] = js.undefined
  var exchange_rate: js.UndefOr[Double | Null] = js.undefined
  /**
    * Fee (in cents/pence) paid for this transaction
    */
  var fee: Double
  /**
    * Detailed breakdown of fees (in cents/pence) paid for this transaction
    */
  var fee_details: js.Array[Anon_Amount]
  /**
    * Net amount of the transaction, in cents.
    */
  var net: Double
  /**
    * The Stripe object this transaction is related to. [Expandable]
    */
  var source: String | IResourceObject
  /**
    * The transfers (if any) for which source is a source_transaction.
    */
  var source_transfers: js.UndefOr[IList[ITransfer]] = js.undefined
  /**
    * If the transaction's net funds are available in the Stripe balance yet. Either "available" or "pending".
    */
  var status: String
  /**
    * Transaction type: "adjustment", "application_fee",
    * "application_fee_refund", "charge", "payment", "payment_refund",
    * "refund", "transfer", "transfer_cancel", "transfer_failure", or
    * "transfer_refund".
    */
  var `type`: String
}

object IBalanceTransaction {
  @scala.inline
  def apply(
    amount: Double,
    available_on: Double,
    created: Double,
    currency: String,
    fee: Double,
    fee_details: js.Array[Anon_Amount],
    id: String,
    net: Double,
    `object`: String,
    source: String | IResourceObject,
    status: String,
    `type`: String,
    description: String = null,
    exchange_rate: Int | Double = null,
    source_transfers: IList[ITransfer] = null
  ): IBalanceTransaction = {
    val __obj = js.Dynamic.literal(amount = amount, available_on = available_on, created = created, currency = currency, fee = fee, fee_details = fee_details, id = id, net = net, source = source.asInstanceOf[js.Any], status = status)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    if (exchange_rate != null) __obj.updateDynamic("exchange_rate")(exchange_rate.asInstanceOf[js.Any])
    if (source_transfers != null) __obj.updateDynamic("source_transfers")(source_transfers)
    __obj.asInstanceOf[IBalanceTransaction]
  }
}

