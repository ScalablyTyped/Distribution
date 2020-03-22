package typings.vis.mod

import typings.std.Date
import typings.vis.AnonTemplate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineOptions extends js.Object {
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
  var locales: js.UndefOr[js.Any] = js.undefined
  var margin: js.UndefOr[TimelineOptionsMarginType] = js.undefined
  var max: js.UndefOr[DateType] = js.undefined
  var maxHeight: js.UndefOr[HeightWidthType] = js.undefined
  var maxMinorChars: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[DateType] = js.undefined
  var minHeight: js.UndefOr[HeightWidthType] = js.undefined
   // TODO
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
  var tooltipOnItemUpdateTime: js.UndefOr[Boolean | AnonTemplate] = js.undefined
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
  @scala.inline
  def apply(
    align: TimelineAlignType = null,
    autoResize: js.UndefOr[Boolean] = js.undefined,
    clickToUse: js.UndefOr[Boolean] = js.undefined,
    configure: TimelineOptionsConfigureType = null,
    dataAttributes: TimelineOptionsDataAttributesType = null,
    editable: TimelineOptionsEditableType = null,
    end: DateType = null,
    format: TimelineFormatOption = null,
    groupEditable: TimelineOptionsGroupEditableType = null,
    groupOrder: TimelineOptionsGroupOrderType = null,
    groupOrderSwap: (/* fromGroup */ js.Any, /* toGroup */ js.Any, /* groups */ DataSet[DataGroup]) => Unit = null,
    groupTemplate: (/* item */ js.UndefOr[js.Any], /* element */ js.UndefOr[js.Any], /* data */ js.UndefOr[js.Any]) => String = null,
    height: HeightWidthType = null,
    hiddenDates: TimelineOptionsHiddenDatesType = null,
    horizontalScroll: js.UndefOr[Boolean] = js.undefined,
    itemsAlwaysDraggable: TimelineOptionsItemsAlwaysDraggableType = null,
    locale: String = null,
    locales: js.Any = null,
    margin: TimelineOptionsMarginType = null,
    max: DateType = null,
    maxHeight: HeightWidthType = null,
    maxMinorChars: Int | Double = null,
    min: DateType = null,
    minHeight: HeightWidthType = null,
    moment: MomentConstructor = null,
    moveable: js.UndefOr[Boolean] = js.undefined,
    multiselect: js.UndefOr[Boolean] = js.undefined,
    multiselectPerGroup: js.UndefOr[Boolean] = js.undefined,
    onAdd: (/* item */ TimelineItem, /* callback */ js.Function1[/* item */ TimelineItem | Null, Unit]) => Unit = null,
    onAddGroup: (/* group */ TimelineGroup, /* callback */ js.Function1[/* group */ TimelineGroup | Null, Unit]) => Unit = null,
    onInitialDrawComplete: () => Unit = null,
    onMove: (/* item */ TimelineItem, /* callback */ js.Function1[/* item */ TimelineItem | Null, Unit]) => Unit = null,
    onMoveGroup: (/* group */ TimelineGroup, /* callback */ js.Function1[/* group */ TimelineGroup | Null, Unit]) => Unit = null,
    onMoving: (/* item */ TimelineItem, /* callback */ js.Function1[/* item */ TimelineItem | Null, Unit]) => Unit = null,
    onRemove: (/* item */ TimelineItem, /* callback */ js.Function1[/* item */ TimelineItem | Null, Unit]) => Unit = null,
    onRemoveGroup: (/* group */ TimelineGroup, /* callback */ js.Function1[/* group */ TimelineGroup | Null, Unit]) => Unit = null,
    onUpdate: (/* item */ TimelineItem, /* callback */ js.Function1[/* item */ TimelineItem | Null, Unit]) => Unit = null,
    order: (/* a */ js.Any, /* b */ js.Any) => Double = null,
    orientation: TimelineOptionsOrientationType = null,
    rollingMode: TimelineRollingModeOption = null,
    rtl: js.UndefOr[Boolean] = js.undefined,
    selectable: js.UndefOr[Boolean] = js.undefined,
    showCurrentTime: js.UndefOr[Boolean] = js.undefined,
    showMajorLabels: js.UndefOr[Boolean] = js.undefined,
    showMinorLabels: js.UndefOr[Boolean] = js.undefined,
    showTooltips: js.UndefOr[Boolean] = js.undefined,
    snap: (/* date */ Date, /* scale */ String, /* step */ Double) => Date | Double = null,
    stack: js.UndefOr[Boolean] = js.undefined,
    stackSubgroups: js.UndefOr[Boolean] = js.undefined,
    start: DateType = null,
    template: (/* item */ js.UndefOr[js.Any], /* element */ js.UndefOr[js.Any], /* data */ js.UndefOr[js.Any]) => String = null,
    throttleRedraw: Int | Double = null,
    timeAxis: TimelineTimeAxisOption = null,
    tooltip: TimelineTooltipOption = null,
    tooltipOnItemUpdateTime: Boolean | AnonTemplate = null,
    `type`: String = null,
    verticalScroll: js.UndefOr[Boolean] = js.undefined,
    visibleFrameTemplate: (/* item */ js.UndefOr[js.Any], /* element */ js.UndefOr[js.Any], /* data */ js.UndefOr[js.Any]) => String = null,
    width: HeightWidthType = null,
    zoomKey: String = null,
    zoomMax: Int | Double = null,
    zoomMin: Int | Double = null,
    zoomable: js.UndefOr[Boolean] = js.undefined
  ): TimelineOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(autoResize)) __obj.updateDynamic("autoResize")(autoResize.asInstanceOf[js.Any])
    if (!js.isUndefined(clickToUse)) __obj.updateDynamic("clickToUse")(clickToUse.asInstanceOf[js.Any])
    if (configure != null) __obj.updateDynamic("configure")(configure.asInstanceOf[js.Any])
    if (dataAttributes != null) __obj.updateDynamic("dataAttributes")(dataAttributes.asInstanceOf[js.Any])
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (groupEditable != null) __obj.updateDynamic("groupEditable")(groupEditable.asInstanceOf[js.Any])
    if (groupOrder != null) __obj.updateDynamic("groupOrder")(groupOrder.asInstanceOf[js.Any])
    if (groupOrderSwap != null) __obj.updateDynamic("groupOrderSwap")(js.Any.fromFunction3(groupOrderSwap))
    if (groupTemplate != null) __obj.updateDynamic("groupTemplate")(js.Any.fromFunction3(groupTemplate))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hiddenDates != null) __obj.updateDynamic("hiddenDates")(hiddenDates.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontalScroll)) __obj.updateDynamic("horizontalScroll")(horizontalScroll.asInstanceOf[js.Any])
    if (itemsAlwaysDraggable != null) __obj.updateDynamic("itemsAlwaysDraggable")(itemsAlwaysDraggable.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (locales != null) __obj.updateDynamic("locales")(locales.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxMinorChars != null) __obj.updateDynamic("maxMinorChars")(maxMinorChars.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (moment != null) __obj.updateDynamic("moment")(moment.asInstanceOf[js.Any])
    if (!js.isUndefined(moveable)) __obj.updateDynamic("moveable")(moveable.asInstanceOf[js.Any])
    if (!js.isUndefined(multiselect)) __obj.updateDynamic("multiselect")(multiselect.asInstanceOf[js.Any])
    if (!js.isUndefined(multiselectPerGroup)) __obj.updateDynamic("multiselectPerGroup")(multiselectPerGroup.asInstanceOf[js.Any])
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction2(onAdd))
    if (onAddGroup != null) __obj.updateDynamic("onAddGroup")(js.Any.fromFunction2(onAddGroup))
    if (onInitialDrawComplete != null) __obj.updateDynamic("onInitialDrawComplete")(js.Any.fromFunction0(onInitialDrawComplete))
    if (onMove != null) __obj.updateDynamic("onMove")(js.Any.fromFunction2(onMove))
    if (onMoveGroup != null) __obj.updateDynamic("onMoveGroup")(js.Any.fromFunction2(onMoveGroup))
    if (onMoving != null) __obj.updateDynamic("onMoving")(js.Any.fromFunction2(onMoving))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction2(onRemove))
    if (onRemoveGroup != null) __obj.updateDynamic("onRemoveGroup")(js.Any.fromFunction2(onRemoveGroup))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction2(onUpdate))
    if (order != null) __obj.updateDynamic("order")(js.Any.fromFunction2(order))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (rollingMode != null) __obj.updateDynamic("rollingMode")(rollingMode.asInstanceOf[js.Any])
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (!js.isUndefined(showCurrentTime)) __obj.updateDynamic("showCurrentTime")(showCurrentTime.asInstanceOf[js.Any])
    if (!js.isUndefined(showMajorLabels)) __obj.updateDynamic("showMajorLabels")(showMajorLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(showMinorLabels)) __obj.updateDynamic("showMinorLabels")(showMinorLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(showTooltips)) __obj.updateDynamic("showTooltips")(showTooltips.asInstanceOf[js.Any])
    if (snap != null) __obj.updateDynamic("snap")(js.Any.fromFunction3(snap))
    if (!js.isUndefined(stack)) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (!js.isUndefined(stackSubgroups)) __obj.updateDynamic("stackSubgroups")(stackSubgroups.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(js.Any.fromFunction3(template))
    if (throttleRedraw != null) __obj.updateDynamic("throttleRedraw")(throttleRedraw.asInstanceOf[js.Any])
    if (timeAxis != null) __obj.updateDynamic("timeAxis")(timeAxis.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipOnItemUpdateTime != null) __obj.updateDynamic("tooltipOnItemUpdateTime")(tooltipOnItemUpdateTime.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalScroll)) __obj.updateDynamic("verticalScroll")(verticalScroll.asInstanceOf[js.Any])
    if (visibleFrameTemplate != null) __obj.updateDynamic("visibleFrameTemplate")(js.Any.fromFunction3(visibleFrameTemplate))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zoomKey != null) __obj.updateDynamic("zoomKey")(zoomKey.asInstanceOf[js.Any])
    if (zoomMax != null) __obj.updateDynamic("zoomMax")(zoomMax.asInstanceOf[js.Any])
    if (zoomMin != null) __obj.updateDynamic("zoomMin")(zoomMin.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomable)) __obj.updateDynamic("zoomable")(zoomable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineOptions]
  }
}

