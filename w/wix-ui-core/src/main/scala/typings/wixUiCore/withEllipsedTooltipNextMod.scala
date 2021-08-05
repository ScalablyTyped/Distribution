package typings.wixUiCore

import typings.react.mod.FunctionComponent
import typings.wixUiCore.anon.TooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withEllipsedTooltipNextMod {
  
  @JSImport("wix-ui-core/dist/src/hocs/EllipsedTooltip/withEllipsedTooltipNext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withEllipsedTooltipNext(): js.Function1[/* Comp */ js.Any, FunctionComponent[WrapperComponentProps]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withEllipsedTooltipNext")().asInstanceOf[js.Function1[/* Comp */ js.Any, FunctionComponent[WrapperComponentProps]]]
  inline def withEllipsedTooltipNext(hasShowTooltipTooltipProps: TooltipProps): js.Function1[/* Comp */ js.Any, FunctionComponent[WrapperComponentProps]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withEllipsedTooltipNext")(hasShowTooltipTooltipProps.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* Comp */ js.Any, FunctionComponent[WrapperComponentProps]]]
  
  trait WrapperComponentProps extends StObject {
    
    var showTooltip: js.UndefOr[Boolean] = js.undefined
  }
  object WrapperComponentProps {
    
    inline def apply(): WrapperComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WrapperComponentProps]
    }
    
    extension [Self <: WrapperComponentProps](x: Self) {
      
      inline def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
      
      inline def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
    }
  }
}
