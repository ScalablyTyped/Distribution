package typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a custom print task option. */
@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintCustomTextOptionDetails")
@js.native
abstract class PrintCustomTextOptionDetails () extends js.Object {
  /** Gets or sets the display name of the custom print task option. */
  var displayName: String = js.native
  /** Gets or sets the string for an error condition. */
  var errorText: String = js.native
  /** Gets or sets the maximum number of characters for the display name of the custom print task option. */
  var maxCharacters: Double = js.native
  /** Gets the ID of the custom print task option. */
  var optionId: String = js.native
  /** Gets the option type for the custom print task option. */
  var optionType: PrintOptionType = js.native
  /** Gets or sets the state of a custom print task option. */
  var state: PrintOptionStates = js.native
  /** Gets or sets the value of a custom print task option. */
  var value: js.Any = js.native
  /**
    * Sets the value for the custom print task.
    * @param value Value for the custom print task.
    * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
    */
  def trySetValue(value: js.Any): Boolean = js.native
}

