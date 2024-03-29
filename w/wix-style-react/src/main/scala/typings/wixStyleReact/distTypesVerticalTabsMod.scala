package typings.wixStyleReact

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.wixStyleReact.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesVerticalTabsMod {
  
  @JSImport("wix-style-react/dist/types/VerticalTabs", JSImport.Default)
  @js.native
  open class default ()
    extends Component[VerticalTabsProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/VerticalTabs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/VerticalTabs", "default.Footer")
    @js.native
    def Footer: FC[`1`] = js.native
    inline def Footer_=(x: FC[`1`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/VerticalTabs", "default.TabItem")
    @js.native
    def TabItem: Instantiable0[typings.wixStyleReact.distTypesVerticalTabsItemMod.default] = js.native
    inline def TabItem_=(x: Instantiable0[typings.wixStyleReact.distTypesVerticalTabsItemMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TabItem")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/VerticalTabs", "default.TabsGroup")
    @js.native
    def TabsGroup: FC[typings.wixStyleReact.distTypesVerticalTabsMod.TabsGroup] = js.native
    inline def TabsGroup_=(x: FC[TabsGroup]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TabsGroup")(x.asInstanceOf[js.Any])
  }
  
  trait TabsGroup extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object TabsGroup {
    
    inline def apply(): TabsGroup = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsGroup]
    }
    
    extension [Self <: TabsGroup](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type VerticalTabs = Component[VerticalTabsProps, js.Object, Any]
  
  trait VerticalTabsProps extends StObject {
    
    var activeTabId: js.UndefOr[Double] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* id */ Double, Unit]] = js.undefined
    
    var size: js.UndefOr[VerticalTabsSize] = js.undefined
  }
  object VerticalTabsProps {
    
    inline def apply(): VerticalTabsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerticalTabsProps]
    }
    
    extension [Self <: VerticalTabsProps](x: Self) {
      
      inline def setActiveTabId(value: Double): Self = StObject.set(x, "activeTabId", value.asInstanceOf[js.Any])
      
      inline def setActiveTabIdUndefined: Self = StObject.set(x, "activeTabId", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setOnChange(value: /* id */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setSize(value: VerticalTabsSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.tiny
    - typings.wixStyleReact.wixStyleReactStrings.small
    - typings.wixStyleReact.wixStyleReactStrings.medium
  */
  trait VerticalTabsSize extends StObject
  object VerticalTabsSize {
    
    inline def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
    
    inline def tiny: typings.wixStyleReact.wixStyleReactStrings.tiny = "tiny".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.tiny]
  }
}
