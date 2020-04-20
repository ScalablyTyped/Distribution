package typings.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PricingMessagingResource extends js.Object {
  var countries: CountryResource
}

object PricingMessagingResource {
  @scala.inline
  def apply(countries: CountryResource): PricingMessagingResource = {
    val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any])
    __obj.asInstanceOf[PricingMessagingResource]
  }
}

