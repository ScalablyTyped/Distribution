package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Invoices
  extends stripeLib.stripeMod.StripeNs.StripeResource {
  def create(data: stripeLib.stripeMod.StripeNs.invoicesNs.IInvoiceCreationOptions): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice] = js.native
  /**
    * If you need to invoice your customer outside the regular billing cycle, you can create an invoice that
    * pulls in all pending invoice items, including prorations. The customer's billing cycle and regular subscription
    * won't be affected. Once you create the invoice, it'll be picked up and paid automatically, though you can
    * choose to pay it right away: https://stripe.com/docs/api#pay_invoice
    *
    * @returns Returns the invoice object if there are pending invoice items to invoice. Throws an error if there
    * are no pending invoice items or if the customer ID provided is invalid.
    *
    * @param data Options used to create the invoice.
    */
  def create(
    data: stripeLib.stripeMod.StripeNs.invoicesNs.IInvoiceCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice] = js.native
  def create(
    data: stripeLib.stripeMod.StripeNs.invoicesNs.IInvoiceCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice]
  ): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice] = js.native
  def create(
    data: stripeLib.stripeMod.StripeNs.invoicesNs.IInvoiceCreationOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice]
  ): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice] = js.native
  def list(): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice]
  ] = js.native
  def list(data: stripeLib.stripeMod.StripeNs.invoicesNs.IInvoiceListOptions): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice]
  ] = js.native
  /**
    * You can list all invoices, or list the invoices for a specific customer. The invoices are returned
    * sorted by creation date, with the most recently created invoices appearing first.
    *
    * @returns A object with a data property that contains an array of invoice objects. Throws an error if the
    * customer ID is invalid.
    *
    * @param data Filtering options
    */
  def list(
    data: stripeLib.stripeMod.StripeNs.invoicesNs.IInvoiceListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice]
  ] = js.native
  def list(
    data: stripeLib.stripeMod.StripeNs.invoicesNs.IInvoiceListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice]
  ] = js.native
  def list(
    data: stripeLib.stripeMod.StripeNs.invoicesNs.IInvoiceListOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice]
  ] = js.native
  def list(
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice]
  ] = js.native
  def pay(id: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice] = js.native
  def pay(id: java.lang.String, data: stripeLib.stripeMod.StripeNs.invoicesNs.IInvoicePayOptions): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice] = js.native
  /**
    * Stripe automatically creates and then attempts to pay invoices for customers on subscriptions. We'll also retry unpaid
    * invoices according to your retry settings. However, if you'd like to attempt to collect payment on an invoice out of the
    * normal retry schedule or for some other reason, you can do so.
    *
    * @returns Returns the invoice object.
    *
    * @param id The ID of the invoice to pay.
    */
  def pay(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.invoicesNs.IInvoicePayOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice] = js.native
  def pay(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.invoicesNs.IInvoicePayOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice]
  ): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice] = js.native
  def pay(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.invoicesNs.IInvoicePayOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice]
  ): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice] = js.native
  def pay(id: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice] = js.native
  def pay(
    id: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice]
  ): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice] = js.native
  def pay(
    id: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice]
  ): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice] = js.native
  def retrieve(id: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice] = js.native
  def retrieve(id: java.lang.String, data: stripeLib.stripeMod.StripeNs.IDataOptions): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice] = js.native
  /**
    * Retrieves the invoice with the given ID. The invoice object contains a
    * lines hash that contains information about the subscriptions and invoice items that have been applied to the
    * invoice, as well as any prorations that Stripe has automatically calculated. Each line on the invoice has an
    * amount attribute that represents the amount actually contributed to the invoice's total. For invoice items and
    * prorations, the amount attribute is the same as for the invoice item or proration respectively. For
    * subscriptions, the amount may be different from the plan's regular price depending on whether the invoice
    * covers a trial period or the invoice period differs from the plan's usual interval. The invoice object has
    * both a subtotal and a total. The subtotal represents the total before any discounts, while the total is the final
    * amount to be charged to the customer after all coupons have been applied. The invoice also has a
    * next_payment_attempt attribute that tells you the next time (as a Unix timestamp) payment for the invoice will be
    * automatically attempted. For invoices that have been closed or that have reached the maximum number of retries
    * (specified in your retry settings), the next_payment_attempt will be null.
    *
    * @returns Returns an invoice object if a valid invoice ID was provided. Throws an error otherwise.
    *
    * @param id The ID of the desired invoice.
    */
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice] = js.native
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice]
  ): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice] = js.native
  def retrieve(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice]
  ): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice] = js.native
  def retrieve(id: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice] = js.native
  def retrieve(
    id: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice]
  ): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice] = js.native
  def retrieve(
    id: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice]
  ): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice] = js.native
  def retrieveLines(id: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoiceLineItem] = js.native
  def retrieveLines(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.invoicesNs.IInvoiceLineItemRetrievalOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoiceLineItem] = js.native
  /**
    * When retrieving an invoice, you'll get a lines property containing the total count of line items and the first
    * handful of those items. There is also a URL where you can retrieve the full (paginated) list of line items.
    *
    * @returns Returns a list of line_item objects.
    *
    * @param id The id of the invoice containing the lines to be retrieved
    * @param data Filtering options
    */
  def retrieveLines(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.invoicesNs.IInvoiceLineItemRetrievalOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoiceLineItem] = js.native
  def retrieveLines(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.invoicesNs.IInvoiceLineItemRetrievalOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoiceLineItem]
    ]
  ): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoiceLineItem] = js.native
  def retrieveLines(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.invoicesNs.IInvoiceLineItemRetrievalOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoiceLineItem]
    ]
  ): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoiceLineItem] = js.native
  def retrieveLines(id: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoiceLineItem] = js.native
  def retrieveLines(
    id: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoiceLineItem]
    ]
  ): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoiceLineItem] = js.native
  def retrieveLines(
    id: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoiceLineItem]
    ]
  ): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoiceLineItem] = js.native
  def retrieveUpcoming(id: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice] = js.native
  def retrieveUpcoming(id: java.lang.String, data: stripeLib.stripeMod.StripeNs.invoicesNs.IInvoiceUpcomingOptions): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice] = js.native
  /**
    * At any time, you can preview the upcoming invoice for a customer. This will show you all the charges that are pending,
    * including subscription renewal charges, invoice item charges, etc. It will also show you any discount that is applicable
    * to the customer. Note that when you are viewing an upcoming invoice, you are simply viewing a preview -- the invoice has
    * not yet been created. As such, the upcoming invoice will not show up in invoice listing calls, and you cannot use the API
    * to pay or edit the invoice. If you want to change the amount that your customer will be billed, you can add, remove, or
    * update pending invoice items, or update the customer's discount.
    *
    * @returns Returns an invoice if a valid customer ID was provided. Throws an error otherwise.
    *
    * @param id The identifier of the customer whose upcoming invoice you'd like to retrieve.
    */
  def retrieveUpcoming(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.invoicesNs.IInvoiceUpcomingOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice] = js.native
  def retrieveUpcoming(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.invoicesNs.IInvoiceUpcomingOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice]
  ): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice] = js.native
  def retrieveUpcoming(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.invoicesNs.IInvoiceUpcomingOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice]
  ): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice] = js.native
  def retrieveUpcoming(id: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice] = js.native
  def retrieveUpcoming(
    id: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice]
  ): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice] = js.native
  def retrieveUpcoming(
    id: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice]
  ): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice] = js.native
  def update(id: java.lang.String, data: stripeLib.stripeMod.StripeNs.invoicesNs.IInvoiceUpdateOptions): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice] = js.native
  /**
    * Until an invoice is paid, it is marked as open (closed=false). If you'd like to stop Stripe from automatically attempting
    * payment on an invoice or would simply like to close the invoice out as no longer owed by the customer, you can update the
    * closed parameter.
    *
    * @returns Returns the invoice object.
    *
    * @param id The ID of the invoice to update
    * @param data Fields to update
    */
  def update(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.invoicesNs.IInvoiceUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice] = js.native
  def update(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.invoicesNs.IInvoiceUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice]
  ): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice] = js.native
  def update(
    id: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.invoicesNs.IInvoiceUpdateOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice]
  ): js.Promise[stripeLib.stripeMod.StripeNs.invoicesNs.IInvoice] = js.native
}

