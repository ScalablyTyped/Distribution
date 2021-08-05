package typings.stripe.mod.invoices

import typings.stripe.mod.IDateFilter
import typings.stripe.mod.IListOptions
import typings.stripe.stripeStrings.charge_automatically
import typings.stripe.stripeStrings.draft
import typings.stripe.stripeStrings.open
import typings.stripe.stripeStrings.paid
import typings.stripe.stripeStrings.send_invoice
import typings.stripe.stripeStrings.uncollectible
import typings.stripe.stripeStrings.void
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInvoiceListOptions
  extends StObject
     with IListOptions {
  
  /**
    * The billing mode of the invoice to retrieve. Either `charge_automatically` or `send_invoice`
    * This field has been renamed to collection_method and will be removed in a future API version.
    */
  var billing: js.UndefOr[charge_automatically | send_invoice] = js.undefined
  
  /**
    * Either charge_automatically, or send_invoice. When charging automatically, Stripe will attempt to pay
    * this invoice using the default source attached to the customer. When sending an invoice, Stripe will
    * email this invoice to the customer with payment instructions.
    */
  var collection_method: js.UndefOr[charge_automatically | send_invoice] = js.undefined
  
  /**
    * A filter on the list based on the object created field. The value can be a string with an integer Unix timestamp,
    * or it can be a dictionary with the following options:
    */
  var created: js.UndefOr[IDateFilter] = js.undefined
  
  /**
    * The identifier of the customer whose invoices to return. If none is provided, all invoices will be returned.
    */
  var customer: js.UndefOr[String] = js.undefined
  
  /**
    * @deprecated Use created property instead as of api version 2019-03-14.
    */
  var date: js.UndefOr[IDateFilter] = js.undefined
  
  /**
    * A filter on the list based on the object due_date field. The value can be a string with an integer Unix timestamp,
    * or it can be a dictionary with the following options:
    */
  var due_date: js.UndefOr[IDateFilter] = js.undefined
  
  /**
    * The status of the invoice, one of draft, open, paid, uncollectible, or void.
    */
  var status: js.UndefOr[draft | open | paid | uncollectible | void] = js.undefined
  
  /**
    * Only return invoices for the subscription specified by this subscription ID
    */
  var subscription: js.UndefOr[String] = js.undefined
}
object IInvoiceListOptions {
  
  inline def apply(): IInvoiceListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInvoiceListOptions]
  }
  
  extension [Self <: IInvoiceListOptions](x: Self) {
    
    inline def setBilling(value: charge_automatically | send_invoice): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
    
    inline def setBillingUndefined: Self = StObject.set(x, "billing", js.undefined)
    
    inline def setCollection_method(value: charge_automatically | send_invoice): Self = StObject.set(x, "collection_method", value.asInstanceOf[js.Any])
    
    inline def setCollection_methodUndefined: Self = StObject.set(x, "collection_method", js.undefined)
    
    inline def setCreated(value: IDateFilter): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setDate(value: IDateFilter): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDue_date(value: IDateFilter): Self = StObject.set(x, "due_date", value.asInstanceOf[js.Any])
    
    inline def setDue_dateUndefined: Self = StObject.set(x, "due_date", js.undefined)
    
    inline def setStatus(value: draft | open | paid | uncollectible | void): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
  }
}
