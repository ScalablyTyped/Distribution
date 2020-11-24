package typings.vegaTooltip.mod

import typings.std.MouseEvent
import typings.vegaTooltip.anon.Height
import typings.vegaTooltip.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vega-tooltip", "calculatePosition")
@js.native
object calculatePosition extends js.Object {
  
  /**
    * Position the tooltip
    *
    * @param event The mouse event.
    * @param tooltipBox
    * @param offsetX Horizontal offset.
    * @param offsetY Vertical offset.
    */
  def apply(event: MouseEvent, tooltipBox: Height, offsetX: Double, offsetY: Double): X = js.native
}
