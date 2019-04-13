package typings
package visLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object visMod {
  type DataGroupCollectionType = js.Array[DataGroup] | DataSet[DataGroup] | DataView[DataGroup]
  type DataItemCollectionType = js.Array[DataItem] | DataSet[DataItem] | DataView[DataItem]
  type DateType = stdLib.Date | scala.Double | java.lang.String
  type Graph2dLegendOption = scala.Boolean | LegendOptions
  type Graph2dOptionBarChart = scala.Double | Graph2dBarChartOption
  type Graph2dOptionDataAxis = scala.Boolean | Graph2dDataAxisOption
  type Graph2dOptionDrawPoints = scala.Boolean | Graph2dDrawPointsOption
  type HeightWidthType = IdType
  type IdType = java.lang.String | scala.Double
  type MomentConstructor = MomentConstructor1 | MomentConstructor2
  type MomentConstructor1 = js.Function3[
    /* inp */ js.UndefOr[momentLib.momentMod.MomentInput], 
    /* format */ js.UndefOr[momentLib.momentMod.MomentFormatSpecification], 
    /* strict */ js.UndefOr[scala.Boolean], 
    momentLib.momentMod.Moment
  ]
  type MomentConstructor2 = js.Function4[
    /* inp */ js.UndefOr[momentLib.momentMod.MomentInput], 
    /* format */ js.UndefOr[momentLib.momentMod.MomentFormatSpecification], 
    /* language */ js.UndefOr[java.lang.String], 
    /* strict */ js.UndefOr[scala.Boolean], 
    momentLib.momentMod.Moment
  ]
  type SubGroupStackOptions = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  type SubgroupType = IdType
  type TimelineAnimationType = scala.Boolean | AnimationOptions
  type TimelineFormatLabelsFunction = js.Function3[
    /* date */ stdLib.Date, 
    /* scale */ java.lang.String, 
    /* step */ scala.Double, 
    java.lang.String
  ]
  type TimelineItemEditableType = scala.Boolean | TimelineItemEditableOption
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
}
