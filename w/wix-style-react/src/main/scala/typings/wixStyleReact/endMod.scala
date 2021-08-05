package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object endMod {
  
  @JSImport("wix-style-react/dist/es/src/PageFooter/End", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[EndProps, js.Object, js.Any]
  
  type End = PureComponent[EndProps, js.Object, js.Any]
  
  trait EndProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object EndProps {
    
    inline def apply(): EndProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndProps]
    }
    
    extension [Self <: EndProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
