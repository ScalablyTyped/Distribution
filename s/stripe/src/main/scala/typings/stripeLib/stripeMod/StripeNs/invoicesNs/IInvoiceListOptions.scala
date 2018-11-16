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

