package typings.wixStyleReact

import typings.csstype.mod.Property.BorderRadius
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import typings.wixStyleReact.distTypesCommonMod.TooltipCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAddItemAddItemDottypesMod {
  
  trait AddItemActions extends StObject {
    
    def blur(): Unit
    
    def focus(): Unit
  }
  object AddItemActions {
    
    inline def apply(blur: () => Unit, focus: () => Unit): AddItemActions = {
      val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[AddItemActions]
    }
    
    extension [Self <: AddItemActions](x: Self) {
      
      inline def setBlur(value: () => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.center
    - typings.wixStyleReact.wixStyleReactStrings.right
    - typings.wixStyleReact.wixStyleReactStrings.left
  */
  trait AddItemAlignItems extends StObject
  object AddItemAlignItems {
    
    inline def center: typings.wixStyleReact.wixStyleReactStrings.center = "center".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.center]
    
    inline def left: typings.wixStyleReact.wixStyleReactStrings.left = "left".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.left]
    
    inline def right: typings.wixStyleReact.wixStyleReactStrings.right = "right".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.right]
  }
  
  trait AddItemProps extends StObject {
    
    /** switching content alignment  */
    var alignItems: js.UndefOr[AddItemAlignItems] = js.undefined
    
    /** Defines a string value that labels the add item element */
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    /** Subtitle of the component */
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    /** sets the border-radius css property on the button element */
    var borderRadius: js.UndefOr[BorderRadius[String | Double]] = js.undefined
    
    /** any renderable node or a render function. In case of a render function, text styles will not be applied. */
    var children: js.UndefOr[ReactNode | js.Function0[ReactNode]] = js.undefined
    
    /** A css class to be applied to the component's root element */
    var className: js.UndefOr[String] = js.undefined
    
    /** Applied as data-hook HTML attribute that can be used to create driver in testing */
    var dataHook: js.UndefOr[String] = js.undefined
    
    /** apply disabled styles */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** The illustraion icon src or node */
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    /** click event handler  */
    var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    /** Removes padding */
    var removePadding: js.UndefOr[Boolean] = js.undefined
    
    /** Displays the plus icon */
    var showIcon: js.UndefOr[Boolean] = js.undefined
    
    /** size to control icon and spacing  */
    var size: js.UndefOr[AddItemSize] = js.undefined
    
    /** Subtitle of the component */
    var subtitle: js.UndefOr[ReactNode] = js.undefined
    
    /** the theme of component */
    var theme: js.UndefOr[AddItemTheme] = js.undefined
    
    /** When provided, hover will display a tooltip */
    var tooltipContent: js.UndefOr[ReactNode] = js.undefined
    
    /** Tooltip props */
    var tooltipProps: js.UndefOr[TooltipCommonProps] = js.undefined
  }
  object AddItemProps {
    
    inline def apply(): AddItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddItemProps]
    }
    
    extension [Self <: AddItemProps](x: Self) {
      
      inline def setAlignItems(value: AddItemAlignItems): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setBorderRadius(value: BorderRadius[String | Double]): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      inline def setChildren(value: ReactNode | js.Function0[ReactNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction0(value: () => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction0(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setRemovePadding(value: Boolean): Self = StObject.set(x, "removePadding", value.asInstanceOf[js.Any])
      
      inline def setRemovePaddingUndefined: Self = StObject.set(x, "removePadding", js.undefined)
      
      inline def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
      
      inline def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
      
      inline def setSize(value: AddItemSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSubtitle(value: ReactNode): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setTheme(value: AddItemTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTooltipContent(value: ReactNode): Self = StObject.set(x, "tooltipContent", value.asInstanceOf[js.Any])
      
      inline def setTooltipContentUndefined: Self = StObject.set(x, "tooltipContent", js.undefined)
      
      inline def setTooltipProps(value: TooltipCommonProps): Self = StObject.set(x, "tooltipProps", value.asInstanceOf[js.Any])
      
      inline def setTooltipPropsUndefined: Self = StObject.set(x, "tooltipProps", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.large
    - typings.wixStyleReact.wixStyleReactStrings.medium
    - typings.wixStyleReact.wixStyleReactStrings.small
    - typings.wixStyleReact.wixStyleReactStrings.tiny
  */
  trait AddItemSize extends StObject
  object AddItemSize {
    
    inline def large: typings.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.large]
    
    inline def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
    
    inline def tiny: typings.wixStyleReact.wixStyleReactStrings.tiny = "tiny".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.tiny]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.dashes
    - typings.wixStyleReact.wixStyleReactStrings.plain
    - typings.wixStyleReact.wixStyleReactStrings.filled
    - typings.wixStyleReact.wixStyleReactStrings.image
  */
  trait AddItemTheme extends StObject
  object AddItemTheme {
    
    inline def dashes: typings.wixStyleReact.wixStyleReactStrings.dashes = "dashes".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.dashes]
    
    inline def filled: typings.wixStyleReact.wixStyleReactStrings.filled = "filled".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.filled]
    
    inline def image: typings.wixStyleReact.wixStyleReactStrings.image = "image".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.image]
    
    inline def plain: typings.wixStyleReact.wixStyleReactStrings.plain = "plain".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.plain]
  }
}
