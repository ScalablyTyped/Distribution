package typings.winrtUwp.Windows.Graphics.Printing.OptionDetails

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a custom print task option. */
@js.native
trait PrintCustomTextOptionDetails extends js.Object {
  /** Gets or sets the display name of the custom print task option. */
  var displayName: String = js.native
  /** Gets or sets the string for an error condition. */
  var errorText: String = js.native
  /** Gets or sets the maximum number of characters for the display name of the custom print task option. */
  var maxCharacters: Double = js.native
  /** Gets the ID of the custom print task option. */
  var optionId: String = js.native
  /** Gets the option type for the custom print task option. */
  var optionType: PrintOptionType = js.native
  /** Gets or sets the state of a custom print task option. */
  var state: PrintOptionStates = js.native
  /** Gets or sets the value of a custom print task option. */
  var value: js.Any = js.native
  /**
    * Sets the value for the custom print task.
    * @param value Value for the custom print task.
    * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
    */
  def trySetValue(value: js.Any): Boolean = js.native
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
  @scala.inline
  implicit class PrintCustomTextOptionDetailsOps[Self <: PrintCustomTextOptionDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorText(value: String): Self = this.set("errorText", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxCharacters(value: Double): Self = this.set("maxCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionId(value: String): Self = this.set("optionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionType(value: PrintOptionType): Self = this.set("optionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: PrintOptionStates): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrySetValue(value: js.Any => Boolean): Self = this.set("trySetValue", js.Any.fromFunction1(value))
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

