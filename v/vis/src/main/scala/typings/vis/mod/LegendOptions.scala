package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendOptions extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var iconSize: js.UndefOr[Double] = js.undefined
  
  var iconSpacing: js.UndefOr[Double] = js.undefined
  
  var icons: js.UndefOr[Boolean] = js.undefined
  
  var left: js.UndefOr[LegendPositionOptions] = js.undefined
  
  var right: js.UndefOr[LegendPositionOptions] = js.undefined
}
object LegendOptions {
  
  @scala.inline
  def apply(): LegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendOptions]
  }
  
  @scala.inline
  implicit class LegendOptionsMutableBuilder[Self <: LegendOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setIconSize(value: Double): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
    
    @scala.inline
    def setIconSpacing(value: Double): Self = StObject.set(x, "iconSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconSpacingUndefined: Self = StObject.set(x, "iconSpacing", js.undefined)
    
    @scala.inline
    def setIcons(value: Boolean): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    @scala.inline
    def setLeft(value: LegendPositionOptions): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setRight(value: LegendPositionOptions): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
  }
}
