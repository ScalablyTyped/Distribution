package typings.vegaTypings.typesSpecTransformMod

import typings.vegaTypings.typesSpecMarkMod.Compare
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.typesSpecUtilMod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.typesSpecTransformMod.AggregateTransform
  - typings.vegaTypings.typesSpecTransformMod.BinTransform
  - typings.vegaTypings.typesSpecTransformMod.CollectTransform
  - typings.vegaTypings.typesSpecTransformMod.CountPatternTransform
  - typings.vegaTypings.typesSpecTransformMod.ContourTransform
  - typings.vegaTypings.typesSpecTransformMod.CrossTransform
  - typings.vegaTypings.typesSpecTransformMod.CrossFilterTransform
  - typings.vegaTypings.typesSpecTransformMod.DensityTransform
  - typings.vegaTypings.typesSpecTransformMod.DotBinTransform
  - typings.vegaTypings.typesSpecTransformMod.ExtentTransform
  - typings.vegaTypings.typesSpecTransformMod.FilterTransform
  - typings.vegaTypings.typesSpecTransformMod.FlattenTransform
  - typings.vegaTypings.typesSpecTransformMod.FoldTransform
  - typings.vegaTypings.typesSpecTransformMod.ForceTransform
  - typings.vegaTypings.typesSpecTransformMod.FormulaTransform
  - typings.vegaTypings.typesSpecTransformMod.HeatmapTransform
  - typings.vegaTypings.typesSpecTransformMod.GeoJSONTransform
  - typings.vegaTypings.typesSpecTransformMod.GeoPathTransform
  - typings.vegaTypings.typesSpecTransformMod.GeoPointTransform
  - typings.vegaTypings.typesSpecTransformMod.GeoShapeTransform
  - typings.vegaTypings.typesSpecTransformMod.GraticuleTransform
  - typings.vegaTypings.typesSpecTransformMod.IdentifierTransform
  - typings.vegaTypings.typesSpecTransformMod.ImputeTransform
  - typings.vegaTypings.typesSpecTransformMod.IsocontourTransform
  - typings.vegaTypings.typesSpecTransformMod.JoinAggregateTransform
  - typings.vegaTypings.typesSpecTransformMod.KDETransform
  - typings.vegaTypings.typesSpecTransformMod.KDE2DTransform
  - typings.vegaTypings.typesSpecTransformMod.LabelTransform
  - typings.vegaTypings.typesSpecTransformMod.LinkPathTransform
  - typings.vegaTypings.typesSpecTransformMod.LoessTransform
  - typings.vegaTypings.typesSpecTransformMod.LookupTransform
  - typings.vegaTypings.typesSpecTransformMod.NestTransform
  - typings.vegaTypings.typesSpecTransformMod.PackTransform
  - typings.vegaTypings.typesSpecTransformMod.PartitionTransform
  - typings.vegaTypings.typesSpecTransformMod.PieTransform
  - typings.vegaTypings.typesSpecTransformMod.PivotTransform
  - typings.vegaTypings.typesSpecTransformMod.ProjectTransform
  - typings.vegaTypings.typesSpecTransformMod.QuantileTransform
  - typings.vegaTypings.typesSpecTransformMod.RegressionTransform
  - typings.vegaTypings.typesSpecTransformMod.ResolveFilterTransform
  - typings.vegaTypings.typesSpecTransformMod.SampleTransform
  - typings.vegaTypings.typesSpecTransformMod.SequenceTransform
  - typings.vegaTypings.typesSpecTransformMod.StackTransform
  - typings.vegaTypings.typesSpecTransformMod.StratifyTransform
  - typings.vegaTypings.typesSpecTransformMod.TimeUnitTransform
  - typings.vegaTypings.typesSpecTransformMod.TreeTransform
  - typings.vegaTypings.typesSpecTransformMod.TreeLinksTransform
  - typings.vegaTypings.typesSpecTransformMod.TreemapTransform
  - typings.vegaTypings.typesSpecTransformMod.VoronoiTransform
  - typings.vegaTypings.typesSpecTransformMod.WindowTransform
  - typings.vegaTypings.typesSpecTransformMod.WordcloudTransform
*/
trait Transforms extends StObject
object Transforms {
  
