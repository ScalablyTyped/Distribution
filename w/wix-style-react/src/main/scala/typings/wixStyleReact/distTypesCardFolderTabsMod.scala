package typings.wixStyleReact

import typings.csstype.mod.Property.MaxWidth
import typings.react.mod.PureComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.wixStyleReact.distTypesCardFolderTabsTabMod.CardFolderTabProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCardFolderTabsMod {
  
  @JSImport("wix-style-react/dist/types/CardFolderTabs", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[CardFolderTabsProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/CardFolderTabs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def Tab(): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Tab")().asInstanceOf[ReactElement]
    inline def Tab(props: CardFolderTabProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Tab")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  }
  
  type CardFolderTabs = PureComponent[CardFolderTabsProps, js.Object, Any]
  
  trait CardFolderTabsProps extends StObject {
    
    var activeId: String
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var ellipsis: js.UndefOr[Boolean] = js.undefined
    
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    var maxTabWidth: js.UndefOr[MaxWidth[String | Double]] = js.undefined
    
    var onTabChange: js.UndefOr[js.Function1[/* newActiveId */ String, Unit]] = js.undefined
    
    var size: js.UndefOr[TabFontSize] = js.undefined
  }
  object CardFolderTabsProps {
    
    inline def apply(activeId: String): CardFolderTabsProps = {
      val __obj = js.Dynamic.literal(activeId = activeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardFolderTabsProps]
    }
    
    extension [Self <: CardFolderTabsProps](x: Self) {
      
      inline def setActiveId(value: String): Self = StObject.set(x, "activeId", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setEllipsis(value: Boolean): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setMaxTabWidth(value: MaxWidth[String | Double]): Self = StObject.set(x, "maxTabWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxTabWidthUndefined: Self = StObject.set(x, "maxTabWidth", js.undefined)
      
      inline def setOnTabChange(value: /* newActiveId */ String => Unit): Self = StObject.set(x, "onTabChange", js.Any.fromFunction1(value))
      
      inline def setOnTabChangeUndefined: Self = StObject.set(x, "onTabChange", js.undefined)
      
      inline def setSize(value: TabFontSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.medium
    - typings.wixStyleReact.wixStyleReactStrings.small
  */
  trait TabFontSize extends StObject
  object TabFontSize {
    
    inline def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
  }
}
