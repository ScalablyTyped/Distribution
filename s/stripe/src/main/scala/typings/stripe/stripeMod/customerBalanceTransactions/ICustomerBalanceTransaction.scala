package typings.stripe.stripeMod.customerBalanceTransactions

import typings.stripe.stripeMod.IMetadata
import typings.stripe.stripeMod.IResourceObject
import typings.stripe.stripeStrings.customer_balance_transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomerBalanceTransaction extends IResourceObject {
  /**
    * The amount of the transaction. A negative value is a credit for the customer’s balance, and a positive
    * value is a debit to the customer’s balance.
    */
  var amount: Double
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  /**
    * The ID of the credit note (if any) related to the transaction. [Expandable]
    */
  var credit_note: String | Null
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: String
  /**
    * The ID of the customer the transaction belongs to. [Expandable]
    */
  var customer: String
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    */
  var description: String | Null
  /**
    * The customer’s balance after the transaction was applied. A negative value decreases the amount due
    * on the customer’s next invoice. A positive value increases the amount due on the customer’s next invoice.
    */
  var ending_balance: Double
  /**
    * The ID of the invoice (if any) related to the transaction. [Expandable]
    */
  var invoice: String | Null
  /**
    * Has the value true if the object exists in live mode or the value false if the object exists in test mode.
    */
  var livemode: Boolean
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional
    * information about the object in a structured format.
    */
  var metadata: IMetadata | Null
  /**
    * Value is "customer_balance_transaction"
    */
  @JSName("object")
  var object_ICustomerBalanceTransaction: customer_balance_transaction
  /**
    * Transaction type. See the Customer Balance page to learn more about transaction types.
    */
  var `type`: CustomerBalanceTransactionType
}

object ICustomerBalanceTransaction {
  @scala.inline
  def apply(
    amount: Double,
    created: Double,
    currency: String,
    customer: String,
    ending_balance: Double,
    id: String,
    livemode: Boolean,
    `object`: customer_balance_transaction,
    `type`: CustomerBalanceTransactionType,
    credit_note: String = null,
    description: String = null,
    invoice: String = null,
    metadata: IMetadata = null
  ): ICustomerBalanceTransaction = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], ending_balance = ending_balance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (credit_note != null) __obj.updateDynamic("credit_note")(credit_note.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (invoice != null) __obj.updateDynamic("invoice")(invoice.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomerBalanceTransaction]
  }
}

