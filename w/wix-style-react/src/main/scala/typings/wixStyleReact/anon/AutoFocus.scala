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
  
  @scala.inline
  def apply(title: String): AutoFocus = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoFocus]
  }
  
  @scala.inline
  implicit class AutoFocusMutableBuilder[Self <: AutoFocus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    @scala.inline
    def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setEllipsis(value: Boolean): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
    
    @scala.inline
    def setHighlighted(value: Boolean): Self = StObject.set(x, "highlighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightedUndefined: Self = StObject.set(x, "highlighted", js.undefined)
    
    @scala.inline
    def setPrefixIcon(value: IconElement): Self = StObject.set(x, "prefixIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixIconUndefined: Self = StObject.set(x, "prefixIcon", js.undefined)
    
    @scala.inline
    def setSize(value: ListItemActionSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSkin(value: ListItemActionSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    
    @scala.inline
    def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipModifiers(value: EllipsisCommonProps): Self = StObject.set(x, "tooltipModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipModifiersUndefined: Self = StObject.set(x, "tooltipModifiers", js.undefined)
  }
}
