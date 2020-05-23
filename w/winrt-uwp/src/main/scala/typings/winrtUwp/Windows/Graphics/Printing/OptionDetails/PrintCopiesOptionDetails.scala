package typings.winrtUwp.Windows.Graphics.Printing.OptionDetails

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the option for the number of printed copies. */
trait PrintCopiesOptionDetails extends js.Object {
  /** Gets or sets the string for an error condition. */
  var errorText: String
  /** Gets the value for the maximum number of printed copies allowed. */
  var maxValue: Double
  /** Gets the value for the minimum number of printed copies allowed. */
  var minValue: Double
  /** Gets the ID for the option for the number of printed copies. */
  var optionId: String
  /** Gets the option type for the option for the number of printed copies. */
  var optionType: PrintOptionType
  /** Gets or sets the state of the option for the number of printed copies. */
  var state: PrintOptionStates
  /** Gets or sets the number of copies for a print task. */
  var value: js.Any
  /**
    * Sets the value for the print copies option.
    * @param value Value for the print copies option.
    * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
    */
  def trySetValue(value: js.Any): Boolean
}

object PrintCopiesOptionDetails {
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
  ): PrintCopiesOptionDetails = {
    val __obj = js.Dynamic.literal(errorText = errorText.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], optionId = optionId.asInstanceOf[js.Any], optionType = optionType.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], trySetValue = js.Any.fromFunction1(trySetValue), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintCopiesOptionDetails]
  }
}

