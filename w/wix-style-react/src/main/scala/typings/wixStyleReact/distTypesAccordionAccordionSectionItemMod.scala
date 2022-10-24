package typings.wixStyleReact

import typings.react.mod.Component
import typings.wixStyleReact.wixStyleReactStrings.large
import typings.wixStyleReact.wixStyleReactStrings.medium
import typings.wixStyleReact.wixStyleReactStrings.small
import typings.wixStyleReact.wixStyleReactStrings.tiny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAccordionAccordionSectionItemMod {
  
  @JSImport("wix-style-react/dist/types/Accordion/AccordionSectionItem", JSImport.Default)
  @js.native
  open class default ()
    extends Component[AccordionSectionItemProps & AccordionSectionItemCommonProps, js.Object, Any]
  
  type AccordionSectionItem = Component[AccordionSectionItemProps & AccordionSectionItemCommonProps, js.Object, Any]
  
  trait AccordionSectionItemCommonProps extends StObject {
    
    var title: String
  }
  object AccordionSectionItemCommonProps {
    
    inline def apply(title: String): AccordionSectionItemCommonProps = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccordionSectionItemCommonProps]
    }
    
    extension [Self <: AccordionSectionItemCommonProps](x: Self) {
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait AccordionSectionItemProps extends StObject {
    
    var size: js.UndefOr[tiny | small | medium | large] = js.undefined
  }
  object AccordionSectionItemProps {
    
    inline def apply(): AccordionSectionItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionSectionItemProps]
    }
    
    extension [Self <: AccordionSectionItemProps](x: Self) {
      
      inline def setSize(value: tiny | small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
