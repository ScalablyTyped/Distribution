package typings.vegaTooltip

import typings.std.MouseEvent
import typings.vegaTooltip.anon.Height
import typings.vegaTooltip.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-tooltip/build/src/position", JSImport.Namespace)
@js.native
object positionMod extends js.Object {
  def calculatePosition(event: MouseEvent, tooltipBox: Height, offsetX: Double, offsetY: Double): X = js.native
}

