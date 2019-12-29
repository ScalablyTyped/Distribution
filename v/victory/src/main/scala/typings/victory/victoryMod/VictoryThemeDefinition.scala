package typings.victory.victoryMod

import typings.victory.Anon_BorderWidth
import typings.victory.Anon_BoxWidth
import typings.victory.Anon_CandleColors
import typings.victory.Anon_CornerRadius
import typings.victory.Anon_Gutter
import typings.victory.Anon_Style
import typings.victory.Anon_StyleAnonAxis
import typings.victory.Anon_StyleAnonDataFlyout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VictoryThemeDefinition extends js.Object {
  var area: js.UndefOr[Anon_Style with ThemeBaseProps] = js.undefined
  var axis: js.UndefOr[Anon_StyleAnonAxis with ThemeBaseProps] = js.undefined
  var bar: js.UndefOr[Anon_Style with ThemeBaseProps] = js.undefined
  var boxplot: js.UndefOr[Anon_BoxWidth with ThemeBaseProps] = js.undefined
  var candlestick: js.UndefOr[Anon_CandleColors with ThemeBaseProps] = js.undefined
  var chart: js.UndefOr[ThemeBaseProps] = js.undefined
  var errorbar: js.UndefOr[Anon_BorderWidth with ThemeBaseProps] = js.undefined
  var group: js.UndefOr[ThemeBaseProps] = js.undefined
  var legend: js.UndefOr[Anon_Gutter with ThemeBaseProps] = js.undefined
  var line: js.UndefOr[Anon_Style with ThemeBaseProps] = js.undefined
  var pie: js.UndefOr[Anon_Style with ThemeBaseProps] = js.undefined
  var scatter: js.UndefOr[Anon_Style with ThemeBaseProps] = js.undefined
  var stack: js.UndefOr[ThemeBaseProps] = js.undefined
  var tooltip: js.UndefOr[Anon_CornerRadius] = js.undefined
  var voronoi: js.UndefOr[Anon_StyleAnonDataFlyout with ThemeBaseProps] = js.undefined
}

object VictoryThemeDefinition {
  @scala.inline
  def apply(
    area: Anon_Style with ThemeBaseProps = null,
    axis: Anon_StyleAnonAxis with ThemeBaseProps = null,
    bar: Anon_Style with ThemeBaseProps = null,
    boxplot: Anon_BoxWidth with ThemeBaseProps = null,
    candlestick: Anon_CandleColors with ThemeBaseProps = null,
    chart: ThemeBaseProps = null,
    errorbar: Anon_BorderWidth with ThemeBaseProps = null,
    group: ThemeBaseProps = null,
    legend: Anon_Gutter with ThemeBaseProps = null,
    line: Anon_Style with ThemeBaseProps = null,
    pie: Anon_Style with ThemeBaseProps = null,
    scatter: Anon_Style with ThemeBaseProps = null,
    stack: ThemeBaseProps = null,
    tooltip: Anon_CornerRadius = null,
    voronoi: Anon_StyleAnonDataFlyout with ThemeBaseProps = null
  ): VictoryThemeDefinition = {
    val __obj = js.Dynamic.literal()
    if (area != null) __obj.updateDynamic("area")(area.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (bar != null) __obj.updateDynamic("bar")(bar.asInstanceOf[js.Any])
    if (boxplot != null) __obj.updateDynamic("boxplot")(boxplot.asInstanceOf[js.Any])
    if (candlestick != null) __obj.updateDynamic("candlestick")(candlestick.asInstanceOf[js.Any])
    if (chart != null) __obj.updateDynamic("chart")(chart.asInstanceOf[js.Any])
    if (errorbar != null) __obj.updateDynamic("errorbar")(errorbar.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (pie != null) __obj.updateDynamic("pie")(pie.asInstanceOf[js.Any])
    if (scatter != null) __obj.updateDynamic("scatter")(scatter.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (voronoi != null) __obj.updateDynamic("voronoi")(voronoi.asInstanceOf[js.Any])
    __obj.asInstanceOf[VictoryThemeDefinition]
  }
}

