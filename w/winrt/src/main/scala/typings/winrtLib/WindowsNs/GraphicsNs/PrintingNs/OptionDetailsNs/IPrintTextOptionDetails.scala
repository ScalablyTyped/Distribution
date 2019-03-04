package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTextOptionDetails extends IPrintOptionDetails {
  var maxCharacters: scala.Double
}

object IPrintTextOptionDetails {
  @scala.inline
  def apply(
    errorText: java.lang.String,
    maxCharacters: scala.Double,
    optionId: java.lang.String,
    optionType: PrintOptionType,
    state: PrintOptionStates,
    trySetValue: js.Function1[js.Any, scala.Boolean],
    value: js.Any
  ): IPrintTextOptionDetails = {
    val __obj = js.Dynamic.literal(errorText = errorText, maxCharacters = maxCharacters, optionId = optionId, optionType = optionType, state = state, trySetValue = trySetValue, value = value)
  
    __obj.asInstanceOf[IPrintTextOptionDetails]
  }
}

