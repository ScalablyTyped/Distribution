package typings.vis.mod

import typings.moment.mod.Moment
import typings.moment.mod.MomentFormatSpecification
import typings.moment.mod.MomentInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Graph2dOptions extends StObject {
  
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
  
  var locales: js.UndefOr[Locales] = js.undefined
  
  var max: js.UndefOr[DateType] = js.undefined
  
  var maxHeight: js.UndefOr[HeightWidthType] = js.undefined
  
  var maxMinorChars: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[DateType] = js.undefined
  
  var minHeight: js.UndefOr[HeightWidthType] = js.undefined
  
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
  def apply(): Graph2dOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Graph2dOptions]
  }
  
  @scala.inline
  implicit class Graph2dOptionsMutableBuilder[Self <: Graph2dOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoResize(value: Boolean): Self = StObject.set(x, "autoResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoResizeUndefined: Self = StObject.set(x, "autoResize", js.undefined)
    
    @scala.inline
    def setBarChart(value: Graph2dOptionBarChart): Self = StObject.set(x, "barChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarChartUndefined: Self = StObject.set(x, "barChart", js.undefined)
    
    @scala.inline
    def setClickToUse(value: Boolean): Self = StObject.set(x, "clickToUse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickToUseUndefined: Self = StObject.set(x, "clickToUse", js.undefined)
    
    @scala.inline
    def setConfigure(value: TimelineOptionsConfigureType): Self = StObject.set(x, "configure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigureFunction2(value: (/* option */ String, /* path */ js.Array[String]) => Boolean): Self = StObject.set(x, "configure", js.Any.fromFunction2(value))
    
    @scala.inline
    def setConfigureUndefined: Self = StObject.set(x, "configure", js.undefined)
    
    @scala.inline
    def setDataAxis(value: Graph2dOptionDataAxis): Self = StObject.set(x, "dataAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataAxisUndefined: Self = StObject.set(x, "dataAxis", js.undefined)
    
    @scala.inline
    def setDefaultGroup(value: String): Self = StObject.set(x, "defaultGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultGroupUndefined: Self = StObject.set(x, "defaultGroup", js.undefined)
    
    @scala.inline
    def setDrawPoints(value: Graph2dOptionDrawPoints): Self = StObject.set(x, "drawPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawPointsUndefined: Self = StObject.set(x, "drawPoints", js.undefined)
    
    @scala.inline
    def setEnd(value: DateType): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setFormat(value: js.Any): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setGraphHeight(value: HeightWidthType): Self = StObject.set(x, "graphHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphHeightUndefined: Self = StObject.set(x, "graphHeight", js.undefined)
    
    @scala.inline
    def setHeight(value: HeightWidthType): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHiddenDates(value: js.Any): Self = StObject.set(x, "hiddenDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenDatesUndefined: Self = StObject.set(x, "hiddenDates", js.undefined)
    
    @scala.inline
    def setLegend(value: Graph2dLegendOption): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setLocales(value: Locales): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
    
    @scala.inline
    def setMax(value: DateType): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeight(value: HeightWidthType): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMaxMinorChars(value: Double): Self = StObject.set(x, "maxMinorChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxMinorCharsUndefined: Self = StObject.set(x, "maxMinorChars", js.undefined)
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: DateType): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeight(value: HeightWidthType): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setMoment(value: MomentConstructor): Self = StObject.set(x, "moment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMomentFunction3(
      value: (/* inp */ js.UndefOr[MomentInput], /* format */ js.UndefOr[MomentFormatSpecification], /* strict */ js.UndefOr[Boolean]) => Moment
    ): Self = StObject.set(x, "moment", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMomentFunction4(
      value: (/* inp */ js.UndefOr[MomentInput], /* format */ js.UndefOr[MomentFormatSpecification], /* language */ js.UndefOr[String], /* strict */ js.UndefOr[Boolean]) => Moment
    ): Self = StObject.set(x, "moment", js.Any.fromFunction4(value))
    
    @scala.inline
    def setMomentUndefined: Self = StObject.set(x, "moment", js.undefined)
    
    @scala.inline
    def setMoveable(value: Boolean): Self = StObject.set(x, "moveable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveableUndefined: Self = StObject.set(x, "moveable", js.undefined)
    
    @scala.inline
    def setMultiselect(value: Boolean): Self = StObject.set(x, "multiselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiselectUndefined: Self = StObject.set(x, "multiselect", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setSampling(value: Boolean): Self = StObject.set(x, "sampling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplingUndefined: Self = StObject.set(x, "sampling", js.undefined)
    
    @scala.inline
    def setShowCurrentTime(value: Boolean): Self = StObject.set(x, "showCurrentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCurrentTimeUndefined: Self = StObject.set(x, "showCurrentTime", js.undefined)
    
    @scala.inline
    def setShowMajorLabels(value: Boolean): Self = StObject.set(x, "showMajorLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMajorLabelsUndefined: Self = StObject.set(x, "showMajorLabels", js.undefined)
    
    @scala.inline
    def setShowMinorLabels(value: Boolean): Self = StObject.set(x, "showMinorLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMinorLabelsUndefined: Self = StObject.set(x, "showMinorLabels", js.undefined)
    
    @scala.inline
    def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setStack(value: Boolean): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    @scala.inline
    def setStart(value: DateType): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setStyle(value: Graph2dStyleType): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setThrottleRedraw(value: Double): Self = StObject.set(x, "throttleRedraw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrottleRedrawUndefined: Self = StObject.set(x, "throttleRedraw", js.undefined)
    
    @scala.inline
    def setTimeAxis(value: TimelineTimeAxisOption): Self = StObject.set(x, "timeAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeAxisUndefined: Self = StObject.set(x, "timeAxis", js.undefined)
    
    @scala.inline
    def setWidth(value: HeightWidthType): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setYAxisOrientation(value: RightLeftEnumType): Self = StObject.set(x, "yAxisOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisOrientationUndefined: Self = StObject.set(x, "yAxisOrientation", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    
    @scala.inline
    def setZoomKey(value: String): Self = StObject.set(x, "zoomKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomKeyUndefined: Self = StObject.set(x, "zoomKey", js.undefined)
    
    @scala.inline
    def setZoomMax(value: Double): Self = StObject.set(x, "zoomMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomMaxUndefined: Self = StObject.set(x, "zoomMax", js.undefined)
    
    @scala.inline
    def setZoomMin(value: Double): Self = StObject.set(x, "zoomMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomMinUndefined: Self = StObject.set(x, "zoomMin", js.undefined)
    
    @scala.inline
    def setZoomable(value: Boolean): Self = StObject.set(x, "zoomable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomableUndefined: Self = StObject.set(x, "zoomable", js.undefined)
  }
}
