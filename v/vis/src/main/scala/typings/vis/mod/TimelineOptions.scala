package typings.vis.mod

import typings.moment.mod.Moment
import typings.moment.mod.MomentFormatSpecification
import typings.moment.mod.MomentInput
import typings.std.Date
import typings.vis.anon.Template
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineOptions extends js.Object {
  var align: js.UndefOr[TimelineAlignType] = js.native
  var autoResize: js.UndefOr[Boolean] = js.native
  var clickToUse: js.UndefOr[Boolean] = js.native
  var configure: js.UndefOr[TimelineOptionsConfigureType] = js.native
  var dataAttributes: js.UndefOr[TimelineOptionsDataAttributesType] = js.native
  var editable: js.UndefOr[TimelineOptionsEditableType] = js.native
  var end: js.UndefOr[DateType] = js.native
  var format: js.UndefOr[TimelineFormatOption] = js.native
  var groupEditable: js.UndefOr[TimelineOptionsGroupEditableType] = js.native
  var groupOrder: js.UndefOr[TimelineOptionsGroupOrderType] = js.native
  var groupOrderSwap: js.UndefOr[TimelineOptionsGroupOrderSwapFunction] = js.native
  var groupTemplate: js.UndefOr[TimelineOptionsTemplateFunction] = js.native
  var height: js.UndefOr[HeightWidthType] = js.native
  var hiddenDates: js.UndefOr[TimelineOptionsHiddenDatesType] = js.native
  var horizontalScroll: js.UndefOr[Boolean] = js.native
  var itemsAlwaysDraggable: js.UndefOr[TimelineOptionsItemsAlwaysDraggableType] = js.native
  var locale: js.UndefOr[String] = js.native
  var locales: js.UndefOr[js.Any] = js.native
  var margin: js.UndefOr[TimelineOptionsMarginType] = js.native
  var max: js.UndefOr[DateType] = js.native
  var maxHeight: js.UndefOr[HeightWidthType] = js.native
  var maxMinorChars: js.UndefOr[Double] = js.native
  var min: js.UndefOr[DateType] = js.native
  var minHeight: js.UndefOr[HeightWidthType] = js.native
   // TODO
  var moment: js.UndefOr[MomentConstructor] = js.native
  var moveable: js.UndefOr[Boolean] = js.native
  var multiselect: js.UndefOr[Boolean] = js.native
  var multiselectPerGroup: js.UndefOr[Boolean] = js.native
  var onAdd: js.UndefOr[TimelineOptionsItemCallbackFunction] = js.native
  var onAddGroup: js.UndefOr[TimelineOptionsGroupCallbackFunction] = js.native
  var onInitialDrawComplete: js.UndefOr[js.Function0[Unit]] = js.native
  var onMove: js.UndefOr[TimelineOptionsItemCallbackFunction] = js.native
  var onMoveGroup: js.UndefOr[TimelineOptionsGroupCallbackFunction] = js.native
  var onMoving: js.UndefOr[TimelineOptionsItemCallbackFunction] = js.native
  var onRemove: js.UndefOr[TimelineOptionsItemCallbackFunction] = js.native
  var onRemoveGroup: js.UndefOr[TimelineOptionsGroupCallbackFunction] = js.native
  var onUpdate: js.UndefOr[TimelineOptionsItemCallbackFunction] = js.native
  var order: js.UndefOr[TimelineOptionsComparisonFunction] = js.native
  var orientation: js.UndefOr[TimelineOptionsOrientationType] = js.native
  var rollingMode: js.UndefOr[TimelineRollingModeOption] = js.native
  var rtl: js.UndefOr[Boolean] = js.native
  var selectable: js.UndefOr[Boolean] = js.native
  var showCurrentTime: js.UndefOr[Boolean] = js.native
  var showMajorLabels: js.UndefOr[Boolean] = js.native
  var showMinorLabels: js.UndefOr[Boolean] = js.native
  var showTooltips: js.UndefOr[Boolean] = js.native
  var snap: js.UndefOr[TimelineOptionsSnapFunction] = js.native
  var stack: js.UndefOr[Boolean] = js.native
  var stackSubgroups: js.UndefOr[Boolean] = js.native
  var start: js.UndefOr[DateType] = js.native
  var template: js.UndefOr[TimelineOptionsTemplateFunction] = js.native
  var throttleRedraw: js.UndefOr[Double] = js.native
  var timeAxis: js.UndefOr[TimelineTimeAxisOption] = js.native
  var tooltip: js.UndefOr[TimelineTooltipOption] = js.native
  var tooltipOnItemUpdateTime: js.UndefOr[Boolean | Template] = js.native
  var `type`: js.UndefOr[String] = js.native
  var verticalScroll: js.UndefOr[Boolean] = js.native
  var visibleFrameTemplate: js.UndefOr[TimelineOptionsTemplateFunction] = js.native
  var width: js.UndefOr[HeightWidthType] = js.native
  var zoomKey: js.UndefOr[String] = js.native
  var zoomMax: js.UndefOr[Double] = js.native
  var zoomMin: js.UndefOr[Double] = js.native
  var zoomable: js.UndefOr[Boolean] = js.native
}

