package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineOptions extends js.Object {
  var align: js.UndefOr[TimelineAlignType] = js.undefined
  var autoResize: js.UndefOr[scala.Boolean] = js.undefined
  var clickToUse: js.UndefOr[scala.Boolean] = js.undefined
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
  var horizontalScroll: js.UndefOr[scala.Boolean] = js.undefined
  var itemsAlwaysDraggable: js.UndefOr[TimelineOptionsItemsAlwaysDraggableType] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var locales: js.UndefOr[js.Any] = js.undefined
  var margin: js.UndefOr[TimelineOptionsMarginType] = js.undefined
  var max: js.UndefOr[DateType] = js.undefined
  var maxHeight: js.UndefOr[HeightWidthType] = js.undefined
  var maxMinorChars: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[DateType] = js.undefined
  var minHeight: js.UndefOr[HeightWidthType] = js.undefined
   // TODO
  var moment: js.UndefOr[MomentConstructor] = js.undefined
  var moveable: js.UndefOr[scala.Boolean] = js.undefined
  var multiselect: js.UndefOr[scala.Boolean] = js.undefined
  var multiselectPerGroup: js.UndefOr[scala.Boolean] = js.undefined
  var onAdd: js.UndefOr[TimelineOptionsItemCallbackFunction] = js.undefined
  var onAddGroup: js.UndefOr[TimelineOptionsGroupCallbackFunction] = js.undefined
  var onInitialDrawComplete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onMove: js.UndefOr[TimelineOptionsItemCallbackFunction] = js.undefined
  var onMoveGroup: js.UndefOr[TimelineOptionsGroupCallbackFunction] = js.undefined
  var onMoving: js.UndefOr[TimelineOptionsItemCallbackFunction] = js.undefined
  var onRemove: js.UndefOr[TimelineOptionsItemCallbackFunction] = js.undefined
  var onRemoveGroup: js.UndefOr[TimelineOptionsGroupCallbackFunction] = js.undefined
  var onUpdate: js.UndefOr[TimelineOptionsItemCallbackFunction] = js.undefined
  var order: js.UndefOr[TimelineOptionsComparisonFunction] = js.undefined
  var orientation: js.UndefOr[TimelineOptionsOrientationType] = js.undefined
  var rollingMode: js.UndefOr[TimelineRollingModeOption] = js.undefined
  var rtl: js.UndefOr[scala.Boolean] = js.undefined
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  var showCurrentTime: js.UndefOr[scala.Boolean] = js.undefined
  var showMajorLabels: js.UndefOr[scala.Boolean] = js.undefined
  var showMinorLabels: js.UndefOr[scala.Boolean] = js.undefined
  var showTooltips: js.UndefOr[scala.Boolean] = js.undefined
  var snap: js.UndefOr[TimelineOptionsSnapFunction] = js.undefined
  var stack: js.UndefOr[scala.Boolean] = js.undefined
  var stackSubgroups: js.UndefOr[scala.Boolean] = js.undefined
  var start: js.UndefOr[DateType] = js.undefined
  var template: js.UndefOr[TimelineOptionsTemplateFunction] = js.undefined
  var throttleRedraw: js.UndefOr[scala.Double] = js.undefined
  var timeAxis: js.UndefOr[TimelineTimeAxisOption] = js.undefined
  var tooltip: js.UndefOr[TimelineTooltipOption] = js.undefined
  var tooltipOnItemUpdateTime: js.UndefOr[scala.Boolean | visLib.Anon_Item] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var verticalScroll: js.UndefOr[scala.Boolean] = js.undefined
  var visibleFrameTemplate: js.UndefOr[TimelineOptionsTemplateFunction] = js.undefined
  var width: js.UndefOr[HeightWidthType] = js.undefined
  var zoomKey: js.UndefOr[java.lang.String] = js.undefined
  var zoomMax: js.UndefOr[scala.Double] = js.undefined
  var zoomMin: js.UndefOr[scala.Double] = js.undefined
  var zoomable: js.UndefOr[scala.Boolean] = js.undefined
}

