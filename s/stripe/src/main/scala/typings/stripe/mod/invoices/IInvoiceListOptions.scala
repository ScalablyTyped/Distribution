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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInvoiceListOptions extends IListOptions {
  
  /**
    * The billing mode of the invoice to retrieve. Either `charge_automatically` or `send_invoice`
    * This field has been renamed to collection_method and will be removed in a future API version.
    */
  var billing: js.UndefOr[charge_automatically | send_invoice] = js.native
  
  /**
    * Either charge_automatically, or send_invoice. When charging automatically, Stripe will attempt to pay
    * this invoice using the default source attached to the customer. When sending an invoice, Stripe will
    * email this invoice to the customer with payment instructions.
    */
  var collection_method: js.UndefOr[charge_automatically | send_invoice] = js.native
  
  /**
    * A filter on the list based on the object created field. The value can be a string with an integer Unix timestamp,
    * or it can be a dictionary with the following options:
    */
  var created: js.UndefOr[IDateFilter] = js.native
  
  /**
    * The identifier of the customer whose invoices to return. If none is provided, all invoices will be returned.
    */
  var customer: js.UndefOr[String] = js.native
  
  /**
    * @deprecated Use created property instead as of api version 2019-03-14.
    */
  var date: js.UndefOr[IDateFilter] = js.native
  
  /**
    * A filter on the list based on the object due_date field. The value can be a string with an integer Unix timestamp,
    * or it can be a dictionary with the following options:
    */
  var due_date: js.UndefOr[IDateFilter] = js.native
  
  /**
    * The status of the invoice, one of draft, open, paid, uncollectible, or void.
    */
  var status: js.UndefOr[draft | open | paid | uncollectible | void] = js.native
  
  /**
    * Only return invoices for the subscription specified by this subscription ID
    */
  var subscription: js.UndefOr[String] = js.native
}
object IInvoiceListOptions {
  
  @scala.inline
  def apply(): IInvoiceListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInvoiceListOptions]
  }
  
  @scala.inline
  implicit class IInvoiceListOptionsOps[Self <: IInvoiceListOptions] (val x: Self) extends AnyVal {
    
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
    def setBilling(value: charge_automatically | send_invoice): Self = this.set("billing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBilling: Self = this.set("billing", js.undefined)
    
    @scala.inline
    def setCollection_method(value: charge_automatically | send_invoice): Self = this.set("collection_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollection_method: Self = this.set("collection_method", js.undefined)
    
    @scala.inline
    def setCreated(value: IDateFilter): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setCustomer(value: String): Self = this.set("customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomer: Self = this.set("customer", js.undefined)
    
    @scala.inline
    def setDate(value: IDateFilter): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setDue_date(value: IDateFilter): Self = this.set("due_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDue_date: Self = this.set("due_date", js.undefined)
    
    @scala.inline
    def setStatus(value: draft | open | paid | uncollectible | void): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSubscription(value: String): Self = this.set("subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscription: Self = this.set("subscription", js.undefined)
  }
}
