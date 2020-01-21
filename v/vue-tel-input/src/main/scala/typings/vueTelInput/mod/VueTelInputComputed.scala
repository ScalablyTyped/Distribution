package typings.vueTelInput.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueTelInputComputed extends js.Object {
  def filteredCountries(): js.Array[String]
  def formattedResult(): String
  def mode(): String
  def response(): VueTelInputResponse
  def sortedCountries(): js.Array[String]
  def state(): Boolean
}

object VueTelInputComputed {
  @scala.inline
  def apply(
    filteredCountries: () => js.Array[String],
    formattedResult: () => String,
    mode: () => String,
    response: () => VueTelInputResponse,
    sortedCountries: () => js.Array[String],
    state: () => Boolean
  ): VueTelInputComputed = {
    val __obj = js.Dynamic.literal(filteredCountries = js.Any.fromFunction0(filteredCountries), formattedResult = js.Any.fromFunction0(formattedResult), mode = js.Any.fromFunction0(mode), response = js.Any.fromFunction0(response), sortedCountries = js.Any.fromFunction0(sortedCountries), state = js.Any.fromFunction0(state))
  
    __obj.asInstanceOf[VueTelInputComputed]
  }
}

