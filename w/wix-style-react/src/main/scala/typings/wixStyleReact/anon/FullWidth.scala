package typings.wixStyleReact.anon

import typings.react.mod.ReactNode
import typings.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonPriority
import typings.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonSize
import typings.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonSkin
import typings.wixStyleReact.distTypesCommonMod.IconElement
import typings.wixStyleReact.distTypesCommonMod.TooltipCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullWidth extends StObject {
  
  /** Accepts any item as a child element. For all common cases pass a standard text string. */
  var children: js.UndefOr[ReactNode] = js.undefined
  
  /** Specifies a CSS class name to be appended to the component’s root element. */
  var className: js.UndefOr[String] = js.undefined
  
  /** Applies a data-hook HTML attribute that can be used in the tests. */
  var dataHook: js.UndefOr[String] = js.undefined
  
  /** Specifies whether user interactions are disabled. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /** Specifies whether component handles text overflow with ellipsis. If enabled, label that exceed available space will be displayed inside of a tooltip when user hover over a button. */
  var ellipsis: js.UndefOr[Boolean] = js.undefined
  
  /** Sets button width to fill a 100% of a parent container width. */
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  
  /** Pass an icon or a component to display at the front of a label (e.g., svg, image, etc.) */
  var prefixIcon: js.UndefOr[IconElement] = js.undefined
  
  /** Specifies the priority of a button. */
  var priority: js.UndefOr[ButtonPriority] = js.undefined
  
  /** Specifies whether the full button label is displayed in a tooltip when label overflows available space.
    *
    * Behaviour is enabled by default. Set property value to false to show ellipsis without a tooltip. */
  var showTooltip: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls the size of a button.
    * @default medium
    */
  var size: js.UndefOr[ButtonSize] = js.undefined
  
  /** Specifies the skin of a button. */
  var skin: js.UndefOr[ButtonSkin] = js.undefined
  
  /** Pass an icon or a component to display at the end of a label (e.g., svg, image, etc.) */
  var suffixIcon: js.UndefOr[IconElement] = js.undefined
  
  /** Allows to pass all common tooltip props. Use it to customize a tooltip created from text ellipsis. Check `<Tooltip/>` for a full API. */
  var tooltipProps: js.UndefOr[TooltipCommonProps] = js.undefined
}
object FullWidth {
  
  inline def apply(): FullWidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullWidth]
  }
  
  extension [Self <: FullWidth](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
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
