package typings.stripe.stripeMod.invoiceItems

import typings.stripe.stripeMod.IDataOptionsWithMetadata
import typings.stripe.stripeMod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvoiceItemUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * The integer amount in cents/pence of the charge to be applied to the upcoming invoice. If you want to apply a credit to the customer's
    * account, pass a negative amount.
    */
  var amount: js.UndefOr[Double] = js.undefined
  /**
    * An arbitrary string which you can attach to the invoice item. The description is displayed in the invoice for easy tracking. This can be
    * unset by updating the value to null and then saving.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Controls whether discounts apply to this invoice item. Defaults to false for prorations or negative invoice items, and true for all other
    * invoice items. Cannot be set to true for prorations.
    */
  var discountable: js.UndefOr[Boolean] = js.undefined
}

object InvoiceItemUpdateOptions {
  @scala.inline
  def apply(
    amount: Int | Double = null,
    description: String = null,
    discountable: js.UndefOr[Boolean] = js.undefined,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    metadata: IOptionsMetadata = null
  ): InvoiceItemUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(discountable)) __obj.updateDynamic("discountable")(discountable)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[InvoiceItemUpdateOptions]
  }
}

