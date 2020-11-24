package typings.stripe.mod.invoiceItems

import typings.stripe.mod.IListOptionsCreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvoiceItemListOptions extends IListOptionsCreated {
  
  /**
    * The identifier of the customer whose invoice items to return. If none is provided, all invoice items will be returned.
    */
  var customer: js.UndefOr[String] = js.native
  
  /**
    * Only return invoice items belonging to this invoice. If none is provided, all invoice items will be returned. If specifying an invoice, no customer identifier is needed.
    */
  var invoice: js.UndefOr[String] = js.native
  
  /**
    * Set to true to only show pending invoice items, which are not yet attached to any invoices. Set to false to only show
    * invoice items already attached to invoices. If unspecified, no filter is applied.
    */
  var pending: js.UndefOr[Boolean] = js.native
}
object InvoiceItemListOptions {
  
  @scala.inline
  def apply(): InvoiceItemListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvoiceItemListOptions]
  }
  
  @scala.inline
  implicit class InvoiceItemListOptionsOps[Self <: InvoiceItemListOptions] (val x: Self) extends AnyVal {
    
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
    def setCustomer(value: String): Self = this.set("customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomer: Self = this.set("customer", js.undefined)
    
    @scala.inline
    def setInvoice(value: String): Self = this.set("invoice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvoice: Self = this.set("invoice", js.undefined)
    
    @scala.inline
    def setPending(value: Boolean): Self = this.set("pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePending: Self = this.set("pending", js.undefined)
  }
}
