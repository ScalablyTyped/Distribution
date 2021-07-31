package typings.wixUiCore

import typings.wixUiCore.anon.PartialTooltipPropsChildren
import typings.wixUiCore.componentsTooltipTooltipMod.TooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsTooltipMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/tooltip", "Tooltip")
  @js.native
  class Tooltip protected ()
    extends typings.wixUiCore.componentsTooltipTooltipMod.Tooltip {
    def this(props: TooltipProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TooltipProps, context: js.Any) = this()
  }
  /* static members */
  object Tooltip {
    
    @JSImport("wix-ui-core/dist/standalone/src/components/tooltip", "Tooltip")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/standalone/src/components/tooltip", "Tooltip.defaultProps")
    @js.native
    def defaultProps: PartialTooltipPropsChildren = js.native
    @scala.inline
    def defaultProps_=(x: PartialTooltipPropsChildren): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/components/tooltip", "Tooltip.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
