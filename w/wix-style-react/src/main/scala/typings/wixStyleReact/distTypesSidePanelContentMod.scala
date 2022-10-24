package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidePanelContentMod {
  
  @JSImport("wix-style-react/dist/types/SidePanel/Content", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[ContentProps, js.Object, Any]
  
  type Content = PureComponent[ContentProps, js.Object, Any]
  
  trait ContentProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var noPadding: js.UndefOr[Boolean] = js.undefined
    
    var stretchVertically: js.UndefOr[Boolean] = js.undefined
  }
  object ContentProps {
    
    inline def apply(): ContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentProps]
    }
    
    extension [Self <: ContentProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setNoPadding(value: Boolean): Self = StObject.set(x, "noPadding", value.asInstanceOf[js.Any])
      
      inline def setNoPaddingUndefined: Self = StObject.set(x, "noPadding", js.undefined)
      
      inline def setStretchVertically(value: Boolean): Self = StObject.set(x, "stretchVertically", value.asInstanceOf[js.Any])
      
      inline def setStretchVerticallyUndefined: Self = StObject.set(x, "stretchVertically", js.undefined)
    }
  }
}
