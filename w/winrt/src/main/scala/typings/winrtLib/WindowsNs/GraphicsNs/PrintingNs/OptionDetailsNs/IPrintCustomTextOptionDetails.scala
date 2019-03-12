package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintCustomTextOptionDetails extends IPrintCustomOptionDetails {
  var maxCharacters: scala.Double
}

object IPrintCustomTextOptionDetails {
  @scala.inline
  def apply(
    displayName: java.lang.String,
    errorText: java.lang.String,
    maxCharacters: scala.Double,
    optionId: java.lang.String,
    optionType: PrintOptionType,
    state: PrintOptionStates,
    trySetValue: js.Any => scala.Boolean,
    value: js.Any
  ): IPrintCustomTextOptionDetails = {
    val __obj = js.Dynamic.literal(displayName = displayName, errorText = errorText, maxCharacters = maxCharacters, optionId = optionId, optionType = optionType, state = state, trySetValue = js.Any.fromFunction1(trySetValue), value = value)
  
    __obj.asInstanceOf[IPrintCustomTextOptionDetails]
  }
}

