package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAutoFocus extends StObject {
  
  var listAutoFocus: Boolean
  
  var open: Any
  
  var selectedId: Any
}
object ListAutoFocus {
  
  inline def apply(listAutoFocus: Boolean, open: Any, selectedId: Any): ListAutoFocus = {
    val __obj = js.Dynamic.literal(listAutoFocus = listAutoFocus.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], selectedId = selectedId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAutoFocus]
  }
  
  extension [Self <: ListAutoFocus](x: Self) {
    
    inline def setListAutoFocus(value: Boolean): Self = StObject.set(x, "listAutoFocus", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Any): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setSelectedId(value: Any): Self = StObject.set(x, "selectedId", value.asInstanceOf[js.Any])
  }
}
