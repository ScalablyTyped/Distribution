package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PricingVoiceResource extends StObject {
  
  var countries: CountryResource
  
  var numbers: NumberResource
}
object PricingVoiceResource {
  
  inline def apply(countries: CountryResource, numbers: NumberResource): PricingVoiceResource = {
    val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any], numbers = numbers.asInstanceOf[js.Any])
    __obj.asInstanceOf[PricingVoiceResource]
  }
  
  extension [Self <: PricingVoiceResource](x: Self) {
    
    inline def setCountries(value: CountryResource): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
    
    inline def setNumbers(value: NumberResource): Self = StObject.set(x, "numbers", value.asInstanceOf[js.Any])
  }
}
