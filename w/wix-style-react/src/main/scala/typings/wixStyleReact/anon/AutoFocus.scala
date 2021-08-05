package typings.wixStyleReact.anon

import typings.wixStyleReact.commonMod.IconElement
import typings.wixStyleReact.ellipsisMod.EllipsisCommonProps
import typings.wixStyleReact.listItemActionMod.ListItemActionSize
import typings.wixStyleReact.listItemActionMod.ListItemActionSkin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoFocus extends StObject {
  
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  var dataHook: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var ellipsis: js.UndefOr[Boolean] = js.undefined
  
  var highlighted: js.UndefOr[Boolean] = js.undefined
  
  var prefixIcon: js.UndefOr[IconElement] = js.undefined
  
  var size: js.UndefOr[ListItemActionSize] = js.undefined
  
  var skin: js.UndefOr[ListItemActionSkin] = js.undefined
  
  var subtitle: js.UndefOr[String] = js.undefined
  
  var title: String
  
  var tooltipModifiers: js.UndefOr[EllipsisCommonProps] = js.undefined
}
object AutoFocus {
  
  inline def apply(title: String): AutoFocus = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoFocus]
  }
  
  extension [Self <: AutoFocus](x: Self) {
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEllipsis(value: Boolean): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
    
    inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
    
    inline def setHighlighted(value: Boolean): Self = StObject.set(x, "highlighted", value.asInstanceOf[js.Any])
    
    inline def setHighlightedUndefined: Self = StObject.set(x, "highlighted", js.undefined)
    
    inline def setPrefixIcon(value: IconElement): Self = StObject.set(x, "prefixIcon", value.asInstanceOf[js.Any])
    
    inline def setPrefixIconUndefined: Self = StObject.set(x, "prefixIcon", js.undefined)
    
    inline def setSize(value: ListItemActionSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSkin(value: ListItemActionSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
    
    inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTooltipModifiers(value: EllipsisCommonProps): Self = StObject.set(x, "tooltipModifiers", value.asInstanceOf[js.Any])
    
    inline def setTooltipModifiersUndefined: Self = StObject.set(x, "tooltipModifiers", js.undefined)
  }
}
