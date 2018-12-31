package typings
package stripeLib.stripeMod.StripeNs.invoicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInvoiceLineItemRetrievalOptions
  extends stripeLib.stripeMod.StripeNs.IListOptions {
  var coupon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * In the case of upcoming invoices, the customer of the upcoming invoice is required. In other cases it is ignored.
    */
  var customer: js.UndefOr[java.lang.String] = js.undefined
  /**
    * In the case of upcoming invoices, the subscription of the upcoming invoice is optional. In other cases it is ignored.
    */
  var subscription: js.UndefOr[java.lang.String] = js.undefined
  var subscription_plan: js.UndefOr[java.lang.String] = js.undefined
  var subscription_prorate: js.UndefOr[scala.Boolean] = js.undefined
  var subscription_proration_date: js.UndefOr[scala.Double] = js.undefined
  var subscription_quantity: js.UndefOr[scala.Double] = js.undefined
  var subscription_trial_end: js.UndefOr[scala.Double] = js.undefined
}

