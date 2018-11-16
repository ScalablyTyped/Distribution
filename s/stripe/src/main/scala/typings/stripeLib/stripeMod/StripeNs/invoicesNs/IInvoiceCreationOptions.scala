package typings
package stripeLib.stripeMod.StripeNs.invoicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IInvoiceCreationOptions
  extends stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata {
  /**
               * A fee in pence that will be applied to the invoice and transferred to the application owner’s Stripe account.
               * The request must be made with an OAuth key or the Stripe-Account header in order to take an application fee.
               * For more information, see the application fees documentation.
               */
  var application_fee: js.UndefOr[scala.Double] = js.undefined
  var customer: java.lang.String
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Extra information about a charge for the customer’s credit card statement.
               */
  var statement_descriptor: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The ID of the subscription to invoice. If not set, the created invoice will include all pending invoice items for
               * the customer. If set, the created invoice will exclude pending invoice items that pertain to other subscriptions.
               */
  var subscription: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The percent tax rate applied to the invoice, represented as a decimal number.
               */
  var tax_percent: js.UndefOr[scala.Double] = js.undefined
}

