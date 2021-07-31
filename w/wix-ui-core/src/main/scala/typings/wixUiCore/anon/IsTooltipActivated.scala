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
  
  @scala.inline
  def apply(Tooltip: js.Any, isTooltipActivated: Boolean, tooltipStyles: js.Any): IsTooltipActivated = {
    val __obj = js.Dynamic.literal(Tooltip = Tooltip.asInstanceOf[js.Any], isTooltipActivated = isTooltipActivated.asInstanceOf[js.Any], tooltipStyles = tooltipStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsTooltipActivated]
  }
  
  @scala.inline
  implicit class IsTooltipActivatedMutableBuilder[Self <: IsTooltipActivated] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsTooltipActivated(value: Boolean): Self = StObject.set(x, "isTooltipActivated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip(value: js.Any): Self = StObject.set(x, "Tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipStyles(value: js.Any): Self = StObject.set(x, "tooltipStyles", value.asInstanceOf[js.Any])
  }
}
