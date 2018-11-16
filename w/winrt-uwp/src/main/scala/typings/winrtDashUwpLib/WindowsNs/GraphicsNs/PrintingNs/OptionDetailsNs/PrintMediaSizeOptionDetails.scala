package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the list of media size options. */
@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintMediaSizeOptionDetails")
@js.native
abstract class PrintMediaSizeOptionDetails () extends js.Object {
  /** Gets or sets the string for an error condition. */
  var errorText: java.lang.String = js.native
  /** Gets the list of print media size option items. */
  var items: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_] = js.native
  /** Gets the ID for the print media size option. */
  var optionId: java.lang.String = js.native
  /** Gets the option type for the option for the number of printed copies. */
  var optionType: PrintOptionType = js.native
  /** Gets or sets the state of the option for the number of printed copies. */
  var state: PrintOptionStates = js.native
  /** Gets or sets the number of copies for a print task. */
  var value: js.Any = js.native
  /**
                       * Sets the value for the media size option.
                       * @param value Value for the media size option.
                       * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
                       */
  def trySetValue(value: js.Any): scala.Boolean = js.native
}

