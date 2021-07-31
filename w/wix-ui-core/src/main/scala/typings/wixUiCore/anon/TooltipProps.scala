package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipProps extends StObject {
  
  var showTooltip: js.UndefOr[Boolean] = js.undefined
  
  var tooltipProps: js.UndefOr[js.Object] = js.undefined
}
object TooltipProps {
  
  @scala.inline
  def apply(): TooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipProps]
  }
  
  @scala.inline
  implicit class TooltipPropsMutableBuilder[Self <: TooltipProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
    
    @scala.inline
    def setTooltipProps(value: js.Object): Self = StObject.set(x, "tooltipProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipPropsUndefined: Self = StObject.set(x, "tooltipProps", js.undefined)
  }
}
