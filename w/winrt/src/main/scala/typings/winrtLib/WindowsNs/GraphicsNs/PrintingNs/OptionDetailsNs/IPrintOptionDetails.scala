package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintOptionDetails extends js.Object {
  var errorText: java.lang.String
  var optionId: java.lang.String
  var optionType: PrintOptionType
  var state: PrintOptionStates
  var value: js.Any
  def trySetValue(value: js.Any): scala.Boolean
}

object IPrintOptionDetails {
  @scala.inline
  def apply(
    errorText: java.lang.String,
    optionId: java.lang.String,
    optionType: PrintOptionType,
    state: PrintOptionStates,
    trySetValue: js.Any => scala.Boolean,
    value: js.Any
  ): IPrintOptionDetails = {
    val __obj = js.Dynamic.literal(errorText = errorText, optionId = optionId, optionType = optionType, state = state, trySetValue = js.Any.fromFunction1(trySetValue), value = value)
  
    __obj.asInstanceOf[IPrintOptionDetails]
  }
}

