package typings.vegaTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transformMod {
  type ContourTransform = typings.vegaTypings.AnonBandwidth with (typings.vegaTypings.AnonNice | typings.vegaTypings.AnonThresholds)
  type DataName = java.lang.String
  type ExprString = java.lang.String
  type FieldRef = java.lang.String | typings.vegaTypings.transformMod.TransformField
  type ProjectionName = java.lang.String
  type SignalName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.transformMod.AggregateTransform
    - typings.vegaTypings.transformMod.BinTransform
    - typings.vegaTypings.transformMod.CollectTransform
    - typings.vegaTypings.transformMod.CountPatternTransform
    - typings.vegaTypings.transformMod.ContourTransform
    - typings.vegaTypings.transformMod.CrossTransform
    - typings.vegaTypings.transformMod.CrossFilterTransform
    - typings.vegaTypings.transformMod.DensityTransform
    - typings.vegaTypings.transformMod.DotBinTransform
    - typings.vegaTypings.transformMod.ExtentTransform
    - typings.vegaTypings.transformMod.FilterTransform
    - typings.vegaTypings.transformMod.FlattenTransform
    - typings.vegaTypings.transformMod.FoldTransform
    - typings.vegaTypings.transformMod.ForceTransform
    - typings.vegaTypings.transformMod.FormulaTransform
    - typings.vegaTypings.transformMod.HeatmapTransform
    - typings.vegaTypings.transformMod.GeoJSONTransform
    - typings.vegaTypings.transformMod.GeoPathTransform
    - typings.vegaTypings.transformMod.GeoPointTransform
    - typings.vegaTypings.transformMod.GeoShapeTransform
    - typings.vegaTypings.transformMod.GraticuleTransform
    - typings.vegaTypings.transformMod.IdentifierTransform
    - typings.vegaTypings.transformMod.ImputeTransform
    - typings.vegaTypings.transformMod.IsocontourTransform
    - typings.vegaTypings.transformMod.JoinAggregateTransform
    - typings.vegaTypings.transformMod.KDETransform
    - typings.vegaTypings.transformMod.KDE2DTransform
    - typings.vegaTypings.transformMod.LinkPathTransform
    - typings.vegaTypings.transformMod.LoessTransform
    - typings.vegaTypings.transformMod.LookupTransform
    - typings.vegaTypings.transformMod.NestTransform
    - typings.vegaTypings.transformMod.PackTransform
    - typings.vegaTypings.transformMod.PartitionTransform
    - typings.vegaTypings.transformMod.PieTransform
    - typings.vegaTypings.transformMod.PivotTransform
    - typings.vegaTypings.transformMod.ProjectTransform
    - typings.vegaTypings.transformMod.QuantileTransform
    - typings.vegaTypings.transformMod.RegressionTransform
    - typings.vegaTypings.transformMod.ResolveFilterTransform
    - typings.vegaTypings.transformMod.SampleTransform
    - typings.vegaTypings.transformMod.SequenceTransform
    - typings.vegaTypings.transformMod.StackTransform
    - typings.vegaTypings.transformMod.StratifyTransform
    - typings.vegaTypings.transformMod.TimeUnitTransform
    - typings.vegaTypings.transformMod.TreeTransform
    - typings.vegaTypings.transformMod.TreeLinksTransform
    - typings.vegaTypings.transformMod.TreemapTransform
    - typings.vegaTypings.transformMod.VoronoiTransform
    - typings.vegaTypings.transformMod.WindowTransform
    - typings.vegaTypings.transformMod.WordcloudTransform
  */
  type Transforms = typings.vegaTypings.transformMod._Transforms | typings.vegaTypings.transformMod.ContourTransform
}
