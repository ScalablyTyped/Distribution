package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterStringInput extends StObject {
  
  var filterStringInput: String
  
  var item: String
  
  var itemDisabled: String
  
  var itemText: String
  
  var maxText: String
  
  var minText: String
  
  var root: String
  
  var selected: String
}
object FilterStringInput {
  
  inline def apply(
    filterStringInput: String,
    item: String,
    itemDisabled: String,
    itemText: String,
    maxText: String,
    minText: String,
    root: String,
    selected: String
  ): FilterStringInput = {
    val __obj = js.Dynamic.literal(filterStringInput = filterStringInput.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemDisabled = itemDisabled.asInstanceOf[js.Any], itemText = itemText.asInstanceOf[js.Any], maxText = maxText.asInstanceOf[js.Any], minText = minText.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterStringInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterStringInput] (val x: Self) extends AnyVal {
    
    inline def setFilterStringInput(value: String): Self = StObject.set(x, "filterStringInput", value.asInstanceOf[js.Any])
    
    inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemDisabled(value: String): Self = StObject.set(x, "itemDisabled", value.asInstanceOf[js.Any])
    
    inline def setItemText(value: String): Self = StObject.set(x, "itemText", value.asInstanceOf[js.Any])
    
    inline def setMaxText(value: String): Self = StObject.set(x, "maxText", value.asInstanceOf[js.Any])
    
    inline def setMinText(value: String): Self = StObject.set(x, "minText", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
  }
}
