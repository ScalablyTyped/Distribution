package typings.winrtUwp.Windows.Graphics.Printing.OptionDetails

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a custom print task option. */
trait PrintCustomTextOptionDetails extends js.Object {
  /** Gets or sets the display name of the custom print task option. */
  var displayName: String
  /** Gets or sets the string for an error condition. */
  var errorText: String
  /** Gets or sets the maximum number of characters for the display name of the custom print task option. */
  var maxCharacters: Double
  /** Gets the ID of the custom print task option. */
  var optionId: String
  /** Gets the option type for the custom print task option. */
  var optionType: PrintOptionType
  /** Gets or sets the state of a custom print task option. */
  var state: PrintOptionStates
  /** Gets or sets the value of a custom print task option. */
  var value: js.Any
  /**
    * Sets the value for the custom print task.
    * @param value Value for the custom print task.
    * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
    */
  def trySetValue(value: js.Any): Boolean
}

object PrintCustomTextOptionDetails {
  @scala.inline
  def apply(
    displayName: String,
    errorText: String,
    maxCharacters: Double,
    optionId: String,
    optionType: PrintOptionType,
    state: PrintOptionStates,
    trySetValue: js.Any => Boolean,
    value: js.Any
  ): PrintCustomTextOptionDetails = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], maxCharacters = maxCharacters.asInstanceOf[js.Any], optionId = optionId.asInstanceOf[js.Any], optionType = optionType.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], trySetValue = js.Any.fromFunction1(trySetValue), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintCustomTextOptionDetails]
  }
}

