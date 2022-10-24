package typings.wixStyleReact.anon

import typings.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonPriority
import typings.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonSize
import typings.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonSkin
import typings.wixStyleReact.distTypesCommonMod.IconElement
import typings.wixStyleReact.distTypesCommonMod.TooltipCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullWidth extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var dataHook: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var ellipsis: js.UndefOr[Boolean] = js.undefined
  
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  
  var prefixIcon: js.UndefOr[IconElement] = js.undefined
  
  var priority: js.UndefOr[ButtonPriority] = js.undefined
  
  var showTooltip: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Size of Button content
    * @default medium
    */
  var size: js.UndefOr[ButtonSize] = js.undefined
  
  var skin: js.UndefOr[ButtonSkin] = js.undefined
  
  var suffixIcon: js.UndefOr[IconElement] = js.undefined
  
  var tooltipProps: js.UndefOr[TooltipCommonProps] = js.undefined
}
object FullWidth {
  
  inline def apply(): FullWidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullWidth]
  }
  
  extension [Self <: FullWidth](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEllipsis(value: Boolean): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
    
    inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
    
    inline def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    
    inline def setPrefixIcon(value: IconElement): Self = StObject.set(x, "prefixIcon", value.asInstanceOf[js.Any])
    
    inline def setPrefixIconUndefined: Self = StObject.set(x, "prefixIcon", js.undefined)
    
    inline def setPriority(value: ButtonPriority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
    
    inline def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
    
    inline def setSize(value: ButtonSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSkin(value: ButtonSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
    
    inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    
    inline def setSuffixIcon(value: IconElement): Self = StObject.set(x, "suffixIcon", value.asInstanceOf[js.Any])
    
    inline def setSuffixIconUndefined: Self = StObject.set(x, "suffixIcon", js.undefined)
    
    inline def setTooltipProps(value: TooltipCommonProps): Self = StObject.set(x, "tooltipProps", value.asInstanceOf[js.Any])
    
    inline def setTooltipPropsUndefined: Self = StObject.set(x, "tooltipProps", js.undefined)
  }
}
