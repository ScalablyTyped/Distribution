package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.DisplayValueLabel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFunnelChartFunnelLabelFunnelLabelMod {
  
  object FunnelLabel {
    
    inline def apply(param0: DisplayValueLabel): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/FunnelChart/FunnelLabel/FunnelLabel", "FunnelLabel")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/FunnelChart/FunnelLabel/FunnelLabel", "FunnelLabel.propTypes.displayValue")
      @js.native
      val displayValue: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/FunnelChart/FunnelLabel/FunnelLabel", "FunnelLabel.propTypes.label")
      @js.native
      val label: Validator[String] = js.native
      
      @JSImport("wix-style-react/dist/types/FunnelChart/FunnelLabel/FunnelLabel", "FunnelLabel.propTypes.value")
      @js.native
      val value: Requireable[Double] = js.native
    }
  }
}
