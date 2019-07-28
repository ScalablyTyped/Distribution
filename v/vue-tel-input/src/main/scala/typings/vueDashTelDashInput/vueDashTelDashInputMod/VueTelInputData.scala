package typings.vueDashTelDashInput.vueDashTelDashInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueTelInputData extends js.Object {
  var activeCountry: VueTelInputCountryOption
  var open: Boolean
  var phone: String
  var selectedIndex: js.Any
  var typeToFindInput: String
  var typeToFindTimer: js.Any
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
    val __obj = js.Dynamic.literal(activeCountry = activeCountry, open = open, phone = phone, selectedIndex = selectedIndex, typeToFindInput = typeToFindInput, typeToFindTimer = typeToFindTimer)
  
    __obj.asInstanceOf[VueTelInputData]
  }
}

