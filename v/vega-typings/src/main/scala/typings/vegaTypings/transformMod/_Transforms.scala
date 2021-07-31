package typings.vegaTypings.transformMod

import typings.vegaTypings.markMod.Compare
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Transforms extends StObject
object _Transforms {
  
  @scala.inline
  def AggregateTransform(): typings.vegaTypings.transformMod.AggregateTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("aggregate")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.AggregateTransform]
  }
  
  @scala.inline
  def BinTransform(extent: (Vector2[Double | SignalRef]) | SignalRef, field: FieldRef): typings.vegaTypings.transformMod.BinTransform = {
    val __obj = js.Dynamic.literal(extent = extent.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bin")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.BinTransform]
  }
  
  @scala.inline
  def CollectTransform(sort: Compare): typings.vegaTypings.transformMod.CollectTransform = {
    val __obj = js.Dynamic.literal(sort = sort.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("collect")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.CollectTransform]
  }
  
  @scala.inline
  def CountPatternTransform(field: FieldRef): typings.vegaTypings.transformMod.CountPatternTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("countpattern")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.CountPatternTransform]
  }
  
  @scala.inline
  def CrossFilterTransform(
    fields: (js.Array[String | TransformField]) | SignalRef,
    query: (js.Array[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef
  ): typings.vegaTypings.transformMod.CrossFilterTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("crossfilter")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.CrossFilterTransform]
  }
  
  @scala.inline
  def CrossTransform(): typings.vegaTypings.transformMod.CrossTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("cross")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.CrossTransform]
  }
  
  @scala.inline
  def DensityTransform(): typings.vegaTypings.transformMod.DensityTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("density")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.DensityTransform]
  }
  
  @scala.inline
  def DotBinTransform(field: FieldRef): typings.vegaTypings.transformMod.DotBinTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dotbin")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.DotBinTransform]
  }
  
  @scala.inline
  def ExtentTransform(field: FieldRef): typings.vegaTypings.transformMod.ExtentTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("extent")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.ExtentTransform]
  }
  
  @scala.inline
  def FilterTransform(expr: ExprString): typings.vegaTypings.transformMod.FilterTransform = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("filter")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.FilterTransform]
  }
  
  @scala.inline
  def FlattenTransform(fields: js.Array[FieldRef] | SignalRef): typings.vegaTypings.transformMod.FlattenTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("flatten")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.FlattenTransform]
  }
  
  @scala.inline
  def FoldTransform(fields: js.Array[FieldRef] | SignalRef): typings.vegaTypings.transformMod.FoldTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fold")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.FoldTransform]
  }
  
  @scala.inline
  def ForceTransform(): typings.vegaTypings.transformMod.ForceTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("force")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.ForceTransform]
  }
  
  @scala.inline
  def FormulaTransform(as: String | SignalRef, expr: ExprString): typings.vegaTypings.transformMod.FormulaTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("formula")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.FormulaTransform]
  }
  
  @scala.inline
  def GeoJSONTransform(): typings.vegaTypings.transformMod.GeoJSONTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("geojson")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.GeoJSONTransform]
  }
  
  @scala.inline
  def GeoPathTransform(): typings.vegaTypings.transformMod.GeoPathTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("geopath")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.GeoPathTransform]
  }
  
  @scala.inline
  def GeoPointTransform(fields: Vector2[FieldRef] | SignalRef, projection: ProjectionName): typings.vegaTypings.transformMod.GeoPointTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("geopoint")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.GeoPointTransform]
  }
  
  @scala.inline
  def GeoShapeTransform(): typings.vegaTypings.transformMod.GeoShapeTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("geoshape")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.GeoShapeTransform]
  }
  
  @scala.inline
  def GraticuleTransform(): typings.vegaTypings.transformMod.GraticuleTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("graticule")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.GraticuleTransform]
  }
  
  @scala.inline
  def HeatmapTransform(): typings.vegaTypings.transformMod.HeatmapTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("heatmap")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.HeatmapTransform]
  }
  
  @scala.inline
  def IdentifierTransform(as: String | SignalRef): typings.vegaTypings.transformMod.IdentifierTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("identifier")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.IdentifierTransform]
  }
  
  @scala.inline
  def ImputeTransform(field: FieldRef, key: FieldRef): typings.vegaTypings.transformMod.ImputeTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("impute")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.ImputeTransform]
  }
  
  @scala.inline
  def IsocontourTransform(): typings.vegaTypings.transformMod.IsocontourTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("isocontour")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.IsocontourTransform]
  }
  
  @scala.inline
  def JoinAggregateTransform(): typings.vegaTypings.transformMod.JoinAggregateTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("joinaggregate")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.JoinAggregateTransform]
  }
  
  @scala.inline
  def KDE2DTransform(
    size: (js.Array[Double | SignalRef]) | SignalRef,
    x: String | TransformField,
    y: String | TransformField
  ): typings.vegaTypings.transformMod.KDE2DTransform = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("kde2d")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.KDE2DTransform]
  }
  
  @scala.inline
  def KDETransform(field: FieldRef): typings.vegaTypings.transformMod.KDETransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("kde")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.KDETransform]
  }
  
  @scala.inline
  def LabelTransform(size: (Vector2[Double | SignalRef]) | SignalRef): typings.vegaTypings.transformMod.LabelTransform = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("label")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.LabelTransform]
  }
  
  @scala.inline
  def LinkPathTransform(): typings.vegaTypings.transformMod.LinkPathTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("linkpath")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.LinkPathTransform]
  }
  
  @scala.inline
  def LoessTransform(x: FieldRef, y: FieldRef): typings.vegaTypings.transformMod.LoessTransform = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("loess")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.LoessTransform]
  }
  
  @scala.inline
  def LookupTransform(fields: js.Array[FieldRef] | SignalRef, from: DataName, key: FieldRef): typings.vegaTypings.transformMod.LookupTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("lookup")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.LookupTransform]
  }
  
  @scala.inline
  def NestTransform(): typings.vegaTypings.transformMod.NestTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("nest")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.NestTransform]
  }
  
  @scala.inline
  def PackTransform(): typings.vegaTypings.transformMod.PackTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("pack")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.PackTransform]
  }
  
  @scala.inline
  def PartitionTransform(): typings.vegaTypings.transformMod.PartitionTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("partition")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.PartitionTransform]
  }
  
  @scala.inline
  def PieTransform(): typings.vegaTypings.transformMod.PieTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("pie")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.PieTransform]
  }
  
  @scala.inline
  def PivotTransform(field: FieldRef, value: FieldRef): typings.vegaTypings.transformMod.PivotTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pivot")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.PivotTransform]
  }
  
  @scala.inline
  def ProjectTransform(): typings.vegaTypings.transformMod.ProjectTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("project")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.ProjectTransform]
  }
  
  @scala.inline
  def QuantileTransform(field: FieldRef): typings.vegaTypings.transformMod.QuantileTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("quantile")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.QuantileTransform]
  }
  
  @scala.inline
  def RegressionTransform(x: FieldRef, y: FieldRef): typings.vegaTypings.transformMod.RegressionTransform = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("regression")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.RegressionTransform]
  }
  
  @scala.inline
  def ResolveFilterTransform(filter: SignalRef, ignore: Double | SignalRef): typings.vegaTypings.transformMod.ResolveFilterTransform = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("resolvefilter")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.ResolveFilterTransform]
  }
  
  @scala.inline
  def SampleTransform(size: Double | SignalRef): typings.vegaTypings.transformMod.SampleTransform = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sample")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.SampleTransform]
  }
  
  @scala.inline
  def SequenceTransform(start: Double | SignalRef, stop: Double | SignalRef): typings.vegaTypings.transformMod.SequenceTransform = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sequence")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.SequenceTransform]
  }
  
  @scala.inline
  def StackTransform(): typings.vegaTypings.transformMod.StackTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("stack")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.StackTransform]
  }
  
  @scala.inline
  def StratifyTransform(key: FieldRef, parentKey: FieldRef): typings.vegaTypings.transformMod.StratifyTransform = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], parentKey = parentKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("stratify")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.StratifyTransform]
  }
  
  @scala.inline
  def TimeUnitTransform(field: FieldRef): typings.vegaTypings.transformMod.TimeUnitTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("timeunit")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.TimeUnitTransform]
  }
  
  @scala.inline
  def TreeLinksTransform(): typings.vegaTypings.transformMod.TreeLinksTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("treelinks")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.TreeLinksTransform]
  }
  
  @scala.inline
  def TreeTransform(): typings.vegaTypings.transformMod.TreeTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("tree")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.TreeTransform]
  }
  
  @scala.inline
  def TreemapTransform(): typings.vegaTypings.transformMod.TreemapTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("treemap")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.TreemapTransform]
  }
  
  @scala.inline
  def VoronoiTransform(x: FieldRef, y: FieldRef): typings.vegaTypings.transformMod.VoronoiTransform = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("voronoi")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.VoronoiTransform]
  }
  
  @scala.inline
  def WindowTransform(): typings.vegaTypings.transformMod.WindowTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("window")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.WindowTransform]
  }
  
  @scala.inline
  def WordcloudTransform(): typings.vegaTypings.transformMod.WordcloudTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("wordcloud")
    __obj.asInstanceOf[typings.vegaTypings.transformMod.WordcloudTransform]
  }
}
