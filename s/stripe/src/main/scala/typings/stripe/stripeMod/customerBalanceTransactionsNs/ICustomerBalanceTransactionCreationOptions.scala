package typings.stripe.stripeMod.customerBalanceTransactionsNs

import typings.stripe.stripeMod.IMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomerBalanceTransactionCreationOptions extends js.Object {
  /**
    * The integer amount in cents to apply to the customer’s balance. Pass a negative amount to credit the
    * customer’s balance, and pass in a positive amount to debit the customer’s balance.
    */
  var amount: Double
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency. If the customer’s currency
    * is set, this value must match it. If the customer’s currency is not set, it will be updated to this value.
    */
  var currency: String
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional
    * information about the object in a structured format.
    */
  var metadata: js.UndefOr[IMetadata] = js.undefined
}

object ICustomerBalanceTransactionCreationOptions {
  @scala.inline
  def apply(amount: Double, currency: String, description: String = null, metadata: IMetadata = null): ICustomerBalanceTransactionCreationOptions = {
    val __obj = js.Dynamic.literal(amount = amount, currency = currency)
    if (description != null) __obj.updateDynamic("description")(description)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[ICustomerBalanceTransactionCreationOptions]
  }
}

