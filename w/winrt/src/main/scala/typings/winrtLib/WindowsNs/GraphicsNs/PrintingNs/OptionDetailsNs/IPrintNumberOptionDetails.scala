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
    trySetValue: js.Function1[js.Any, scala.Boolean],
    value: js.Any
  ): IPrintNumberOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errorText")(errorText)
    __obj.updateDynamic("maxValue")(maxValue)
    __obj.updateDynamic("minValue")(minValue)
    __obj.updateDynamic("optionId")(optionId)
    __obj.updateDynamic("optionType")(optionType)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("trySetValue")(trySetValue)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IPrintNumberOptionDetails]
  }
}

