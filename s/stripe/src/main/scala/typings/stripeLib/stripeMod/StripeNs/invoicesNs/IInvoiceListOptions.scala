package typings
package stripeLib.stripeMod.StripeNs.invoicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInvoiceListOptions
  extends stripeLib.stripeMod.StripeNs.IListOptions {
  /**
    * The identifier of the customer whose invoices to return. If none is provided, all invoices will be returned.
    */
  var customer: js.UndefOr[java.lang.String] = js.undefined
  var date: js.UndefOr[stripeLib.stripeMod.StripeNs.IDateFilter] = js.undefined
}

object IInvoiceListOptions {
  @scala.inline
  def apply(
    customer: java.lang.String = null,
    date: stripeLib.stripeMod.StripeNs.IDateFilter = null,
    ending_before: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    limit: scala.Int | scala.Double = null,
    starting_after: java.lang.String = null
  ): IInvoiceListOptions = {
    val __obj = js.Dynamic.literal()
    if (customer != null) __obj.updateDynamic("customer")(customer)
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after)
    __obj.asInstanceOf[IInvoiceListOptions]
  }
}

