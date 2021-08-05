package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object centerMod {
  
  @JSImport("wix-style-react/dist/es/src/PageFooter/Center", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[CenterProps, js.Object, js.Any]
  
  type Center = PureComponent[CenterProps, js.Object, js.Any]
  
  trait CenterProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object CenterProps {
    
    inline def apply(): CenterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CenterProps]
    }
    
    extension [Self <: CenterProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
