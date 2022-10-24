package typings.wixStyleReact

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.wixStyleReact.wixStyleReactStrings.checkbox
import typings.wixStyleReact.wixStyleReactStrings.radio
import typings.wixStyleReact.wixStyleReactStrings.toggle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSelectableAccordionItemMod {
  
  @JSImport("wix-style-react/dist/types/SelectableAccordion/Item", JSImport.Default)
  @js.native
  open class default ()
    extends Component[SelectableAccordionItemProps, js.Object, Any]
  
  type SelectableAccordionItem = Component[SelectableAccordionItemProps, js.Object, Any]
  
  trait SelectableAccordionItemCommonProps extends StObject {
    
    var content: js.UndefOr[ReactNode] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var subtitle: js.UndefOr[ReactNode] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object SelectableAccordionItemCommonProps {
    
    inline def apply(): SelectableAccordionItemCommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectableAccordionItemCommonProps]
    }
    
    extension [Self <: SelectableAccordionItemCommonProps](x: Self) {
      
      inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setSubtitle(value: ReactNode): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait SelectableAccordionItemProps
    extends StObject
       with SelectableAccordionItemCommonProps {
    
    var onChange: js.UndefOr[js.Function2[/* idx */ Double, /* open */ Boolean, Unit]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[radio | checkbox | toggle] = js.undefined
  }
  object SelectableAccordionItemProps {
    
    inline def apply(): SelectableAccordionItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectableAccordionItemProps]
    }
    
    extension [Self <: SelectableAccordionItemProps](x: Self) {
      
      inline def setOnChange(value: (/* idx */ Double, /* open */ Boolean) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setType(value: radio | checkbox | toggle): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
