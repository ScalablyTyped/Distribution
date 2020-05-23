package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Graph2dOptions extends js.Object {
  var autoResize: js.UndefOr[Boolean] = js.undefined
  var barChart: js.UndefOr[Graph2dOptionBarChart] = js.undefined
  var clickToUse: js.UndefOr[Boolean] = js.undefined
  var configure: js.UndefOr[TimelineOptionsConfigureType] = js.undefined
  var dataAxis: js.UndefOr[Graph2dOptionDataAxis] = js.undefined
  var defaultGroup: js.UndefOr[String] = js.undefined
  var drawPoints: js.UndefOr[Graph2dOptionDrawPoints] = js.undefined
  var end: js.UndefOr[DateType] = js.undefined
  var format: js.UndefOr[js.Any] = js.undefined
   // TODO
  var graphHeight: js.UndefOr[HeightWidthType] = js.undefined
  var height: js.UndefOr[HeightWidthType] = js.undefined
  var hiddenDates: js.UndefOr[js.Any] = js.undefined
   // TODO
  var legend: js.UndefOr[Graph2dLegendOption] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var locales: js.UndefOr[js.Any] = js.undefined
  var max: js.UndefOr[DateType] = js.undefined
  var maxHeight: js.UndefOr[HeightWidthType] = js.undefined
  var maxMinorChars: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[DateType] = js.undefined
  var minHeight: js.UndefOr[HeightWidthType] = js.undefined
   // TODO
  var moment: js.UndefOr[MomentConstructor] = js.undefined
  var moveable: js.UndefOr[Boolean] = js.undefined
  var multiselect: js.UndefOr[Boolean] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  var sampling: js.UndefOr[Boolean] = js.undefined
  var showCurrentTime: js.UndefOr[Boolean] = js.undefined
  var showMajorLabels: js.UndefOr[Boolean] = js.undefined
  var showMinorLabels: js.UndefOr[Boolean] = js.undefined
  var sort: js.UndefOr[Boolean] = js.undefined
  var stack: js.UndefOr[Boolean] = js.undefined
  var start: js.UndefOr[DateType] = js.undefined
  var style: js.UndefOr[Graph2dStyleType] = js.undefined
  var throttleRedraw: js.UndefOr[Double] = js.undefined
  var timeAxis: js.UndefOr[TimelineTimeAxisOption] = js.undefined
  var width: js.UndefOr[HeightWidthType] = js.undefined
  var yAxisOrientation: js.UndefOr[RightLeftEnumType] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
  var zoomKey: js.UndefOr[String] = js.undefined
  var zoomMax: js.UndefOr[Double] = js.undefined
  var zoomMin: js.UndefOr[Double] = js.undefined
  var zoomable: js.UndefOr[Boolean] = js.undefined
}

object Graph2dOptions {
  @scala.inline
  def apply(
    autoResize: js.UndefOr[Boolean] = js.undefined,
    barChart: Graph2dOptionBarChart = null,
    clickToUse: js.UndefOr[Boolean] = js.undefined,
    configure: TimelineOptionsConfigureType = null,
    dataAxis: Graph2dOptionDataAxis = null,
    defaultGroup: String = null,
    drawPoints: Graph2dOptionDrawPoints = null,
    end: DateType = null,
    format: js.Any = null,
    graphHeight: HeightWidthType = null,
    height: HeightWidthType = null,
    hiddenDates: js.Any = null,
    legend: Graph2dLegendOption = null,
    locale: String = null,
    locales: js.Any = null,
    max: DateType = null,
    maxHeight: HeightWidthType = null,
    maxMinorChars: js.UndefOr[Double] = js.undefined,
    min: DateType = null,
    minHeight: HeightWidthType = null,
    moment: MomentConstructor = null,
    moveable: js.UndefOr[Boolean] = js.undefined,
    multiselect: js.UndefOr[Boolean] = js.undefined,
    orientation: String = null,
    sampling: js.UndefOr[Boolean] = js.undefined,
    showCurrentTime: js.UndefOr[Boolean] = js.undefined,
    showMajorLabels: js.UndefOr[Boolean] = js.undefined,
    showMinorLabels: js.UndefOr[Boolean] = js.undefined,
    sort: js.UndefOr[Boolean] = js.undefined,
    stack: js.UndefOr[Boolean] = js.undefined,
    start: DateType = null,
    style: Graph2dStyleType = null,
    throttleRedraw: js.UndefOr[Double] = js.undefined,
    timeAxis: TimelineTimeAxisOption = null,
    width: HeightWidthType = null,
    yAxisOrientation: RightLeftEnumType = null,
    zIndex: js.UndefOr[Double] = js.undefined,
    zoomKey: String = null,
    zoomMax: js.UndefOr[Double] = js.undefined,
    zoomMin: js.UndefOr[Double] = js.undefined,
    zoomable: js.UndefOr[Boolean] = js.undefined
  ): Graph2dOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoResize)) __obj.updateDynamic("autoResize")(autoResize.get.asInstanceOf[js.Any])
    if (barChart != null) __obj.updateDynamic("barChart")(barChart.asInstanceOf[js.Any])
    if (!js.isUndefined(clickToUse)) __obj.updateDynamic("clickToUse")(clickToUse.get.asInstanceOf[js.Any])
    if (configure != null) __obj.updateDynamic("configure")(configure.asInstanceOf[js.Any])
    if (dataAxis != null) __obj.updateDynamic("dataAxis")(dataAxis.asInstanceOf[js.Any])
    if (defaultGroup != null) __obj.updateDynamic("defaultGroup")(defaultGroup.asInstanceOf[js.Any])
    if (drawPoints != null) __obj.updateDynamic("drawPoints")(drawPoints.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (graphHeight != null) __obj.updateDynamic("graphHeight")(graphHeight.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hiddenDates != null) __obj.updateDynamic("hiddenDates")(hiddenDates.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (locales != null) __obj.updateDynamic("locales")(locales.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(maxMinorChars)) __obj.updateDynamic("maxMinorChars")(maxMinorChars.get.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (moment != null) __obj.updateDynamic("moment")(moment.asInstanceOf[js.Any])
    if (!js.isUndefined(moveable)) __obj.updateDynamic("moveable")(moveable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multiselect)) __obj.updateDynamic("multiselect")(multiselect.get.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(sampling)) __obj.updateDynamic("sampling")(sampling.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showCurrentTime)) __obj.updateDynamic("showCurrentTime")(showCurrentTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showMajorLabels)) __obj.updateDynamic("showMajorLabels")(showMajorLabels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showMinorLabels)) __obj.updateDynamic("showMinorLabels")(showMinorLabels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stack)) __obj.updateDynamic("stack")(stack.get.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(throttleRedraw)) __obj.updateDynamic("throttleRedraw")(throttleRedraw.get.asInstanceOf[js.Any])
    if (timeAxis != null) __obj.updateDynamic("timeAxis")(timeAxis.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (yAxisOrientation != null) __obj.updateDynamic("yAxisOrientation")(yAxisOrientation.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    if (zoomKey != null) __obj.updateDynamic("zoomKey")(zoomKey.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomMax)) __obj.updateDynamic("zoomMax")(zoomMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomMin)) __obj.updateDynamic("zoomMin")(zoomMin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomable)) __obj.updateDynamic("zoomable")(zoomable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graph2dOptions]
  }
}

