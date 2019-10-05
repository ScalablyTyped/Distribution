package typings.stripe.stripeMod.invoiceItems

import typings.stripe.stripeMod.IDateFilter
import typings.stripe.stripeMod.IListOptionsCreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvoiceItemListOptions extends IListOptionsCreated {
  /**
    * The identifier of the customer whose invoice items to return. If none is provided, all invoice items will be returned.
    */
  var customer: js.UndefOr[String] = js.undefined
  /**
    * Only return invoice items belonging to this invoice. If none is provided, all invoice items will be returned. If specifying an invoice, no customer identifier is needed.
    */
  var invoice: js.UndefOr[String] = js.undefined
  /**
    * Set to true to only show pending invoice items, which are not yet attached to any invoices. Set to false to only show
    * invoice items already attached to invoices. If unspecified, no filter is applied.
    */
  var pending: js.UndefOr[Boolean] = js.undefined
}

object InvoiceItemListOptions {
  @scala.inline
  def apply(
    created: String | IDateFilter = null,
    customer: String = null,
    ending_before: String = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    invoice: String = null,
    limit: Int | Double = null,
    pending: js.UndefOr[Boolean] = js.undefined,
    starting_after: String = null
  ): InvoiceItemListOptions = {
    val __obj = js.Dynamic.literal()
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer)
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (invoice != null) __obj.updateDynamic("invoice")(invoice)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(pending)) __obj.updateDynamic("pending")(pending)
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after)
    __obj.asInstanceOf[InvoiceItemListOptions]
  }
}

