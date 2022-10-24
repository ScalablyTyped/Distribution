package typings.wixStyleReact.anon

import typings.react.mod.ReactNode
import typings.wixStyleReact.distTypesCommonEllipsisMod.EllipsisCommonProps
import typings.wixStyleReact.distTypesCommonMod.IconElement
import typings.wixStyleReact.distTypesListItemActionMod.ListItemActionSize
import typings.wixStyleReact.distTypesListItemActionMod.ListItemActionSkin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Highlighted extends StObject {
  
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  var dataHook: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var ellipsis: js.UndefOr[Boolean] = js.undefined
  
  var highlighted: js.UndefOr[Boolean] = js.undefined
  
  var prefixIcon: js.UndefOr[IconElement] = js.undefined
  
  var shouldFocusWithoutScroll: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[ListItemActionSize] = js.undefined
  
  var skin: js.UndefOr[ListItemActionSkin] = js.undefined
  
  var subtitle: js.UndefOr[String] = js.undefined
  
  var suffix: js.UndefOr[ReactNode] = js.undefined
  
  var suffixIcon: js.UndefOr[IconElement] = js.undefined
  
  var title: String
  
  var tooltipModifiers: js.UndefOr[EllipsisCommonProps] = js.undefined
}
object Highlighted {
  
  inline def apply(title: String): Highlighted = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Highlighted]
  }
  
  extension [Self <: Highlighted](x: Self) {
    
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
    
    inline def setShouldFocusWithoutScroll(value: Boolean): Self = StObject.set(x, "shouldFocusWithoutScroll", value.asInstanceOf[js.Any])
    
    inline def setShouldFocusWithoutScrollUndefined: Self = StObject.set(x, "shouldFocusWithoutScroll", js.undefined)
    
    inline def setSize(value: ListItemActionSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSkin(value: ListItemActionSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
    
    inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setSuffix(value: ReactNode): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixIcon(value: IconElement): Self = StObject.set(x, "suffixIcon", value.asInstanceOf[js.Any])
    
    inline def setSuffixIconUndefined: Self = StObject.set(x, "suffixIcon", js.undefined)
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTooltipModifiers(value: EllipsisCommonProps): Self = StObject.set(x, "tooltipModifiers", value.asInstanceOf[js.Any])
    
    inline def setTooltipModifiersUndefined: Self = StObject.set(x, "tooltipModifiers", js.undefined)
  }
}
