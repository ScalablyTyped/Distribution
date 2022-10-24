package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidePanelFooterMod {
  
  @JSImport("wix-style-react/dist/types/SidePanel/Footer", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[FooterProps, js.Object, Any]
  
  type Footer = PureComponent[FooterProps, js.Object, Any]
  
  trait FooterProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var noPadding: js.UndefOr[Boolean] = js.undefined
    
    var showDivider: js.UndefOr[Boolean] = js.undefined
  }
  object FooterProps {
    
    inline def apply(): FooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FooterProps]
    }
    
    extension [Self <: FooterProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setNoPadding(value: Boolean): Self = StObject.set(x, "noPadding", value.asInstanceOf[js.Any])
      
      inline def setNoPaddingUndefined: Self = StObject.set(x, "noPadding", js.undefined)
      
      inline def setShowDivider(value: Boolean): Self = StObject.set(x, "showDivider", value.asInstanceOf[js.Any])
      
      inline def setShowDividerUndefined: Self = StObject.set(x, "showDivider", js.undefined)
    }
  }
}
