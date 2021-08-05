package typings.winrt.Windows.Graphics.Printing.OptionDetails

import typings.winrt.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.winrt.Windows.Graphics.Printing.OptionDetails.IPrintOptionDetails because Already inherited
- typings.winrt.Windows.Graphics.Printing.OptionDetails.IPrintCustomOptionDetails because var conflicts: errorText, optionId, optionType, state, value. Inlined displayName */ trait IPrintCustomItemListOptionDetails
  extends StObject
     with IPrintItemListOptionDetails {
  
  def addItem(itemId: String, displayName: String): Unit
  
  var displayName: String
}
object IPrintCustomItemListOptionDetails {
  
  inline def apply(
    addItem: (String, String) => Unit,
    displayName: String,
    errorText: String,
    items: IVectorView[js.Any],
    optionId: String,
    optionType: PrintOptionType,
    state: PrintOptionStates,
    trySetValue: js.Any => Boolean,
    value: js.Any
  ): IPrintCustomItemListOptionDetails = {
    val __obj = js.Dynamic.literal(addItem = js.Any.fromFunction2(addItem), displayName = displayName.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], optionId = optionId.asInstanceOf[js.Any], optionType = optionType.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], trySetValue = js.Any.fromFunction1(trySetValue), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintCustomItemListOptionDetails]
  }
  
  extension [Self <: IPrintCustomItemListOptionDetails](x: Self) {
    
    inline def setAddItem(value: (String, String) => Unit): Self = StObject.set(x, "addItem", js.Any.fromFunction2(value))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
  }
}
