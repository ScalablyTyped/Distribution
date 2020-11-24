package typings.vueTelInput.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VueTelInputData extends js.Object {
  
  var activeCountry: VueTelInputCountryOption = js.native
  
  var open: Boolean = js.native
  
  var phone: String = js.native
  
  var selectedIndex: js.Any = js.native
  
  var typeToFindInput: String = js.native
  
  var typeToFindTimer: js.Any = js.native
}
object VueTelInputData {
  
  @scala.inline
  def apply(
    activeCountry: VueTelInputCountryOption,
    open: Boolean,
    phone: String,
    selectedIndex: js.Any,
    typeToFindInput: String,
    typeToFindTimer: js.Any
  ): VueTelInputData = {
    val __obj = js.Dynamic.literal(activeCountry = activeCountry.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any], typeToFindInput = typeToFindInput.asInstanceOf[js.Any], typeToFindTimer = typeToFindTimer.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueTelInputData]
  }
  
  @scala.inline
  implicit class VueTelInputDataOps[Self <: VueTelInputData] (val x: Self) extends AnyVal {
    
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
    def setActiveCountry(value: VueTelInputCountryOption): Self = this.set("activeCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedIndex(value: js.Any): Self = this.set("selectedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeToFindInput(value: String): Self = this.set("typeToFindInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeToFindTimer(value: js.Any): Self = this.set("typeToFindTimer", value.asInstanceOf[js.Any])
  }
}
