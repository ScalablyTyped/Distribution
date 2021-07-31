package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object funnelBadgeMod {
  
  @JSImport("wix-style-react/dist/es/src/FunnelChart/FunnelBadge", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[FunnelBadgeProps, js.Object, js.Any]
  
  type FunnelBadge = PureComponent[FunnelBadgeProps, js.Object, js.Any]
  
  trait FunnelBadgeProps extends StObject {
    
    var onTooltipShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var tooltipContent: js.UndefOr[ReactNode] = js.undefined
    
    var value: String
  }
  object FunnelBadgeProps {
    
    @scala.inline
    def apply(value: String): FunnelBadgeProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunnelBadgeProps]
    }
    
    @scala.inline
    implicit class FunnelBadgePropsMutableBuilder[Self <: FunnelBadgeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnTooltipShow(value: () => Unit): Self = StObject.set(x, "onTooltipShow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnTooltipShowUndefined: Self = StObject.set(x, "onTooltipShow", js.undefined)
      
      @scala.inline
      def setTooltipContent(value: ReactNode): Self = StObject.set(x, "tooltipContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipContentUndefined: Self = StObject.set(x, "tooltipContent", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
