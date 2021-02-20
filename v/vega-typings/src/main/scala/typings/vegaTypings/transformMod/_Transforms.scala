package typings.vegaTypings.transformMod

import typings.vegaTypings.markMod.Compare
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.aggregate
import typings.vegaTypings.vegaTypingsStrings.bin
import typings.vegaTypings.vegaTypingsStrings.collect
import typings.vegaTypings.vegaTypingsStrings.countpattern
import typings.vegaTypings.vegaTypingsStrings.cross
import typings.vegaTypings.vegaTypingsStrings.crossfilter
import typings.vegaTypings.vegaTypingsStrings.density
import typings.vegaTypings.vegaTypingsStrings.dotbin
import typings.vegaTypings.vegaTypingsStrings.extent
import typings.vegaTypings.vegaTypingsStrings.filter
import typings.vegaTypings.vegaTypingsStrings.flatten
import typings.vegaTypings.vegaTypingsStrings.fold
import typings.vegaTypings.vegaTypingsStrings.force
import typings.vegaTypings.vegaTypingsStrings.formula
import typings.vegaTypings.vegaTypingsStrings.geojson
import typings.vegaTypings.vegaTypingsStrings.geopath
import typings.vegaTypings.vegaTypingsStrings.geopoint
import typings.vegaTypings.vegaTypingsStrings.geoshape
import typings.vegaTypings.vegaTypingsStrings.graticule
import typings.vegaTypings.vegaTypingsStrings.heatmap
import typings.vegaTypings.vegaTypingsStrings.identifier
import typings.vegaTypings.vegaTypingsStrings.impute
import typings.vegaTypings.vegaTypingsStrings.isocontour
import typings.vegaTypings.vegaTypingsStrings.joinaggregate
import typings.vegaTypings.vegaTypingsStrings.kde
import typings.vegaTypings.vegaTypingsStrings.kde2d
import typings.vegaTypings.vegaTypingsStrings.label
import typings.vegaTypings.vegaTypingsStrings.linkpath
import typings.vegaTypings.vegaTypingsStrings.loess
import typings.vegaTypings.vegaTypingsStrings.lookup
import typings.vegaTypings.vegaTypingsStrings.nest
import typings.vegaTypings.vegaTypingsStrings.pack
import typings.vegaTypings.vegaTypingsStrings.partition
import typings.vegaTypings.vegaTypingsStrings.pie
import typings.vegaTypings.vegaTypingsStrings.pivot
import typings.vegaTypings.vegaTypingsStrings.project
import typings.vegaTypings.vegaTypingsStrings.quantile
import typings.vegaTypings.vegaTypingsStrings.regression
import typings.vegaTypings.vegaTypingsStrings.resolvefilter
import typings.vegaTypings.vegaTypingsStrings.sample
import typings.vegaTypings.vegaTypingsStrings.sequence
import typings.vegaTypings.vegaTypingsStrings.stack
import typings.vegaTypings.vegaTypingsStrings.stratify
import typings.vegaTypings.vegaTypingsStrings.timeunit
import typings.vegaTypings.vegaTypingsStrings.tree
import typings.vegaTypings.vegaTypingsStrings.treelinks
import typings.vegaTypings.vegaTypingsStrings.treemap
import typings.vegaTypings.vegaTypingsStrings.voronoi
import typings.vegaTypings.vegaTypingsStrings.window
import typings.vegaTypings.vegaTypingsStrings.wordcloud
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Transforms extends StObject
object _Transforms {
  
