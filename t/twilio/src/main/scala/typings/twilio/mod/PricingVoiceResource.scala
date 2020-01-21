package typings.twilio.mod

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
    val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any], numbers = numbers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PricingVoiceResource]
  }
}

