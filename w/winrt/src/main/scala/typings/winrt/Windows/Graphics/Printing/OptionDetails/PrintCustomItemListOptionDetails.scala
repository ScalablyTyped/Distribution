package typings.winrt.Windows.Graphics.Printing.OptionDetails

import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintCustomItemListOptionDetails extends IPrintCustomItemListOptionDetails

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

