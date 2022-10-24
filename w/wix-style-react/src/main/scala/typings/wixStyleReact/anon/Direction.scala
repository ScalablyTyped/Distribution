package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Direction extends StObject {
  
  var direction: Any
  
  var onClick: Any
  
  var tooltipText: Any
}
object Direction {
  
  inline def apply(direction: Any, onClick: Any, tooltipText: Any): Direction = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], tooltipText = tooltipText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
  
  extension [Self <: Direction](x: Self) {
    
    inline def setDirection(value: Any): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: Any): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setTooltipText(value: Any): Self = StObject.set(x, "tooltipText", value.asInstanceOf[js.Any])
  }
}
