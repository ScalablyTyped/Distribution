package typings.wixStyleReact

import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.wixStyleReact.wixStyleReactStrings.light
import typings.wixStyleReact.wixStyleReactStrings.standard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionItemMod {
  
  @JSImport("wix-style-react/dist/es/src/Accordion/AccordionItem", JSImport.Default)
  @js.native
  class default ()
    extends Component[AccordionItemProps, js.Object, js.Any]
  
  type AccordionItem = Component[AccordionItemProps, js.Object, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.textButton
    - typings.wixStyleReact.wixStyleReactStrings.button
  */
  trait AccordionItemButtonType extends StObject
  object AccordionItemButtonType {
    
    @scala.inline
    def button: typings.wixStyleReact.wixStyleReactStrings.button = "button".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.button]
    
    @scala.inline
    def textButton: typings.wixStyleReact.wixStyleReactStrings.textButton = "textButton".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.textButton]
  }
  
  trait AccordionItemProps extends StObject {
    
    var buttonType: js.UndefOr[AccordionItemButtonType] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var collapseLabel: js.UndefOr[ReactNode] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var expandLabel: js.UndefOr[ReactNode] = js.undefined
    
    var hideShadow: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    var initiallyOpen: js.UndefOr[Boolean] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onToggle: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var skin: js.UndefOr[light | standard] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object AccordionItemProps {
    
    @scala.inline
    def apply(): AccordionItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionItemProps]
    }
    
    @scala.inline
    implicit class AccordionItemPropsMutableBuilder[Self <: AccordionItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonType(value: AccordionItemButtonType): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTypeUndefined: Self = StObject.set(x, "buttonType", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCollapseLabel(value: ReactNode): Self = StObject.set(x, "collapseLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseLabelUndefined: Self = StObject.set(x, "collapseLabel", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setExpandLabel(value: ReactNode): Self = StObject.set(x, "expandLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandLabelUndefined: Self = StObject.set(x, "expandLabel", js.undefined)
      
      @scala.inline
      def setHideShadow(value: Boolean): Self = StObject.set(x, "hideShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideShadowUndefined: Self = StObject.set(x, "hideShadow", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setInitiallyOpen(value: Boolean): Self = StObject.set(x, "initiallyOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitiallyOpenUndefined: Self = StObject.set(x, "initiallyOpen", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnToggle(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setSkin(value: light | standard): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
