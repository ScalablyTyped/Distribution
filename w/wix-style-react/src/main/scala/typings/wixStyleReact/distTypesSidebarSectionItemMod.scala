package typings.wixStyleReact

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidebarSectionItemMod {
  
  @JSImport("wix-style-react/dist/types/SidebarSectionItem", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[SidebarSectionItemProps, js.Object, Any]
  
  type SidebarSectionItem = PureComponent[SidebarSectionItemProps, js.Object, Any]
  
  trait SidebarSectionItemProps extends StObject {
    
    var alwaysDisplayChevron: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var drillable: js.UndefOr[Boolean] = js.undefined
    
    var itemKey: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var prefix: js.UndefOr[ReactNode] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var suffix: js.UndefOr[ReactNode] = js.undefined
  }
  object SidebarSectionItemProps {
    
    inline def apply(): SidebarSectionItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SidebarSectionItemProps]
    }
    
    extension [Self <: SidebarSectionItemProps](x: Self) {
      
      inline def setAlwaysDisplayChevron(value: Boolean): Self = StObject.set(x, "alwaysDisplayChevron", value.asInstanceOf[js.Any])
      
      inline def setAlwaysDisplayChevronUndefined: Self = StObject.set(x, "alwaysDisplayChevron", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDrillable(value: Boolean): Self = StObject.set(x, "drillable", value.asInstanceOf[js.Any])
      
      inline def setDrillableUndefined: Self = StObject.set(x, "drillable", js.undefined)
      
      inline def setItemKey(value: String): Self = StObject.set(x, "itemKey", value.asInstanceOf[js.Any])
      
      inline def setItemKeyUndefined: Self = StObject.set(x, "itemKey", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPrefix(value: ReactNode): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSuffix(value: ReactNode): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
}
