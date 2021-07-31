package typings.stripe.mod.invoices

import typings.stripe.mod.IDataOptionsWithMetadata
import typings.stripe.mod.cards.ICardSourceCreationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInvoicePayOptions
  extends StObject
     with IDataOptionsWithMetadata {
  
  /**
    * In cases where the source used to pay the invoice has insufficient
    * funds, passing forgive=true controls whether a charge should be
    * attempted for the full amount available on the source, up to the
    * amount to fully pay the invoice. This effectively forgives the
    * difference between the amount available on the source and the amount due.
    * Passing forgive=false will fail the charge if the source hasn’t
    * been pre-funded with the right amount. An example for this case is
    * with ACH Credit Transfers and wires: if the amount wired is less
    * than the amount due by a small amount, you might want to forgive
    * the difference.
    */
  var forgive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Boolean representing whether an invoice is paid outside of Stripe.
    * This will result in no charge being made.
    */
  var paid_out_of_band: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A payment source to be charged. The source must be the ID of a source
    * belonging to the customer associated with the invoice being paid.
    */
  var source: js.UndefOr[String | ICardSourceCreationOptions] = js.undefined
}
object IInvoicePayOptions {
  
  @scala.inline
  def apply(): IInvoicePayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInvoicePayOptions]
  }
  
  @scala.inline
  implicit class IInvoicePayOptionsMutableBuilder[Self <: IInvoicePayOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForgive(value: Boolean): Self = StObject.set(x, "forgive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForgiveUndefined: Self = StObject.set(x, "forgive", js.undefined)
    
    @scala.inline
    def setPaid_out_of_band(value: Boolean): Self = StObject.set(x, "paid_out_of_band", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaid_out_of_bandUndefined: Self = StObject.set(x, "paid_out_of_band", js.undefined)
    
    @scala.inline
    def setSource(value: String | ICardSourceCreationOptions): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