object TimelineOptions {
  @scala.inline
  def apply(
    align: TimelineAlignType = null,
    autoResize: js.UndefOr[scala.Boolean] = js.undefined,
    clickToUse: js.UndefOr[scala.Boolean] = js.undefined,
    configure: TimelineOptionsConfigureType = null,
    dataAttributes: TimelineOptionsDataAttributesType = null,
    editable: TimelineOptionsEditableType = null,
    end: DateType = null,
    format: TimelineFormatOption = null,
    groupEditable: TimelineOptionsGroupEditableType = null,
    groupOrder: TimelineOptionsGroupOrderType = null,
    groupOrderSwap: TimelineOptionsGroupOrderSwapFunction = null,
    groupTemplate: TimelineOptionsTemplateFunction = null,
    height: HeightWidthType = null,
    hiddenDates: TimelineOptionsHiddenDatesType = null,
    horizontalScroll: js.UndefOr[scala.Boolean] = js.undefined,
    itemsAlwaysDraggable: TimelineOptionsItemsAlwaysDraggableType = null,
    locale: java.lang.String = null,
    locales: js.Any = null,
    margin: TimelineOptionsMarginType = null,
    max: DateType = null,
    maxHeight: HeightWidthType = null,
    maxMinorChars: scala.Int | scala.Double = null,
    min: DateType = null,
    minHeight: HeightWidthType = null,
    moment: MomentConstructor = null,
    moveable: js.UndefOr[scala.Boolean] = js.undefined,
    multiselect: js.UndefOr[scala.Boolean] = js.undefined,
    multiselectPerGroup: js.UndefOr[scala.Boolean] = js.undefined,
    onAdd: TimelineOptionsItemCallbackFunction = null,
    onAddGroup: TimelineOptionsGroupCallbackFunction = null,
    onInitialDrawComplete: js.Function0[scala.Unit] = null,
    onMove: TimelineOptionsItemCallbackFunction = null,
    onMoveGroup: TimelineOptionsGroupCallbackFunction = null,
    onMoving: TimelineOptionsItemCallbackFunction = null,
    onRemove: TimelineOptionsItemCallbackFunction = null,
    onRemoveGroup: TimelineOptionsGroupCallbackFunction = null,
    onUpdate: TimelineOptionsItemCallbackFunction = null,
    order: TimelineOptionsComparisonFunction = null,
    orientation: TimelineOptionsOrientationType = null,
    rollingMode: TimelineRollingModeOption = null,
    rtl: js.UndefOr[scala.Boolean] = js.undefined,
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
    showCurrentTime: js.UndefOr[scala.Boolean] = js.undefined,
    showMajorLabels: js.UndefOr[scala.Boolean] = js.undefined,
    showMinorLabels: js.UndefOr[scala.Boolean] = js.undefined,
    showTooltips: js.UndefOr[scala.Boolean] = js.undefined,
    snap: TimelineOptionsSnapFunction = null,
    stack: js.UndefOr[scala.Boolean] = js.undefined,
    stackSubgroups: js.UndefOr[scala.Boolean] = js.undefined,
    start: DateType = null,
    template: TimelineOptionsTemplateFunction = null,
    throttleRedraw: scala.Int | scala.Double = null,
    timeAxis: TimelineTimeAxisOption = null,
    tooltip: TimelineTooltipOption = null,
    tooltipOnItemUpdateTime: scala.Boolean | visLib.Anon_Item = null,
    `type`: java.lang.String = null,
    verticalScroll: js.UndefOr[scala.Boolean] = js.undefined,
    visibleFrameTemplate: TimelineOptionsTemplateFunction = null,
    width: HeightWidthType = null,
    zoomKey: java.lang.String = null,
    zoomMax: scala.Int | scala.Double = null,
    zoomMin: scala.Int | scala.Double = null,
    zoomable: js.UndefOr[scala.Boolean] = js.undefined
  ): TimelineOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (!js.isUndefined(autoResize)) __obj.updateDynamic("autoResize")(autoResize)
    if (!js.isUndefined(clickToUse)) __obj.updateDynamic("clickToUse")(clickToUse)
    if (configure != null) __obj.updateDynamic("configure")(configure.asInstanceOf[js.Any])
    if (dataAttributes != null) __obj.updateDynamic("dataAttributes")(dataAttributes.asInstanceOf[js.Any])
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (groupEditable != null) __obj.updateDynamic("groupEditable")(groupEditable.asInstanceOf[js.Any])
    if (groupOrder != null) __obj.updateDynamic("groupOrder")(groupOrder.asInstanceOf[js.Any])
    if (groupOrderSwap != null) __obj.updateDynamic("groupOrderSwap")(groupOrderSwap)
    if (groupTemplate != null) __obj.updateDynamic("groupTemplate")(groupTemplate)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hiddenDates != null) __obj.updateDynamic("hiddenDates")(hiddenDates.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontalScroll)) __obj.updateDynamic("horizontalScroll")(horizontalScroll)
    if (itemsAlwaysDraggable != null) __obj.updateDynamic("itemsAlwaysDraggable")(itemsAlwaysDraggable.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (locales != null) __obj.updateDynamic("locales")(locales)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxMinorChars != null) __obj.updateDynamic("maxMinorChars")(maxMinorChars.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (moment != null) __obj.updateDynamic("moment")(moment.asInstanceOf[js.Any])
    if (!js.isUndefined(moveable)) __obj.updateDynamic("moveable")(moveable)
    if (!js.isUndefined(multiselect)) __obj.updateDynamic("multiselect")(multiselect)
    if (!js.isUndefined(multiselectPerGroup)) __obj.updateDynamic("multiselectPerGroup")(multiselectPerGroup)
    if (onAdd != null) __obj.updateDynamic("onAdd")(onAdd)
    if (onAddGroup != null) __obj.updateDynamic("onAddGroup")(onAddGroup)
    if (onInitialDrawComplete != null) __obj.updateDynamic("onInitialDrawComplete")(onInitialDrawComplete)
    if (onMove != null) __obj.updateDynamic("onMove")(onMove)
    if (onMoveGroup != null) __obj.updateDynamic("onMoveGroup")(onMoveGroup)
    if (onMoving != null) __obj.updateDynamic("onMoving")(onMoving)
    if (onRemove != null) __obj.updateDynamic("onRemove")(onRemove)
    if (onRemoveGroup != null) __obj.updateDynamic("onRemoveGroup")(onRemoveGroup)
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(onUpdate)
    if (order != null) __obj.updateDynamic("order")(order)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (rollingMode != null) __obj.updateDynamic("rollingMode")(rollingMode)
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (!js.isUndefined(showCurrentTime)) __obj.updateDynamic("showCurrentTime")(showCurrentTime)
    if (!js.isUndefined(showMajorLabels)) __obj.updateDynamic("showMajorLabels")(showMajorLabels)
    if (!js.isUndefined(showMinorLabels)) __obj.updateDynamic("showMinorLabels")(showMinorLabels)
    if (!js.isUndefined(showTooltips)) __obj.updateDynamic("showTooltips")(showTooltips)
    if (snap != null) __obj.updateDynamic("snap")(snap)
    if (!js.isUndefined(stack)) __obj.updateDynamic("stack")(stack)
    if (!js.isUndefined(stackSubgroups)) __obj.updateDynamic("stackSubgroups")(stackSubgroups)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template)
    if (throttleRedraw != null) __obj.updateDynamic("throttleRedraw")(throttleRedraw.asInstanceOf[js.Any])
    if (timeAxis != null) __obj.updateDynamic("timeAxis")(timeAxis)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipOnItemUpdateTime != null) __obj.updateDynamic("tooltipOnItemUpdateTime")(tooltipOnItemUpdateTime.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(verticalScroll)) __obj.updateDynamic("verticalScroll")(verticalScroll)
    if (visibleFrameTemplate != null) __obj.updateDynamic("visibleFrameTemplate")(visibleFrameTemplate)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zoomKey != null) __obj.updateDynamic("zoomKey")(zoomKey)
    if (zoomMax != null) __obj.updateDynamic("zoomMax")(zoomMax.asInstanceOf[js.Any])
    if (zoomMin != null) __obj.updateDynamic("zoomMin")(zoomMin.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomable)) __obj.updateDynamic("zoomable")(zoomable)
    __obj.asInstanceOf[TimelineOptions]
  }
}

