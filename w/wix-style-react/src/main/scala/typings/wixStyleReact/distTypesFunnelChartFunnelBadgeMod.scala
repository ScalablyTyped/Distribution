package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFunnelChartFunnelBadgeMod {
  
  @JSImport("wix-style-react/dist/types/FunnelChart/FunnelBadge", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[FunnelBadgeProps, js.Object, Any]
  
  type FunnelBadge = PureComponent[FunnelBadgeProps, js.Object, Any]
  
  trait FunnelBadgeProps extends StObject {
    
    var onTooltipShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var tooltipContent: js.UndefOr[ReactNode] = js.undefined
    
    var value: String
  }
  object FunnelBadgeProps {
    
    inline def apply(value: String): FunnelBadgeProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunnelBadgeProps]
    }
    
    extension [Self <: FunnelBadgeProps](x: Self) {
      
      inline def setOnTooltipShow(value: () => Unit): Self = StObject.set(x, "onTooltipShow", js.Any.fromFunction0(value))
      
      inline def setOnTooltipShowUndefined: Self = StObject.set(x, "onTooltipShow", js.undefined)
      
      inline def setTooltipContent(value: ReactNode): Self = StObject.set(x, "tooltipContent", value.asInstanceOf[js.Any])
      
      inline def setTooltipContentUndefined: Self = StObject.set(x, "tooltipContent", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
