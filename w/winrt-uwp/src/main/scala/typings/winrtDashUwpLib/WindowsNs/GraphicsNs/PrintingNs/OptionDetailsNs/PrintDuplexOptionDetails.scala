package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the list of print duplex options. */
@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintDuplexOptionDetails")
@js.native
abstract class PrintDuplexOptionDetails () extends js.Object {
  /** Gets or sets the string for an error condition. */
  var errorText: java.lang.String = js.native
  /** Gets the list of print duplex options. */
  var items: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_] = js.native
  /** Gets the ID of the print duplex option. */
  var optionId: java.lang.String = js.native
  /** Gets the option type of the print duplex option. */
  var optionType: PrintOptionType = js.native
  /** Gets or sets the state of the print duplex options. */
  var state: PrintOptionStates = js.native
  /** Gets or sets the enumerated vlaue of the print duplex option. */
  var value: js.Any = js.native
  /**
                       * Sets the value for the duplex option.
                       * @param value Value for the duplex option.
                       * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
                       */
  def trySetValue(value: js.Any): scala.Boolean = js.native
}

