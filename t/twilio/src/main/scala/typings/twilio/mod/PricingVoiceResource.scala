package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PricingVoiceResource extends StObject {
  
  var countries: CountryResource
  
  var numbers: NumberResource
}
object PricingVoiceResource {
  
  @scala.inline
  def apply(countries: CountryResource, numbers: NumberResource): PricingVoiceResource = {
    val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any], numbers = numbers.asInstanceOf[js.Any])
    __obj.asInstanceOf[PricingVoiceResource]
  }
  
  @scala.inline
  implicit class PricingVoiceResourceMutableBuilder[Self <: PricingVoiceResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountries(value: CountryResource): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumbers(value: NumberResource): Self = StObject.set(x, "numbers", value.asInstanceOf[js.Any])
  }
}
