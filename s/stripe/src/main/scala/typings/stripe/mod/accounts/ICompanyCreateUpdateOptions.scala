package typings.stripe.mod.accounts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICompanyCreateUpdateOptions extends ICompanyShared {
  
  /**
    * The business ID number of the company, as appropriate for the company’s country.
    * (Examples are an Employer ID Number in the U.S., a Business Number in Canada, or a
    * Company Number in the UK.) This can be unset by updating the value to null and then saving.
    */
  var tax_id: js.UndefOr[String] = js.native
  
  /**
    * The VAT number of the company.
    * This can be unset by updating the value to null and then saving.
    */
  var vat_id: js.UndefOr[String] = js.native
}
object ICompanyCreateUpdateOptions {
  
  @scala.inline
  def apply(): ICompanyCreateUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICompanyCreateUpdateOptions]
  }
  
  @scala.inline
  implicit class ICompanyCreateUpdateOptionsMutableBuilder[Self <: ICompanyCreateUpdateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTax_id(value: String): Self = StObject.set(x, "tax_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTax_idUndefined: Self = StObject.set(x, "tax_id", js.undefined)
    
    @scala.inline
    def setVat_id(value: String): Self = StObject.set(x, "vat_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVat_idUndefined: Self = StObject.set(x, "vat_id", js.undefined)
  }
}
