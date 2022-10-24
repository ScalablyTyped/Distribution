package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusedItemId extends StObject {
  
  var focusedItemId: Null
  
  var hovered: Double
  
  var selectedId: Any
}
object FocusedItemId {
  
  inline def apply(focusedItemId: Null, hovered: Double, selectedId: Any): FocusedItemId = {
    val __obj = js.Dynamic.literal(focusedItemId = focusedItemId.asInstanceOf[js.Any], hovered = hovered.asInstanceOf[js.Any], selectedId = selectedId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusedItemId]
  }
  
  extension [Self <: FocusedItemId](x: Self) {
    
    inline def setFocusedItemId(value: Null): Self = StObject.set(x, "focusedItemId", value.asInstanceOf[js.Any])
    
    inline def setHovered(value: Double): Self = StObject.set(x, "hovered", value.asInstanceOf[js.Any])
    
    inline def setSelectedId(value: Any): Self = StObject.set(x, "selectedId", value.asInstanceOf[js.Any])
  }
}
