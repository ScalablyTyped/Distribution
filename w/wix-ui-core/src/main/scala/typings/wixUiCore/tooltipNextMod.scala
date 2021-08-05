package typings.wixUiCore

import typings.wixUiCore.anon.PartialTooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipNextMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("wix-ui-core/dist/src/components/tooltip-next", "TooltipNext")
  @js.native
  class TooltipNext ()
    extends typings.wixUiCore.tooltipNextTooltipNextMod.TooltipNext
  object TooltipNext {
    
    @JSImport("wix-ui-core/dist/src/components/tooltip-next", "TooltipNext")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/src/components/tooltip-next", "TooltipNext.defaultProps")
    @js.native
    def defaultProps: PartialTooltipProps = js.native
    inline def defaultProps_=(x: PartialTooltipProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/src/components/tooltip-next", "TooltipNext.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