  @scala.inline
  def AggregateTransform(`type`: aggregate): typings.vegaTypings.transformMod.AggregateTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.AggregateTransform]
  }
  
  @scala.inline
  def BinTransform(extent: (Vector2[Double | SignalRef]) | SignalRef, field: FieldRef, `type`: bin): typings.vegaTypings.transformMod.BinTransform = {
    val __obj = js.Dynamic.literal(extent = extent.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.BinTransform]
  }
  
  @scala.inline
  def CollectTransform(sort: Compare, `type`: collect): typings.vegaTypings.transformMod.CollectTransform = {
    val __obj = js.Dynamic.literal(sort = sort.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.CollectTransform]
  }
  
  @scala.inline
  def CountPatternTransform(field: FieldRef, `type`: countpattern): typings.vegaTypings.transformMod.CountPatternTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.CountPatternTransform]
  }
  
  @scala.inline
  def CrossFilterTransform(
    fields: (js.Array[String | TransformField]) | SignalRef,
    query: (js.Array[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef,
    `type`: crossfilter
  ): typings.vegaTypings.transformMod.CrossFilterTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.CrossFilterTransform]
  }
  
  @scala.inline
  def CrossTransform(`type`: cross): typings.vegaTypings.transformMod.CrossTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.CrossTransform]
  }
  
  @scala.inline
  def DensityTransform(`type`: density): typings.vegaTypings.transformMod.DensityTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.DensityTransform]
  }
  
  @scala.inline
  def DotBinTransform(field: FieldRef, `type`: dotbin): typings.vegaTypings.transformMod.DotBinTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.DotBinTransform]
  }
  
  @scala.inline
  def ExtentTransform(field: FieldRef, `type`: extent): typings.vegaTypings.transformMod.ExtentTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.ExtentTransform]
  }
  
  @scala.inline
  def FilterTransform(expr: ExprString, `type`: filter): typings.vegaTypings.transformMod.FilterTransform = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.FilterTransform]
  }
  
  @scala.inline
  def FlattenTransform(fields: js.Array[FieldRef] | SignalRef, `type`: flatten): typings.vegaTypings.transformMod.FlattenTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.FlattenTransform]
  }
  
  @scala.inline
  def FoldTransform(fields: js.Array[FieldRef] | SignalRef, `type`: fold): typings.vegaTypings.transformMod.FoldTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.FoldTransform]
  }
  
  @scala.inline
  def ForceTransform(`type`: force): typings.vegaTypings.transformMod.ForceTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.ForceTransform]
  }
  
  @scala.inline
  def FormulaTransform(as: String | SignalRef, expr: ExprString, `type`: formula): typings.vegaTypings.transformMod.FormulaTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.FormulaTransform]
  }
  
  @scala.inline
  def GeoJSONTransform(`type`: geojson): typings.vegaTypings.transformMod.GeoJSONTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.GeoJSONTransform]
  }
  
  @scala.inline
  def GeoPathTransform(`type`: geopath): typings.vegaTypings.transformMod.GeoPathTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.GeoPathTransform]
  }
  
  @scala.inline
  def GeoPointTransform(fields: Vector2[FieldRef] | SignalRef, projection: ProjectionName, `type`: geopoint): typings.vegaTypings.transformMod.GeoPointTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.GeoPointTransform]
  }
  
  @scala.inline
  def GeoShapeTransform(`type`: geoshape): typings.vegaTypings.transformMod.GeoShapeTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.GeoShapeTransform]
  }
  
  @scala.inline
  def GraticuleTransform(`type`: graticule): typings.vegaTypings.transformMod.GraticuleTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.GraticuleTransform]
  }
  
  @scala.inline
  def HeatmapTransform(`type`: heatmap): typings.vegaTypings.transformMod.HeatmapTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.HeatmapTransform]
  }
  
  @scala.inline
  def IdentifierTransform(as: String | SignalRef, `type`: identifier): typings.vegaTypings.transformMod.IdentifierTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.IdentifierTransform]
  }
  
  @scala.inline
  def ImputeTransform(field: FieldRef, key: FieldRef, `type`: impute): typings.vegaTypings.transformMod.ImputeTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.ImputeTransform]
  }
  
  @scala.inline
  def IsocontourTransform(`type`: isocontour): typings.vegaTypings.transformMod.IsocontourTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.IsocontourTransform]
  }
  
  @scala.inline
  def JoinAggregateTransform(`type`: joinaggregate): typings.vegaTypings.transformMod.JoinAggregateTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.JoinAggregateTransform]
  }
  
  @scala.inline
  def KDE2DTransform(
    size: (js.Array[Double | SignalRef]) | SignalRef,
    `type`: kde2d,
    x: String | TransformField,
    y: String | TransformField
  ): typings.vegaTypings.transformMod.KDE2DTransform = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.KDE2DTransform]
  }
  
  @scala.inline
  def KDETransform(field: FieldRef, `type`: kde): typings.vegaTypings.transformMod.KDETransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.KDETransform]
  }
  
  @scala.inline
  def LabelTransform(size: (Vector2[Double | SignalRef]) | SignalRef, `type`: label): typings.vegaTypings.transformMod.LabelTransform = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.LabelTransform]
  }
  
  @scala.inline
  def LinkPathTransform(`type`: linkpath): typings.vegaTypings.transformMod.LinkPathTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.LinkPathTransform]
  }
  
  @scala.inline
  def LoessTransform(`type`: loess, x: FieldRef, y: FieldRef): typings.vegaTypings.transformMod.LoessTransform = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.LoessTransform]
  }
  
  @scala.inline
  def LookupTransform(fields: js.Array[FieldRef] | SignalRef, from: DataName, key: FieldRef, `type`: lookup): typings.vegaTypings.transformMod.LookupTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.LookupTransform]
  }
  
  @scala.inline
  def NestTransform(`type`: nest): typings.vegaTypings.transformMod.NestTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.NestTransform]
  }
  
  @scala.inline
  def PackTransform(`type`: pack): typings.vegaTypings.transformMod.PackTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.PackTransform]
  }
  
  @scala.inline
  def PartitionTransform(`type`: partition): typings.vegaTypings.transformMod.PartitionTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.PartitionTransform]
  }
  
  @scala.inline
  def PieTransform(`type`: pie): typings.vegaTypings.transformMod.PieTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.PieTransform]
  }
  
  @scala.inline
  def PivotTransform(field: FieldRef, `type`: pivot, value: FieldRef): typings.vegaTypings.transformMod.PivotTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.PivotTransform]
  }
  
  @scala.inline
  def ProjectTransform(`type`: project): typings.vegaTypings.transformMod.ProjectTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.ProjectTransform]
  }
  
  @scala.inline
  def QuantileTransform(field: FieldRef, `type`: quantile): typings.vegaTypings.transformMod.QuantileTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.QuantileTransform]
  }
  
  @scala.inline
  def RegressionTransform(`type`: regression, x: FieldRef, y: FieldRef): typings.vegaTypings.transformMod.RegressionTransform = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.RegressionTransform]
  }
  
  @scala.inline
  def ResolveFilterTransform(filter: SignalRef, ignore: Double | SignalRef, `type`: resolvefilter): typings.vegaTypings.transformMod.ResolveFilterTransform = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.ResolveFilterTransform]
  }
  
  @scala.inline
  def SampleTransform(size: Double | SignalRef, `type`: sample): typings.vegaTypings.transformMod.SampleTransform = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.SampleTransform]
  }
  
  @scala.inline
  def SequenceTransform(start: Double | SignalRef, stop: Double | SignalRef, `type`: sequence): typings.vegaTypings.transformMod.SequenceTransform = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.SequenceTransform]
  }
  
  @scala.inline
  def StackTransform(`type`: stack): typings.vegaTypings.transformMod.StackTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.StackTransform]
  }
  
  @scala.inline
  def StratifyTransform(key: FieldRef, parentKey: FieldRef, `type`: stratify): typings.vegaTypings.transformMod.StratifyTransform = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], parentKey = parentKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.StratifyTransform]
  }
  
  @scala.inline
  def TimeUnitTransform(field: FieldRef, `type`: timeunit): typings.vegaTypings.transformMod.TimeUnitTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.TimeUnitTransform]
  }
  
  @scala.inline
  def TreeLinksTransform(`type`: treelinks): typings.vegaTypings.transformMod.TreeLinksTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.TreeLinksTransform]
  }
  
  @scala.inline
  def TreeTransform(`type`: tree): typings.vegaTypings.transformMod.TreeTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.TreeTransform]
  }
  
  @scala.inline
  def TreemapTransform(`type`: treemap): typings.vegaTypings.transformMod.TreemapTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.TreemapTransform]
  }
  
  @scala.inline
  def VoronoiTransform(`type`: voronoi, x: FieldRef, y: FieldRef): typings.vegaTypings.transformMod.VoronoiTransform = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.VoronoiTransform]
  }
  
  @scala.inline
  def WindowTransform(`type`: window): typings.vegaTypings.transformMod.WindowTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.WindowTransform]
  }
  
  @scala.inline
  def WordcloudTransform(`type`: wordcloud): typings.vegaTypings.transformMod.WordcloudTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.transformMod.WordcloudTransform]
  }
}