  inline def AggregateTransform(): typings.vegaTypings.typesSpecTransformMod.AggregateTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("aggregate")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.AggregateTransform]
  }
  
  inline def BinTransform(extent: (Vector2[Double | SignalRef]) | SignalRef, field: FieldRef): typings.vegaTypings.typesSpecTransformMod.BinTransform = {
    val __obj = js.Dynamic.literal(extent = extent.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bin")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.BinTransform]
  }
  
  inline def CollectTransform(sort: Compare): typings.vegaTypings.typesSpecTransformMod.CollectTransform = {
    val __obj = js.Dynamic.literal(sort = sort.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("collect")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.CollectTransform]
  }
  
  inline def CountPatternTransform(field: FieldRef): typings.vegaTypings.typesSpecTransformMod.CountPatternTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("countpattern")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.CountPatternTransform]
  }
  
  inline def CrossFilterTransform(
    fields: (js.Array[String | TransformField]) | SignalRef,
    query: (js.Array[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef
  ): typings.vegaTypings.typesSpecTransformMod.CrossFilterTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("crossfilter")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.CrossFilterTransform]
  }
  
  inline def CrossTransform(): typings.vegaTypings.typesSpecTransformMod.CrossTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("cross")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.CrossTransform]
  }
  
  inline def DensityTransform(): typings.vegaTypings.typesSpecTransformMod.DensityTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("density")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.DensityTransform]
  }
  
  inline def DotBinTransform(field: FieldRef): typings.vegaTypings.typesSpecTransformMod.DotBinTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dotbin")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.DotBinTransform]
  }
  
  inline def ExtentTransform(field: FieldRef): typings.vegaTypings.typesSpecTransformMod.ExtentTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("extent")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.ExtentTransform]
  }
  
  inline def FilterTransform(expr: ExprString): typings.vegaTypings.typesSpecTransformMod.FilterTransform = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("filter")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.FilterTransform]
  }
  
  inline def FlattenTransform(fields: js.Array[FieldRef] | SignalRef): typings.vegaTypings.typesSpecTransformMod.FlattenTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("flatten")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.FlattenTransform]
  }
  
  inline def FoldTransform(fields: js.Array[FieldRef] | SignalRef): typings.vegaTypings.typesSpecTransformMod.FoldTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fold")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.FoldTransform]
  }
  
  inline def ForceTransform(): typings.vegaTypings.typesSpecTransformMod.ForceTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("force")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.ForceTransform]
  }
  
  inline def FormulaTransform(as: String | SignalRef, expr: ExprString): typings.vegaTypings.typesSpecTransformMod.FormulaTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("formula")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.FormulaTransform]
  }
  
  inline def GeoJSONTransform(): typings.vegaTypings.typesSpecTransformMod.GeoJSONTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("geojson")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.GeoJSONTransform]
  }
  
  inline def GeoPathTransform(): typings.vegaTypings.typesSpecTransformMod.GeoPathTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("geopath")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.GeoPathTransform]
  }
  
  inline def GeoPointTransform(fields: Vector2[FieldRef] | SignalRef, projection: ProjectionName): typings.vegaTypings.typesSpecTransformMod.GeoPointTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("geopoint")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.GeoPointTransform]
  }
  
  inline def GeoShapeTransform(): typings.vegaTypings.typesSpecTransformMod.GeoShapeTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("geoshape")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.GeoShapeTransform]
  }
  
  inline def GraticuleTransform(): typings.vegaTypings.typesSpecTransformMod.GraticuleTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("graticule")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.GraticuleTransform]
  }
  
  inline def HeatmapTransform(): typings.vegaTypings.typesSpecTransformMod.HeatmapTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("heatmap")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.HeatmapTransform]
  }
  
  inline def IdentifierTransform(as: String | SignalRef): typings.vegaTypings.typesSpecTransformMod.IdentifierTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("identifier")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.IdentifierTransform]
  }
  
  inline def ImputeTransform(field: FieldRef, key: FieldRef): typings.vegaTypings.typesSpecTransformMod.ImputeTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("impute")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.ImputeTransform]
  }
  
  inline def IsocontourTransform(): typings.vegaTypings.typesSpecTransformMod.IsocontourTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("isocontour")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.IsocontourTransform]
  }
  
  inline def JoinAggregateTransform(): typings.vegaTypings.typesSpecTransformMod.JoinAggregateTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("joinaggregate")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.JoinAggregateTransform]
  }
  
  inline def KDE2DTransform(
    size: (js.Array[Double | SignalRef]) | SignalRef,
    x: String | TransformField,
    y: String | TransformField
  ): typings.vegaTypings.typesSpecTransformMod.KDE2DTransform = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("kde2d")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.KDE2DTransform]
  }
  
  inline def KDETransform(field: FieldRef): typings.vegaTypings.typesSpecTransformMod.KDETransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("kde")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.KDETransform]
  }
  
  inline def LabelTransform(size: (Vector2[Double | SignalRef]) | SignalRef): typings.vegaTypings.typesSpecTransformMod.LabelTransform = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("label")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.LabelTransform]
  }
  
  inline def LinkPathTransform(): typings.vegaTypings.typesSpecTransformMod.LinkPathTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("linkpath")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.LinkPathTransform]
  }
  
  inline def LoessTransform(x: FieldRef, y: FieldRef): typings.vegaTypings.typesSpecTransformMod.LoessTransform = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("loess")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.LoessTransform]
  }
  
  inline def LookupTransform(fields: js.Array[FieldRef] | SignalRef, from: DataName, key: FieldRef): typings.vegaTypings.typesSpecTransformMod.LookupTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("lookup")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.LookupTransform]
  }
  
  inline def NestTransform(): typings.vegaTypings.typesSpecTransformMod.NestTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("nest")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.NestTransform]
  }
  
  inline def PackTransform(): typings.vegaTypings.typesSpecTransformMod.PackTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("pack")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.PackTransform]
  }
  
  inline def PartitionTransform(): typings.vegaTypings.typesSpecTransformMod.PartitionTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("partition")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.PartitionTransform]
  }
  
  inline def PieTransform(): typings.vegaTypings.typesSpecTransformMod.PieTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("pie")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.PieTransform]
  }
  
  inline def PivotTransform(field: FieldRef, value: FieldRef): typings.vegaTypings.typesSpecTransformMod.PivotTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pivot")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.PivotTransform]
  }
  
  inline def ProjectTransform(): typings.vegaTypings.typesSpecTransformMod.ProjectTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("project")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.ProjectTransform]
  }
  
  inline def QuantileTransform(field: FieldRef): typings.vegaTypings.typesSpecTransformMod.QuantileTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("quantile")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.QuantileTransform]
  }
  
  inline def RegressionTransform(x: FieldRef, y: FieldRef): typings.vegaTypings.typesSpecTransformMod.RegressionTransform = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("regression")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.RegressionTransform]
  }
  
  inline def ResolveFilterTransform(filter: SignalRef, ignore: Double | SignalRef): typings.vegaTypings.typesSpecTransformMod.ResolveFilterTransform = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("resolvefilter")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.ResolveFilterTransform]
  }
  
  inline def SampleTransform(size: Double | SignalRef): typings.vegaTypings.typesSpecTransformMod.SampleTransform = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sample")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.SampleTransform]
  }
  
  inline def SequenceTransform(start: Double | SignalRef, stop: Double | SignalRef): typings.vegaTypings.typesSpecTransformMod.SequenceTransform = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sequence")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.SequenceTransform]
  }
  
  inline def StackTransform(): typings.vegaTypings.typesSpecTransformMod.StackTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("stack")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.StackTransform]
  }
  
  inline def StratifyTransform(key: FieldRef, parentKey: FieldRef): typings.vegaTypings.typesSpecTransformMod.StratifyTransform = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], parentKey = parentKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("stratify")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.StratifyTransform]
  }
  
  inline def TimeUnitTransform(field: FieldRef): typings.vegaTypings.typesSpecTransformMod.TimeUnitTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("timeunit")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.TimeUnitTransform]
  }
  
  inline def TreeLinksTransform(): typings.vegaTypings.typesSpecTransformMod.TreeLinksTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("treelinks")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.TreeLinksTransform]
  }
  
  inline def TreeTransform(): typings.vegaTypings.typesSpecTransformMod.TreeTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("tree")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.TreeTransform]
  }
  
  inline def TreemapTransform(): typings.vegaTypings.typesSpecTransformMod.TreemapTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("treemap")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.TreemapTransform]
  }
  
  inline def VoronoiTransform(x: FieldRef, y: FieldRef): typings.vegaTypings.typesSpecTransformMod.VoronoiTransform = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("voronoi")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.VoronoiTransform]
  }
  
  inline def WindowTransform(): typings.vegaTypings.typesSpecTransformMod.WindowTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("window")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.WindowTransform]
  }
  
  inline def WordcloudTransform(): typings.vegaTypings.typesSpecTransformMod.WordcloudTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("wordcloud")
    __obj.asInstanceOf[typings.vegaTypings.typesSpecTransformMod.WordcloudTransform]
  }
  
  inline def countnumberSignalRefundef(size: (js.Array[Double | SignalRef]) | SignalRef): typings.vegaTypings.anon.countnumberSignalRefundef = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("contour")
    __obj.asInstanceOf[typings.vegaTypings.anon.countnumberSignalRefundef]
  }
  
  inline def thresholdsArraynumberSign(size: (js.Array[Double | SignalRef]) | SignalRef): typings.vegaTypings.anon.thresholdsArraynumberSign = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("contour")
    __obj.asInstanceOf[typings.vegaTypings.anon.thresholdsArraynumberSign]
  }
}
