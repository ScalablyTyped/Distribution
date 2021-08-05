package typings.wixStyleReact

import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object funnelLabelMod {
  
  @JSImport("wix-style-react/dist/es/src/FunnelChart/FunnelLabel", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[FunnelLabelProps, js.Object, js.Any]
  
  type FunnelLabel = PureComponent[FunnelLabelProps, js.Object, js.Any]
  
  trait FunnelLabelProps extends StObject {
    
    var label: String
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object FunnelLabelProps {
    
    inline def apply(label: String): FunnelLabelProps = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunnelLabelProps]
    }
    
    extension [Self <: FunnelLabelProps](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
