package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PricingVoiceResource extends js.Object {
  var countries: CountryResource
  var numbers: NumberResource
}

object PricingVoiceResource {
  @scala.inline
  def apply(countries: CountryResource, numbers: NumberResource): PricingVoiceResource = {
    val __obj = js.Dynamic.literal(countries = countries, numbers = numbers)
  
    __obj.asInstanceOf[PricingVoiceResource]
  }
}

