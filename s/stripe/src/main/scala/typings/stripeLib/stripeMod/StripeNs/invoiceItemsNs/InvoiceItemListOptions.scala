package typings
package stripeLib.stripeMod.StripeNs.invoiceItemsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvoiceItemListOptions
  extends stripeLib.stripeMod.StripeNs.IListOptionsCreated {
  /**
    * The identifier of the customer whose invoice items to return. If none is provided, all invoice items will be returned.
    */
  var customer: js.UndefOr[java.lang.String] = js.undefined
}

object InvoiceItemListOptions {
  @scala.inline
  def apply(
    created: java.lang.String | stripeLib.stripeMod.StripeNs.IDateFilter = null,
    customer: java.lang.String = null,
    ending_before: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    limit: scala.Int | scala.Double = null,
    starting_after: java.lang.String = null
  ): InvoiceItemListOptions = {
    val __obj = js.Dynamic.literal()
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer)
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after)
    __obj.asInstanceOf[InvoiceItemListOptions]
  }
}

