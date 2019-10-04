package typings.victory

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Axis extends js.Object {
  var axis: js.UndefOr[CSSProperties] = js.undefined
  var axisLabel: js.UndefOr[CSSProperties] = js.undefined
  var grid: js.UndefOr[CSSProperties] = js.undefined
  var tickLabels: js.UndefOr[CSSProperties] = js.undefined
  var ticks: js.UndefOr[CSSProperties] = js.undefined
}

object Anon_Axis {
  @scala.inline
  def apply(
    axis: CSSProperties = null,
    axisLabel: CSSProperties = null,
    grid: CSSProperties = null,
    tickLabels: CSSProperties = null,
    ticks: CSSProperties = null
  ): Anon_Axis = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (axisLabel != null) __obj.updateDynamic("axisLabel")(axisLabel)
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (tickLabels != null) __obj.updateDynamic("tickLabels")(tickLabels)
    if (ticks != null) __obj.updateDynamic("ticks")(ticks)
    __obj.asInstanceOf[Anon_Axis]
  }
}

