package typings.winrtUwp.Windows.Graphics.Printing.OptionDetails

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a list of the stapling options. */
@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintStapleOptionDetails")
@js.native
abstract class PrintStapleOptionDetails () extends js.Object {
  /** Gets or sets the string for an error condition. */
  var errorText: String = js.native
  /** Gets the list of items for the stapling options. */
  var items: IVectorView[_] = js.native
  /** Gets the ID for the stapling option. */
  var optionId: String = js.native
  /** Gets the option type for the stapling option. */
  var optionType: PrintOptionType = js.native
  /** Gets or sets the state of the stapling option. */
  var state: PrintOptionStates = js.native
  /** Gets or sets the enumerated value of the stapling option. */
  var value: js.Any = js.native
  /**
    * Sets the value for the staple opiton.
    * @param value Value for the staple opiton.
    * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
    */
  def trySetValue(value: js.Any): Boolean = js.native
}

