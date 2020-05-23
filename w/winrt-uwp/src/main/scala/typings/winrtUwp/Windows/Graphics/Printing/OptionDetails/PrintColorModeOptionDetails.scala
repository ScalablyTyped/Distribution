package typings.winrtUwp.Windows.Graphics.Printing.OptionDetails

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the list of print color mode options. */
trait PrintColorModeOptionDetails extends js.Object {
  /** Gets or sets the string for an error condition. */
  var errorText: String
  /** Gets the list of items for the print color mode option. */
  var items: IVectorView[_]
  /** Gets the ID for the print color mode option. */
  var optionId: String
  /** Gets the option type for the print color mode option. */
  var optionType: PrintOptionType
  /** Gets or sets the state of the print color mode option. */
  var state: PrintOptionStates
  /** Gets or sets the enumerated value of the print color mode option. */
  var value: js.Any
  /**
    * Sets the value for the print color mode option.
    * @param value Value for the print color mode option.
    * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
    */
  def trySetValue(value: js.Any): Boolean
}

object PrintColorModeOptionDetails {
  @scala.inline
  def apply(
    errorText: String,
    items: IVectorView[_],
    optionId: String,
    optionType: PrintOptionType,
    state: PrintOptionStates,
    trySetValue: js.Any => Boolean,
    value: js.Any
  ): PrintColorModeOptionDetails = {
    val __obj = js.Dynamic.literal(errorText = errorText.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], optionId = optionId.asInstanceOf[js.Any], optionType = optionType.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], trySetValue = js.Any.fromFunction1(trySetValue), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintColorModeOptionDetails]
  }
}

