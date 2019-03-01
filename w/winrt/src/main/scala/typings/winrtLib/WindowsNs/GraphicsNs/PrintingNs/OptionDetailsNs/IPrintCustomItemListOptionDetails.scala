package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- winrtLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.IPrintCustomOptionDetails because var conflicts: errorText, optionId, optionType, state, value. Inlined displayName */ trait IPrintCustomItemListOptionDetails extends IPrintItemListOptionDetails {
  var displayName: java.lang.String
  def addItem(itemId: java.lang.String, displayName: java.lang.String): scala.Unit
}

object IPrintCustomItemListOptionDetails {
  @scala.inline
  def apply(
    addItem: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    displayName: java.lang.String,
    errorText: java.lang.String,
    items: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_],
    optionId: java.lang.String,
    optionType: PrintOptionType,
    state: PrintOptionStates,
    trySetValue: js.Function1[js.Any, scala.Boolean],
    value: js.Any
  ): IPrintCustomItemListOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addItem")(addItem)
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("errorText")(errorText)
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("optionId")(optionId)
    __obj.updateDynamic("optionType")(optionType)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("trySetValue")(trySetValue)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IPrintCustomItemListOptionDetails]
  }
}

