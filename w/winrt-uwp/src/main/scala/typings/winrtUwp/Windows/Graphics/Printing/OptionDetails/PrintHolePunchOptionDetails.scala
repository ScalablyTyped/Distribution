package typings.winrtUwp.Windows.Graphics.Printing.OptionDetails

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the list of punch hole options. */
@js.native
trait PrintHolePunchOptionDetails extends js.Object {
  /** Gets or sets the string for an error condition. */
  var errorText: String = js.native
  /** Gets the list of items for the hole punch option. */
  var items: IVectorView[_] = js.native
  /** Gets the ID for the hole punch option. */
  var optionId: String = js.native
  /** Gets the option type for the hole punch option. */
  var optionType: PrintOptionType = js.native
  /** Gets or sets the state of the hole punch option. */
  var state: PrintOptionStates = js.native
  /** Gets or sets the enumerated value of the hole punch option. */
  var value: js.Any = js.native
  /**
    * Sets the value for the hole punch option.
    * @param value Value for the hole punch option.
    * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
    */
  def trySetValue(value: js.Any): Boolean = js.native
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
  @scala.inline
  implicit class PrintHolePunchOptionDetailsOps[Self <: PrintHolePunchOptionDetails] (val x: Self) extends AnyVal {
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
    def setErrorText(value: String): Self = this.set("errorText", value.asInstanceOf[js.Any])
    @scala.inline
    def setItems(value: IVectorView[_]): Self = this.set("items", value.asInstanceOf[js.Any])
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

