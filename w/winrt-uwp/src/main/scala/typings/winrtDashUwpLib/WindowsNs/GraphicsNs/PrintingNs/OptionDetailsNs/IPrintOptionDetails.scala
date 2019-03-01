package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the base class for the PrintTaskOptionXxx objects. */
trait IPrintOptionDetails extends js.Object {
  /** Gets or sets the string for an error condition. */
  var errorText: java.lang.String
  /** Gets the ID for a print task option. */
  var optionId: java.lang.String
  /** Gets the option type for a print task option. */
  var optionType: PrintOptionType
  /** Gets or sets the state of a print task option. */
  var state: PrintOptionStates
  /** Gets the enumerated value of a print task option. */
  var value: js.Any
  /**
    * Sets the value for the print task option.
    * @param value Value for the print task option.
    * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
    */
  def trySetValue(value: js.Any): scala.Boolean
}

object IPrintOptionDetails {
  @scala.inline
  def apply(
    errorText: java.lang.String,
    optionId: java.lang.String,
    optionType: PrintOptionType,
    state: PrintOptionStates,
    trySetValue: js.Function1[js.Any, scala.Boolean],
    value: js.Any
  ): IPrintOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errorText")(errorText)
    __obj.updateDynamic("optionId")(optionId)
    __obj.updateDynamic("optionType")(optionType)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("trySetValue")(trySetValue)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IPrintOptionDetails]
  }
}

