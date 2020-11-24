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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Transforms extends js.Object
object _Transforms {
  
  @scala.inline
  def GraticuleTransform(`type`: graticule): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def RegressionTransform(`type`: regression, x: FieldRef, y: FieldRef): _Transforms = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def ExtentTransform(field: FieldRef, `type`: extent): _Transforms = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def AggregateTransform(`type`: aggregate): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def TreeLinksTransform(`type`: treelinks): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def GeoPathTransform(`type`: geopath): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def CrossTransform(`type`: cross): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def CollectTransform(sort: Compare, `type`: collect): _Transforms = {
    val __obj = js.Dynamic.literal(sort = sort.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def WindowTransform(`type`: window): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def SequenceTransform(start: Double | SignalRef, stop: Double | SignalRef, `type`: sequence): _Transforms = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def JoinAggregateTransform(`type`: joinaggregate): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def LinkPathTransform(`type`: linkpath): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def GeoShapeTransform(`type`: geoshape): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def KDETransform(field: FieldRef, `type`: kde): _Transforms = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def PieTransform(`type`: pie): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def GeoJSONTransform(`type`: geojson): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def PartitionTransform(`type`: partition): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def KDE2DTransform(
    size: (js.Array[Double | SignalRef]) | SignalRef,
    `type`: kde2d,
    x: String | TransformField,
    y: String | TransformField
  ): _Transforms = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def FoldTransform(fields: js.Array[FieldRef] | SignalRef, `type`: fold): _Transforms = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def FlattenTransform(fields: js.Array[FieldRef] | SignalRef, `type`: flatten): _Transforms = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def NestTransform(`type`: nest): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def ProjectTransform(`type`: project): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def DotBinTransform(field: FieldRef, `type`: dotbin): _Transforms = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def CrossFilterTransform(
    fields: (js.Array[String | TransformField]) | SignalRef,
    query: (js.Array[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef,
    `type`: crossfilter
  ): _Transforms = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def TimeUnitTransform(field: FieldRef, `type`: timeunit): _Transforms = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def BinTransform(extent: (Vector2[Double | SignalRef]) | SignalRef, field: FieldRef, `type`: bin): _Transforms = {
    val __obj = js.Dynamic.literal(extent = extent.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def TreemapTransform(`type`: treemap): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def ImputeTransform(field: FieldRef, key: FieldRef, `type`: impute): _Transforms = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def SampleTransform(size: Double | SignalRef, `type`: sample): _Transforms = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def DensityTransform(`type`: density): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def LoessTransform(`type`: loess, x: FieldRef, y: FieldRef): _Transforms = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def FormulaTransform(as: String | SignalRef, expr: ExprString, `type`: formula): _Transforms = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def ResolveFilterTransform(filter: SignalRef, ignore: Double | SignalRef, `type`: resolvefilter): _Transforms = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def GeoPointTransform(fields: Vector2[FieldRef] | SignalRef, projection: ProjectionName, `type`: geopoint): _Transforms = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def StratifyTransform(key: FieldRef, parentKey: FieldRef, `type`: stratify): _Transforms = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], parentKey = parentKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def VoronoiTransform(`type`: voronoi, x: FieldRef, y: FieldRef): _Transforms = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def PackTransform(`type`: pack): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def CountPatternTransform(field: FieldRef, `type`: countpattern): _Transforms = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def IdentifierTransform(as: String | SignalRef, `type`: identifier): _Transforms = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def QuantileTransform(field: FieldRef, `type`: quantile): _Transforms = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def PivotTransform(field: FieldRef, `type`: pivot, value: FieldRef): _Transforms = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def ForceTransform(`type`: force): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def IsocontourTransform(`type`: isocontour): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def LabelTransform(size: (Vector2[Double | SignalRef]) | SignalRef, `type`: label): _Transforms = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def HeatmapTransform(`type`: heatmap): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def FilterTransform(expr: ExprString, `type`: filter): _Transforms = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def StackTransform(`type`: stack): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def LookupTransform(fields: js.Array[FieldRef] | SignalRef, from: DataName, key: FieldRef, `type`: lookup): _Transforms = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def WordcloudTransform(`type`: wordcloud): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  
  @scala.inline
  def TreeTransform(`type`: tree): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
}
