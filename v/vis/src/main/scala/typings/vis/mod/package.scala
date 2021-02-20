package typings.vis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type DataGroupCollectionType = js.Array[typings.vis.mod.DataGroup] | typings.vis.mod.DataSet[typings.vis.mod.DataGroup] | typings.vis.mod.DataView[typings.vis.mod.DataGroup]
  
  type DataItemCollectionType = js.Array[typings.vis.mod.DataItem] | typings.vis.mod.DataSet[typings.vis.mod.DataItem] | typings.vis.mod.DataView[typings.vis.mod.DataItem]
  
  type DateType = typings.std.Date | scala.Double | java.lang.String
  
  type Graph2dLegendOption = scala.Boolean | typings.vis.mod.LegendOptions
  
  type Graph2dOptionBarChart = scala.Double | typings.vis.mod.Graph2dBarChartOption
  
  type Graph2dOptionDataAxis = scala.Boolean | typings.vis.mod.Graph2dDataAxisOption
  
  type Graph2dOptionDrawPoints = scala.Boolean | typings.vis.mod.Graph2dDrawPointsOption
  
  type HeightWidthType = typings.vis.mod.IdType
  
  type IdType = java.lang.String | scala.Double
  
  type MomentConstructor = typings.vis.mod.MomentConstructor1 | typings.vis.mod.MomentConstructor2
  
  type MomentConstructor1 = js.Function3[
    /* inp */ js.UndefOr[typings.moment.mod.MomentInput], 
    /* format */ js.UndefOr[typings.moment.mod.MomentFormatSpecification], 
    /* strict */ js.UndefOr[scala.Boolean], 
    typings.moment.mod.Moment
  ]
  
  type MomentConstructor2 = js.Function4[
    /* inp */ js.UndefOr[typings.moment.mod.MomentInput], 
    /* format */ js.UndefOr[typings.moment.mod.MomentFormatSpecification], 
    /* language */ js.UndefOr[java.lang.String], 
    /* strict */ js.UndefOr[scala.Boolean], 
    typings.moment.mod.Moment
  ]
  
  type SubGroupStackOptions = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  
  type SubgroupType = typings.vis.mod.IdType
  
  type TimelineAnimationType = scala.Boolean | typings.vis.mod.AnimationOptions
  
  type TimelineFormatLabelsFunction = js.Function3[
    /* date */ typings.std.Date, 
    /* scale */ java.lang.String, 
    /* step */ scala.Double, 
    java.lang.String
  ]
  
  type TimelineItemEditableType = scala.Boolean | typings.vis.mod.TimelineItemEditableOption
  
  type TimelineMarginItemType = scala.Double | typings.vis.mod.TimelineMarginItem
  
  type TimelineOptionsComparisonFunction = js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double]
  
  type TimelineOptionsConfigureFunction = js.Function2[/* option */ java.lang.String, /* path */ js.Array[java.lang.String], scala.Boolean]
  
  type TimelineOptionsConfigureType = scala.Boolean | typings.vis.mod.TimelineOptionsConfigureFunction
  
  type TimelineOptionsDataAttributesType = scala.Boolean | java.lang.String | js.Array[java.lang.String]
  
  type TimelineOptionsEditableType = scala.Boolean | typings.vis.mod.TimelineEditableOption
  
  type TimelineOptionsGroupCallbackFunction = js.Function2[
    /* group */ typings.vis.mod.TimelineGroup, 
    /* callback */ js.Function1[/* group */ typings.vis.mod.TimelineGroup | scala.Null, scala.Unit], 
    scala.Unit
  ]
  
  type TimelineOptionsGroupEditableType = scala.Boolean | typings.vis.mod.TimelineGroupEditableOption
  
  type TimelineOptionsGroupOrderSwapFunction = js.Function3[
    /* fromGroup */ js.Any, 
    /* toGroup */ js.Any, 
    /* groups */ typings.vis.mod.DataSet[typings.vis.mod.DataGroup], 
    scala.Unit
  ]
  
  type TimelineOptionsGroupOrderType = java.lang.String | typings.vis.mod.TimelineOptionsComparisonFunction
  
  type TimelineOptionsHiddenDatesType = typings.vis.mod.TimelineHiddenDateOption | js.Array[typings.vis.mod.TimelineHiddenDateOption]
  
  type TimelineOptionsItemCallbackFunction = js.Function2[
    /* item */ typings.vis.mod.TimelineItem, 
    /* callback */ js.Function1[/* item */ typings.vis.mod.TimelineItem | scala.Null, scala.Unit], 
    scala.Unit
  ]
  
  type TimelineOptionsItemsAlwaysDraggableType = scala.Boolean | typings.vis.mod.TimelineItemsAlwaysDraggableOption
  
  type TimelineOptionsMarginType = scala.Double | typings.vis.mod.TimelineMarginOption
  
  type TimelineOptionsOrientationType = java.lang.String | typings.vis.mod.TimelineOrientationOption
  
  type TimelineOptionsSnapFunction = js.Function3[
    /* date */ typings.std.Date, 
    /* scale */ java.lang.String, 
    /* step */ scala.Double, 
    typings.std.Date | scala.Double
  ]
  
  type TimelineOptionsTemplateFunction = js.Function3[
    /* item */ js.UndefOr[js.Any], 
    /* element */ js.UndefOr[js.Any], 
    /* data */ js.UndefOr[js.Any], 
    java.lang.String
  ]
}
