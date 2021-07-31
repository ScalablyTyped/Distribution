package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sidePanelFooterMod {
  
  @JSImport("wix-style-react/dist/es/src/SidePanel/Footer", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[FooterProps, js.Object, js.Any]
  
  type Footer = PureComponent[FooterProps, js.Object, js.Any]
  
  trait FooterProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var showDivider: js.UndefOr[Boolean] = js.undefined
  }
  object FooterProps {
    
    @scala.inline
    def apply(): FooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FooterProps]
    }
    
    @scala.inline
    implicit class FooterPropsMutableBuilder[Self <: FooterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setShowDivider(value: Boolean): Self = StObject.set(x, "showDivider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDividerUndefined: Self = StObject.set(x, "showDivider", js.undefined)
    }
  }
}
