package typings.winrtDashUwp.Windows.Graphics.Printing.OptionDetails

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the base class for the PrintTaskOptionXxx objects. */
trait IPrintOptionDetails extends js.Object {
  /** Gets or sets the string for an error condition. */
  var errorText: String
  /** Gets the ID for a print task option. */
  var optionId: String
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
  def trySetValue(value: js.Any): Boolean
}

object IPrintOptionDetails {
  @scala.inline
  def apply(
    errorText: String,
    optionId: String,
    optionType: PrintOptionType,
    state: PrintOptionStates,
    trySetValue: js.Any => Boolean,
    value: js.Any
  ): IPrintOptionDetails = {
    val __obj = js.Dynamic.literal(errorText = errorText, optionId = optionId, optionType = optionType, state = state, trySetValue = js.Any.fromFunction1(trySetValue), value = value)
  
    __obj.asInstanceOf[IPrintOptionDetails]
  }
}

