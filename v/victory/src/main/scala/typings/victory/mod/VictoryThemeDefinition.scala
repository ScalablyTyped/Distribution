package typings.victory.mod

import typings.victory.anon.CornerRadius
import typings.victory.anon.borderWidthnumberstyledat
import typings.victory.anon.gutternumberorientationve
import typings.victory.anon.styleaxisCSSPropertiesaxi
import typings.victory.anon.styledataCSSPropertieslab
import typings.victory.anon.styledataCSSPropertieslabCandleColors
import typings.victory.anon.styledataCSSPropertieslabColorScale
import typings.victory.anon.stylemaxCSSPropertiesmaxL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VictoryThemeDefinition extends js.Object {
  var area: js.UndefOr[styledataCSSPropertieslab] = js.undefined
  var axis: js.UndefOr[styleaxisCSSPropertiesaxi] = js.undefined
  var bar: js.UndefOr[styledataCSSPropertieslab] = js.undefined
  var boxplot: js.UndefOr[stylemaxCSSPropertiesmaxL] = js.undefined
  var candlestick: js.UndefOr[styledataCSSPropertieslabCandleColors] = js.undefined
  var chart: js.UndefOr[ThemeBaseProps] = js.undefined
  var errorbar: js.UndefOr[borderWidthnumberstyledat] = js.undefined
  var group: js.UndefOr[ThemeBaseProps] = js.undefined
  var legend: js.UndefOr[gutternumberorientationve] = js.undefined
  var line: js.UndefOr[styledataCSSPropertieslab] = js.undefined
  var pie: js.UndefOr[styledataCSSPropertieslab] = js.undefined
  var scatter: js.UndefOr[styledataCSSPropertieslab] = js.undefined
  var stack: js.UndefOr[ThemeBaseProps] = js.undefined
  var tooltip: js.UndefOr[CornerRadius] = js.undefined
  var voronoi: js.UndefOr[styledataCSSPropertieslabColorScale] = js.undefined
}

object VictoryThemeDefinition {
  @scala.inline
  def apply(
    area: styledataCSSPropertieslab = null,
    axis: styleaxisCSSPropertiesaxi = null,
    bar: styledataCSSPropertieslab = null,
    boxplot: stylemaxCSSPropertiesmaxL = null,
    candlestick: styledataCSSPropertieslabCandleColors = null,
    chart: ThemeBaseProps = null,
    errorbar: borderWidthnumberstyledat = null,
    group: ThemeBaseProps = null,
    legend: gutternumberorientationve = null,
    line: styledataCSSPropertieslab = null,
    pie: styledataCSSPropertieslab = null,
    scatter: styledataCSSPropertieslab = null,
    stack: ThemeBaseProps = null,
    tooltip: CornerRadius = null,
    voronoi: styledataCSSPropertieslabColorScale = null
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

