package typings.vis.mod

import typings.moment.mod.Moment
import typings.moment.mod.MomentFormatSpecification
import typings.moment.mod.MomentInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Graph2dOptions extends js.Object {
  
  var autoResize: js.UndefOr[Boolean] = js.native
  
  var barChart: js.UndefOr[Graph2dOptionBarChart] = js.native
  
  var clickToUse: js.UndefOr[Boolean] = js.native
  
  var configure: js.UndefOr[TimelineOptionsConfigureType] = js.native
  
  var dataAxis: js.UndefOr[Graph2dOptionDataAxis] = js.native
  
  var defaultGroup: js.UndefOr[String] = js.native
  
  var drawPoints: js.UndefOr[Graph2dOptionDrawPoints] = js.native
  
  var end: js.UndefOr[DateType] = js.native
  
  var format: js.UndefOr[js.Any] = js.native
  
   // TODO
  var graphHeight: js.UndefOr[HeightWidthType] = js.native
  
  var height: js.UndefOr[HeightWidthType] = js.native
  
  var hiddenDates: js.UndefOr[js.Any] = js.native
  
   // TODO
  var legend: js.UndefOr[Graph2dLegendOption] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var locales: js.UndefOr[Locales] = js.native
  
  var max: js.UndefOr[DateType] = js.native
  
  var maxHeight: js.UndefOr[HeightWidthType] = js.native
  
  var maxMinorChars: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[DateType] = js.native
  
  var minHeight: js.UndefOr[HeightWidthType] = js.native
  
  var moment: js.UndefOr[MomentConstructor] = js.native
  
  var moveable: js.UndefOr[Boolean] = js.native
  
  var multiselect: js.UndefOr[Boolean] = js.native
  
  var orientation: js.UndefOr[String] = js.native
  
  var sampling: js.UndefOr[Boolean] = js.native
  
  var showCurrentTime: js.UndefOr[Boolean] = js.native
  
  var showMajorLabels: js.UndefOr[Boolean] = js.native
  
  var showMinorLabels: js.UndefOr[Boolean] = js.native
  
  var sort: js.UndefOr[Boolean] = js.native
  
  var stack: js.UndefOr[Boolean] = js.native
  
  var start: js.UndefOr[DateType] = js.native
  
  var style: js.UndefOr[Graph2dStyleType] = js.native
  
  var throttleRedraw: js.UndefOr[Double] = js.native
  
  var timeAxis: js.UndefOr[TimelineTimeAxisOption] = js.native
  
  var width: js.UndefOr[HeightWidthType] = js.native
  
  var yAxisOrientation: js.UndefOr[RightLeftEnumType] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
  
  var zoomKey: js.UndefOr[String] = js.native
  
  var zoomMax: js.UndefOr[Double] = js.native
  
  var zoomMin: js.UndefOr[Double] = js.native
  
  var zoomable: js.UndefOr[Boolean] = js.native
}
object Graph2dOptions {
  
