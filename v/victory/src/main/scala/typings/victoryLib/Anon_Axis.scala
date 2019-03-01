package typings
package victoryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Axis extends js.Object {
  var axis: reactLib.reactMod.ReactNs.CSSProperties
  var axisLabel: reactLib.reactMod.ReactNs.CSSProperties
  var grid: reactLib.reactMod.ReactNs.CSSProperties
  var tickLabels: reactLib.reactMod.ReactNs.CSSProperties
  var ticks: reactLib.reactMod.ReactNs.CSSProperties
}

object Anon_Axis {
  @scala.inline
  def apply(
    axis: reactLib.reactMod.ReactNs.CSSProperties,
    axisLabel: reactLib.reactMod.ReactNs.CSSProperties,
    grid: reactLib.reactMod.ReactNs.CSSProperties,
    tickLabels: reactLib.reactMod.ReactNs.CSSProperties,
    ticks: reactLib.reactMod.ReactNs.CSSProperties
  ): Anon_Axis = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("axis")(axis)
    __obj.updateDynamic("axisLabel")(axisLabel)
    __obj.updateDynamic("grid")(grid)
    __obj.updateDynamic("tickLabels")(tickLabels)
    __obj.updateDynamic("ticks")(ticks)
    __obj.asInstanceOf[Anon_Axis]
  }
}

