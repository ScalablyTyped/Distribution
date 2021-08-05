package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PricingPhoneNumberResource extends StObject {
  
  var countries: CountryResource
}
object PricingPhoneNumberResource {
  
  inline def apply(countries: CountryResource): PricingPhoneNumberResource = {
    val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any])
    __obj.asInstanceOf[PricingPhoneNumberResource]
  }
  
  extension [Self <: PricingPhoneNumberResource](x: Self) {
    
    inline def setCountries(value: CountryResource): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
  }
}
