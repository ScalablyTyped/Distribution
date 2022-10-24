package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selected extends StObject {
  
  var disabled: Any
  
  var hovered: Any
  
  var selected: Any
}
object Selected {
  
  inline def apply(disabled: Any, hovered: Any, selected: Any): Selected = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], hovered = hovered.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selected]
  }
  
  extension [Self <: Selected](x: Self) {
    
    inline def setDisabled(value: Any): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setHovered(value: Any): Self = StObject.set(x, "hovered", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: Any): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
  }
}
