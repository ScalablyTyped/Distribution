package typings.vueDashTelDashInput.vueDashTelDashInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueTelInputResponse extends js.Object {
  var country: VueTelInputCountryOption
  var isValid: Boolean
  var number: String
}

object VueTelInputResponse {
  @scala.inline
  def apply(country: VueTelInputCountryOption, isValid: Boolean, number: String): VueTelInputResponse = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VueTelInputResponse]
  }
}

