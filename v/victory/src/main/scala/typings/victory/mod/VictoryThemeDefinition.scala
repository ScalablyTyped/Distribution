package typings.victory.mod

import typings.victory.AnonBorderWidth
import typings.victory.AnonBoxWidth
import typings.victory.AnonCandleColors
import typings.victory.AnonCornerRadius
import typings.victory.AnonGutter
import typings.victory.AnonStyle
import typings.victory.AnonStyleAnonAxis
import typings.victory.AnonStyleAnonDataFlyout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VictoryThemeDefinition extends js.Object {
  var area: js.UndefOr[AnonStyle with ThemeBaseProps] = js.undefined
  var axis: js.UndefOr[AnonStyleAnonAxis with ThemeBaseProps] = js.undefined
  var bar: js.UndefOr[AnonStyle with ThemeBaseProps] = js.undefined
  var boxplot: js.UndefOr[AnonBoxWidth with ThemeBaseProps] = js.undefined
  var candlestick: js.UndefOr[AnonCandleColors with ThemeBaseProps] = js.undefined
  var chart: js.UndefOr[ThemeBaseProps] = js.undefined
  var errorbar: js.UndefOr[AnonBorderWidth with ThemeBaseProps] = js.undefined
  var group: js.UndefOr[ThemeBaseProps] = js.undefined
  var legend: js.UndefOr[AnonGutter with ThemeBaseProps] = js.undefined
  var line: js.UndefOr[AnonStyle with ThemeBaseProps] = js.undefined
  var pie: js.UndefOr[AnonStyle with ThemeBaseProps] = js.undefined
  var scatter: js.UndefOr[AnonStyle with ThemeBaseProps] = js.undefined
  var stack: js.UndefOr[ThemeBaseProps] = js.undefined
  var tooltip: js.UndefOr[AnonCornerRadius] = js.undefined
  var voronoi: js.UndefOr[AnonStyleAnonDataFlyout with ThemeBaseProps] = js.undefined
}

object VictoryThemeDefinition {
  @scala.inline
  def apply(
    area: AnonStyle with ThemeBaseProps = null,
    axis: AnonStyleAnonAxis with ThemeBaseProps = null,
    bar: AnonStyle with ThemeBaseProps = null,
    boxplot: AnonBoxWidth with ThemeBaseProps = null,
    candlestick: AnonCandleColors with ThemeBaseProps = null,
    chart: ThemeBaseProps = null,
    errorbar: AnonBorderWidth with ThemeBaseProps = null,
    group: ThemeBaseProps = null,
    legend: AnonGutter with ThemeBaseProps = null,
    line: AnonStyle with ThemeBaseProps = null,
    pie: AnonStyle with ThemeBaseProps = null,
    scatter: AnonStyle with ThemeBaseProps = null,
    stack: ThemeBaseProps = null,
    tooltip: AnonCornerRadius = null,
    voronoi: AnonStyleAnonDataFlyout with ThemeBaseProps = null
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

