package typings
package twilioLib.twilioMod.twilioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PricingPhoneNumberResource extends js.Object {
  var countries: CountryResource
}

object PricingPhoneNumberResource {
  @scala.inline
  def apply(countries: CountryResource): PricingPhoneNumberResource = {
    val __obj = js.Dynamic.literal(countries = countries)
  
    __obj.asInstanceOf[PricingPhoneNumberResource]
  }
}

