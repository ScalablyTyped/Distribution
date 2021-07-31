package typings.wixStyleReact.anon

import typings.react.mod.ReactNode
import typings.wixStyleReact.commonMod.TooltipCommonProps
import typings.wixStyleReact.toggleButtonMod.ToggleButtonSkin
import typings.wixStyleReact.wixStyleReactStrings.bottom
import typings.wixStyleReact.wixStyleReactStrings.end
import typings.wixStyleReact.wixStyleReactStrings.large
import typings.wixStyleReact.wixStyleReactStrings.medium
import typings.wixStyleReact.wixStyleReactStrings.round
import typings.wixStyleReact.wixStyleReactStrings.small
import typings.wixStyleReact.wixStyleReactStrings.square
import typings.wixStyleReact.wixStyleReactStrings.tiny
import typings.wixStyleReact.wixStyleReactStrings.tooltip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Border extends StObject {
  
  var border: js.UndefOr[Boolean] = js.undefined
  
  var dataHook: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var labelEllipsis: js.UndefOr[Boolean] = js.undefined
  
  var labelPlacement: js.UndefOr[tooltip | bottom | end] = js.undefined
  
  var labelValue: js.UndefOr[ReactNode] = js.undefined
  
  var selected: js.UndefOr[Boolean] = js.undefined
  
  var shape: js.UndefOr[square | round] = js.undefined
  
  var size: js.UndefOr[tiny | small | medium | large] = js.undefined
  
  var skin: js.UndefOr[ToggleButtonSkin] = js.undefined
  
  var tooltipProps: js.UndefOr[TooltipCommonProps] = js.undefined
}
object Border {
  
  @scala.inline
  def apply(): Border = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Border]
  }
  
  @scala.inline
  implicit class BorderMutableBuilder[Self <: Border] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: Boolean): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setLabelEllipsis(value: Boolean): Self = StObject.set(x, "labelEllipsis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelEllipsisUndefined: Self = StObject.set(x, "labelEllipsis", js.undefined)
    
    @scala.inline
    def setLabelPlacement(value: tooltip | bottom | end): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
    
    @scala.inline
    def setLabelValue(value: ReactNode): Self = StObject.set(x, "labelValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelValueUndefined: Self = StObject.set(x, "labelValue", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setShape(value: square | round): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    @scala.inline
    def setSize(value: tiny | small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSkin(value: ToggleButtonSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    
    @scala.inline
    def setTooltipProps(value: TooltipCommonProps): Self = StObject.set(x, "tooltipProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipPropsUndefined: Self = StObject.set(x, "tooltipProps", js.undefined)
  }
}
