package typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the list of print binding options. */
@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintBindingOptionDetails")
@js.native
abstract class PrintBindingOptionDetails () extends js.Object {
  /** Gets or sets the string for an error condition. */
  var errorText: String = js.native
  /** Gets the list of items for the print binding options. */
  var items: IVectorView[_] = js.native
  /** Gets the ID of the print binding option. */
  var optionId: String = js.native
  /** Gets the option type of the print binding option. */
  var optionType: PrintOptionType = js.native
  /** Gets or sets the state of the print binding option. */
  var state: PrintOptionStates = js.native
  /** Gets or sets the enumerated value of the print binding option. */
  var value: js.Any = js.native
  /**
    * Sets the value for the print binding option.
    * @param value Value for the print binding option.
    * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
    */
  def trySetValue(value: js.Any): Boolean = js.native
}

