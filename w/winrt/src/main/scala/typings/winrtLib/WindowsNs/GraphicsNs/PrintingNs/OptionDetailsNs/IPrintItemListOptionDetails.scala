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
    trySetValue: js.Any => scala.Boolean,
    value: js.Any
  ): IPrintItemListOptionDetails = {
    val __obj = js.Dynamic.literal(errorText = errorText, items = items, optionId = optionId, optionType = optionType, state = state, trySetValue = js.Any.fromFunction1(trySetValue), value = value)
  
    __obj.asInstanceOf[IPrintItemListOptionDetails]
  }
}

