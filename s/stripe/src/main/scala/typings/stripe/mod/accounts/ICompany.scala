package typings.stripe.mod.accounts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICompany
  extends StObject
     with ICompanyShared {
  
  /**
    * Whether the company’s business ID number was provided.
    */
  var tax_id_provided: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the company’s business VAT number was provided.
    */
  var vat_id_provided: js.UndefOr[Boolean] = js.undefined
}
object ICompany {
  
  inline def apply(): ICompany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICompany]
  }
  
  extension [Self <: ICompany](x: Self) {
    
    inline def setTax_id_provided(value: Boolean): Self = StObject.set(x, "tax_id_provided", value.asInstanceOf[js.Any])
    
    inline def setTax_id_providedUndefined: Self = StObject.set(x, "tax_id_provided", js.undefined)
    
    inline def setVat_id_provided(value: Boolean): Self = StObject.set(x, "vat_id_provided", value.asInstanceOf[js.Any])
    
    inline def setVat_id_providedUndefined: Self = StObject.set(x, "vat_id_provided", js.undefined)
  }
}
