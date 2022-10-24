package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisabledHovered extends StObject {
  
  var disabled: Boolean
  
  var hovered: Boolean
  
  var selected: Boolean
}
object DisabledHovered {
  
  inline def apply(disabled: Boolean, hovered: Boolean, selected: Boolean): DisabledHovered = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], hovered = hovered.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisabledHovered]
  }
  
  extension [Self <: DisabledHovered](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setHovered(value: Boolean): Self = StObject.set(x, "hovered", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
  }
}
