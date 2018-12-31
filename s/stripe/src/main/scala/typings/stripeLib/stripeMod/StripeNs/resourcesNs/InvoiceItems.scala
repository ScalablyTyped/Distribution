package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvoiceItems
  extends stripeLib.stripeMod.StripeNs.StripeResource {
  def create(data: stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItemCreationOptions): js.Promise[stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItem] = js.native
  /**
    * Adds an arbitrary charge or credit to the customer’s upcoming invoice.
    */
  def create(
    data: stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItemCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItem] = js.native
  def create(
    data: stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItemCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItem]
  ): js.Promise[stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItem] = js.native
  def create(
    data: stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItemCreationOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItem]
  ): js.Promise[stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItem] = js.native
  def del(invoiceItemId: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  /**
    * Removes an invoice item from the upcoming invoice. Removing an invoice item is only possible before the invoice it's attached
    * to is closed.
    */
  def del(invoiceItemId: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  def del(
    invoiceItemId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IDeleteConfirmation]
  ): js.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  def del(
    invoiceItemId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.IDeleteConfirmation]
  ): js.Promise[stripeLib.stripeMod.StripeNs.IDeleteConfirmation] = js.native
  def list(): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItem]
  ] = js.native
  def list(data: stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItemListOptions): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItem]
  ] = js.native
  /**
    * Returns a list of your invoice items. Invoice items are returned sorted by creation date, with the most recently created invoice
    * items appearing first.
    */
  def list(
    data: stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItemListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItem]
  ] = js.native
  def list(
    data: stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItemListOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItem]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItem]
  ] = js.native
  def list(
    data: stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItemListOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItem]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItem]
  ] = js.native
  def list(options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItem]
  ] = js.native
  def list(
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItem]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItem]
  ] = js.native
  def list(
    response: stripeLib.stripeMod.StripeNs.IResponseFn[
      stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItem]
    ]
  ): js.Promise[
    stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItem]
  ] = js.native
  def retrieve(invoiceItemId: java.lang.String): js.Promise[stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItem] = js.native
  /**
    * Retrieves the invoice item with the given ID.
    */
  def retrieve(invoiceItemId: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): js.Promise[stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItem] = js.native
  def retrieve(
    invoiceItemId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItem]
  ): js.Promise[stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItem] = js.native
  def retrieve(
    invoiceItemId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItem]
  ): js.Promise[stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItem] = js.native
  def update(
    invoiceItemId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItemUpdateOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItem] = js.native
  /**
    * Updates the amount or description of an invoice item on an upcoming invoice. Updating an invoice item is only possible before the
    * invoice it's attached to is closed.
    */
  def update(
    invoiceItemId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItemUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): js.Promise[stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItem] = js.native
  def update(
    invoiceItemId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItemUpdateOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItem]
  ): js.Promise[stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItem] = js.native
  def update(
    invoiceItemId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItemUpdateOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItem]
  ): js.Promise[stripeLib.stripeMod.StripeNs.invoiceItemsNs.InvoiceItem] = js.native
}