  @scala.inline
  def apply(): Graph2dOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Graph2dOptions]
  }
  
  @scala.inline
  implicit class Graph2dOptionsOps[Self <: Graph2dOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoResize(value: Boolean): Self = this.set("autoResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoResize: Self = this.set("autoResize", js.undefined)
    
    @scala.inline
    def setBarChart(value: Graph2dOptionBarChart): Self = this.set("barChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarChart: Self = this.set("barChart", js.undefined)
    
    @scala.inline
    def setClickToUse(value: Boolean): Self = this.set("clickToUse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickToUse: Self = this.set("clickToUse", js.undefined)
    
    @scala.inline
    def setConfigureFunction2(value: (/* option */ String, /* path */ js.Array[String]) => Boolean): Self = this.set("configure", js.Any.fromFunction2(value))
    
    @scala.inline
    def setConfigure(value: TimelineOptionsConfigureType): Self = this.set("configure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigure: Self = this.set("configure", js.undefined)
    
    @scala.inline
    def setDataAxis(value: Graph2dOptionDataAxis): Self = this.set("dataAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataAxis: Self = this.set("dataAxis", js.undefined)
    
    @scala.inline
    def setDefaultGroup(value: String): Self = this.set("defaultGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultGroup: Self = this.set("defaultGroup", js.undefined)
    
    @scala.inline
    def setDrawPoints(value: Graph2dOptionDrawPoints): Self = this.set("drawPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawPoints: Self = this.set("drawPoints", js.undefined)
    
    @scala.inline
    def setEnd(value: DateType): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setFormat(value: js.Any): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setGraphHeight(value: HeightWidthType): Self = this.set("graphHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGraphHeight: Self = this.set("graphHeight", js.undefined)
    
    @scala.inline
    def setHeight(value: HeightWidthType): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHiddenDates(value: js.Any): Self = this.set("hiddenDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenDates: Self = this.set("hiddenDates", js.undefined)
    
    @scala.inline
    def setLegend(value: Graph2dLegendOption): Self = this.set("legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setLocales(value: Locales): Self = this.set("locales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocales: Self = this.set("locales", js.undefined)
    
    @scala.inline
    def setMax(value: DateType): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: HeightWidthType): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMaxMinorChars(value: Double): Self = this.set("maxMinorChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxMinorChars: Self = this.set("maxMinorChars", js.undefined)
    
    @scala.inline
    def setMin(value: DateType): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setMinHeight(value: HeightWidthType): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    
    @scala.inline
    def setMomentFunction4(
      value: (/* inp */ js.UndefOr[MomentInput], /* format */ js.UndefOr[MomentFormatSpecification], /* language */ js.UndefOr[String], /* strict */ js.UndefOr[Boolean]) => Moment
    ): Self = this.set("moment", js.Any.fromFunction4(value))
    
    @scala.inline
    def setMomentFunction3(
      value: (/* inp */ js.UndefOr[MomentInput], /* format */ js.UndefOr[MomentFormatSpecification], /* strict */ js.UndefOr[Boolean]) => Moment
    ): Self = this.set("moment", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMoment(value: MomentConstructor): Self = this.set("moment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoment: Self = this.set("moment", js.undefined)
    
    @scala.inline
    def setMoveable(value: Boolean): Self = this.set("moveable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoveable: Self = this.set("moveable", js.undefined)
    
    @scala.inline
    def setMultiselect(value: Boolean): Self = this.set("multiselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiselect: Self = this.set("multiselect", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setSampling(value: Boolean): Self = this.set("sampling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampling: Self = this.set("sampling", js.undefined)
    
    @scala.inline
    def setShowCurrentTime(value: Boolean): Self = this.set("showCurrentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCurrentTime: Self = this.set("showCurrentTime", js.undefined)
    
    @scala.inline
    def setShowMajorLabels(value: Boolean): Self = this.set("showMajorLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMajorLabels: Self = this.set("showMajorLabels", js.undefined)
    
    @scala.inline
    def setShowMinorLabels(value: Boolean): Self = this.set("showMinorLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMinorLabels: Self = this.set("showMinorLabels", js.undefined)
    
    @scala.inline
    def setSort(value: Boolean): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setStack(value: Boolean): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
    
    @scala.inline
    def setStart(value: DateType): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setStyle(value: Graph2dStyleType): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setThrottleRedraw(value: Double): Self = this.set("throttleRedraw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrottleRedraw: Self = this.set("throttleRedraw", js.undefined)
    
    @scala.inline
    def setTimeAxis(value: TimelineTimeAxisOption): Self = this.set("timeAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeAxis: Self = this.set("timeAxis", js.undefined)
    
    @scala.inline
    def setWidth(value: HeightWidthType): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setYAxisOrientation(value: RightLeftEnumType): Self = this.set("yAxisOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisOrientation: Self = this.set("yAxisOrientation", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
    
    @scala.inline
    def setZoomKey(value: String): Self = this.set("zoomKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomKey: Self = this.set("zoomKey", js.undefined)
    
    @scala.inline
    def setZoomMax(value: Double): Self = this.set("zoomMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomMax: Self = this.set("zoomMax", js.undefined)
    
    @scala.inline
    def setZoomMin(value: Double): Self = this.set("zoomMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomMin: Self = this.set("zoomMin", js.undefined)
    
    @scala.inline
    def setZoomable(value: Boolean): Self = this.set("zoomable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomable: Self = this.set("zoomable", js.undefined)
  }
}
