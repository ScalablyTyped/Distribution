package typings.vis

import org.scalablytyped.runtime.StringDictionary
import typings.moment.momentMod.Moment
import typings.moment.momentMod.MomentFormatSpecification
import typings.moment.momentMod.MomentInput
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object visMod {
  type DataGroupCollectionType = js.Array[DataGroup] | DataSet[DataGroup] | DataView[DataGroup]
  type DataItemCollectionType = js.Array[DataItem] | DataSet[DataItem] | DataView[DataItem]
  type DateType = Date | Double | String
  type Graph2dLegendOption = Boolean | LegendOptions
  type Graph2dOptionBarChart = Double | Graph2dBarChartOption
  type Graph2dOptionDataAxis = Boolean | Graph2dDataAxisOption
  type Graph2dOptionDrawPoints = Boolean | Graph2dDrawPointsOption
  type HeightWidthType = IdType
  type IdType = String | Double
  type MomentConstructor = MomentConstructor1 | MomentConstructor2
  type MomentConstructor1 = js.Function3[
    /* inp */ js.UndefOr[MomentInput], 
    /* format */ js.UndefOr[MomentFormatSpecification], 
    /* strict */ js.UndefOr[Boolean], 
    Moment
  ]
  type MomentConstructor2 = js.Function4[
    /* inp */ js.UndefOr[MomentInput], 
    /* format */ js.UndefOr[MomentFormatSpecification], 
    /* language */ js.UndefOr[String], 
    /* strict */ js.UndefOr[Boolean], 
    Moment
  ]
  type SubGroupStackOptions = StringDictionary[Boolean]
  type SubgroupType = IdType
  type TimelineAnimationType = Boolean | AnimationOptions
  type TimelineFormatLabelsFunction = js.Function3[/* date */ Date, /* scale */ String, /* step */ Double, String]
  type TimelineItemEditableType = Boolean | TimelineItemEditableOption
  type TimelineMarginItemType = Double | TimelineMarginItem
  type TimelineOptionsComparisonFunction = js.Function2[/* a */ js.Any, /* b */ js.Any, Double]
  type TimelineOptionsConfigureFunction = js.Function2[/* option */ String, /* path */ js.Array[String], Boolean]
  type TimelineOptionsConfigureType = Boolean | TimelineOptionsConfigureFunction
  type TimelineOptionsDataAttributesType = Boolean | String | js.Array[String]
  type TimelineOptionsEditableType = Boolean | TimelineEditableOption
  type TimelineOptionsGroupCallbackFunction = js.Function2[
    /* group */ TimelineGroup, 
    /* callback */ js.Function1[/* group */ TimelineGroup | Null, Unit], 
    Unit
  ]
  type TimelineOptionsGroupEditableType = Boolean | TimelineGroupEditableOption
  type TimelineOptionsGroupOrderSwapFunction = js.Function3[/* fromGroup */ js.Any, /* toGroup */ js.Any, /* groups */ DataSet[DataGroup], Unit]
  type TimelineOptionsGroupOrderType = String | TimelineOptionsComparisonFunction
  type TimelineOptionsHiddenDatesType = TimelineHiddenDateOption | js.Array[TimelineHiddenDateOption]
  type TimelineOptionsItemCallbackFunction = js.Function2[
    /* item */ TimelineItem, 
    /* callback */ js.Function1[/* item */ TimelineItem | Null, Unit], 
    Unit
  ]
  type TimelineOptionsItemsAlwaysDraggableType = Boolean | TimelineItemsAlwaysDraggableOption
  type TimelineOptionsMarginType = Double | TimelineMarginOption
  type TimelineOptionsOrientationType = String | TimelineOrientationOption
  type TimelineOptionsSnapFunction = js.Function3[/* date */ Date, /* scale */ String, /* step */ Double, Date | Double]
  type TimelineOptionsTemplateFunction = js.Function3[
    /* item */ js.UndefOr[js.Any], 
    /* element */ js.UndefOr[js.Any], 
    /* data */ js.UndefOr[js.Any], 
    String
  ]
}
