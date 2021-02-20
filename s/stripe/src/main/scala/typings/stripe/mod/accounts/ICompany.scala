package typings.stripe.mod.accounts

import org.scalablytyped.runtime.StObject
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
  implicit class ICompanyMutableBuilder[Self <: ICompany] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTax_id_provided(value: Boolean): Self = StObject.set(x, "tax_id_provided", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTax_id_providedUndefined: Self = StObject.set(x, "tax_id_provided", js.undefined)
    
    @scala.inline
    def setVat_id_provided(value: Boolean): Self = StObject.set(x, "vat_id_provided", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVat_id_providedUndefined: Self = StObject.set(x, "vat_id_provided", js.undefined)
  }
}
