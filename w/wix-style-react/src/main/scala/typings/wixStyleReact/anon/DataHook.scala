package typings.wixStyleReact.anon

import typings.wixStyleReact.buttonMod.ButtonPriority
import typings.wixStyleReact.buttonMod.ButtonSize
import typings.wixStyleReact.buttonMod.ButtonSkin
import typings.wixStyleReact.commonMod.IconElement
import typings.wixStyleReact.commonMod.TooltipCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataHook extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var dataHook: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var ellipsis: js.UndefOr[Boolean] = js.undefined
  
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  
  var prefixIcon: js.UndefOr[IconElement] = js.undefined
  
  var priority: js.UndefOr[ButtonPriority] = js.undefined
  
  var showTooltip: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[ButtonSize] = js.undefined
  
  var skin: js.UndefOr[ButtonSkin] = js.undefined
  
  var suffixIcon: js.UndefOr[IconElement] = js.undefined
  
  var tooltipProps: js.UndefOr[TooltipCommonProps] = js.undefined
}
object DataHook {
  
  @scala.inline
  def apply(): DataHook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataHook]
  }
  
  @scala.inline
  implicit class DataHookMutableBuilder[Self <: DataHook] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
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
    def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    
    @scala.inline
    def setPrefixIcon(value: IconElement): Self = StObject.set(x, "prefixIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixIconUndefined: Self = StObject.set(x, "prefixIcon", js.undefined)
    
    @scala.inline
    def setPriority(value: ButtonPriority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
    
    @scala.inline
    def setSize(value: ButtonSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSkin(value: ButtonSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    
    @scala.inline
    def setSuffixIcon(value: IconElement): Self = StObject.set(x, "suffixIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixIconUndefined: Self = StObject.set(x, "suffixIcon", js.undefined)
    
    @scala.inline
    def setTooltipProps(value: TooltipCommonProps): Self = StObject.set(x, "tooltipProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipPropsUndefined: Self = StObject.set(x, "tooltipProps", js.undefined)
  }
}
