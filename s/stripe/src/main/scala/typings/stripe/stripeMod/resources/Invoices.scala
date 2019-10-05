package typings.stripe.stripeMod.resources

import typings.stripe.stripeMod.HeaderOptions
import typings.stripe.stripeMod.IDataOptions
import typings.stripe.stripeMod.IList
import typings.stripe.stripeMod.IListPromise
import typings.stripe.stripeMod.IResponseFn
import typings.stripe.stripeMod.StripeResource
import typings.stripe.stripeMod.invoices.IInvoice
import typings.stripe.stripeMod.invoices.IInvoiceCreationOptions
import typings.stripe.stripeMod.invoices.IInvoiceFinalizeOptions
import typings.stripe.stripeMod.invoices.IInvoiceLineItem
import typings.stripe.stripeMod.invoices.IInvoiceLineItemRetrievalOptions
import typings.stripe.stripeMod.invoices.IInvoiceListLineItemsOptions
import typings.stripe.stripeMod.invoices.IInvoiceListOptions
import typings.stripe.stripeMod.invoices.IInvoiceListUpcomingLineItemsOptions
import typings.stripe.stripeMod.invoices.IInvoicePayOptions
import typings.stripe.stripeMod.invoices.IInvoiceUpcomingOptions
import typings.stripe.stripeMod.invoices.IInvoiceUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.Invoices")
@js.native
class Invoices () extends StripeResource {
  def create(data: IInvoiceCreationOptions): js.Promise[IInvoice] = js.native
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
  def create(data: IInvoiceCreationOptions, options: HeaderOptions): js.Promise[IInvoice] = js.native
  def create(data: IInvoiceCreationOptions, options: HeaderOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
  def create(data: IInvoiceCreationOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
  def finalizeInvoice(id: String): js.Promise[IInvoice] = js.native
  def finalizeInvoice(id: String, data: IInvoiceFinalizeOptions): js.Promise[IInvoice] = js.native
  /**
    * Stripe automatically finalizes drafts before sending and attempting payment on invoices. However, if
    * you’d like to finalize a draft invoice manually, you can do so using this method.
    *
    * @returns Returns the invoice object.
    *
    * @param id The ID of the invoice to pay.
    * @param data Additional arguments.
    */
  def finalizeInvoice(id: String, data: IInvoiceFinalizeOptions, options: HeaderOptions): js.Promise[IInvoice] = js.native
  def finalizeInvoice(id: String, data: IInvoiceFinalizeOptions, options: HeaderOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
  def finalizeInvoice(id: String, data: IInvoiceFinalizeOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
  def finalizeInvoice(id: String, options: HeaderOptions): js.Promise[IInvoice] = js.native
  def finalizeInvoice(id: String, options: HeaderOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
  def finalizeInvoice(id: String, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
  def list(): IListPromise[IInvoice] = js.native
  def list(data: IInvoiceListOptions): IListPromise[IInvoice] = js.native
  /**
    * You can list all invoices, or list the invoices for a specific customer. The invoices are returned
    * sorted by creation date, with the most recently created invoices appearing first.
    *
    * @returns A object with a data property that contains an array of invoice objects. Throws an error if the
    * customer ID is invalid.
    *
    * @param data Filtering options
    */
  def list(data: IInvoiceListOptions, options: HeaderOptions): IListPromise[IInvoice] = js.native
  def list(data: IInvoiceListOptions, options: HeaderOptions, response: IResponseFn[IList[IInvoice]]): IListPromise[IInvoice] = js.native
  def list(data: IInvoiceListOptions, response: IResponseFn[IList[IInvoice]]): IListPromise[IInvoice] = js.native
  def list(response: IResponseFn[IList[IInvoice]]): IListPromise[IInvoice] = js.native
  def listLineItems(id: String): IListPromise[IInvoiceLineItem] = js.native
  def listLineItems(id: String, data: IInvoiceListLineItemsOptions): IListPromise[IInvoiceLineItem] = js.native
  /**
    * When retrieving an invoice, you'll get a lines property containing the total count of line items and the first
    * handful of those items. There is also a URL where you can retrieve the full (paginated) list of line items.
    *
    * @returns Returns a list of line_item objects.
    *
    * @param id The id of the invoice containing the lines to be retrieved
    * @param data Filtering options
    */
  def listLineItems(id: String, data: IInvoiceListLineItemsOptions, options: HeaderOptions): IListPromise[IInvoiceLineItem] = js.native
  def listLineItems(
    id: String,
    data: IInvoiceListLineItemsOptions,
    options: HeaderOptions,
    response: IResponseFn[IList[IInvoiceLineItem]]
  ): IListPromise[IInvoiceLineItem] = js.native
  def listLineItems(id: String, data: IInvoiceListLineItemsOptions, response: IResponseFn[IList[IInvoiceLineItem]]): IListPromise[IInvoiceLineItem] = js.native
  def listLineItems(id: String, options: HeaderOptions): IListPromise[IInvoiceLineItem] = js.native
  def listLineItems(id: String, options: HeaderOptions, response: IResponseFn[IList[IInvoiceLineItem]]): IListPromise[IInvoiceLineItem] = js.native
  def listLineItems(id: String, response: IResponseFn[IList[IInvoiceLineItem]]): IListPromise[IInvoiceLineItem] = js.native
  def listUpcomingLineItems(): IListPromise[IInvoiceLineItem] = js.native
  def listUpcomingLineItems(data: IInvoiceListUpcomingLineItemsOptions): IListPromise[IInvoiceLineItem] = js.native
  /**
    * When retrieving an upcoming invoice, you’ll get a lines property containing the total count of line
    * items and the first handful of those items. There is also a URL where you can retrieve the full
    * (paginated) list of line items.
    *
    * @returns Returns a list of line_item objects.
    *
    * @param id The id of the invoice containing the lines to be retrieved
    * @param data Filtering options
    */
  def listUpcomingLineItems(data: IInvoiceListUpcomingLineItemsOptions, options: HeaderOptions): IListPromise[IInvoiceLineItem] = js.native
  def listUpcomingLineItems(
    data: IInvoiceListUpcomingLineItemsOptions,
    options: HeaderOptions,
    response: IResponseFn[IList[IInvoiceLineItem]]
  ): IListPromise[IInvoiceLineItem] = js.native
  def listUpcomingLineItems(data: IInvoiceListUpcomingLineItemsOptions, response: IResponseFn[IList[IInvoiceLineItem]]): IListPromise[IInvoiceLineItem] = js.native
  def listUpcomingLineItems(options: HeaderOptions): IListPromise[IInvoiceLineItem] = js.native
  def listUpcomingLineItems(options: HeaderOptions, response: IResponseFn[IList[IInvoiceLineItem]]): IListPromise[IInvoiceLineItem] = js.native
  def listUpcomingLineItems(response: IResponseFn[IList[IInvoiceLineItem]]): IListPromise[IInvoiceLineItem] = js.native
  def pay(id: String): js.Promise[IInvoice] = js.native
  def pay(id: String, data: IInvoicePayOptions): js.Promise[IInvoice] = js.native
  /**
    * Stripe automatically creates and then attempts to pay invoices for customers on subscriptions. We'll also retry unpaid
    * invoices according to your retry settings. However, if you'd like to attempt to collect payment on an invoice out of the
    * normal retry schedule or for some other reason, you can do so.
    *
    * @returns Returns the invoice object.
    *
    * @param id The ID of the invoice to pay.
    */
  def pay(id: String, data: IInvoicePayOptions, options: HeaderOptions): js.Promise[IInvoice] = js.native
  def pay(id: String, data: IInvoicePayOptions, options: HeaderOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
  def pay(id: String, data: IInvoicePayOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
  def pay(id: String, options: HeaderOptions): js.Promise[IInvoice] = js.native
  def pay(id: String, options: HeaderOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
  def pay(id: String, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
  def retrieve(id: String): js.Promise[IInvoice] = js.native
  def retrieve(id: String, data: IDataOptions): js.Promise[IInvoice] = js.native
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
  def retrieve(id: String, data: IDataOptions, options: HeaderOptions): js.Promise[IInvoice] = js.native
  def retrieve(id: String, data: IDataOptions, options: HeaderOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
  def retrieve(id: String, data: IDataOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
  def retrieve(id: String, options: HeaderOptions): js.Promise[IInvoice] = js.native
  def retrieve(id: String, options: HeaderOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
  def retrieve(id: String, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
  def retrieveLines(id: String): IListPromise[IInvoiceLineItem] = js.native
  def retrieveLines(id: String, data: IInvoiceLineItemRetrievalOptions): IListPromise[IInvoiceLineItem] = js.native
  /**
    * When retrieving an invoice, you'll get a lines property containing the total count of line items and the first
    * handful of those items. There is also a URL where you can retrieve the full (paginated) list of line items.
    *
    * @returns Returns a list of line_item objects.
    *
    * @param id The id of the invoice containing the lines to be retrieved
    * @param data Filtering options
    */
  def retrieveLines(id: String, data: IInvoiceLineItemRetrievalOptions, options: HeaderOptions): IListPromise[IInvoiceLineItem] = js.native
  def retrieveLines(
    id: String,
    data: IInvoiceLineItemRetrievalOptions,
    options: HeaderOptions,
    response: IResponseFn[IList[IInvoiceLineItem]]
  ): IListPromise[IInvoiceLineItem] = js.native
  def retrieveLines(id: String, data: IInvoiceLineItemRetrievalOptions, response: IResponseFn[IList[IInvoiceLineItem]]): IListPromise[IInvoiceLineItem] = js.native
  def retrieveLines(id: String, options: HeaderOptions): IListPromise[IInvoiceLineItem] = js.native
  def retrieveLines(id: String, options: HeaderOptions, response: IResponseFn[IList[IInvoiceLineItem]]): IListPromise[IInvoiceLineItem] = js.native
  def retrieveLines(id: String, response: IResponseFn[IList[IInvoiceLineItem]]): IListPromise[IInvoiceLineItem] = js.native
  def retrieveUpcoming(data: IInvoiceUpcomingOptions): js.Promise[IInvoice] = js.native
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
    * @param data Filtering options
    */
  def retrieveUpcoming(data: IInvoiceUpcomingOptions, options: HeaderOptions): js.Promise[IInvoice] = js.native
  def retrieveUpcoming(data: IInvoiceUpcomingOptions, options: HeaderOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
  def retrieveUpcoming(data: IInvoiceUpcomingOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
  def retrieveUpcoming(id: String): js.Promise[IInvoice] = js.native
  def retrieveUpcoming(id: String, data: IInvoiceUpcomingOptions): js.Promise[IInvoice] = js.native
  def retrieveUpcoming(id: String, data: IInvoiceUpcomingOptions, options: HeaderOptions): js.Promise[IInvoice] = js.native
  def retrieveUpcoming(id: String, data: IInvoiceUpcomingOptions, options: HeaderOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
  def retrieveUpcoming(id: String, data: IInvoiceUpcomingOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
  def retrieveUpcoming(id: String, options: HeaderOptions): js.Promise[IInvoice] = js.native
  def retrieveUpcoming(id: String, options: HeaderOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
  def retrieveUpcoming(id: String, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
  def sendInvoice(id: String): js.Promise[IInvoice] = js.native
  /**
    * Stripe will automatically send invoices to customers according to your subscriptions settings.
    * However, if you’d like to manually send an invoice to your customer out of the normal schedule, you can do so.
    * When sending invoices that have already been paid, there will be no reference to the payment in the email.
    *
    * Requests made in test-mode result in no emails being sent, despite sending an invoice.sent event.
    *
    * @returns Returns the invoice object
    *
    * @param invoice The ID of the invoice to send
    */
  def sendInvoice(id: String, options: HeaderOptions): js.Promise[IInvoice] = js.native
  def sendInvoice(id: String, options: HeaderOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
  def sendInvoice(id: String, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
  def update(id: String, data: IInvoiceUpdateOptions): js.Promise[IInvoice] = js.native
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
  def update(id: String, data: IInvoiceUpdateOptions, options: HeaderOptions): js.Promise[IInvoice] = js.native
  def update(id: String, data: IInvoiceUpdateOptions, options: HeaderOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
  def update(id: String, data: IInvoiceUpdateOptions, response: IResponseFn[IInvoice]): js.Promise[IInvoice] = js.native
}

