package typings
package stripeLib.stripeMod.StripeNs.applicationFeesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IApplicationFeeRefund
  extends stripeLib.stripeMod.StripeNs.IResourceObject {
  /**
    * Amount, in cents/pence.
    */
  var amount: scala.Double
  /**
    * Balance transaction that describes the impact on your account balance.
    */
  var balance_transaction: java.lang.String | stripeLib.stripeMod.StripeNs.balanceNs.IBalanceTransaction
  var created: scala.Double
  /**
    * Three-letter ISO code representing the currency.
    */
  var currency: java.lang.String
  /**
    * ID of the application fee that was refunded.
    */
  var fee: java.lang.String | IApplicationFee
  /**
    * A set of key/value pairs that you can attach to the object. It can be useful
    * for storing additional information in a structured format.
    */
  var metadata: stripeLib.stripeMod.StripeNs.IMetadata
}

object IApplicationFeeRefund {
  @scala.inline
  def apply(
    amount: scala.Double,
    balance_transaction: java.lang.String | stripeLib.stripeMod.StripeNs.balanceNs.IBalanceTransaction,
    created: scala.Double,
    currency: java.lang.String,
    fee: java.lang.String | IApplicationFee,
    id: java.lang.String,
    metadata: stripeLib.stripeMod.StripeNs.IMetadata,
    `object`: java.lang.String
  ): IApplicationFeeRefund = {
    val __obj = js.Dynamic.literal(amount = amount, balance_transaction = balance_transaction.asInstanceOf[js.Any], created = created, currency = currency, fee = fee.asInstanceOf[js.Any], id = id, metadata = metadata)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[IApplicationFeeRefund]
  }
}

