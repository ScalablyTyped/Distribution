package typings
package stripeLib.stripeMod.invoicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInvoiceCreationOptions
  extends stripeLib.stripeMod.IDataOptionsWithMetadata {
  /**
    * A fee in pence that will be applied to the invoice and transferred to the application owner’s Stripe account.
    * The request must be made with an OAuth key or the Stripe-Account header in order to take an application fee.
    * For more information, see the application fees documentation.
    */
  var application_fee: js.UndefOr[scala.Double] = js.undefined
  /**
    * Controls whether Stripe will perform
    * [automatic collection](https://stripe.com/docs/billing/invoices/workflow/#auto_advance)
    * of the invoice. When `false`, the invoice’s state will not automatically advance
    * without an explicit action.
    */
  var auto_advance: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe
    * will attempt to pay this invoice using the default source attached to the customer.
    * When sending an invoice, Stripe will email this invoice to the customer with payment
    * instructions. Defaults to charge_automatically.
    */
  var billing: js.UndefOr[
    stripeLib.stripeLibStrings.charge_automatically | stripeLib.stripeLibStrings.send_invoice
  ] = js.undefined
  /**
    * A list of up to 4 custom fields to be displayed on the invoice.
    */
  var custom_fields: js.UndefOr[js.Array[stripeLib.Anon_Name]] = js.undefined
  var customer: java.lang.String
  /**
    * The number of days from when the invoice is created until it is due. Valid only for
    * invoices where `billing=send_invoice`.
    */
  var days_until_due: js.UndefOr[scala.Double] = js.undefined
  /**
    * ID of the default payment source for the invoice. It must belong to the customer
    * associated with the invoice and be in a chargeable state. If not set, defaults to the
    * subscription’s default source, if any, or to the customer’s default source.
    */
  var default_source: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The date on which payment for this invoice is due. Valid only for invoices where
    * `billing=send_invoice`;
    */
  var due_date: js.UndefOr[stdLib.Date | scala.Double] = js.undefined
  /**
    * Footer to be displayed on the invoice. This can be unset by updating the value to
    * `null` and then saving.
    */
  var footer: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Extra information about a charge for the customer’s credit card statement.
    */
  var statement_descriptor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of the subscription to invoice, if any. If not set, the created invoice will
    * include all pending invoice items for the customer. If set, the created invoice will
    * exclude pending invoice items that pertain to other subscriptions. The subscription’s
    * billing cycle and regular subscription events won’t be affected.
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
    auto_advance: js.UndefOr[scala.Boolean] = js.undefined,
    billing: stripeLib.stripeLibStrings.charge_automatically | stripeLib.stripeLibStrings.send_invoice = null,
    custom_fields: js.Array[stripeLib.Anon_Name] = null,
    days_until_due: scala.Int | scala.Double = null,
    default_source: java.lang.String = null,
    description: java.lang.String = null,
    due_date: stdLib.Date | scala.Double = null,
    expand: js.Array[java.lang.String] = null,
    footer: java.lang.String = null,
    include: js.Array[java.lang.String] = null,
    metadata: stripeLib.stripeMod.IOptionsMetadata = null,
    statement_descriptor: java.lang.String = null,
    subscription: java.lang.String = null,
    tax_percent: scala.Int | scala.Double = null
  ): IInvoiceCreationOptions = {
    val __obj = js.Dynamic.literal(customer = customer)
    if (application_fee != null) __obj.updateDynamic("application_fee")(application_fee.asInstanceOf[js.Any])
    if (!js.isUndefined(auto_advance)) __obj.updateDynamic("auto_advance")(auto_advance)
    if (billing != null) __obj.updateDynamic("billing")(billing.asInstanceOf[js.Any])
    if (custom_fields != null) __obj.updateDynamic("custom_fields")(custom_fields)
    if (days_until_due != null) __obj.updateDynamic("days_until_due")(days_until_due.asInstanceOf[js.Any])
    if (default_source != null) __obj.updateDynamic("default_source")(default_source)
    if (description != null) __obj.updateDynamic("description")(description)
    if (due_date != null) __obj.updateDynamic("due_date")(due_date.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (include != null) __obj.updateDynamic("include")(include)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (statement_descriptor != null) __obj.updateDynamic("statement_descriptor")(statement_descriptor)
    if (subscription != null) __obj.updateDynamic("subscription")(subscription)
    if (tax_percent != null) __obj.updateDynamic("tax_percent")(tax_percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInvoiceCreationOptions]
  }
}

