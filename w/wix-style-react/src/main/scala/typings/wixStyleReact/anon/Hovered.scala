package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hovered extends StObject {
  
  var disabled: Any
  
  var hovered: Any
  
  var selected: Any
}
object Hovered {
  
  inline def apply(disabled: Any, hovered: Any, selected: Any): Hovered = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], hovered = hovered.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hovered]
  }
  
  extension [Self <: Hovered](x: Self) {
    
    inline def setDisabled(value: Any): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setHovered(value: Any): Self = StObject.set(x, "hovered", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: Any): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
  }
}
