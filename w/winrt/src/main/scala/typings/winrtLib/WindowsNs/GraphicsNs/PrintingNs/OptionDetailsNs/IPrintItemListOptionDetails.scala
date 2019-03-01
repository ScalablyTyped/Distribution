package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintItemListOptionDetails extends IPrintOptionDetails {
  var items: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]
}

object IPrintItemListOptionDetails {
  @scala.inline
  def apply(
    errorText: java.lang.String,
    items: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_],
    optionId: java.lang.String,
    optionType: PrintOptionType,
    state: PrintOptionStates,
    trySetValue: js.Function1[js.Any, scala.Boolean],
    value: js.Any
  ): IPrintItemListOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errorText")(errorText)
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("optionId")(optionId)
    __obj.updateDynamic("optionType")(optionType)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("trySetValue")(trySetValue)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IPrintItemListOptionDetails]
  }
}

