package typings.stripe.mod.creditNotes

import typings.stripe.mod.IListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICreditNoteListOptions extends IListOptions {
  
  /**
    * ID of the invoice.
    */
  var invoice: js.UndefOr[String] = js.native
}
object ICreditNoteListOptions {
  
  @scala.inline
  def apply(): ICreditNoteListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICreditNoteListOptions]
  }
  
  @scala.inline
  implicit class ICreditNoteListOptionsOps[Self <: ICreditNoteListOptions] (val x: Self) extends AnyVal {
    
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
    def setInvoice(value: String): Self = this.set("invoice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvoice: Self = this.set("invoice", js.undefined)
  }
}
