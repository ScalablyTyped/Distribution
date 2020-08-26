package typings.stripe.mod.customerBalanceTransactions

import typings.stripe.mod.IMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.stripeStrings.customer_balance_transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomerBalanceTransaction extends IResourceObject {
  /**
    * The amount of the transaction. A negative value is a credit for the customer’s balance, and a positive
    * value is a debit to the customer’s balance.
    */
  var amount: Double = js.native
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double = js.native
  /**
    * The ID of the credit note (if any) related to the transaction. [Expandable]
    */
  var credit_note: String | Null = js.native
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: String = js.native
  /**
    * The ID of the customer the transaction belongs to. [Expandable]
    */
  var customer: String = js.native
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    */
  var description: String | Null = js.native
  /**
    * The customer’s balance after the transaction was applied. A negative value decreases the amount due
    * on the customer’s next invoice. A positive value increases the amount due on the customer’s next invoice.
    */
  var ending_balance: Double = js.native
  /**
    * The ID of the invoice (if any) related to the transaction. [Expandable]
    */
  var invoice: String | Null = js.native
  /**
    * Has the value true if the object exists in live mode or the value false if the object exists in test mode.
    */
  var livemode: Boolean = js.native
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional
    * information about the object in a structured format.
    */
  var metadata: IMetadata | Null = js.native
  /**
    * Value is "customer_balance_transaction"
    */
  @JSName("object")
  var object_ICustomerBalanceTransaction: customer_balance_transaction = js.native
  /**
    * Transaction type. See the Customer Balance page to learn more about transaction types.
    */
  var `type`: CustomerBalanceTransactionType = js.native
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
    `type`: CustomerBalanceTransactionType
  ): ICustomerBalanceTransaction = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], ending_balance = ending_balance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomerBalanceTransaction]
  }
  @scala.inline
  implicit class ICustomerBalanceTransactionOps[Self <: ICustomerBalanceTransaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomer(value: String): Self = this.set("customer", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnding_balance(value: Double): Self = this.set("ending_balance", value.asInstanceOf[js.Any])
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: customer_balance_transaction): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: CustomerBalanceTransactionType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setCredit_note(value: String): Self = this.set("credit_note", value.asInstanceOf[js.Any])
    @scala.inline
    def setCredit_noteNull: Self = this.set("credit_note", null)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    @scala.inline
    def setInvoice(value: String): Self = this.set("invoice", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvoiceNull: Self = this.set("invoice", null)
    @scala.inline
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadataNull: Self = this.set("metadata", null)
  }
  
}

