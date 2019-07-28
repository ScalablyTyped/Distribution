package typings.winrt.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintNumberOptionDetails extends IPrintOptionDetails {
  var maxValue: Double
  var minValue: Double
}

object IPrintNumberOptionDetails {
  @scala.inline
  def apply(
    errorText: String,
    maxValue: Double,
    minValue: Double,
    optionId: String,
    optionType: PrintOptionType,
    state: PrintOptionStates,
    trySetValue: js.Any => Boolean,
    value: js.Any
  ): IPrintNumberOptionDetails = {
    val __obj = js.Dynamic.literal(errorText = errorText, maxValue = maxValue, minValue = minValue, optionId = optionId, optionType = optionType, state = state, trySetValue = js.Any.fromFunction1(trySetValue), value = value)
  
    __obj.asInstanceOf[IPrintNumberOptionDetails]
  }
}

