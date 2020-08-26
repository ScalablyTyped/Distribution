package typings.victory.mod

import typings.victory.anon.CornerRadius
import typings.victory.anon.borderWidthnumberundefine
import typings.victory.anon.gutternumberundefinedorie
import typings.victory.anon.styleaxisCSSPropertiesund
import typings.victory.anon.styledataCSSPropertiesund
import typings.victory.anon.styledataCSSPropertiesundCandleColors
import typings.victory.anon.styledataCSSPropertiesundColorScale
import typings.victory.anon.stylemaxCSSPropertiesunde
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VictoryThemeDefinition extends js.Object {
  var area: js.UndefOr[styledataCSSPropertiesund] = js.native
  var axis: js.UndefOr[styleaxisCSSPropertiesund] = js.native
  var bar: js.UndefOr[styledataCSSPropertiesund] = js.native
  var boxplot: js.UndefOr[stylemaxCSSPropertiesunde] = js.native
  var candlestick: js.UndefOr[styledataCSSPropertiesundCandleColors] = js.native
  var chart: js.UndefOr[ThemeBaseProps] = js.native
  var errorbar: js.UndefOr[borderWidthnumberundefine] = js.native
  var group: js.UndefOr[ThemeBaseProps] = js.native
  var legend: js.UndefOr[gutternumberundefinedorie] = js.native
  var line: js.UndefOr[styledataCSSPropertiesund] = js.native
  var pie: js.UndefOr[styledataCSSPropertiesund] = js.native
  var scatter: js.UndefOr[styledataCSSPropertiesund] = js.native
  var stack: js.UndefOr[ThemeBaseProps] = js.native
  var tooltip: js.UndefOr[CornerRadius] = js.native
  var voronoi: js.UndefOr[styledataCSSPropertiesundColorScale] = js.native
}

object VictoryThemeDefinition {
  @scala.inline
  def apply(): VictoryThemeDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryThemeDefinition]
  }
  @scala.inline
  implicit class VictoryThemeDefinitionOps[Self <: VictoryThemeDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArea(value: styledataCSSPropertiesund): Self = this.set("area", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArea: Self = this.set("area", js.undefined)
    @scala.inline
    def setAxis(value: styleaxisCSSPropertiesund): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    @scala.inline
    def setBar(value: styledataCSSPropertiesund): Self = this.set("bar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBar: Self = this.set("bar", js.undefined)
    @scala.inline
    def setBoxplot(value: stylemaxCSSPropertiesunde): Self = this.set("boxplot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxplot: Self = this.set("boxplot", js.undefined)
    @scala.inline
    def setCandlestick(value: styledataCSSPropertiesundCandleColors): Self = this.set("candlestick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCandlestick: Self = this.set("candlestick", js.undefined)
    @scala.inline
    def setChart(value: ThemeBaseProps): Self = this.set("chart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChart: Self = this.set("chart", js.undefined)
    @scala.inline
    def setErrorbar(value: borderWidthnumberundefine): Self = this.set("errorbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorbar: Self = this.set("errorbar", js.undefined)
    @scala.inline
    def setGroup(value: ThemeBaseProps): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setLegend(value: gutternumberundefinedorie): Self = this.set("legend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    @scala.inline
    def setLine(value: styledataCSSPropertiesund): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    @scala.inline
    def setPie(value: styledataCSSPropertiesund): Self = this.set("pie", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePie: Self = this.set("pie", js.undefined)
    @scala.inline
    def setScatter(value: styledataCSSPropertiesund): Self = this.set("scatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScatter: Self = this.set("scatter", js.undefined)
    @scala.inline
    def setStack(value: ThemeBaseProps): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
    @scala.inline
    def setTooltip(value: CornerRadius): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setVoronoi(value: styledataCSSPropertiesundColorScale): Self = this.set("voronoi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVoronoi: Self = this.set("voronoi", js.undefined)
  }
  
}

