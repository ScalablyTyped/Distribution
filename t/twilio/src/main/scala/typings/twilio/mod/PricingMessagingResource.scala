package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PricingMessagingResource extends StObject {
  
  var countries: CountryResource = js.native
}
object PricingMessagingResource {
  
  @scala.inline
  def apply(countries: CountryResource): PricingMessagingResource = {
    val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any])
    __obj.asInstanceOf[PricingMessagingResource]
  }
  
  @scala.inline
  implicit class PricingMessagingResourceMutableBuilder[Self <: PricingMessagingResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountries(value: CountryResource): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
  }
}
