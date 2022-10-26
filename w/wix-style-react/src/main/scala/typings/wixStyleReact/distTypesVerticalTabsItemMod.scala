package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.wixStyleReact.distTypesCommonMod.IconElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesVerticalTabsItemMod {
  
  @JSImport("wix-style-react/dist/types/VerticalTabsItem", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[VerticalTabsItemProps, js.Object, Any]
  
  type VerticalTabsItem = PureComponent[VerticalTabsItemProps, js.Object, Any]
  
  trait VerticalTabsItemProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[Double] = js.undefined
    
    var prefixIcon: js.UndefOr[IconElement] = js.undefined
    
    var suffixIcon: js.UndefOr[IconElement] = js.undefined
    
    var `type`: js.UndefOr[VerticalTabsItemType] = js.undefined
  }
  object VerticalTabsItemProps {
    
    inline def apply(): VerticalTabsItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerticalTabsItemProps]
    }
    
    extension [Self <: VerticalTabsItemProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setPrefixIcon(value: IconElement): Self = StObject.set(x, "prefixIcon", value.asInstanceOf[js.Any])
      
      inline def setPrefixIconUndefined: Self = StObject.set(x, "prefixIcon", js.undefined)
      
      inline def setSuffixIcon(value: IconElement): Self = StObject.set(x, "suffixIcon", value.asInstanceOf[js.Any])
      
      inline def setSuffixIconUndefined: Self = StObject.set(x, "suffixIcon", js.undefined)
      
      inline def setType(value: VerticalTabsItemType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.tab
    - typings.wixStyleReact.wixStyleReactStrings.action
    - typings.wixStyleReact.wixStyleReactStrings.title
  */
  trait VerticalTabsItemType extends StObject
  object VerticalTabsItemType {
    
    inline def action: typings.wixStyleReact.wixStyleReactStrings.action = "action".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.action]
    
    inline def tab: typings.wixStyleReact.wixStyleReactStrings.tab = "tab".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.tab]
    
    inline def title: typings.wixStyleReact.wixStyleReactStrings.title = "title".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.title]
  }
}
