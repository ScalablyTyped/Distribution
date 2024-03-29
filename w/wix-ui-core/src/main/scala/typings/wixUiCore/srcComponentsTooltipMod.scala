package typings.wixUiCore

import typings.wixUiCore.anon.PartialTooltipPropsContent
import typings.wixUiCore.srcComponentsTooltipTooltipMod.TooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsTooltipMod {
  
  @JSImport("wix-ui-core/src/components/tooltip", "Tooltip")
  @js.native
  class Tooltip protected ()
    extends typings.wixUiCore.srcComponentsTooltipTooltipMod.Tooltip {
    def this(props: TooltipProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TooltipProps, context: js.Any) = this()
  }
  /* static members */
  object Tooltip {
    
    @JSImport("wix-ui-core/src/components/tooltip", "Tooltip")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/src/components/tooltip", "Tooltip.defaultProps")
    @js.native
    def defaultProps: PartialTooltipPropsContent = js.native
    inline def defaultProps_=(x: PartialTooltipPropsContent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/src/components/tooltip", "Tooltip.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
