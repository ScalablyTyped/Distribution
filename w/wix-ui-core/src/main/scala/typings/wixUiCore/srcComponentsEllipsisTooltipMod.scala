package typings.wixUiCore

import typings.wixUiCore.anon.ShowTooltip
import typings.wixUiCore.srcComponentsEllipsisTooltipEllipsisTooltipMod.EllipsisTooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsEllipsisTooltipMod {
  
  @JSImport("wix-ui-core/src/components/ellipsis-tooltip", "EllipsisTooltip")
  @js.native
  class EllipsisTooltip protected ()
    extends typings.wixUiCore.srcComponentsEllipsisTooltipEllipsisTooltipMod.EllipsisTooltip {
    def this(props: EllipsisTooltipProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: EllipsisTooltipProps, context: js.Any) = this()
  }
  /* static members */
  object EllipsisTooltip {
    
    @JSImport("wix-ui-core/src/components/ellipsis-tooltip", "EllipsisTooltip")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/src/components/ellipsis-tooltip", "EllipsisTooltip.defaultProps")
    @js.native
    def defaultProps: ShowTooltip = js.native
    @scala.inline
    def defaultProps_=(x: ShowTooltip): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
