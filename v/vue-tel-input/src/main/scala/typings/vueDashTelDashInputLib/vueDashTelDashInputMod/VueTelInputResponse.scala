package typings
package vueDashTelDashInputLib.vueDashTelDashInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueTelInputResponse extends js.Object {
  var country: VueTelInputCountryOption
  var isValid: scala.Boolean
  var number: java.lang.String
}

object VueTelInputResponse {
  @scala.inline
  def apply(country: VueTelInputCountryOption, isValid: scala.Boolean, number: java.lang.String): VueTelInputResponse = {
    val __obj = js.Dynamic.literal(country = country, isValid = isValid, number = number)
  
    __obj.asInstanceOf[VueTelInputResponse]
  }
}

