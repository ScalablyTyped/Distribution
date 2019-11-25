package typings.stripe.stripeMod.invoices

import typings.std.Date
import typings.stripe.Anon_Name
import typings.stripe.stripeMod.IDataOptionsWithMetadata
import typings.stripe.stripeMod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInvoiceUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * A fee in pence that will be applied to the invoice and transferred to the application owner’s Stripe account.
    * The request must be made with an OAuth key or the Stripe-Account header in order to take an application fee.
    * For more information, see the application fees documentation.
    */
  var application_fee: js.UndefOr[Double] = js.undefined
  /**
    * Controls whether Stripe will perform
    * [automatic collection](https://stripe.com/docs/billing/invoices/workflow/#auto_advance)
    * of the invoice.
    */
  var auto_advance: js.UndefOr[Boolean] = js.undefined
  /**
    * Boolean representing whether an invoice is closed or not. To close an invoice, pass true.
    */
  var closed: js.UndefOr[Boolean] = js.undefined
  /**
    * A list of up to 4 custom fields to be displayed on the invoice.
    */
  var custom_fields: js.UndefOr[js.Array[Anon_Name]] = js.undefined
  /**
    * The number of days from which the invoice is created until it is due. Only valid for
    * invoices where billing=send_invoice. This field can only be updated on draft
    * invoices.
    */
  var days_until_due: js.UndefOr[Double] = js.undefined
  /**
    * ID of the default payment source for the invoice. It must belong to the customer
    * associated with the invoice and be in a chargeable state. If not set, defaults to the
    * subscription’s default source, if any, or to the customer’s default source.
    */
  var default_source: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  /**
    * The date on which payment for this invoice is due. Only valid for invoices where
    * `billing=send_invoice`. This field can only be updated on draft invoices.
    */
  var due_date: js.UndefOr[Date | Double] = js.undefined
  /**
    * Footer to be displayed on the invoice. This can be unset by updating the value to
    * `null` and then saving.
    */
  var footer: js.UndefOr[String | Null] = js.undefined
  /**
    * Boolean representing whether an invoice is forgiven or not. To forgive an invoice, pass true. Forgiving an invoice
    * instructs us to update the subscription status as if the invoice were successfully paid. Once an invoice has been
    * forgiven, it cannot be unforgiven or reopened.
    */
  var forgiven: js.UndefOr[Boolean] = js.undefined
  /**
    * Extra information about a charge for the customer’s credit card statement.
    */
  var statement_descriptor: js.UndefOr[String] = js.undefined
  /**
    * The percent tax rate applied to the invoice, represented as a non-negative decimal
    * number (with at most four decimal places) between 0 and 100. To unset a
    * previously-set value, pass an empty string. This field can be updated only on draft
    * invoices.
    */
  var tax_percent: js.UndefOr[Double] = js.undefined
}

object IInvoiceUpdateOptions {
  @scala.inline
  def apply(
    application_fee: Int | Double = null,
    auto_advance: js.UndefOr[Boolean] = js.undefined,
    closed: js.UndefOr[Boolean] = js.undefined,
    custom_fields: js.Array[Anon_Name] = null,
    days_until_due: Int | Double = null,
    default_source: String = null,
    description: String = null,
    due_date: Date | Double = null,
    expand: js.Array[String] = null,
    footer: String = null,
    forgiven: js.UndefOr[Boolean] = js.undefined,
    include: js.Array[String] = null,
    metadata: IOptionsMetadata = null,
    statement_descriptor: String = null,
    tax_percent: Int | Double = null
  ): IInvoiceUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (application_fee != null) __obj.updateDynamic("application_fee")(application_fee.asInstanceOf[js.Any])
    if (!js.isUndefined(auto_advance)) __obj.updateDynamic("auto_advance")(auto_advance.asInstanceOf[js.Any])
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed.asInstanceOf[js.Any])
    if (custom_fields != null) __obj.updateDynamic("custom_fields")(custom_fields.asInstanceOf[js.Any])
    if (days_until_due != null) __obj.updateDynamic("days_until_due")(days_until_due.asInstanceOf[js.Any])
    if (default_source != null) __obj.updateDynamic("default_source")(default_source.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (due_date != null) __obj.updateDynamic("due_date")(due_date.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (!js.isUndefined(forgiven)) __obj.updateDynamic("forgiven")(forgiven.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (statement_descriptor != null) __obj.updateDynamic("statement_descriptor")(statement_descriptor.asInstanceOf[js.Any])
    if (tax_percent != null) __obj.updateDynamic("tax_percent")(tax_percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInvoiceUpdateOptions]
  }
}

