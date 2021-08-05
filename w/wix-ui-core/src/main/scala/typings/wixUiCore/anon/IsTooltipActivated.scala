package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsTooltipActivated extends StObject {
  
  var Tooltip: js.Any
  
  var isTooltipActivated: Boolean
  
  var tooltipStyles: js.Any
}
object IsTooltipActivated {
  
  inline def apply(Tooltip: js.Any, isTooltipActivated: Boolean, tooltipStyles: js.Any): IsTooltipActivated = {
    val __obj = js.Dynamic.literal(Tooltip = Tooltip.asInstanceOf[js.Any], isTooltipActivated = isTooltipActivated.asInstanceOf[js.Any], tooltipStyles = tooltipStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsTooltipActivated]
  }
  
  extension [Self <: IsTooltipActivated](x: Self) {
    
    inline def setIsTooltipActivated(value: Boolean): Self = StObject.set(x, "isTooltipActivated", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: js.Any): Self = StObject.set(x, "Tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipStyles(value: js.Any): Self = StObject.set(x, "tooltipStyles", value.asInstanceOf[js.Any])
  }
}
