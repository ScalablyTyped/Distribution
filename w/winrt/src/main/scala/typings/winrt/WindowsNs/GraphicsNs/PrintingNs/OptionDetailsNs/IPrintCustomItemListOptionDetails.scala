package typings.winrt.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.winrt.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.IPrintCustomOptionDetails because var conflicts: errorText, optionId, optionType, state, value. Inlined displayName */ trait IPrintCustomItemListOptionDetails extends IPrintItemListOptionDetails {
  var displayName: String
  def addItem(itemId: String, displayName: String): Unit
}

object IPrintCustomItemListOptionDetails {
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
  ): IPrintCustomItemListOptionDetails = {
    val __obj = js.Dynamic.literal(addItem = js.Any.fromFunction2(addItem), displayName = displayName, errorText = errorText, items = items, optionId = optionId, optionType = optionType, state = state, trySetValue = js.Any.fromFunction1(trySetValue), value = value)
  
    __obj.asInstanceOf[IPrintCustomItemListOptionDetails]
  }
}

