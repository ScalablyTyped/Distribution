package typings.vueTelInput.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VueTelInputCountryOption extends js.Object {
  
  var iso2: String = js.native
}
object VueTelInputCountryOption {
  
  @scala.inline
  def apply(iso2: String): VueTelInputCountryOption = {
    val __obj = js.Dynamic.literal(iso2 = iso2.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueTelInputCountryOption]
  }
  
  @scala.inline
  implicit class VueTelInputCountryOptionOps[Self <: VueTelInputCountryOption] (val x: Self) extends AnyVal {
    
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
    def setIso2(value: String): Self = this.set("iso2", value.asInstanceOf[js.Any])
  }
}
