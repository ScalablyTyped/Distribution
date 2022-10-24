package typings.wixStyleReact.anon

import typings.wixStyleReact.distTypesDropdownLayoutMod.DropdownLayoutOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseOnSelect extends StObject {
  
  var closeOnSelect: Boolean
  
  var options: js.Array[DropdownLayoutOption]
  
  var selectedHighlight: Boolean
  
  var selectedId: Double
}
object CloseOnSelect {
  
  inline def apply(
    closeOnSelect: Boolean,
    options: js.Array[DropdownLayoutOption],
    selectedHighlight: Boolean,
    selectedId: Double
  ): CloseOnSelect = {
    val __obj = js.Dynamic.literal(closeOnSelect = closeOnSelect.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], selectedHighlight = selectedHighlight.asInstanceOf[js.Any], selectedId = selectedId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseOnSelect]
  }
  
  extension [Self <: CloseOnSelect](x: Self) {
    
    inline def setCloseOnSelect(value: Boolean): Self = StObject.set(x, "closeOnSelect", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: js.Array[DropdownLayoutOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: DropdownLayoutOption*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setSelectedHighlight(value: Boolean): Self = StObject.set(x, "selectedHighlight", value.asInstanceOf[js.Any])
    
    inline def setSelectedId(value: Double): Self = StObject.set(x, "selectedId", value.asInstanceOf[js.Any])
  }
}
