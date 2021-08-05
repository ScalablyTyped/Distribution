package typings.wixUiCore.srcMod

import typings.wixUiCore.anon.PartialTooltipPropsAppendTo
import typings.wixUiCore.tooltipTooltipMod.TooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-ui-core/dist/src", "Tooltip")
@js.native
class Tooltip protected ()
  extends typings.wixUiCore.tooltipMod.Tooltip {
  def this(props: TooltipProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: TooltipProps, context: js.Any) = this()
}
/* static members */
object Tooltip {
  
  @JSImport("wix-ui-core/dist/src", "Tooltip")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/dist/src", "Tooltip.defaultProps")
  @js.native
  def defaultProps: PartialTooltipPropsAppendTo = js.native
  inline def defaultProps_=(x: PartialTooltipPropsAppendTo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-ui-core/dist/src", "Tooltip.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
