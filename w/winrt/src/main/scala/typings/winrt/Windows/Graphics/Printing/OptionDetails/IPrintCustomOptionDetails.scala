package typings.winrt.Windows.Graphics.Printing.OptionDetails

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintCustomOptionDetails extends IPrintOptionDetails {
  var displayName: String
}

object IPrintCustomOptionDetails {
  @scala.inline
  def apply(
    displayName: String,
    errorText: String,
    optionId: String,
    optionType: PrintOptionType,
    state: PrintOptionStates,
    trySetValue: js.Any => Boolean,
    value: js.Any
  ): IPrintCustomOptionDetails = {
    val __obj = js.Dynamic.literal(displayName = displayName, errorText = errorText, optionId = optionId, optionType = optionType, state = state, trySetValue = js.Any.fromFunction1(trySetValue), value = value)
  
    __obj.asInstanceOf[IPrintCustomOptionDetails]
  }
}

