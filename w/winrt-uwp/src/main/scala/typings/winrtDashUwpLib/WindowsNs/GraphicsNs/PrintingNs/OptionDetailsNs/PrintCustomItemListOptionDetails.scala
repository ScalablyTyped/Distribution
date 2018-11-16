package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a list of the custom print task option items. */
@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintCustomItemListOptionDetails")
@js.native
abstract class PrintCustomItemListOptionDetails () extends js.Object {
  /** Gets or sets the display name of an item in the list of custom print task options. */
  var displayName: java.lang.String = js.native
  /** Gets or sets the string for an error condition. */
  var errorText: java.lang.String = js.native
  /** Gets an item from the list of custom print tasks. */
  var items: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_] = js.native
  /** Gets the ID of a custom print task option. */
  var optionId: java.lang.String = js.native
  /** Gets the option type for a custom print task option. */
  var optionType: PrintOptionType = js.native
  /** Gets or sets the state of the list of custom print task option items. */
  var state: PrintOptionStates = js.native
  /** Gets or sets the value of the list of custom print tasks. */
  var value: js.Any = js.native
  /**
                       * Sets the ID or display name of an item in the list of custom print task options.
                       * @param itemId The ID of the option item.
                       * @param displayName The display name of the option item.
                       */
  def addItem(itemId: java.lang.String, displayName: java.lang.String): scala.Unit = js.native
  /**
                       * Sets the value for the item ID or the display name of the custom item.
                       * @param value Value for the item ID or the display name of the custom item.
                       * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
                       */
  def trySetValue(value: js.Any): scala.Boolean = js.native
}

