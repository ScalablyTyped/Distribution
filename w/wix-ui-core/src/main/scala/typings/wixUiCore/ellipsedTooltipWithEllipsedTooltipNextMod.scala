package typings.wixUiCore

import typings.react.mod.FunctionComponent
import typings.wixUiCore.anon.TooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ellipsedTooltipWithEllipsedTooltipNextMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/hocs/EllipsedTooltip/withEllipsedTooltipNext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def withEllipsedTooltipNext(): js.Function1[/* Comp */ js.Any, FunctionComponent[WrapperComponentProps]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withEllipsedTooltipNext")().asInstanceOf[js.Function1[/* Comp */ js.Any, FunctionComponent[WrapperComponentProps]]]
  @scala.inline
  def withEllipsedTooltipNext(hasShowTooltipTooltipProps: TooltipProps): js.Function1[/* Comp */ js.Any, FunctionComponent[WrapperComponentProps]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withEllipsedTooltipNext")(hasShowTooltipTooltipProps.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* Comp */ js.Any, FunctionComponent[WrapperComponentProps]]]
  
  trait WrapperComponentProps extends StObject {
    
    var showTooltip: js.UndefOr[Boolean] = js.undefined
  }
  object WrapperComponentProps {
    
    @scala.inline
    def apply(): WrapperComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WrapperComponentProps]
    }
    
    @scala.inline
    implicit class WrapperComponentPropsMutableBuilder[Self <: WrapperComponentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
    }
  }
}
