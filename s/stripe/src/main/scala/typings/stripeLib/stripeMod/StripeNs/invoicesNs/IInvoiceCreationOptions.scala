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

object IInvoiceCreationOptions {
  @scala.inline
  def apply(
    customer: java.lang.String,
    application_fee: scala.Int | scala.Double = null,
    description: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    metadata: stripeLib.stripeMod.StripeNs.IOptionsMetadata = null,
    statement_descriptor: java.lang.String = null,
    subscription: java.lang.String = null,
    tax_percent: scala.Int | scala.Double = null
  ): IInvoiceCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("customer")(customer)
    if (application_fee != null) __obj.updateDynamic("application_fee")(application_fee.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (statement_descriptor != null) __obj.updateDynamic("statement_descriptor")(statement_descriptor)
    if (subscription != null) __obj.updateDynamic("subscription")(subscription)
    if (tax_percent != null) __obj.updateDynamic("tax_percent")(tax_percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInvoiceCreationOptions]
  }
}

