package typings
package stripeLib.stripeMod.invoicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInvoiceListOptions
  extends stripeLib.stripeMod.IListOptions {
  /**
    * The billing mode of the invoice to retrieve. Either `charge_automatically` or `send_invoice`
    */
  var billing: js.UndefOr[
    stripeLib.stripeLibStrings.charge_automatically | stripeLib.stripeLibStrings.send_invoice
  ] = js.undefined
  /**
    * A filter on the list based on the object created field. The value can be a string with an integer Unix timestamp,
    * or it can be a dictionary with the following options:
    */
  var created: js.UndefOr[stripeLib.stripeMod.IDateFilter] = js.undefined
  /**
    * The identifier of the customer whose invoices to return. If none is provided, all invoices will be returned.
    */
  var customer: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A filter on the list based on the object due_date field. The value can be a string with an integer Unix timestamp,
    * or it can be a dictionary with the following options:
    */
  var due_date: js.UndefOr[stripeLib.stripeMod.IDateFilter] = js.undefined
  /**
    * Only return invoices for the subscription specified by this subscription ID
    */
  var subscription: js.UndefOr[java.lang.String] = js.undefined
}

object IInvoiceListOptions {
  @scala.inline
  def apply(
    billing: stripeLib.stripeLibStrings.charge_automatically | stripeLib.stripeLibStrings.send_invoice = null,
    created: stripeLib.stripeMod.IDateFilter = null,
    customer: java.lang.String = null,
    due_date: stripeLib.stripeMod.IDateFilter = null,
    ending_before: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    limit: scala.Int | scala.Double = null,
    starting_after: java.lang.String = null,
    subscription: java.lang.String = null
  ): IInvoiceListOptions = {
    val __obj = js.Dynamic.literal()
    if (billing != null) __obj.updateDynamic("billing")(billing.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer)
    if (due_date != null) __obj.updateDynamic("due_date")(due_date.asInstanceOf[js.Any])
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after)
    if (subscription != null) __obj.updateDynamic("subscription")(subscription)
    __obj.asInstanceOf[IInvoiceListOptions]
  }
}

