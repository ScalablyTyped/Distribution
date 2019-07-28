package typings.winrt.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintItemListOptionDetails extends IPrintOptionDetails {
  var items: IVectorView[_]
}

object IPrintItemListOptionDetails {
  @scala.inline
  def apply(
    errorText: String,
    items: IVectorView[_],
    optionId: String,
    optionType: PrintOptionType,
    state: PrintOptionStates,
    trySetValue: js.Any => Boolean,
    value: js.Any
  ): IPrintItemListOptionDetails = {
    val __obj = js.Dynamic.literal(errorText = errorText, items = items, optionId = optionId, optionType = optionType, state = state, trySetValue = js.Any.fromFunction1(trySetValue), value = value)
  
    __obj.asInstanceOf[IPrintItemListOptionDetails]
  }
}

