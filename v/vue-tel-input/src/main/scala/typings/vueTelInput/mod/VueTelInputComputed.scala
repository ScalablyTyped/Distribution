package typings.vueTelInput.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VueTelInputComputed extends js.Object {
  
  def filteredCountries(): js.Array[String] = js.native
  
  def formattedResult(): String = js.native
  
  def mode(): String = js.native
  
  def response(): VueTelInputResponse = js.native
  
  def sortedCountries(): js.Array[String] = js.native
  
  def state(): Boolean = js.native
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
  
  @scala.inline
  implicit class VueTelInputComputedOps[Self <: VueTelInputComputed] (val x: Self) extends AnyVal {
    
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
    def setFilteredCountries(value: () => js.Array[String]): Self = this.set("filteredCountries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFormattedResult(value: () => String): Self = this.set("formattedResult", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMode(value: () => String): Self = this.set("mode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResponse(value: () => VueTelInputResponse): Self = this.set("response", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSortedCountries(value: () => js.Array[String]): Self = this.set("sortedCountries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setState(value: () => Boolean): Self = this.set("state", js.Any.fromFunction0(value))
  }
}
