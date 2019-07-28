package typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the list of print media type options. */
@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintMediaTypeOptionDetails")
@js.native
abstract class PrintMediaTypeOptionDetails () extends js.Object {
  /** Gets or sets the string for an error condition. */
  var errorText: String = js.native
  /** Gets the list of items for the print media type options. */
  var items: IVectorView[_] = js.native
  /** Gets the ID for the print media type option. */
  var optionId: String = js.native
  /** Gets the option type for the print media type option. */
  var optionType: PrintOptionType = js.native
  /** Gets or sets the state for the print media type option. */
  var state: PrintOptionStates = js.native
  /** Gets or sets the enumerated value of the print media type option. */
  var value: js.Any = js.native
  /**
    * Sets the value for the media type option.
    * @param value Value for the media type option.
    * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
    */
  def trySetValue(value: js.Any): Boolean = js.native
}

