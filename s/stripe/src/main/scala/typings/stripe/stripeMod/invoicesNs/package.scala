package typings.stripe.stripeMod

import typings.stripe.stripeMod.IListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object invoicesNs {
  type IInvoiceListLineItemsOptions = IListOptions
  // TODO: update once https://stripe.com/docs/api/invoices/upcoming_invoice_lines is fixed.
  type IInvoiceListUpcomingLineItemsOptions = IListOptions
}
