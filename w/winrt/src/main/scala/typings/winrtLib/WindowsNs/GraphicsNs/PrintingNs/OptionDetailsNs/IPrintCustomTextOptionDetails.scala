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
    trySetValue: js.Function1[js.Any, scala.Boolean],
    value: js.Any
  ): IPrintCustomTextOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("errorText")(errorText)
    __obj.updateDynamic("maxCharacters")(maxCharacters)
    __obj.updateDynamic("optionId")(optionId)
    __obj.updateDynamic("optionType")(optionType)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("trySetValue")(trySetValue)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IPrintCustomTextOptionDetails]
  }
}

