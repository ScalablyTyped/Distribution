package typings.vis.mod

import typings.moment.mod.Moment
import typings.moment.mod.MomentFormatSpecification
import typings.moment.mod.MomentInput
import typings.std.Date
import typings.vis.anon.Template
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineOptions extends StObject {
  
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
  
  var locales: js.UndefOr[Locales] = js.native
  
  var margin: js.UndefOr[TimelineOptionsMarginType] = js.native
  
  var max: js.UndefOr[DateType] = js.native
  
  var maxHeight: js.UndefOr[HeightWidthType] = js.native
  
  var maxMinorChars: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[DateType] = js.native
  
  var minHeight: js.UndefOr[HeightWidthType] = js.native
  
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
  implicit class TimelineOptionsMutableBuilder[Self <: TimelineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: TimelineAlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setAutoResize(value: Boolean): Self = StObject.set(x, "autoResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoResizeUndefined: Self = StObject.set(x, "autoResize", js.undefined)
    
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
    def setDataAttributes(value: TimelineOptionsDataAttributesType): Self = StObject.set(x, "dataAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataAttributesUndefined: Self = StObject.set(x, "dataAttributes", js.undefined)
    
    @scala.inline
    def setDataAttributesVarargs(value: String*): Self = StObject.set(x, "dataAttributes", js.Array(value :_*))
    
    @scala.inline
    def setEditable(value: TimelineOptionsEditableType): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    @scala.inline
    def setEnd(value: DateType): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setFormat(value: TimelineFormatOption): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setGroupEditable(value: TimelineOptionsGroupEditableType): Self = StObject.set(x, "groupEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupEditableUndefined: Self = StObject.set(x, "groupEditable", js.undefined)
    
    @scala.inline
    def setGroupOrder(value: TimelineOptionsGroupOrderType): Self = StObject.set(x, "groupOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupOrderFunction2(value: (/* a */ js.Any, /* b */ js.Any) => Double): Self = StObject.set(x, "groupOrder", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGroupOrderSwap(value: (/* fromGroup */ js.Any, /* toGroup */ js.Any, /* groups */ DataSet[DataGroup]) => Unit): Self = StObject.set(x, "groupOrderSwap", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGroupOrderSwapUndefined: Self = StObject.set(x, "groupOrderSwap", js.undefined)
    
    @scala.inline
    def setGroupOrderUndefined: Self = StObject.set(x, "groupOrder", js.undefined)
    
    @scala.inline
    def setGroupTemplate(
      value: (/* item */ js.UndefOr[js.Any], /* element */ js.UndefOr[js.Any], /* data */ js.UndefOr[js.Any]) => String
    ): Self = StObject.set(x, "groupTemplate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGroupTemplateUndefined: Self = StObject.set(x, "groupTemplate", js.undefined)
    
    @scala.inline
    def setHeight(value: HeightWidthType): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHiddenDates(value: TimelineOptionsHiddenDatesType): Self = StObject.set(x, "hiddenDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenDatesUndefined: Self = StObject.set(x, "hiddenDates", js.undefined)
    
    @scala.inline
    def setHiddenDatesVarargs(value: TimelineHiddenDateOption*): Self = StObject.set(x, "hiddenDates", js.Array(value :_*))
    
    @scala.inline
    def setHorizontalScroll(value: Boolean): Self = StObject.set(x, "horizontalScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalScrollUndefined: Self = StObject.set(x, "horizontalScroll", js.undefined)
    
    @scala.inline
    def setItemsAlwaysDraggable(value: TimelineOptionsItemsAlwaysDraggableType): Self = StObject.set(x, "itemsAlwaysDraggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsAlwaysDraggableUndefined: Self = StObject.set(x, "itemsAlwaysDraggable", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setLocales(value: Locales): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
    
    @scala.inline
    def setMargin(value: TimelineOptionsMarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
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
    def setMultiselectPerGroup(value: Boolean): Self = StObject.set(x, "multiselectPerGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiselectPerGroupUndefined: Self = StObject.set(x, "multiselectPerGroup", js.undefined)
    
    @scala.inline
    def setMultiselectUndefined: Self = StObject.set(x, "multiselect", js.undefined)
    
    @scala.inline
    def setOnAdd(
      value: (/* item */ TimelineItem, /* callback */ js.Function1[/* item */ TimelineItem | Null, Unit]) => Unit
    ): Self = StObject.set(x, "onAdd", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnAddGroup(
      value: (/* group */ TimelineGroup, /* callback */ js.Function1[/* group */ TimelineGroup | Null, Unit]) => Unit
    ): Self = StObject.set(x, "onAddGroup", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnAddGroupUndefined: Self = StObject.set(x, "onAddGroup", js.undefined)
    
    @scala.inline
    def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
    
    @scala.inline
    def setOnInitialDrawComplete(value: () => Unit): Self = StObject.set(x, "onInitialDrawComplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnInitialDrawCompleteUndefined: Self = StObject.set(x, "onInitialDrawComplete", js.undefined)
    
    @scala.inline
    def setOnMove(
      value: (/* item */ TimelineItem, /* callback */ js.Function1[/* item */ TimelineItem | Null, Unit]) => Unit
    ): Self = StObject.set(x, "onMove", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnMoveGroup(
      value: (/* group */ TimelineGroup, /* callback */ js.Function1[/* group */ TimelineGroup | Null, Unit]) => Unit
    ): Self = StObject.set(x, "onMoveGroup", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnMoveGroupUndefined: Self = StObject.set(x, "onMoveGroup", js.undefined)
    
    @scala.inline
    def setOnMoveUndefined: Self = StObject.set(x, "onMove", js.undefined)
    
    @scala.inline
    def setOnMoving(
      value: (/* item */ TimelineItem, /* callback */ js.Function1[/* item */ TimelineItem | Null, Unit]) => Unit
    ): Self = StObject.set(x, "onMoving", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnMovingUndefined: Self = StObject.set(x, "onMoving", js.undefined)
    
    @scala.inline
    def setOnRemove(
      value: (/* item */ TimelineItem, /* callback */ js.Function1[/* item */ TimelineItem | Null, Unit]) => Unit
    ): Self = StObject.set(x, "onRemove", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRemoveGroup(
      value: (/* group */ TimelineGroup, /* callback */ js.Function1[/* group */ TimelineGroup | Null, Unit]) => Unit
    ): Self = StObject.set(x, "onRemoveGroup", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRemoveGroupUndefined: Self = StObject.set(x, "onRemoveGroup", js.undefined)
    
    @scala.inline
    def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
    
    @scala.inline
    def setOnUpdate(
      value: (/* item */ TimelineItem, /* callback */ js.Function1[/* item */ TimelineItem | Null, Unit]) => Unit
    ): Self = StObject.set(x, "onUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
    
    @scala.inline
    def setOrder(value: (/* a */ js.Any, /* b */ js.Any) => Double): Self = StObject.set(x, "order", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setOrientation(value: TimelineOptionsOrientationType): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setRollingMode(value: TimelineRollingModeOption): Self = StObject.set(x, "rollingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollingModeUndefined: Self = StObject.set(x, "rollingMode", js.undefined)
    
    @scala.inline
    def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
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
    def setShowTooltips(value: Boolean): Self = StObject.set(x, "showTooltips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTooltipsUndefined: Self = StObject.set(x, "showTooltips", js.undefined)
    
    @scala.inline
    def setSnap(value: (/* date */ Date, /* scale */ String, /* step */ Double) => Date | Double): Self = StObject.set(x, "snap", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
    
    @scala.inline
    def setStack(value: Boolean): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackSubgroups(value: Boolean): Self = StObject.set(x, "stackSubgroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackSubgroupsUndefined: Self = StObject.set(x, "stackSubgroups", js.undefined)
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    @scala.inline
    def setStart(value: DateType): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setTemplate(
      value: (/* item */ js.UndefOr[js.Any], /* element */ js.UndefOr[js.Any], /* data */ js.UndefOr[js.Any]) => String
    ): Self = StObject.set(x, "template", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setThrottleRedraw(value: Double): Self = StObject.set(x, "throttleRedraw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrottleRedrawUndefined: Self = StObject.set(x, "throttleRedraw", js.undefined)
    
    @scala.inline
    def setTimeAxis(value: TimelineTimeAxisOption): Self = StObject.set(x, "timeAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeAxisUndefined: Self = StObject.set(x, "timeAxis", js.undefined)
    
    @scala.inline
    def setTooltip(value: TimelineTooltipOption): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipOnItemUpdateTime(value: Boolean | Template): Self = StObject.set(x, "tooltipOnItemUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipOnItemUpdateTimeUndefined: Self = StObject.set(x, "tooltipOnItemUpdateTime", js.undefined)
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVerticalScroll(value: Boolean): Self = StObject.set(x, "verticalScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalScrollUndefined: Self = StObject.set(x, "verticalScroll", js.undefined)
    
    @scala.inline
    def setVisibleFrameTemplate(
      value: (/* item */ js.UndefOr[js.Any], /* element */ js.UndefOr[js.Any], /* data */ js.UndefOr[js.Any]) => String
    ): Self = StObject.set(x, "visibleFrameTemplate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setVisibleFrameTemplateUndefined: Self = StObject.set(x, "visibleFrameTemplate", js.undefined)
    
    @scala.inline
    def setWidth(value: HeightWidthType): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
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
