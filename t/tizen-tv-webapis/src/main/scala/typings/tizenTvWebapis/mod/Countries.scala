package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Countries extends StObject {
  
  var CountryCode: String
  
  var IsBillingSupported: Boolean
}
object Countries {
  
  inline def apply(CountryCode: String, IsBillingSupported: Boolean): Countries = {
    val __obj = js.Dynamic.literal(CountryCode = CountryCode.asInstanceOf[js.Any], IsBillingSupported = IsBillingSupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[Countries]
  }
  
  extension [Self <: Countries](x: Self) {
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "CountryCode", value.asInstanceOf[js.Any])
    
    inline def setIsBillingSupported(value: Boolean): Self = StObject.set(x, "IsBillingSupported", value.asInstanceOf[js.Any])
  }
}
