package typings.victory.victoryMod

import typings.victory.Anon_Axis
import typings.victory.Anon_ColorScale
import typings.victory.Anon_Props
import typings.victory.Anon_PropsStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VictoryThemeDefinition extends js.Object {
  var area: js.UndefOr[VictoryStyleInterface] = js.undefined
  var axis: js.UndefOr[Anon_Axis] = js.undefined
  var bar: js.UndefOr[VictoryStyleInterface] = js.undefined
  var candlestick: js.UndefOr[VictoryStyleInterface with Anon_Props] = js.undefined
  var line: js.UndefOr[VictoryStyleInterface] = js.undefined
  var pie: js.UndefOr[Anon_PropsStyle] = js.undefined
  var props: js.UndefOr[Anon_ColorScale] = js.undefined
  var scatter: js.UndefOr[VictoryStyleInterface] = js.undefined
}

object VictoryThemeDefinition {
  @scala.inline
  def apply(
    area: VictoryStyleInterface = null,
    axis: Anon_Axis = null,
    bar: VictoryStyleInterface = null,
    candlestick: VictoryStyleInterface with Anon_Props = null,
    line: VictoryStyleInterface = null,
    pie: Anon_PropsStyle = null,
    props: Anon_ColorScale = null,
    scatter: VictoryStyleInterface = null
  ): VictoryThemeDefinition = {
    val __obj = js.Dynamic.literal()
    if (area != null) __obj.updateDynamic("area")(area)
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (bar != null) __obj.updateDynamic("bar")(bar)
    if (candlestick != null) __obj.updateDynamic("candlestick")(candlestick)
    if (line != null) __obj.updateDynamic("line")(line)
    if (pie != null) __obj.updateDynamic("pie")(pie)
    if (props != null) __obj.updateDynamic("props")(props)
    if (scatter != null) __obj.updateDynamic("scatter")(scatter)
    __obj.asInstanceOf[VictoryThemeDefinition]
  }
}

