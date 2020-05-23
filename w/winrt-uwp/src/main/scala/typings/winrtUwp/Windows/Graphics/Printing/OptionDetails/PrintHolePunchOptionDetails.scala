package typings.winrtUwp.Windows.Graphics.Printing.OptionDetails

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the list of punch hole options. */
trait PrintHolePunchOptionDetails extends js.Object {
  /** Gets or sets the string for an error condition. */
  var errorText: String
  /** Gets the list of items for the hole punch option. */
  var items: IVectorView[_]
  /** Gets the ID for the hole punch option. */
  var optionId: String
  /** Gets the option type for the hole punch option. */
  var optionType: PrintOptionType
  /** Gets or sets the state of the hole punch option. */
  var state: PrintOptionStates
  /** Gets or sets the enumerated value of the hole punch option. */
  var value: js.Any
  /**
    * Sets the value for the hole punch option.
    * @param value Value for the hole punch option.
    * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
    */
  def trySetValue(value: js.Any): Boolean
}

object PrintHolePunchOptionDetails {
  @scala.inline
  def apply(
    errorText: String,
    items: IVectorView[_],
    optionId: String,
    optionType: PrintOptionType,
    state: PrintOptionStates,
    trySetValue: js.Any => Boolean,
    value: js.Any
  ): PrintHolePunchOptionDetails = {
    val __obj = js.Dynamic.literal(errorText = errorText.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], optionId = optionId.asInstanceOf[js.Any], optionType = optionType.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], trySetValue = js.Any.fromFunction1(trySetValue), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintHolePunchOptionDetails]
  }
}

