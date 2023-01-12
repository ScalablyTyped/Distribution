package typings.vis.mod

import typings.moment.mod.Moment
import typings.moment.mod.MomentFormatSpecification
import typings.moment.mod.MomentInput
import typings.vis.anon.Template
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineOptions extends StObject {
  
  var align: js.UndefOr[TimelineAlignType] = js.undefined
  
  var autoResize: js.UndefOr[Boolean] = js.undefined
  
  var clickToUse: js.UndefOr[Boolean] = js.undefined
  
  var configure: js.UndefOr[TimelineOptionsConfigureType] = js.undefined
  
  var dataAttributes: js.UndefOr[TimelineOptionsDataAttributesType] = js.undefined
  
  var editable: js.UndefOr[TimelineOptionsEditableType] = js.undefined
  
  var end: js.UndefOr[DateType] = js.undefined
  
  var format: js.UndefOr[TimelineFormatOption] = js.undefined
  
  var groupEditable: js.UndefOr[TimelineOptionsGroupEditableType] = js.undefined
  
  var groupOrder: js.UndefOr[TimelineOptionsGroupOrderType] = js.undefined
  
  var groupOrderSwap: js.UndefOr[TimelineOptionsGroupOrderSwapFunction] = js.undefined
  
  var groupTemplate: js.UndefOr[TimelineOptionsTemplateFunction] = js.undefined
  
  var height: js.UndefOr[HeightWidthType] = js.undefined
  
  var hiddenDates: js.UndefOr[TimelineOptionsHiddenDatesType] = js.undefined
  
  var horizontalScroll: js.UndefOr[Boolean] = js.undefined
  
  var itemsAlwaysDraggable: js.UndefOr[TimelineOptionsItemsAlwaysDraggableType] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var locales: js.UndefOr[Locales] = js.undefined
  
  var margin: js.UndefOr[TimelineOptionsMarginType] = js.undefined
  
  var max: js.UndefOr[DateType] = js.undefined
  
  var maxHeight: js.UndefOr[HeightWidthType] = js.undefined
  
  var maxMinorChars: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[DateType] = js.undefined
  
  var minHeight: js.UndefOr[HeightWidthType] = js.undefined
  
  var moment: js.UndefOr[MomentConstructor] = js.undefined
  
  var moveable: js.UndefOr[Boolean] = js.undefined
  
  var multiselect: js.UndefOr[Boolean] = js.undefined
  
  var multiselectPerGroup: js.UndefOr[Boolean] = js.undefined
  
  var onAdd: js.UndefOr[TimelineOptionsItemCallbackFunction] = js.undefined
  
  var onAddGroup: js.UndefOr[TimelineOptionsGroupCallbackFunction] = js.undefined
  
  var onInitialDrawComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onMove: js.UndefOr[TimelineOptionsItemCallbackFunction] = js.undefined
  
  var onMoveGroup: js.UndefOr[TimelineOptionsGroupCallbackFunction] = js.undefined
  
  var onMoving: js.UndefOr[TimelineOptionsItemCallbackFunction] = js.undefined
  
  var onRemove: js.UndefOr[TimelineOptionsItemCallbackFunction] = js.undefined
  
  var onRemoveGroup: js.UndefOr[TimelineOptionsGroupCallbackFunction] = js.undefined
  
  var onUpdate: js.UndefOr[TimelineOptionsItemCallbackFunction] = js.undefined
  
  var order: js.UndefOr[TimelineOptionsComparisonFunction] = js.undefined
  
  var orientation: js.UndefOr[TimelineOptionsOrientationType] = js.undefined
  
  var rollingMode: js.UndefOr[TimelineRollingModeOption] = js.undefined
  
  var rtl: js.UndefOr[Boolean] = js.undefined
  
  var selectable: js.UndefOr[Boolean] = js.undefined
  
  var showCurrentTime: js.UndefOr[Boolean] = js.undefined
  
  var showMajorLabels: js.UndefOr[Boolean] = js.undefined
  
  var showMinorLabels: js.UndefOr[Boolean] = js.undefined
  
  var showTooltips: js.UndefOr[Boolean] = js.undefined
  
  var snap: js.UndefOr[TimelineOptionsSnapFunction] = js.undefined
  
  var stack: js.UndefOr[Boolean] = js.undefined
  
  var stackSubgroups: js.UndefOr[Boolean] = js.undefined
  
  var start: js.UndefOr[DateType] = js.undefined
  
  var template: js.UndefOr[TimelineOptionsTemplateFunction] = js.undefined
  
  var throttleRedraw: js.UndefOr[Double] = js.undefined
  
  var timeAxis: js.UndefOr[TimelineTimeAxisOption] = js.undefined
  
  var tooltip: js.UndefOr[TimelineTooltipOption] = js.undefined
  
  var tooltipOnItemUpdateTime: js.UndefOr[Boolean | Template] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var verticalScroll: js.UndefOr[Boolean] = js.undefined
  
  var visibleFrameTemplate: js.UndefOr[TimelineOptionsTemplateFunction] = js.undefined
  
  var width: js.UndefOr[HeightWidthType] = js.undefined
  
  var zoomKey: js.UndefOr[String] = js.undefined
  
  var zoomMax: js.UndefOr[Double] = js.undefined
  
  var zoomMin: js.UndefOr[Double] = js.undefined
  
  var zoomable: js.UndefOr[Boolean] = js.undefined
}
object TimelineOptions {
  
