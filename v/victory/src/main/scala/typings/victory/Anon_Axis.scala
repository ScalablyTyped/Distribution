package typings.victory

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Axis extends js.Object {
  var axis: CSSProperties
  var axisLabel: CSSProperties
  var grid: CSSProperties
  var tickLabels: CSSProperties
  var ticks: CSSProperties
}

object Anon_Axis {
  @scala.inline
  def apply(
    axis: CSSProperties,
    axisLabel: CSSProperties,
    grid: CSSProperties,
    tickLabels: CSSProperties,
    ticks: CSSProperties
  ): Anon_Axis = {
    val __obj = js.Dynamic.literal(axis = axis, axisLabel = axisLabel, grid = grid, tickLabels = tickLabels, ticks = ticks)
  
    __obj.asInstanceOf[Anon_Axis]
  }
}

