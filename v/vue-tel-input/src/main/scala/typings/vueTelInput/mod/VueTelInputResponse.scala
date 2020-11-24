package typings.vueTelInput.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VueTelInputResponse extends js.Object {
  
  var country: VueTelInputCountryOption = js.native
  
  var isValid: Boolean = js.native
  
  var number: String = js.native
}
object VueTelInputResponse {
  
  @scala.inline
  def apply(country: VueTelInputCountryOption, isValid: Boolean, number: String): VueTelInputResponse = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueTelInputResponse]
  }
  
  @scala.inline
  implicit class VueTelInputResponseOps[Self <: VueTelInputResponse] (val x: Self) extends AnyVal {
    
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
    def setCountry(value: VueTelInputCountryOption): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValid(value: Boolean): Self = this.set("isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: String): Self = this.set("number", value.asInstanceOf[js.Any])
  }
}
