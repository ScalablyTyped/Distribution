package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPageFooterStartMod {
  
  @JSImport("wix-style-react/dist/types/PageFooter/Start", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[StartProps, js.Object, Any]
  
  type Start = PureComponent[StartProps, js.Object, Any]
  
  trait StartProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object StartProps {
    
    inline def apply(): StartProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartProps]
    }
    
    extension [Self <: StartProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