object TimelineOptions {
  @scala.inline
  def apply(): TimelineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineOptions]
  }
  @scala.inline
  implicit class TimelineOptionsOps[Self <: TimelineOptions] (val x: Self) extends AnyVal {
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
    def setAlign(value: TimelineAlignType): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setAutoResize(value: Boolean): Self = this.set("autoResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoResize: Self = this.set("autoResize", js.undefined)
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
    def setDataAttributesVarargs(value: String*): Self = this.set("dataAttributes", js.Array(value :_*))
    @scala.inline
    def setDataAttributes(value: TimelineOptionsDataAttributesType): Self = this.set("dataAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataAttributes: Self = this.set("dataAttributes", js.undefined)
    @scala.inline
    def setEditable(value: TimelineOptionsEditableType): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    @scala.inline
    def setEnd(value: DateType): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setFormat(value: TimelineFormatOption): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setGroupEditable(value: TimelineOptionsGroupEditableType): Self = this.set("groupEditable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupEditable: Self = this.set("groupEditable", js.undefined)
    @scala.inline
    def setGroupOrderFunction2(value: (/* a */ js.Any, /* b */ js.Any) => Double): Self = this.set("groupOrder", js.Any.fromFunction2(value))
    @scala.inline
    def setGroupOrder(value: TimelineOptionsGroupOrderType): Self = this.set("groupOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupOrder: Self = this.set("groupOrder", js.undefined)
    @scala.inline
    def setGroupOrderSwap(value: (/* fromGroup */ js.Any, /* toGroup */ js.Any, /* groups */ DataSet[DataGroup]) => Unit): Self = this.set("groupOrderSwap", js.Any.fromFunction3(value))
    @scala.inline
    def deleteGroupOrderSwap: Self = this.set("groupOrderSwap", js.undefined)
    @scala.inline
    def setGroupTemplate(
      value: (/* item */ js.UndefOr[js.Any], /* element */ js.UndefOr[js.Any], /* data */ js.UndefOr[js.Any]) => String
    ): Self = this.set("groupTemplate", js.Any.fromFunction3(value))
    @scala.inline
    def deleteGroupTemplate: Self = this.set("groupTemplate", js.undefined)
    @scala.inline
    def setHeight(value: HeightWidthType): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHiddenDatesVarargs(value: TimelineHiddenDateOption*): Self = this.set("hiddenDates", js.Array(value :_*))
    @scala.inline
    def setHiddenDates(value: TimelineOptionsHiddenDatesType): Self = this.set("hiddenDates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHiddenDates: Self = this.set("hiddenDates", js.undefined)
    @scala.inline
    def setHorizontalScroll(value: Boolean): Self = this.set("horizontalScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalScroll: Self = this.set("horizontalScroll", js.undefined)
    @scala.inline
    def setItemsAlwaysDraggable(value: TimelineOptionsItemsAlwaysDraggableType): Self = this.set("itemsAlwaysDraggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemsAlwaysDraggable: Self = this.set("itemsAlwaysDraggable", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setLocales(value: js.Any): Self = this.set("locales", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocales: Self = this.set("locales", js.undefined)
    @scala.inline
    def setMargin(value: TimelineOptionsMarginType): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
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
    def setMultiselectPerGroup(value: Boolean): Self = this.set("multiselectPerGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiselectPerGroup: Self = this.set("multiselectPerGroup", js.undefined)
    @scala.inline
    def setOnAdd(
      value: (/* item */ TimelineItem, /* callback */ js.Function1[/* item */ TimelineItem | Null, Unit]) => Unit
    ): Self = this.set("onAdd", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnAdd: Self = this.set("onAdd", js.undefined)
    @scala.inline
    def setOnAddGroup(
      value: (/* group */ TimelineGroup, /* callback */ js.Function1[/* group */ TimelineGroup | Null, Unit]) => Unit
    ): Self = this.set("onAddGroup", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnAddGroup: Self = this.set("onAddGroup", js.undefined)
    @scala.inline
    def setOnInitialDrawComplete(value: () => Unit): Self = this.set("onInitialDrawComplete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnInitialDrawComplete: Self = this.set("onInitialDrawComplete", js.undefined)
    @scala.inline
    def setOnMove(
      value: (/* item */ TimelineItem, /* callback */ js.Function1[/* item */ TimelineItem | Null, Unit]) => Unit
    ): Self = this.set("onMove", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnMove: Self = this.set("onMove", js.undefined)
    @scala.inline
    def setOnMoveGroup(
      value: (/* group */ TimelineGroup, /* callback */ js.Function1[/* group */ TimelineGroup | Null, Unit]) => Unit
    ): Self = this.set("onMoveGroup", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnMoveGroup: Self = this.set("onMoveGroup", js.undefined)
    @scala.inline
    def setOnMoving(
      value: (/* item */ TimelineItem, /* callback */ js.Function1[/* item */ TimelineItem | Null, Unit]) => Unit
    ): Self = this.set("onMoving", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnMoving: Self = this.set("onMoving", js.undefined)
    @scala.inline
    def setOnRemove(
      value: (/* item */ TimelineItem, /* callback */ js.Function1[/* item */ TimelineItem | Null, Unit]) => Unit
    ): Self = this.set("onRemove", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRemove: Self = this.set("onRemove", js.undefined)
    @scala.inline
    def setOnRemoveGroup(
      value: (/* group */ TimelineGroup, /* callback */ js.Function1[/* group */ TimelineGroup | Null, Unit]) => Unit
    ): Self = this.set("onRemoveGroup", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRemoveGroup: Self = this.set("onRemoveGroup", js.undefined)
    @scala.inline
    def setOnUpdate(
      value: (/* item */ TimelineItem, /* callback */ js.Function1[/* item */ TimelineItem | Null, Unit]) => Unit
    ): Self = this.set("onUpdate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
    @scala.inline
    def setOrder(value: (/* a */ js.Any, /* b */ js.Any) => Double): Self = this.set("order", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setOrientation(value: TimelineOptionsOrientationType): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setRollingMode(value: TimelineRollingModeOption): Self = this.set("rollingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRollingMode: Self = this.set("rollingMode", js.undefined)
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRtl: Self = this.set("rtl", js.undefined)
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
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
    def setShowTooltips(value: Boolean): Self = this.set("showTooltips", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTooltips: Self = this.set("showTooltips", js.undefined)
    @scala.inline
    def setSnap(value: (/* date */ Date, /* scale */ String, /* step */ Double) => Date | Double): Self = this.set("snap", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSnap: Self = this.set("snap", js.undefined)
    @scala.inline
    def setStack(value: Boolean): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
    @scala.inline
    def setStackSubgroups(value: Boolean): Self = this.set("stackSubgroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackSubgroups: Self = this.set("stackSubgroups", js.undefined)
    @scala.inline
    def setStart(value: DateType): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setTemplate(
      value: (/* item */ js.UndefOr[js.Any], /* element */ js.UndefOr[js.Any], /* data */ js.UndefOr[js.Any]) => String
    ): Self = this.set("template", js.Any.fromFunction3(value))
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setThrottleRedraw(value: Double): Self = this.set("throttleRedraw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrottleRedraw: Self = this.set("throttleRedraw", js.undefined)
    @scala.inline
    def setTimeAxis(value: TimelineTimeAxisOption): Self = this.set("timeAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeAxis: Self = this.set("timeAxis", js.undefined)
    @scala.inline
    def setTooltip(value: TimelineTooltipOption): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTooltipOnItemUpdateTime(value: Boolean | Template): Self = this.set("tooltipOnItemUpdateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipOnItemUpdateTime: Self = this.set("tooltipOnItemUpdateTime", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVerticalScroll(value: Boolean): Self = this.set("verticalScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalScroll: Self = this.set("verticalScroll", js.undefined)
    @scala.inline
    def setVisibleFrameTemplate(
      value: (/* item */ js.UndefOr[js.Any], /* element */ js.UndefOr[js.Any], /* data */ js.UndefOr[js.Any]) => String
    ): Self = this.set("visibleFrameTemplate", js.Any.fromFunction3(value))
    @scala.inline
    def deleteVisibleFrameTemplate: Self = this.set("visibleFrameTemplate", js.undefined)
    @scala.inline
    def setWidth(value: HeightWidthType): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
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

