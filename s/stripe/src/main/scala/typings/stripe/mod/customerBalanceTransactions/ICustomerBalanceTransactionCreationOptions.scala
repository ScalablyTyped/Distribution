package typings.stripe.mod.customerBalanceTransactions

import typings.stripe.mod.IMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomerBalanceTransactionCreationOptions extends js.Object {
  /**
    * The integer amount in cents to apply to the customer’s balance. Pass a negative amount to credit the
    * customer’s balance, and pass in a positive amount to debit the customer’s balance.
    */
  var amount: Double = js.native
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency. If the customer’s currency
    * is set, this value must match it. If the customer’s currency is not set, it will be updated to this value.
    */
  var currency: String = js.native
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional
    * information about the object in a structured format.
    */
  var metadata: js.UndefOr[IMetadata] = js.native
}

object ICustomerBalanceTransactionCreationOptions {
  @scala.inline
  def apply(amount: Double, currency: String): ICustomerBalanceTransactionCreationOptions = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomerBalanceTransactionCreationOptions]
  }
  @scala.inline
  implicit class ICustomerBalanceTransactionCreationOptionsOps[Self <: ICustomerBalanceTransactionCreationOptions] (val x: Self) extends AnyVal {
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
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
  
}

