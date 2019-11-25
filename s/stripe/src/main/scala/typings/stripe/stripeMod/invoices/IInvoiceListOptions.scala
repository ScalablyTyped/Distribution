package typings.stripe.stripeMod.invoices

import typings.stripe.stripeMod.IDateFilter
import typings.stripe.stripeMod.IListOptions
import typings.stripe.stripeStrings.charge_automatically
import typings.stripe.stripeStrings.draft
import typings.stripe.stripeStrings.open
import typings.stripe.stripeStrings.paid
import typings.stripe.stripeStrings.send_invoice
import typings.stripe.stripeStrings.uncollectible
import typings.stripe.stripeStrings.void
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInvoiceListOptions extends IListOptions {
  /**
    * The billing mode of the invoice to retrieve. Either `charge_automatically` or `send_invoice`
    * This field has been renamed to collection_method and will be removed in a future API version.
    */
  var billing: js.UndefOr[charge_automatically | send_invoice] = js.undefined
  /**
    * Either charge_automatically, or send_invoice. When charging automatically, Stripe will attempt to pay
    * this invoice using the default source attached to the customer. When sending an invoice, Stripe will
    * email this invoice to the customer with payment instructions.
    */
  var collection_method: js.UndefOr[charge_automatically | send_invoice] = js.undefined
  /**
    * A filter on the list based on the object created field. The value can be a string with an integer Unix timestamp,
    * or it can be a dictionary with the following options:
    */
  var created: js.UndefOr[IDateFilter] = js.undefined
  /**
    * The identifier of the customer whose invoices to return. If none is provided, all invoices will be returned.
    */
  var customer: js.UndefOr[String] = js.undefined
  /**
    * @deprecated Use created property instead as of api version 2019-03-14.
    */
  var date: js.UndefOr[IDateFilter] = js.undefined
  /**
    * A filter on the list based on the object due_date field. The value can be a string with an integer Unix timestamp,
    * or it can be a dictionary with the following options:
    */
  var due_date: js.UndefOr[IDateFilter] = js.undefined
  /**
    * The status of the invoice, one of draft, open, paid, uncollectible, or void.
    */
  var status: js.UndefOr[draft | open | paid | uncollectible | void] = js.undefined
  /**
    * Only return invoices for the subscription specified by this subscription ID
    */
  var subscription: js.UndefOr[String] = js.undefined
}

object IInvoiceListOptions {
  @scala.inline
  def apply(
    billing: charge_automatically | send_invoice = null,
    collection_method: charge_automatically | send_invoice = null,
    created: IDateFilter = null,
    customer: String = null,
    date: IDateFilter = null,
    due_date: IDateFilter = null,
    ending_before: String = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    limit: Int | Double = null,
    starting_after: String = null,
    status: draft | open | paid | uncollectible | void = null,
    subscription: String = null
  ): IInvoiceListOptions = {
    val __obj = js.Dynamic.literal()
    if (billing != null) __obj.updateDynamic("billing")(billing.asInstanceOf[js.Any])
    if (collection_method != null) __obj.updateDynamic("collection_method")(collection_method.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (due_date != null) __obj.updateDynamic("due_date")(due_date.asInstanceOf[js.Any])
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInvoiceListOptions]
  }
}

