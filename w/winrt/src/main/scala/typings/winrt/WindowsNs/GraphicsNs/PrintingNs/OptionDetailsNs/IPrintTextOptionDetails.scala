package typings.winrt.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTextOptionDetails extends IPrintOptionDetails {
  var maxCharacters: Double
}

object IPrintTextOptionDetails {
  @scala.inline
  def apply(
    errorText: String,
    maxCharacters: Double,
    optionId: String,
    optionType: PrintOptionType,
    state: PrintOptionStates,
    trySetValue: js.Any => Boolean,
    value: js.Any
  ): IPrintTextOptionDetails = {
    val __obj = js.Dynamic.literal(errorText = errorText, maxCharacters = maxCharacters, optionId = optionId, optionType = optionType, state = state, trySetValue = js.Any.fromFunction1(trySetValue), value = value)
  
    __obj.asInstanceOf[IPrintTextOptionDetails]
  }
}

