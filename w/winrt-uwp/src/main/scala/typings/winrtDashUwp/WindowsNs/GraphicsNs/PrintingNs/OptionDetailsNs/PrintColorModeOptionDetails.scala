package typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the list of print color mode options. */
@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintColorModeOptionDetails")
@js.native
abstract class PrintColorModeOptionDetails () extends js.Object {
  /** Gets or sets the string for an error condition. */
  var errorText: String = js.native
  /** Gets the list of items for the print color mode option. */
  var items: IVectorView[_] = js.native
  /** Gets the ID for the print color mode option. */
  var optionId: String = js.native
  /** Gets the option type for the print color mode option. */
  var optionType: PrintOptionType = js.native
  /** Gets or sets the state of the print color mode option. */
  var state: PrintOptionStates = js.native
  /** Gets or sets the enumerated value of the print color mode option. */
  var value: js.Any = js.native
  /**
    * Sets the value for the print color mode option.
    * @param value Value for the print color mode option.
    * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
    */
  def trySetValue(value: js.Any): Boolean = js.native
}

