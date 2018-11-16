package typings
package visLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object visMod {
  type DataGroupCollectionType = js.Array[DataGroup] | DataSet[DataGroup] | DataView[DataGroup]
  type DataItemCollectionType = js.Array[DataItem] | DataSet[DataItem] | DataView[DataItem]
  type DateType = stdLib.Date | scala.Double | java.lang.String
  type EasingFunction = visLib.visLibStrings.linear | visLib.visLibStrings.easeInQuad | visLib.visLibStrings.easeOutQuad | visLib.visLibStrings.easeInOutQuad | visLib.visLibStrings.easeInCubic | visLib.visLibStrings.easeOutCubic | visLib.visLibStrings.easeInOutCubic | visLib.visLibStrings.easeInQuart | visLib.visLibStrings.easeOutQuart | visLib.visLibStrings.easeInOutQuart | visLib.visLibStrings.easeInQuint | visLib.visLibStrings.easeOutQuint | visLib.visLibStrings.easeInOutQuint
  type Graph2dBarChartAlign = visLib.visLibStrings.left | visLib.visLibStrings.center | visLib.visLibStrings.right
  type Graph2dDrawPointsStyle = visLib.visLibStrings.square | visLib.visLibStrings.circle
  type Graph2dLegendOption = scala.Boolean | LegendOptions
  type Graph2dOptionBarChart = scala.Double | Graph2dBarChartOption
  type Graph2dOptionDataAxis = scala.Boolean | Graph2dDataAxisOption
  type Graph2dOptionDrawPoints = scala.Boolean | Graph2dDrawPointsOption
  type Graph2dStyleType = visLib.visLibStrings.line | visLib.visLibStrings.bar | visLib.visLibStrings.points
  type HeightWidthType = IdType
  type IdType = java.lang.String | scala.Double
  type LegendPositionType = visLib.visLibStrings.`top-right` | visLib.visLibStrings.`top-left` | visLib.visLibStrings.`bottom-right` | visLib.visLibStrings.`bottom-left`
  type MomentConstructor = MomentConstructor1 | MomentConstructor2
  type MomentConstructor1 = js.Function3[
    /* inp */ js.UndefOr[momentLib.momentMod.momentNs.MomentInput], 
    /* format */ js.UndefOr[momentLib.momentMod.momentNs.MomentFormatSpecification], 
    /* strict */ js.UndefOr[scala.Boolean], 
    momentLib.momentMod.momentNs.Moment
  ]
  type MomentConstructor2 = js.Function4[
    /* inp */ js.UndefOr[momentLib.momentMod.momentNs.MomentInput], 
    /* format */ js.UndefOr[momentLib.momentMod.momentNs.MomentFormatSpecification], 
    /* language */ js.UndefOr[java.lang.String], 
    /* strict */ js.UndefOr[scala.Boolean], 
    momentLib.momentMod.momentNs.Moment
  ]
  type NetworkEvents = visLib.visLibStrings.click | visLib.visLibStrings.doubleClick | visLib.visLibStrings.oncontext | visLib.visLibStrings.hold | visLib.visLibStrings.release | visLib.visLibStrings.select | visLib.visLibStrings.selectNode | visLib.visLibStrings.selectEdge | visLib.visLibStrings.deselectNode | visLib.visLibStrings.deselectEdge | visLib.visLibStrings.dragStart | visLib.visLibStrings.dragging | visLib.visLibStrings.dragEnd | visLib.visLibStrings.hoverNode | visLib.visLibStrings.blurNode | visLib.visLibStrings.hoverEdge | visLib.visLibStrings.blurEdge | visLib.visLibStrings.zoom | visLib.visLibStrings.showPopup | visLib.visLibStrings.hidePopup | visLib.visLibStrings.startStabilizing | visLib.visLibStrings.stabilizationProgress | visLib.visLibStrings.stabilizationIterationsDone | visLib.visLibStrings.stabilized | visLib.visLibStrings.resize | visLib.visLibStrings.initRedraw | visLib.visLibStrings.beforeDrawing | visLib.visLibStrings.afterDrawing | visLib.visLibStrings.animationFinished | visLib.visLibStrings.configChange
  type ParametrizationInterpolationType = visLib.visLibStrings.centripetal | visLib.visLibStrings.chordal | visLib.visLibStrings.uniform | visLib.visLibStrings.disabled
  type RightLeftEnumType = visLib.visLibStrings.right | visLib.visLibStrings.left
  type SubgroupType = IdType
  type TimelineAlignType = visLib.visLibStrings.auto | visLib.visLibStrings.center | visLib.visLibStrings.left | visLib.visLibStrings.right
  type TimelineAnimationType = scala.Boolean | AnimationOptions
  type TimelineEventPropertiesResultWhatType = visLib.visLibStrings.item | visLib.visLibStrings.background | visLib.visLibStrings.axis | visLib.visLibStrings.`group-label` | visLib.visLibStrings.`custom-time` | visLib.visLibStrings.`current-time`
  type TimelineEvents = visLib.visLibStrings.currentTimeTick | visLib.visLibStrings.click | visLib.visLibStrings.contextmenu | visLib.visLibStrings.doubleClick | visLib.visLibStrings.drop | visLib.visLibStrings.mouseOver | visLib.visLibStrings.mouseDown | visLib.visLibStrings.mouseUp | visLib.visLibStrings.mouseMove | visLib.visLibStrings.groupDragged | visLib.visLibStrings.changed | visLib.visLibStrings.rangechange | visLib.visLibStrings.rangechanged | visLib.visLibStrings.select | visLib.visLibStrings.itemover | visLib.visLibStrings.itemout | visLib.visLibStrings.timechange | visLib.visLibStrings.timechanged
  type TimelineFormatLabelsFunction = js.Function3[
    /* date */ stdLib.Date, 
    /* scale */ java.lang.String, 
    /* step */ scala.Double, 
    java.lang.String
  ]
  type TimelineItemEditableType = scala.Boolean | TimelineItemEditableOption
  type TimelineItemType = visLib.visLibStrings.box | visLib.visLibStrings.point | visLib.visLibStrings.range | visLib.visLibStrings.background
  type TimelineMarginItemType = scala.Double | TimelineMarginItem
  type TimelineOptionsComparisonFunction = js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double]
  type TimelineOptionsConfigureFunction = js.Function2[/* option */ java.lang.String, /* path */ js.Array[java.lang.String], scala.Boolean]
  type TimelineOptionsConfigureType = scala.Boolean | TimelineOptionsConfigureFunction
  type TimelineOptionsDataAttributesType = scala.Boolean | java.lang.String | js.Array[java.lang.String]
  type TimelineOptionsEditableType = scala.Boolean | TimelineEditableOption
  type TimelineOptionsGroupCallbackFunction = js.Function2[
    /* group */ TimelineGroup, 
    /* callback */ js.Function1[/* group */ TimelineGroup | scala.Null, scala.Unit], 
    scala.Unit
  ]
  type TimelineOptionsGroupEditableType = scala.Boolean | TimelineGroupEditableOption
  type TimelineOptionsGroupOrderSwapFunction = js.Function3[
    /* fromGroup */ js.Any, 
    /* toGroup */ js.Any, 
    /* groups */ DataSet[DataGroup], 
    scala.Unit
  ]
  type TimelineOptionsGroupOrderType = java.lang.String | TimelineOptionsComparisonFunction
  type TimelineOptionsHiddenDatesType = TimelineHiddenDateOption | js.Array[TimelineHiddenDateOption]
  type TimelineOptionsItemCallbackFunction = js.Function2[
    /* item */ TimelineItem, 
    /* callback */ js.Function1[/* item */ TimelineItem | scala.Null, scala.Unit], 
    scala.Unit
  ]
  type TimelineOptionsItemsAlwaysDraggableType = scala.Boolean | TimelineItemsAlwaysDraggableOption
  type TimelineOptionsMarginType = scala.Double | TimelineMarginOption
  type TimelineOptionsOrientationType = java.lang.String | TimelineOrientationOption
  type TimelineOptionsSnapFunction = js.Function3[
    /* date */ stdLib.Date, 
    /* scale */ java.lang.String, 
    /* step */ scala.Double, 
    stdLib.Date | scala.Double
  ]
  type TimelineOptionsTemplateFunction = js.Function3[
    /* item */ js.UndefOr[js.Any], 
    /* element */ js.UndefOr[js.Any], 
    /* data */ js.UndefOr[js.Any], 
    java.lang.String
  ]
  type TimelineTimeAxisScaleType = visLib.visLibStrings.millisecond | visLib.visLibStrings.second | visLib.visLibStrings.minute | visLib.visLibStrings.hour | visLib.visLibStrings.weekday | visLib.visLibStrings.day | visLib.visLibStrings.month | visLib.visLibStrings.year
  type TopBottomEnumType = visLib.visLibStrings.top | visLib.visLibStrings.bottom
}
