package typings.stripe.mod.accounts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICompanyCreateUpdateOptions
  extends StObject
     with ICompanyShared {
  
  /**
    * The business ID number of the company, as appropriate for the company’s country.
    * (Examples are an Employer ID Number in the U.S., a Business Number in Canada, or a
    * Company Number in the UK.) This can be unset by updating the value to null and then saving.
    */
  var tax_id: js.UndefOr[String] = js.undefined
  
  /**
    * The VAT number of the company.
    * This can be unset by updating the value to null and then saving.
    */
  var vat_id: js.UndefOr[String] = js.undefined
}
object ICompanyCreateUpdateOptions {
  
  inline def apply(): ICompanyCreateUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICompanyCreateUpdateOptions]
  }
  
  extension [Self <: ICompanyCreateUpdateOptions](x: Self) {
    
    inline def setTax_id(value: String): Self = StObject.set(x, "tax_id", value.asInstanceOf[js.Any])
    
    inline def setTax_idUndefined: Self = StObject.set(x, "tax_id", js.undefined)
    
    inline def setVat_id(value: String): Self = StObject.set(x, "vat_id", value.asInstanceOf[js.Any])
    
    inline def setVat_idUndefined: Self = StObject.set(x, "vat_id", js.undefined)
  }
}
