package typings.wixStyleReact

import typings.csstype.mod.BorderRadiusProperty
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import typings.wixStyleReact.commonMod.TooltipCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addItemMod {
  
  @JSImport("wix-style-react/dist/es/src/AddItem", JSImport.Default)
  @js.native
  class default ()
    extends Component[AddItemProps, js.Object, js.Any]
  
  type AddItem = Component[AddItemProps, js.Object, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.center
    - typings.wixStyleReact.wixStyleReactStrings.right
    - typings.wixStyleReact.wixStyleReactStrings.left
  */
  trait AddItemAlignItems extends StObject
  object AddItemAlignItems {
    
    @scala.inline
    def center: typings.wixStyleReact.wixStyleReactStrings.center = "center".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.center]
    
    @scala.inline
    def left: typings.wixStyleReact.wixStyleReactStrings.left = "left".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.left]
    
    @scala.inline
    def right: typings.wixStyleReact.wixStyleReactStrings.right = "right".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.right]
  }
  
  trait AddItemProps extends StObject {
    
    var alignItems: js.UndefOr[AddItemAlignItems] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    var borderRadius: js.UndefOr[BorderRadiusProperty[String | Double]] = js.undefined
    
    var children: js.UndefOr[ReactNode | js.Function0[ReactNode]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var removePadding: js.UndefOr[Boolean] = js.undefined
    
    var showIcon: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[AddItemSize] = js.undefined
    
    var theme: js.UndefOr[AddItemTheme] = js.undefined
    
    var tooltipContent: js.UndefOr[ReactNode] = js.undefined
    
    var tooltipProps: js.UndefOr[TooltipCommonProps] = js.undefined
  }
  object AddItemProps {
    
    @scala.inline
    def apply(): AddItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddItemProps]
    }
    
    @scala.inline
    implicit class AddItemPropsMutableBuilder[Self <: AddItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignItems(value: AddItemAlignItems): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      @scala.inline
      def setBorderRadius(value: BorderRadiusProperty[String | Double]): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode | js.Function0[ReactNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction0(value: () => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction0(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
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
      def setOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setRemovePadding(value: Boolean): Self = StObject.set(x, "removePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemovePaddingUndefined: Self = StObject.set(x, "removePadding", js.undefined)
      
      @scala.inline
      def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
      
      @scala.inline
      def setSize(value: AddItemSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTheme(value: AddItemTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setTooltipContent(value: ReactNode): Self = StObject.set(x, "tooltipContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipContentUndefined: Self = StObject.set(x, "tooltipContent", js.undefined)
      
      @scala.inline
      def setTooltipProps(value: TooltipCommonProps): Self = StObject.set(x, "tooltipProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipPropsUndefined: Self = StObject.set(x, "tooltipProps", js.undefined)
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
    
    @scala.inline
    def large: typings.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.large]
    
    @scala.inline
    def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
    
    @scala.inline
    def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
    
    @scala.inline
    def tiny: typings.wixStyleReact.wixStyleReactStrings.tiny = "tiny".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.tiny]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.dashes
    - typings.wixStyleReact.wixStyleReactStrings.plain
    - typings.wixStyleReact.wixStyleReactStrings.filled
    - typings.wixStyleReact.wixStyleReactStrings.image
  */
  trait AddItemTheme extends StObject
  object AddItemTheme {
    
    @scala.inline
    def dashes: typings.wixStyleReact.wixStyleReactStrings.dashes = "dashes".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.dashes]
    
    @scala.inline
    def filled: typings.wixStyleReact.wixStyleReactStrings.filled = "filled".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.filled]
    
    @scala.inline
    def image: typings.wixStyleReact.wixStyleReactStrings.image = "image".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.image]
    
    @scala.inline
    def plain: typings.wixStyleReact.wixStyleReactStrings.plain = "plain".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.plain]
  }
}
