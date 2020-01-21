package typings.stripe.mod.applicationFees

import typings.stripe.mod.IMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.mod.balance.IBalanceTransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IApplicationFeeRefund extends IResourceObject {
  /**
    * Amount, in cents/pence.
    */
  var amount: Double
  /**
    * Balance transaction that describes the impact on your account balance.
    */
  var balance_transaction: String | IBalanceTransaction
  var created: Double
  /**
    * Three-letter ISO code representing the currency.
    */
  var currency: String
  /**
    * ID of the application fee that was refunded.
    */
  var fee: String | IApplicationFee
  /**
    * A set of key/value pairs that you can attach to the object. It can be useful
    * for storing additional information in a structured format.
    */
  var metadata: IMetadata
}

object IApplicationFeeRefund {
  @scala.inline
  def apply(
    amount: Double,
    balance_transaction: String | IBalanceTransaction,
    created: Double,
    currency: String,
    fee: String | IApplicationFee,
    id: String,
    metadata: IMetadata,
    `object`: String
  ): IApplicationFeeRefund = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], balance_transaction = balance_transaction.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IApplicationFeeRefund]
  }
}

