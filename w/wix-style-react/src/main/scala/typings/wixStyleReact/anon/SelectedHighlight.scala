package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedHighlight extends StObject {
  
  var closeOnSelect: Boolean
  
  var options: Any
  
  var selectedHighlight: Boolean
}
object SelectedHighlight {
  
  inline def apply(closeOnSelect: Boolean, options: Any, selectedHighlight: Boolean): SelectedHighlight = {
    val __obj = js.Dynamic.literal(closeOnSelect = closeOnSelect.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], selectedHighlight = selectedHighlight.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedHighlight]
  }
  
  extension [Self <: SelectedHighlight](x: Self) {
    
    inline def setCloseOnSelect(value: Boolean): Self = StObject.set(x, "closeOnSelect", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSelectedHighlight(value: Boolean): Self = StObject.set(x, "selectedHighlight", value.asInstanceOf[js.Any])
  }
}
