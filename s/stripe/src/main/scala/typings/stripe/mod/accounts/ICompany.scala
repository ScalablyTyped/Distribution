package typings.stripe.mod.accounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICompany extends ICompanyShared {
  
  /**
    * Whether the company’s business ID number was provided.
    */
  var tax_id_provided: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the company’s business VAT number was provided.
    */
  var vat_id_provided: js.UndefOr[Boolean] = js.native
}
object ICompany {
  
  @scala.inline
  def apply(): ICompany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICompany]
  }
  
  @scala.inline
  implicit class ICompanyOps[Self <: ICompany] (val x: Self) extends AnyVal {
    
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
    def setTax_id_provided(value: Boolean): Self = this.set("tax_id_provided", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTax_id_provided: Self = this.set("tax_id_provided", js.undefined)
    
    @scala.inline
    def setVat_id_provided(value: Boolean): Self = this.set("vat_id_provided", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVat_id_provided: Self = this.set("vat_id_provided", js.undefined)
  }
}
