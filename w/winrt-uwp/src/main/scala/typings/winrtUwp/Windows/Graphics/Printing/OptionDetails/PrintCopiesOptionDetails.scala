package typings.winrtUwp.Windows.Graphics.Printing.OptionDetails

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the option for the number of printed copies. */
@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintCopiesOptionDetails")
@js.native
abstract class PrintCopiesOptionDetails () extends js.Object {
  /** Gets or sets the string for an error condition. */
  var errorText: String = js.native
  /** Gets the value for the maximum number of printed copies allowed. */
  var maxValue: Double = js.native
  /** Gets the value for the minimum number of printed copies allowed. */
  var minValue: Double = js.native
  /** Gets the ID for the option for the number of printed copies. */
  var optionId: String = js.native
  /** Gets the option type for the option for the number of printed copies. */
  var optionType: PrintOptionType = js.native
  /** Gets or sets the state of the option for the number of printed copies. */
  var state: PrintOptionStates = js.native
  /** Gets or sets the number of copies for a print task. */
  var value: js.Any = js.native
  /**
    * Sets the value for the print copies option.
    * @param value Value for the print copies option.
    * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
    */
  def trySetValue(value: js.Any): Boolean = js.native
}

