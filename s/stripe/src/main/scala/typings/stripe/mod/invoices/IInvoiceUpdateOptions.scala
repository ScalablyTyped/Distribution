package typings.stripe.mod.invoices

import typings.std.Date
import typings.stripe.anon.Name
import typings.stripe.mod.IDataOptionsWithMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInvoiceUpdateOptions
  extends StObject
     with IDataOptionsWithMetadata {
  
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
  var custom_fields: js.UndefOr[js.Array[Name]] = js.undefined
  
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
  def apply(): IInvoiceUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInvoiceUpdateOptions]
  }
  
  @scala.inline
  implicit class IInvoiceUpdateOptionsMutableBuilder[Self <: IInvoiceUpdateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication_fee(value: Double): Self = StObject.set(x, "application_fee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication_feeUndefined: Self = StObject.set(x, "application_fee", js.undefined)
    
    @scala.inline
    def setAuto_advance(value: Boolean): Self = StObject.set(x, "auto_advance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuto_advanceUndefined: Self = StObject.set(x, "auto_advance", js.undefined)
    
    @scala.inline
    def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
    
    @scala.inline
    def setCustom_fields(value: js.Array[Name]): Self = StObject.set(x, "custom_fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_fieldsUndefined: Self = StObject.set(x, "custom_fields", js.undefined)
    
    @scala.inline
    def setCustom_fieldsVarargs(value: Name*): Self = StObject.set(x, "custom_fields", js.Array(value :_*))
    
    @scala.inline
    def setDays_until_due(value: Double): Self = StObject.set(x, "days_until_due", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDays_until_dueUndefined: Self = StObject.set(x, "days_until_due", js.undefined)
    
    @scala.inline
    def setDefault_source(value: String): Self = StObject.set(x, "default_source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_sourceUndefined: Self = StObject.set(x, "default_source", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDue_date(value: Date | Double): Self = StObject.set(x, "due_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDue_dateUndefined: Self = StObject.set(x, "due_date", js.undefined)
    
    @scala.inline
    def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterNull: Self = StObject.set(x, "footer", null)
    
    @scala.inline
    def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    @scala.inline
    def setForgiven(value: Boolean): Self = StObject.set(x, "forgiven", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForgivenUndefined: Self = StObject.set(x, "forgiven", js.undefined)
    
    @scala.inline
    def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatement_descriptorUndefined: Self = StObject.set(x, "statement_descriptor", js.undefined)
    
    @scala.inline
    def setTax_percent(value: Double): Self = StObject.set(x, "tax_percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTax_percentUndefined: Self = StObject.set(x, "tax_percent", js.undefined)
  }
}
