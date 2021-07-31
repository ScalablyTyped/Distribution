package typings.wixStyleReact

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sidePanelMod {
  
  @JSImport("wix-style-react/dist/es/src/SidePanel", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[SidePanelProps, js.Object, js.Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/es/src/SidePanel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/es/src/SidePanel", "default.Content")
    @js.native
    def Content: Instantiable0[typings.wixStyleReact.sidePanelContentMod.default] = js.native
    @scala.inline
    def Content_=(x: Instantiable0[typings.wixStyleReact.sidePanelContentMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/es/src/SidePanel", "default.Divider")
    @js.native
    def Divider: Instantiable0[typings.wixStyleReact.sidePanelDividerMod.default] = js.native
    @scala.inline
    def Divider_=(x: Instantiable0[typings.wixStyleReact.sidePanelDividerMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Divider")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/es/src/SidePanel", "default.Footer")
    @js.native
    def Footer: Instantiable0[typings.wixStyleReact.sidePanelFooterMod.default] = js.native
    @scala.inline
    def Footer_=(x: Instantiable0[typings.wixStyleReact.sidePanelFooterMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/es/src/SidePanel", "default.Header")
    @js.native
    def Header: Instantiable0[typings.wixStyleReact.sidePanelHeaderMod.default] = js.native
    @scala.inline
    def Header_=(x: Instantiable0[typings.wixStyleReact.sidePanelHeaderMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
  }
  
  type SidePanel = PureComponent[SidePanelProps, js.Object, js.Any]
  
  trait SidePanelProps extends StObject {
    
    var buttonText: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var onCloseButtonClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object SidePanelProps {
    
    @scala.inline
    def apply(): SidePanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SidePanelProps]
    }
    
    @scala.inline
    implicit class SidePanelPropsMutableBuilder[Self <: SidePanelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setOnCloseButtonClick(value: () => Unit): Self = StObject.set(x, "onCloseButtonClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseButtonClickUndefined: Self = StObject.set(x, "onCloseButtonClick", js.undefined)
    }
  }
}
