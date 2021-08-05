package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.wixStyleReact.commonMod.TooltipCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sidePanelHeaderMod {
  
  @JSImport("wix-style-react/dist/es/src/SidePanel/Header", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[HeaderProps, js.Object, js.Any]
  
  type Header = PureComponent[HeaderProps, js.Object, js.Any]
  
  trait HeaderProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var infoTooltipContent: js.UndefOr[String] = js.undefined
    
    var infoTooltipProps: js.UndefOr[TooltipCommonProps] = js.undefined
    
    var showDivider: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[String | ReactNode] = js.undefined
  }
  object HeaderProps {
    
    inline def apply(): HeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderProps]
    }
    
    extension [Self <: HeaderProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setInfoTooltipContent(value: String): Self = StObject.set(x, "infoTooltipContent", value.asInstanceOf[js.Any])
      
      inline def setInfoTooltipContentUndefined: Self = StObject.set(x, "infoTooltipContent", js.undefined)
      
      inline def setInfoTooltipProps(value: TooltipCommonProps): Self = StObject.set(x, "infoTooltipProps", value.asInstanceOf[js.Any])
      
      inline def setInfoTooltipPropsUndefined: Self = StObject.set(x, "infoTooltipProps", js.undefined)
      
      inline def setShowDivider(value: Boolean): Self = StObject.set(x, "showDivider", value.asInstanceOf[js.Any])
      
      inline def setShowDividerUndefined: Self = StObject.set(x, "showDivider", js.undefined)
      
      inline def setTitle(value: String | ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
