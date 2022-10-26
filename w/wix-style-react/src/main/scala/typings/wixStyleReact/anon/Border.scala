package typings.wixStyleReact.anon

import typings.react.mod.ReactNode
import typings.wixStyleReact.distTypesCommonMod.TooltipCommonProps
import typings.wixStyleReact.distTypesToggleButtonMod.ToggleButtonSkin
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
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
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
  
  inline def apply(): Border = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Border]
  }
  
  extension [Self <: Border](x: Self) {
    
    inline def setBorder(value: Boolean): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setLabelEllipsis(value: Boolean): Self = StObject.set(x, "labelEllipsis", value.asInstanceOf[js.Any])
    
    inline def setLabelEllipsisUndefined: Self = StObject.set(x, "labelEllipsis", js.undefined)
    
    inline def setLabelPlacement(value: tooltip | bottom | end): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
    
    inline def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
    
    inline def setLabelValue(value: ReactNode): Self = StObject.set(x, "labelValue", value.asInstanceOf[js.Any])
    
    inline def setLabelValueUndefined: Self = StObject.set(x, "labelValue", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setShape(value: square | round): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSize(value: tiny | small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSkin(value: ToggleButtonSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
    
    inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    
    inline def setTooltipProps(value: TooltipCommonProps): Self = StObject.set(x, "tooltipProps", value.asInstanceOf[js.Any])
    
    inline def setTooltipPropsUndefined: Self = StObject.set(x, "tooltipProps", js.undefined)
  }
}
