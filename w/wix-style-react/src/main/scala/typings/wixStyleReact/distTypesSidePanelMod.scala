package typings.wixStyleReact

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidePanelMod {
  
  @JSImport("wix-style-react/dist/types/SidePanel", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[SidePanelProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/SidePanel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/SidePanel", "default.Content")
    @js.native
    def Content: Instantiable0[typings.wixStyleReact.distTypesSidePanelContentMod.default] = js.native
    inline def Content_=(x: Instantiable0[typings.wixStyleReact.distTypesSidePanelContentMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/SidePanel", "default.Divider")
    @js.native
    def Divider: Instantiable0[typings.wixStyleReact.distTypesSidePanelDividerMod.default] = js.native
    inline def Divider_=(x: Instantiable0[typings.wixStyleReact.distTypesSidePanelDividerMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Divider")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/SidePanel", "default.Footer")
    @js.native
    def Footer: Instantiable0[typings.wixStyleReact.distTypesSidePanelFooterMod.default] = js.native
    inline def Footer_=(x: Instantiable0[typings.wixStyleReact.distTypesSidePanelFooterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/SidePanel", "default.Header")
    @js.native
    def Header: Instantiable0[typings.wixStyleReact.distTypesSidePanelHeaderMod.default] = js.native
    inline def Header_=(x: Instantiable0[typings.wixStyleReact.distTypesSidePanelHeaderMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
  }
  
  type SidePanel = PureComponent[SidePanelProps, js.Object, Any]
  
  trait SidePanelProps extends StObject {
    
    var buttonText: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var onCloseButtonClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object SidePanelProps {
    
    inline def apply(): SidePanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SidePanelProps]
    }
    
    extension [Self <: SidePanelProps](x: Self) {
      
      inline def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      inline def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setOnCloseButtonClick(value: () => Unit): Self = StObject.set(x, "onCloseButtonClick", js.Any.fromFunction0(value))
      
      inline def setOnCloseButtonClickUndefined: Self = StObject.set(x, "onCloseButtonClick", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
