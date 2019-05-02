package typings
package vueDashTelDashInputLib.vueDashTelDashInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueTelInputComputed extends js.Object {
  def filteredCountries(): js.Array[java.lang.String]
  def formattedResult(): java.lang.String
  def mode(): java.lang.String
  def response(): VueTelInputResponse
  def sortedCountries(): js.Array[java.lang.String]
  def state(): scala.Boolean
}

object VueTelInputComputed {
  @scala.inline
  def apply(
    filteredCountries: () => js.Array[java.lang.String],
    formattedResult: () => java.lang.String,
    mode: () => java.lang.String,
    response: () => VueTelInputResponse,
    sortedCountries: () => js.Array[java.lang.String],
    state: () => scala.Boolean
  ): VueTelInputComputed = {
    val __obj = js.Dynamic.literal(filteredCountries = js.Any.fromFunction0(filteredCountries), formattedResult = js.Any.fromFunction0(formattedResult), mode = js.Any.fromFunction0(mode), response = js.Any.fromFunction0(response), sortedCountries = js.Any.fromFunction0(sortedCountries), state = js.Any.fromFunction0(state))
  
    __obj.asInstanceOf[VueTelInputComputed]
  }
}

