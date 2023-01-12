package typings.winrt.Windows.Graphics.Printing.OptionDetails

import typings.winrt.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPrintItemListOptionDetails
  extends StObject
     with IPrintOptionDetails {
  
  var items: IVectorView[Any]
}
object IPrintItemListOptionDetails {
  
  inline def apply(
    errorText: String,
    items: IVectorView[Any],
    optionId: String,
    optionType: PrintOptionType,
    state: PrintOptionStates,
    trySetValue: Any => Boolean,
    value: Any
  ): IPrintItemListOptionDetails = {
    val __obj = js.Dynamic.literal(errorText = errorText.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], optionId = optionId.asInstanceOf[js.Any], optionType = optionType.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], trySetValue = js.Any.fromFunction1(trySetValue), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintItemListOptionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPrintItemListOptionDetails] (val x: Self) extends AnyVal {
    
    inline def setItems(value: IVectorView[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
  }
}
