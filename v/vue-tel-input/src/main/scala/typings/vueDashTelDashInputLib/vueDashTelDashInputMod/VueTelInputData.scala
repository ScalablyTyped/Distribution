package typings
package vueDashTelDashInputLib.vueDashTelDashInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueTelInputData extends js.Object {
  var activeCountry: VueTelInputCountryOption
  var open: scala.Boolean
  var phone: java.lang.String
  var selectedIndex: js.Any
  var typeToFindInput: java.lang.String
  var typeToFindTimer: js.Any
}

object VueTelInputData {
  @scala.inline
  def apply(
    activeCountry: VueTelInputCountryOption,
    open: scala.Boolean,
    phone: java.lang.String,
    selectedIndex: js.Any,
    typeToFindInput: java.lang.String,
    typeToFindTimer: js.Any
  ): VueTelInputData = {
    val __obj = js.Dynamic.literal(activeCountry = activeCountry, open = open, phone = phone, selectedIndex = selectedIndex, typeToFindInput = typeToFindInput, typeToFindTimer = typeToFindTimer)
  
    __obj.asInstanceOf[VueTelInputData]
  }
}

