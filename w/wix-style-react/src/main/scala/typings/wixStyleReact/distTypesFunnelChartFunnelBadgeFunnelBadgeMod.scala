package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFunnelChartFunnelBadgeFunnelBadgeMod {
  
  object FunnelBadge {
    
    inline def apply(props: Any): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/FunnelChart/FunnelBadge/FunnelBadge", "FunnelBadge")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/FunnelChart/FunnelBadge/FunnelBadge", "FunnelBadge.propTypes.onTooltipShow")
      @js.native
      val onTooltipShow: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/FunnelChart/FunnelBadge/FunnelBadge", "FunnelBadge.propTypes.tooltipContent")
      @js.native
      val tooltipContent: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/FunnelChart/FunnelBadge/FunnelBadge", "FunnelBadge.propTypes.value")
      @js.native
      val value: Validator[String] = js.native
    }
  }
}
