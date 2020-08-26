package typings.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PricingVoiceResource extends js.Object {
  var countries: CountryResource = js.native
  var numbers: NumberResource = js.native
}

object PricingVoiceResource {
  @scala.inline
  def apply(countries: CountryResource, numbers: NumberResource): PricingVoiceResource = {
    val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any], numbers = numbers.asInstanceOf[js.Any])
    __obj.asInstanceOf[PricingVoiceResource]
  }
  @scala.inline
  implicit class PricingVoiceResourceOps[Self <: PricingVoiceResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCountries(value: CountryResource): Self = this.set("countries", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumbers(value: NumberResource): Self = this.set("numbers", value.asInstanceOf[js.Any])
  }
  
}

