package typings
package stripeLib.stripeMod.StripeNs.invoicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInvoiceUpdateOptions
  extends stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata {
  /**
    * A fee in pence that will be applied to the invoice and transferred to the application owner’s Stripe account.
    * The request must be made with an OAuth key or the Stripe-Account header in order to take an application fee.
    * For more information, see the application fees documentation.
    */
  var application_fee: js.UndefOr[scala.Double] = js.undefined
  /**
    * Boolean representing whether an invoice is closed or not. To close an invoice, pass true.
    */
  var closed: js.UndefOr[scala.Boolean] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Boolean representing whether an invoice is forgiven or not. To forgive an invoice, pass true. Forgiving an invoice
    * instructs us to update the subscription status as if the invoice were successfully paid. Once an invoice has been
    * forgiven, it cannot be unforgiven or reopened.
    */
  var forgiven: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Extra information about a charge for the customer’s credit card statement.
    */
  var statement_descriptor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The percent tax rate applied to the invoice, represented as a decimal number.
    */
  var tax_percent: js.UndefOr[scala.Double] = js.undefined
}

object IInvoiceUpdateOptions {
  @scala.inline
  def apply(
    application_fee: scala.Int | scala.Double = null,
    closed: js.UndefOr[scala.Boolean] = js.undefined,
    description: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    forgiven: js.UndefOr[scala.Boolean] = js.undefined,
    include: js.Array[java.lang.String] = null,
    metadata: stripeLib.stripeMod.StripeNs.IOptionsMetadata = null,
    statement_descriptor: java.lang.String = null,
    tax_percent: scala.Int | scala.Double = null
  ): IInvoiceUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (application_fee != null) __obj.updateDynamic("application_fee")(application_fee.asInstanceOf[js.Any])
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed)
    if (description != null) __obj.updateDynamic("description")(description)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (!js.isUndefined(forgiven)) __obj.updateDynamic("forgiven")(forgiven)
    if (include != null) __obj.updateDynamic("include")(include)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (statement_descriptor != null) __obj.updateDynamic("statement_descriptor")(statement_descriptor)
    if (tax_percent != null) __obj.updateDynamic("tax_percent")(tax_percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInvoiceUpdateOptions]
  }
}

