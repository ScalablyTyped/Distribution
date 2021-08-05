package typings.wixStyleReact

import typings.csstype.mod.MaxWidthProperty
import typings.react.mod.PureComponent
import typings.react.mod.ReactElement
import typings.wixStyleReact.tabMod.CardFolderTabProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardFolderTabsMod {
  
  @JSImport("wix-style-react/dist/es/src/CardFolderTabs", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[CardFolderTabsProps, js.Object, js.Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/es/src/CardFolderTabs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def Tab(): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Tab")().asInstanceOf[ReactElement]
    inline def Tab(props: CardFolderTabProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Tab")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  }
  
  type CardFolderTabs = PureComponent[CardFolderTabsProps, js.Object, js.Any]
  
  trait CardFolderTabsProps extends StObject {
    
    var activeId: String
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var maxTabWidth: js.UndefOr[MaxWidthProperty[String | Double]] = js.undefined
    
    var onTabChange: js.UndefOr[js.Function1[/* newActiveId */ String, Unit]] = js.undefined
  }
  object CardFolderTabsProps {
    
    inline def apply(activeId: String): CardFolderTabsProps = {
      val __obj = js.Dynamic.literal(activeId = activeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardFolderTabsProps]
    }
    
    extension [Self <: CardFolderTabsProps](x: Self) {
      
      inline def setActiveId(value: String): Self = StObject.set(x, "activeId", value.asInstanceOf[js.Any])
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setMaxTabWidth(value: MaxWidthProperty[String | Double]): Self = StObject.set(x, "maxTabWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxTabWidthUndefined: Self = StObject.set(x, "maxTabWidth", js.undefined)
      
      inline def setOnTabChange(value: /* newActiveId */ String => Unit): Self = StObject.set(x, "onTabChange", js.Any.fromFunction1(value))
      
      inline def setOnTabChangeUndefined: Self = StObject.set(x, "onTabChange", js.undefined)
    }
  }
}
