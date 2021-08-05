package typings.wixStyleReact

import typings.react.mod.Component
import typings.wixStyleReact.accordionItemMod.AccordionItemProps
import typings.wixStyleReact.wixStyleReactStrings.light
import typings.wixStyleReact.wixStyleReactStrings.standard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionMod {
  
  @JSImport("wix-style-react/dist/es/src/Accordion", JSImport.Default)
  @js.native
  class default ()
    extends Component[AccordionProps, js.Object, js.Any]
  
  type Accordion = Component[AccordionProps, js.Object, js.Any]
  
  trait AccordionProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var hideShadow: js.UndefOr[Boolean] = js.undefined
    
    var items: js.UndefOr[js.Array[AccordionItemProps]] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var skin: js.UndefOr[light | standard] = js.undefined
  }
  object AccordionProps {
    
    inline def apply(): AccordionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionProps]
    }
    
    extension [Self <: AccordionProps](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setHideShadow(value: Boolean): Self = StObject.set(x, "hideShadow", value.asInstanceOf[js.Any])
      
      inline def setHideShadowUndefined: Self = StObject.set(x, "hideShadow", js.undefined)
      
      inline def setItems(value: js.Array[AccordionItemProps]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: AccordionItemProps*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setSkin(value: light | standard): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    }
  }
}
