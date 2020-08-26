package typings.stripe.mod.invoiceItems

import typings.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvoiceItemUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * The integer amount in cents/pence of the charge to be applied to the upcoming invoice. If you want to apply a credit to the customer's
    * account, pass a negative amount.
    */
  var amount: js.UndefOr[Double] = js.native
  /**
    * An arbitrary string which you can attach to the invoice item. The description is displayed in the invoice for easy tracking. This can be
    * unset by updating the value to null and then saving.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Controls whether discounts apply to this invoice item. Defaults to false for prorations or negative invoice items, and true for all other
    * invoice items. Cannot be set to true for prorations.
    */
  var discountable: js.UndefOr[Boolean] = js.native
}

object InvoiceItemUpdateOptions {
  @scala.inline
  def apply(): InvoiceItemUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvoiceItemUpdateOptions]
  }
  @scala.inline
  implicit class InvoiceItemUpdateOptionsOps[Self <: InvoiceItemUpdateOptions] (val x: Self) extends AnyVal {
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
    def deleteAmount: Self = this.set("amount", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDiscountable(value: Boolean): Self = this.set("discountable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiscountable: Self = this.set("discountable", js.undefined)
  }
  
}

