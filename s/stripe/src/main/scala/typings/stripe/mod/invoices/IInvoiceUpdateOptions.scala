package typings.stripe.mod.invoices

import typings.std.Date
import typings.stripe.anon.Name
import typings.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInvoiceUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * A fee in pence that will be applied to the invoice and transferred to the application owner’s Stripe account.
    * The request must be made with an OAuth key or the Stripe-Account header in order to take an application fee.
    * For more information, see the application fees documentation.
    */
  var application_fee: js.UndefOr[Double] = js.native
  /**
    * Controls whether Stripe will perform
    * [automatic collection](https://stripe.com/docs/billing/invoices/workflow/#auto_advance)
    * of the invoice.
    */
  var auto_advance: js.UndefOr[Boolean] = js.native
  /**
    * Boolean representing whether an invoice is closed or not. To close an invoice, pass true.
    */
  var closed: js.UndefOr[Boolean] = js.native
  /**
    * A list of up to 4 custom fields to be displayed on the invoice.
    */
  var custom_fields: js.UndefOr[js.Array[Name]] = js.native
  /**
    * The number of days from which the invoice is created until it is due. Only valid for
    * invoices where billing=send_invoice. This field can only be updated on draft
    * invoices.
    */
  var days_until_due: js.UndefOr[Double] = js.native
  /**
    * ID of the default payment source for the invoice. It must belong to the customer
    * associated with the invoice and be in a chargeable state. If not set, defaults to the
    * subscription’s default source, if any, or to the customer’s default source.
    */
  var default_source: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  /**
    * The date on which payment for this invoice is due. Only valid for invoices where
    * `billing=send_invoice`. This field can only be updated on draft invoices.
    */
  var due_date: js.UndefOr[Date | Double] = js.native
  /**
    * Footer to be displayed on the invoice. This can be unset by updating the value to
    * `null` and then saving.
    */
  var footer: js.UndefOr[String | Null] = js.native
  /**
    * Boolean representing whether an invoice is forgiven or not. To forgive an invoice, pass true. Forgiving an invoice
    * instructs us to update the subscription status as if the invoice were successfully paid. Once an invoice has been
    * forgiven, it cannot be unforgiven or reopened.
    */
  var forgiven: js.UndefOr[Boolean] = js.native
  /**
    * Extra information about a charge for the customer’s credit card statement.
    */
  var statement_descriptor: js.UndefOr[String] = js.native
  /**
    * The percent tax rate applied to the invoice, represented as a non-negative decimal
    * number (with at most four decimal places) between 0 and 100. To unset a
    * previously-set value, pass an empty string. This field can be updated only on draft
    * invoices.
    */
  var tax_percent: js.UndefOr[Double] = js.native
}

object IInvoiceUpdateOptions {
  @scala.inline
  def apply(): IInvoiceUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInvoiceUpdateOptions]
  }
  @scala.inline
  implicit class IInvoiceUpdateOptionsOps[Self <: IInvoiceUpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication_fee(value: Double): Self = this.set("application_fee", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplication_fee: Self = this.set("application_fee", js.undefined)
    @scala.inline
    def setAuto_advance(value: Boolean): Self = this.set("auto_advance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuto_advance: Self = this.set("auto_advance", js.undefined)
    @scala.inline
    def setClosed(value: Boolean): Self = this.set("closed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClosed: Self = this.set("closed", js.undefined)
    @scala.inline
    def setCustom_fieldsVarargs(value: Name*): Self = this.set("custom_fields", js.Array(value :_*))
    @scala.inline
    def setCustom_fields(value: js.Array[Name]): Self = this.set("custom_fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom_fields: Self = this.set("custom_fields", js.undefined)
    @scala.inline
    def setDays_until_due(value: Double): Self = this.set("days_until_due", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDays_until_due: Self = this.set("days_until_due", js.undefined)
    @scala.inline
    def setDefault_source(value: String): Self = this.set("default_source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault_source: Self = this.set("default_source", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDue_date(value: Date | Double): Self = this.set("due_date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDue_date: Self = this.set("due_date", js.undefined)
    @scala.inline
    def setFooter(value: String): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    @scala.inline
    def setFooterNull: Self = this.set("footer", null)
    @scala.inline
    def setForgiven(value: Boolean): Self = this.set("forgiven", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForgiven: Self = this.set("forgiven", js.undefined)
    @scala.inline
    def setStatement_descriptor(value: String): Self = this.set("statement_descriptor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatement_descriptor: Self = this.set("statement_descriptor", js.undefined)
    @scala.inline
    def setTax_percent(value: Double): Self = this.set("tax_percent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTax_percent: Self = this.set("tax_percent", js.undefined)
  }
  
}

