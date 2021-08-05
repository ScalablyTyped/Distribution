package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.wixStyleReact.itemMod.SelectableAccordionItemCommonProps
import typings.wixStyleReact.wixStyleReactStrings.checkbox
import typings.wixStyleReact.wixStyleReactStrings.radio
import typings.wixStyleReact.wixStyleReactStrings.toggle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectableAccordionMod {
  
  @JSImport("wix-style-react/dist/es/src/SelectableAccordion", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[SelectableAccordionProps, js.Object, js.Any]
  
  type SelectableAccordion = PureComponent[SelectableAccordionProps, js.Object, js.Any]
  
  trait SelectableAccordionItemProps
    extends StObject
       with SelectableAccordionItemCommonProps {
    
    var initiallyOpen: js.UndefOr[Boolean] = js.undefined
  }
  object SelectableAccordionItemProps {
    
    inline def apply(): SelectableAccordionItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectableAccordionItemProps]
    }
    
    extension [Self <: SelectableAccordionItemProps](x: Self) {
      
      inline def setInitiallyOpen(value: Boolean): Self = StObject.set(x, "initiallyOpen", value.asInstanceOf[js.Any])
      
      inline def setInitiallyOpenUndefined: Self = StObject.set(x, "initiallyOpen", js.undefined)
    }
  }
  
  trait SelectableAccordionProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var items: js.UndefOr[js.Array[SelectableAccordionItemProps]] = js.undefined
    
    var onSelectionChanged: js.UndefOr[js.Function1[/* selectedIds */ js.Array[Double], Unit]] = js.undefined
    
    var `type`: js.UndefOr[radio | checkbox | toggle] = js.undefined
  }
  object SelectableAccordionProps {
    
    inline def apply(): SelectableAccordionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectableAccordionProps]
    }
    
    extension [Self <: SelectableAccordionProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setItems(value: js.Array[SelectableAccordionItemProps]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: SelectableAccordionItemProps*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setOnSelectionChanged(value: /* selectedIds */ js.Array[Double] => Unit): Self = StObject.set(x, "onSelectionChanged", js.Any.fromFunction1(value))
      
      inline def setOnSelectionChangedUndefined: Self = StObject.set(x, "onSelectionChanged", js.undefined)
      
      inline def setType(value: radio | checkbox | toggle): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
