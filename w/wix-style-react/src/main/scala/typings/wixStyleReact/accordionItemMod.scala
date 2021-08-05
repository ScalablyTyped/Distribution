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
    
    inline def button: typings.wixStyleReact.wixStyleReactStrings.button = "button".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.button]
    
    inline def textButton: typings.wixStyleReact.wixStyleReactStrings.textButton = "textButton".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.textButton]
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
    
    inline def apply(): AccordionItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionItemProps]
    }
    
    extension [Self <: AccordionItemProps](x: Self) {
      
      inline def setButtonType(value: AccordionItemButtonType): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
      
      inline def setButtonTypeUndefined: Self = StObject.set(x, "buttonType", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCollapseLabel(value: ReactNode): Self = StObject.set(x, "collapseLabel", value.asInstanceOf[js.Any])
      
      inline def setCollapseLabelUndefined: Self = StObject.set(x, "collapseLabel", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setExpandLabel(value: ReactNode): Self = StObject.set(x, "expandLabel", value.asInstanceOf[js.Any])
      
      inline def setExpandLabelUndefined: Self = StObject.set(x, "expandLabel", js.undefined)
      
      inline def setHideShadow(value: Boolean): Self = StObject.set(x, "hideShadow", value.asInstanceOf[js.Any])
      
      inline def setHideShadowUndefined: Self = StObject.set(x, "hideShadow", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setInitiallyOpen(value: Boolean): Self = StObject.set(x, "initiallyOpen", value.asInstanceOf[js.Any])
      
      inline def setInitiallyOpenUndefined: Self = StObject.set(x, "initiallyOpen", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnToggle(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction1(value))
      
      inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setSkin(value: light | standard): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
