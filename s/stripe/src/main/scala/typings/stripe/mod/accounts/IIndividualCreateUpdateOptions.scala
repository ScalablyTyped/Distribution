package typings.stripe.mod.accounts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IIndividualCreateUpdateOptions
  extends StObject
     with IIndividualShared {
  
  /**
    * The government-issued ID number of the individual, as appropriate for the representative’s country.
    * (Examples are a Social Security Number in the U.S., or a Social Insurance Number in Canada).
    * Instead of the number itself, you can also provide a PII token created with Stripe.js.
    * This can be unset by updating the value to null and then saving.
    */
  var id_number: js.UndefOr[String] = js.undefined
  
  /**
    * The last four digits of the individual’s Social Security Number (U.S. only).
    * This can be unset by updating the value to null and then saving.
    */
  var ssn_last_4: js.UndefOr[String] = js.undefined
}
object IIndividualCreateUpdateOptions {
  
  inline def apply(): IIndividualCreateUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIndividualCreateUpdateOptions]
  }
  
  extension [Self <: IIndividualCreateUpdateOptions](x: Self) {
    
    inline def setId_number(value: String): Self = StObject.set(x, "id_number", value.asInstanceOf[js.Any])
    
    inline def setId_numberUndefined: Self = StObject.set(x, "id_number", js.undefined)
    
    inline def setSsn_last_4(value: String): Self = StObject.set(x, "ssn_last_4", value.asInstanceOf[js.Any])
    
    inline def setSsn_last_4Undefined: Self = StObject.set(x, "ssn_last_4", js.undefined)
  }
}