  inline def apply(): TimelineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimelineOptions] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: TimelineAlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setAutoResize(value: Boolean): Self = StObject.set(x, "autoResize", value.asInstanceOf[js.Any])
    
    inline def setAutoResizeUndefined: Self = StObject.set(x, "autoResize", js.undefined)
    
    inline def setClickToUse(value: Boolean): Self = StObject.set(x, "clickToUse", value.asInstanceOf[js.Any])
    
    inline def setClickToUseUndefined: Self = StObject.set(x, "clickToUse", js.undefined)
    
    inline def setConfigure(value: TimelineOptionsConfigureType): Self = StObject.set(x, "configure", value.asInstanceOf[js.Any])
    
    inline def setConfigureFunction2(value: (/* option */ String, /* path */ js.Array[String]) => Boolean): Self = StObject.set(x, "configure", js.Any.fromFunction2(value))
    
    inline def setConfigureUndefined: Self = StObject.set(x, "configure", js.undefined)
    
    inline def setDataAttributes(value: TimelineOptionsDataAttributesType): Self = StObject.set(x, "dataAttributes", value.asInstanceOf[js.Any])
    
    inline def setDataAttributesUndefined: Self = StObject.set(x, "dataAttributes", js.undefined)
    
    inline def setDataAttributesVarargs(value: String*): Self = StObject.set(x, "dataAttributes", js.Array(value*))
    
    inline def setEditable(value: TimelineOptionsEditableType): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setEnd(value: DateType): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setFormat(value: TimelineFormatOption): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setGroupEditable(value: TimelineOptionsGroupEditableType): Self = StObject.set(x, "groupEditable", value.asInstanceOf[js.Any])
    
    inline def setGroupEditableUndefined: Self = StObject.set(x, "groupEditable", js.undefined)
    
    inline def setGroupOrder(value: TimelineOptionsGroupOrderType): Self = StObject.set(x, "groupOrder", value.asInstanceOf[js.Any])
    
    inline def setGroupOrderFunction2(value: (/* a */ Any, /* b */ Any) => Double): Self = StObject.set(x, "groupOrder", js.Any.fromFunction2(value))
    
    inline def setGroupOrderSwap(value: (/* fromGroup */ Any, /* toGroup */ Any, /* groups */ DataSet[DataGroup]) => Unit): Self = StObject.set(x, "groupOrderSwap", js.Any.fromFunction3(value))
    
    inline def setGroupOrderSwapUndefined: Self = StObject.set(x, "groupOrderSwap", js.undefined)
    
    inline def setGroupOrderUndefined: Self = StObject.set(x, "groupOrder", js.undefined)
    
    inline def setGroupTemplate(
      value: (/* item */ js.UndefOr[Any], /* element */ js.UndefOr[Any], /* data */ js.UndefOr[Any]) => String
    ): Self = StObject.set(x, "groupTemplate", js.Any.fromFunction3(value))
    
    inline def setGroupTemplateUndefined: Self = StObject.set(x, "groupTemplate", js.undefined)
    
    inline def setHeight(value: HeightWidthType): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHiddenDates(value: TimelineOptionsHiddenDatesType): Self = StObject.set(x, "hiddenDates", value.asInstanceOf[js.Any])
    
    inline def setHiddenDatesUndefined: Self = StObject.set(x, "hiddenDates", js.undefined)
    
    inline def setHiddenDatesVarargs(value: TimelineHiddenDateOption*): Self = StObject.set(x, "hiddenDates", js.Array(value*))
    
    inline def setHorizontalScroll(value: Boolean): Self = StObject.set(x, "horizontalScroll", value.asInstanceOf[js.Any])
    
    inline def setHorizontalScrollUndefined: Self = StObject.set(x, "horizontalScroll", js.undefined)
    
    inline def setItemsAlwaysDraggable(value: TimelineOptionsItemsAlwaysDraggableType): Self = StObject.set(x, "itemsAlwaysDraggable", value.asInstanceOf[js.Any])
    
    inline def setItemsAlwaysDraggableUndefined: Self = StObject.set(x, "itemsAlwaysDraggable", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setLocales(value: Locales): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
    
    inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
    
    inline def setMargin(value: TimelineOptionsMarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMax(value: DateType): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxHeight(value: HeightWidthType): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxMinorChars(value: Double): Self = StObject.set(x, "maxMinorChars", value.asInstanceOf[js.Any])
    
    inline def setMaxMinorCharsUndefined: Self = StObject.set(x, "maxMinorChars", js.undefined)
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: DateType): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinHeight(value: HeightWidthType): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMoment(value: MomentConstructor): Self = StObject.set(x, "moment", value.asInstanceOf[js.Any])
    
    inline def setMomentFunction3(
      value: (/* inp */ js.UndefOr[MomentInput], /* format */ js.UndefOr[MomentFormatSpecification], /* strict */ js.UndefOr[Boolean]) => Moment
    ): Self = StObject.set(x, "moment", js.Any.fromFunction3(value))
    
    inline def setMomentFunction4(
      value: (/* inp */ js.UndefOr[MomentInput], /* format */ js.UndefOr[MomentFormatSpecification], /* language */ js.UndefOr[String], /* strict */ js.UndefOr[Boolean]) => Moment
    ): Self = StObject.set(x, "moment", js.Any.fromFunction4(value))
    
    inline def setMomentUndefined: Self = StObject.set(x, "moment", js.undefined)
    
    inline def setMoveable(value: Boolean): Self = StObject.set(x, "moveable", value.asInstanceOf[js.Any])
    
    inline def setMoveableUndefined: Self = StObject.set(x, "moveable", js.undefined)
    
    inline def setMultiselect(value: Boolean): Self = StObject.set(x, "multiselect", value.asInstanceOf[js.Any])
    
    inline def setMultiselectPerGroup(value: Boolean): Self = StObject.set(x, "multiselectPerGroup", value.asInstanceOf[js.Any])
    
    inline def setMultiselectPerGroupUndefined: Self = StObject.set(x, "multiselectPerGroup", js.undefined)
    
    inline def setMultiselectUndefined: Self = StObject.set(x, "multiselect", js.undefined)
    
    inline def setOnAdd(
      value: (/* item */ TimelineItem, /* callback */ js.Function1[/* item */ TimelineItem | Null, Unit]) => Unit
    ): Self = StObject.set(x, "onAdd", js.Any.fromFunction2(value))
    
    inline def setOnAddGroup(
      value: (/* group */ TimelineGroup, /* callback */ js.Function1[/* group */ TimelineGroup | Null, Unit]) => Unit
    ): Self = StObject.set(x, "onAddGroup", js.Any.fromFunction2(value))
    
    inline def setOnAddGroupUndefined: Self = StObject.set(x, "onAddGroup", js.undefined)
    
    inline def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
    
    inline def setOnInitialDrawComplete(value: () => Unit): Self = StObject.set(x, "onInitialDrawComplete", js.Any.fromFunction0(value))
    
    inline def setOnInitialDrawCompleteUndefined: Self = StObject.set(x, "onInitialDrawComplete", js.undefined)
    
    inline def setOnMove(
      value: (/* item */ TimelineItem, /* callback */ js.Function1[/* item */ TimelineItem | Null, Unit]) => Unit
    ): Self = StObject.set(x, "onMove", js.Any.fromFunction2(value))
    
    inline def setOnMoveGroup(
      value: (/* group */ TimelineGroup, /* callback */ js.Function1[/* group */ TimelineGroup | Null, Unit]) => Unit
    ): Self = StObject.set(x, "onMoveGroup", js.Any.fromFunction2(value))
    
    inline def setOnMoveGroupUndefined: Self = StObject.set(x, "onMoveGroup", js.undefined)
    
    inline def setOnMoveUndefined: Self = StObject.set(x, "onMove", js.undefined)
    
    inline def setOnMoving(
      value: (/* item */ TimelineItem, /* callback */ js.Function1[/* item */ TimelineItem | Null, Unit]) => Unit
    ): Self = StObject.set(x, "onMoving", js.Any.fromFunction2(value))
    
    inline def setOnMovingUndefined: Self = StObject.set(x, "onMoving", js.undefined)
    
    inline def setOnRemove(
      value: (/* item */ TimelineItem, /* callback */ js.Function1[/* item */ TimelineItem | Null, Unit]) => Unit
    ): Self = StObject.set(x, "onRemove", js.Any.fromFunction2(value))
    
    inline def setOnRemoveGroup(
      value: (/* group */ TimelineGroup, /* callback */ js.Function1[/* group */ TimelineGroup | Null, Unit]) => Unit
    ): Self = StObject.set(x, "onRemoveGroup", js.Any.fromFunction2(value))
    
    inline def setOnRemoveGroupUndefined: Self = StObject.set(x, "onRemoveGroup", js.undefined)
    
    inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
    
    inline def setOnUpdate(
      value: (/* item */ TimelineItem, /* callback */ js.Function1[/* item */ TimelineItem | Null, Unit]) => Unit
    ): Self = StObject.set(x, "onUpdate", js.Any.fromFunction2(value))
    
    inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
    
    inline def setOrder(value: (/* a */ Any, /* b */ Any) => Double): Self = StObject.set(x, "order", js.Any.fromFunction2(value))
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setOrientation(value: TimelineOptionsOrientationType): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setRollingMode(value: TimelineRollingModeOption): Self = StObject.set(x, "rollingMode", value.asInstanceOf[js.Any])
    
    inline def setRollingModeUndefined: Self = StObject.set(x, "rollingMode", js.undefined)
    
    inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    
    inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    inline def setShowCurrentTime(value: Boolean): Self = StObject.set(x, "showCurrentTime", value.asInstanceOf[js.Any])
    
    inline def setShowCurrentTimeUndefined: Self = StObject.set(x, "showCurrentTime", js.undefined)
    
    inline def setShowMajorLabels(value: Boolean): Self = StObject.set(x, "showMajorLabels", value.asInstanceOf[js.Any])
    
    inline def setShowMajorLabelsUndefined: Self = StObject.set(x, "showMajorLabels", js.undefined)
    
    inline def setShowMinorLabels(value: Boolean): Self = StObject.set(x, "showMinorLabels", value.asInstanceOf[js.Any])
    
    inline def setShowMinorLabelsUndefined: Self = StObject.set(x, "showMinorLabels", js.undefined)
    
    inline def setShowTooltips(value: Boolean): Self = StObject.set(x, "showTooltips", value.asInstanceOf[js.Any])
    
    inline def setShowTooltipsUndefined: Self = StObject.set(x, "showTooltips", js.undefined)
    
    inline def setSnap(value: (/* date */ js.Date, /* scale */ String, /* step */ Double) => js.Date | Double): Self = StObject.set(x, "snap", js.Any.fromFunction3(value))
    
    inline def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
    
    inline def setStack(value: Boolean): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackSubgroups(value: Boolean): Self = StObject.set(x, "stackSubgroups", value.asInstanceOf[js.Any])
    
    inline def setStackSubgroupsUndefined: Self = StObject.set(x, "stackSubgroups", js.undefined)
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setStart(value: DateType): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setTemplate(
      value: (/* item */ js.UndefOr[Any], /* element */ js.UndefOr[Any], /* data */ js.UndefOr[Any]) => String
    ): Self = StObject.set(x, "template", js.Any.fromFunction3(value))
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setThrottleRedraw(value: Double): Self = StObject.set(x, "throttleRedraw", value.asInstanceOf[js.Any])
    
    inline def setThrottleRedrawUndefined: Self = StObject.set(x, "throttleRedraw", js.undefined)
    
    inline def setTimeAxis(value: TimelineTimeAxisOption): Self = StObject.set(x, "timeAxis", value.asInstanceOf[js.Any])
    
    inline def setTimeAxisUndefined: Self = StObject.set(x, "timeAxis", js.undefined)
    
    inline def setTooltip(value: TimelineTooltipOption): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipOnItemUpdateTime(value: Boolean | Template): Self = StObject.set(x, "tooltipOnItemUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setTooltipOnItemUpdateTimeUndefined: Self = StObject.set(x, "tooltipOnItemUpdateTime", js.undefined)
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVerticalScroll(value: Boolean): Self = StObject.set(x, "verticalScroll", value.asInstanceOf[js.Any])
    
    inline def setVerticalScrollUndefined: Self = StObject.set(x, "verticalScroll", js.undefined)
    
    inline def setVisibleFrameTemplate(
      value: (/* item */ js.UndefOr[Any], /* element */ js.UndefOr[Any], /* data */ js.UndefOr[Any]) => String
    ): Self = StObject.set(x, "visibleFrameTemplate", js.Any.fromFunction3(value))
    
    inline def setVisibleFrameTemplateUndefined: Self = StObject.set(x, "visibleFrameTemplate", js.undefined)
    
    inline def setWidth(value: HeightWidthType): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setZoomKey(value: String): Self = StObject.set(x, "zoomKey", value.asInstanceOf[js.Any])
    
    inline def setZoomKeyUndefined: Self = StObject.set(x, "zoomKey", js.undefined)
    
    inline def setZoomMax(value: Double): Self = StObject.set(x, "zoomMax", value.asInstanceOf[js.Any])
    
    inline def setZoomMaxUndefined: Self = StObject.set(x, "zoomMax", js.undefined)
    
    inline def setZoomMin(value: Double): Self = StObject.set(x, "zoomMin", value.asInstanceOf[js.Any])
    
    inline def setZoomMinUndefined: Self = StObject.set(x, "zoomMin", js.undefined)
    
    inline def setZoomable(value: Boolean): Self = StObject.set(x, "zoomable", value.asInstanceOf[js.Any])
    
    inline def setZoomableUndefined: Self = StObject.set(x, "zoomable", js.undefined)
  }
}
