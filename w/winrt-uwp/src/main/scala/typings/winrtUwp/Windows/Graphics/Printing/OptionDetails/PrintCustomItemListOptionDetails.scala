package typings.winrtUwp.Windows.Graphics.Printing.OptionDetails

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a list of the custom print task option items. */
trait PrintCustomItemListOptionDetails extends js.Object {
  /** Gets or sets the display name of an item in the list of custom print task options. */
  var displayName: String
  /** Gets or sets the string for an error condition. */
  var errorText: String
  /** Gets an item from the list of custom print tasks. */
  var items: IVectorView[_]
  /** Gets the ID of a custom print task option. */
  var optionId: String
  /** Gets the option type for a custom print task option. */
  var optionType: PrintOptionType
  /** Gets or sets the state of the list of custom print task option items. */
  var state: PrintOptionStates
  /** Gets or sets the value of the list of custom print tasks. */
  var value: js.Any
  /**
    * Sets the ID or display name of an item in the list of custom print task options.
    * @param itemId The ID of the option item.
    * @param displayName The display name of the option item.
    */
  def addItem(itemId: String, displayName: String): Unit
  /**
    * Sets the value for the item ID or the display name of the custom item.
    * @param value Value for the item ID or the display name of the custom item.
    * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
    */
  def trySetValue(value: js.Any): Boolean
}

object PrintCustomItemListOptionDetails {
  @scala.inline
  def apply(
    addItem: (String, String) => Unit,
    displayName: String,
    errorText: String,
    items: IVectorView[_],
    optionId: String,
    optionType: PrintOptionType,
    state: PrintOptionStates,
    trySetValue: js.Any => Boolean,
    value: js.Any
  ): PrintCustomItemListOptionDetails = {
    val __obj = js.Dynamic.literal(addItem = js.Any.fromFunction2(addItem), displayName = displayName.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], optionId = optionId.asInstanceOf[js.Any], optionType = optionType.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], trySetValue = js.Any.fromFunction1(trySetValue), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintCustomItemListOptionDetails]
  }
}

