package typings.winrtUwp.Windows.Graphics.Printing.OptionDetails

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a list of the custom print task option items. */
trait PrintCustomItemListOptionDetails extends StObject {
  
  /**
    * Sets the ID or display name of an item in the list of custom print task options.
    * @param itemId The ID of the option item.
    * @param displayName The display name of the option item.
    */
  def addItem(itemId: String, displayName: String): Unit
  
  /** Gets or sets the display name of an item in the list of custom print task options. */
  var displayName: String
  
  /** Gets or sets the string for an error condition. */
  var errorText: String
  
  /** Gets an item from the list of custom print tasks. */
  var items: IVectorView[Any]
  
  /** Gets the ID of a custom print task option. */
  var optionId: String
  
  /** Gets the option type for a custom print task option. */
  var optionType: PrintOptionType
  
  /** Gets or sets the state of the list of custom print task option items. */
  var state: PrintOptionStates
  
  /**
    * Sets the value for the item ID or the display name of the custom item.
    * @param value Value for the item ID or the display name of the custom item.
    * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
    */
  def trySetValue(value: Any): Boolean
  
  /** Gets or sets the value of the list of custom print tasks. */
  var value: Any
}
object PrintCustomItemListOptionDetails {
  
  inline def apply(
    addItem: (String, String) => Unit,
    displayName: String,
    errorText: String,
    items: IVectorView[Any],
    optionId: String,
    optionType: PrintOptionType,
    state: PrintOptionStates,
    trySetValue: Any => Boolean,
    value: Any
  ): PrintCustomItemListOptionDetails = {
    val __obj = js.Dynamic.literal(addItem = js.Any.fromFunction2(addItem), displayName = displayName.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], optionId = optionId.asInstanceOf[js.Any], optionType = optionType.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], trySetValue = js.Any.fromFunction1(trySetValue), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintCustomItemListOptionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrintCustomItemListOptionDetails] (val x: Self) extends AnyVal {
    
    inline def setAddItem(value: (String, String) => Unit): Self = StObject.set(x, "addItem", js.Any.fromFunction2(value))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    
    inline def setItems(value: IVectorView[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setOptionId(value: String): Self = StObject.set(x, "optionId", value.asInstanceOf[js.Any])
    
    inline def setOptionType(value: PrintOptionType): Self = StObject.set(x, "optionType", value.asInstanceOf[js.Any])
    
    inline def setState(value: PrintOptionStates): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTrySetValue(value: Any => Boolean): Self = StObject.set(x, "trySetValue", js.Any.fromFunction1(value))
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
