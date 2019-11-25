package typings.vegaDashTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesSpecTransformMod {
  import typings.vegaDashTypings.Anon_Bandwidth
  import typings.vegaDashTypings.Anon_CountNice
  import typings.vegaDashTypings.Anon_Thresholds

  type ContourTransform = Anon_Bandwidth with (Anon_CountNice | Anon_Thresholds)
  type DataName = String
  type ExprString = String
  type FieldRef = String | TransformField
  type ProjectionName = String
  type SignalName = String
  /* Rewritten from type alias, can be one of: 
    - typings.vegaDashTypings.typesSpecTransformMod.AggregateTransform
    - typings.vegaDashTypings.typesSpecTransformMod.BinTransform
    - typings.vegaDashTypings.typesSpecTransformMod.CollectTransform
    - typings.vegaDashTypings.typesSpecTransformMod.CountPatternTransform
    - typings.vegaDashTypings.typesSpecTransformMod.ContourTransform
    - typings.vegaDashTypings.typesSpecTransformMod.CrossTransform
    - typings.vegaDashTypings.typesSpecTransformMod.CrossFilterTransform
    - typings.vegaDashTypings.typesSpecTransformMod.DensityTransform
    - typings.vegaDashTypings.typesSpecTransformMod.DotBinTransform
    - typings.vegaDashTypings.typesSpecTransformMod.ExtentTransform
    - typings.vegaDashTypings.typesSpecTransformMod.FilterTransform
    - typings.vegaDashTypings.typesSpecTransformMod.FlattenTransform
    - typings.vegaDashTypings.typesSpecTransformMod.FoldTransform
    - typings.vegaDashTypings.typesSpecTransformMod.ForceTransform
    - typings.vegaDashTypings.typesSpecTransformMod.FormulaTransform
    - typings.vegaDashTypings.typesSpecTransformMod.HeatmapTransform
    - typings.vegaDashTypings.typesSpecTransformMod.GeoJSONTransform
    - typings.vegaDashTypings.typesSpecTransformMod.GeoPathTransform
    - typings.vegaDashTypings.typesSpecTransformMod.GeoPointTransform
    - typings.vegaDashTypings.typesSpecTransformMod.GeoShapeTransform
    - typings.vegaDashTypings.typesSpecTransformMod.GraticuleTransform
    - typings.vegaDashTypings.typesSpecTransformMod.IdentifierTransform
    - typings.vegaDashTypings.typesSpecTransformMod.ImputeTransform
    - typings.vegaDashTypings.typesSpecTransformMod.IsocontourTransform
    - typings.vegaDashTypings.typesSpecTransformMod.JoinAggregateTransform
    - typings.vegaDashTypings.typesSpecTransformMod.KDETransform
    - typings.vegaDashTypings.typesSpecTransformMod.KDE2DTransform
    - typings.vegaDashTypings.typesSpecTransformMod.LinkPathTransform
    - typings.vegaDashTypings.typesSpecTransformMod.LoessTransform
    - typings.vegaDashTypings.typesSpecTransformMod.LookupTransform
    - typings.vegaDashTypings.typesSpecTransformMod.NestTransform
    - typings.vegaDashTypings.typesSpecTransformMod.PackTransform
    - typings.vegaDashTypings.typesSpecTransformMod.PartitionTransform
    - typings.vegaDashTypings.typesSpecTransformMod.PieTransform
    - typings.vegaDashTypings.typesSpecTransformMod.PivotTransform
    - typings.vegaDashTypings.typesSpecTransformMod.ProjectTransform
    - typings.vegaDashTypings.typesSpecTransformMod.QuantileTransform
    - typings.vegaDashTypings.typesSpecTransformMod.RegressionTransform
    - typings.vegaDashTypings.typesSpecTransformMod.ResolveFilterTransform
    - typings.vegaDashTypings.typesSpecTransformMod.SampleTransform
    - typings.vegaDashTypings.typesSpecTransformMod.SequenceTransform
    - typings.vegaDashTypings.typesSpecTransformMod.StackTransform
    - typings.vegaDashTypings.typesSpecTransformMod.StratifyTransform
    - typings.vegaDashTypings.typesSpecTransformMod.TimeUnitTransform
    - typings.vegaDashTypings.typesSpecTransformMod.TreeTransform
    - typings.vegaDashTypings.typesSpecTransformMod.TreeLinksTransform
    - typings.vegaDashTypings.typesSpecTransformMod.TreemapTransform
    - typings.vegaDashTypings.typesSpecTransformMod.VoronoiTransform
    - typings.vegaDashTypings.typesSpecTransformMod.WindowTransform
    - typings.vegaDashTypings.typesSpecTransformMod.WordcloudTransform
  */
  type Transforms = _Transforms | ContourTransform
}
