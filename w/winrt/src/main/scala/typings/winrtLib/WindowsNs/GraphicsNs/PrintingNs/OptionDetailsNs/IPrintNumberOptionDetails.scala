package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintNumberOptionDetails extends IPrintOptionDetails {
  var maxValue: scala.Double
  var minValue: scala.Double
}

object IPrintNumberOptionDetails {
  @scala.inline
  def apply(
    errorText: java.lang.String,
    maxValue: scala.Double,
    minValue: scala.Double,
    optionId: java.lang.String,
    optionType: PrintOptionType,
    state: PrintOptionStates,
    trySetValue: js.Any => scala.Boolean,
    value: js.Any
  ): IPrintNumberOptionDetails = {
    val __obj = js.Dynamic.literal(errorText = errorText, maxValue = maxValue, minValue = minValue, optionId = optionId, optionType = optionType, state = state, trySetValue = js.Any.fromFunction1(trySetValue), value = value)
  
    __obj.asInstanceOf[IPrintNumberOptionDetails]
  }
}

