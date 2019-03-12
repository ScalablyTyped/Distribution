package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintCustomOptionDetails extends IPrintOptionDetails {
  var displayName: java.lang.String
}

object IPrintCustomOptionDetails {
  @scala.inline
  def apply(
    displayName: java.lang.String,
    errorText: java.lang.String,
    optionId: java.lang.String,
    optionType: PrintOptionType,
    state: PrintOptionStates,
    trySetValue: js.Any => scala.Boolean,
    value: js.Any
  ): IPrintCustomOptionDetails = {
    val __obj = js.Dynamic.literal(displayName = displayName, errorText = errorText, optionId = optionId, optionType = optionType, state = state, trySetValue = js.Any.fromFunction1(trySetValue), value = value)
  
    __obj.asInstanceOf[IPrintCustomOptionDetails]
  }
}

