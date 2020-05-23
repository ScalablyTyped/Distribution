package typings.vegaTypings.transformMod

import typings.vegaTypings.encodeMod.FontStyle
import typings.vegaTypings.encodeMod.FontWeight
import typings.vegaTypings.exprMod.ExprRef
import typings.vegaTypings.markMod.Compare
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.utilMod.Vector4
import typings.vegaTypings.utilMod.Vector5
import typings.vegaTypings.utilMod.Vector6
import typings.vegaTypings.utilMod.Vector7
import typings.vegaTypings.vegaTypingsStrings.aggregate
import typings.vegaTypings.vegaTypingsStrings.begin
import typings.vegaTypings.vegaTypingsStrings.bin
import typings.vegaTypings.vegaTypingsStrings.collect
import typings.vegaTypings.vegaTypingsStrings.countpattern
import typings.vegaTypings.vegaTypingsStrings.cross
import typings.vegaTypings.vegaTypingsStrings.crossfilter
import typings.vegaTypings.vegaTypingsStrings.density
import typings.vegaTypings.vegaTypingsStrings.dotbin
import typings.vegaTypings.vegaTypingsStrings.end
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
import typings.vegaTypings.vegaTypingsStrings.independent
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
import typings.vegaTypings.vegaTypingsStrings.shared
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
import scala.scalajs.js.annotation._

trait _Transforms extends js.Object

object _Transforms {
  @scala.inline
  def GraticuleTransform(
    `type`: graticule,
    extent: (Vector2[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef = null,
    extentMajor: (Vector2[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef = null,
    extentMinor: (Vector2[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef = null,
    precision: Double | SignalRef = null,
    signal: SignalName = null,
    step: (Vector2[Double | SignalRef]) | SignalRef = null,
    stepMajor: (Vector2[Double | SignalRef]) | SignalRef = null,
    stepMinor: (Vector2[Double | SignalRef]) | SignalRef = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (extentMajor != null) __obj.updateDynamic("extentMajor")(extentMajor.asInstanceOf[js.Any])
    if (extentMinor != null) __obj.updateDynamic("extentMinor")(extentMinor.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (stepMajor != null) __obj.updateDynamic("stepMajor")(stepMajor.asInstanceOf[js.Any])
    if (stepMinor != null) __obj.updateDynamic("stepMinor")(stepMinor.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def RegressionTransform(
    `type`: regression,
    x: FieldRef,
    y: FieldRef,
    as: (Vector2[String | SignalRef]) | SignalRef = null,
    extent: (js.Tuple2[Double, Double]) | SignalRef = null,
    groupby: js.Array[FieldRef] | SignalRef = null,
    method: RegressionMethod | SignalRef = null,
    order: Double | SignalRef = null,
    params: Boolean | SignalRef = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (groupby != null) __obj.updateDynamic("groupby")(groupby.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def ExtentTransform(field: FieldRef, `type`: extent, signal: String = null): _Transforms = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def AggregateTransform(
    `type`: aggregate,
    as: (js.Array[String | SignalRef | Null]) | SignalRef = null,
    cross: Boolean | SignalRef = null,
    drop: Boolean | SignalRef = null,
    fields: (js.Array[FieldRef | Null]) | SignalRef = null,
    groupby: js.Array[FieldRef] | SignalRef = null,
    key: String | TransformField = null,
    ops: (js.Array[AggregateOp | SignalRef]) | SignalRef = null,
    signal: String = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (cross != null) __obj.updateDynamic("cross")(cross.asInstanceOf[js.Any])
    if (drop != null) __obj.updateDynamic("drop")(drop.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (groupby != null) __obj.updateDynamic("groupby")(groupby.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ops != null) __obj.updateDynamic("ops")(ops.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def TreeLinksTransform(`type`: treelinks): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def GeoPathTransform(
    `type`: geopath,
    as: String | SignalRef = null,
    field: FieldRef = null,
    pointRadius: Double | SignalRef | ExprRef = null,
    projection: ProjectionName = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (pointRadius != null) __obj.updateDynamic("pointRadius")(pointRadius.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def CrossTransform(`type`: cross, as: (Vector2[String | SignalRef]) | SignalRef = null, filter: ExprString = null): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def CollectTransform(sort: Compare, `type`: collect): _Transforms = {
    val __obj = js.Dynamic.literal(sort = sort.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def WindowTransform(
    `type`: window,
    as: (js.Array[String | SignalRef | Null]) | SignalRef = null,
    fields: (js.Array[FieldRef | Null]) | SignalRef = null,
    frame: (Vector2[Double | SignalRef | Null]) | SignalRef = null,
    groupby: js.Array[FieldRef] | SignalRef = null,
    ignorePeers: Boolean | SignalRef = null,
    ops: js.Array[AggregateOp | WindowOnlyOp | SignalRef] = null,
    params: (js.Array[Double | SignalRef | Null]) | SignalRef = null,
    sort: Compare = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (frame != null) __obj.updateDynamic("frame")(frame.asInstanceOf[js.Any])
    if (groupby != null) __obj.updateDynamic("groupby")(groupby.asInstanceOf[js.Any])
    if (ignorePeers != null) __obj.updateDynamic("ignorePeers")(ignorePeers.asInstanceOf[js.Any])
    if (ops != null) __obj.updateDynamic("ops")(ops.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def SequenceTransform(
    start: Double | SignalRef,
    stop: Double | SignalRef,
    `type`: sequence,
    as: String | SignalRef = null,
    step: Double | SignalRef = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def JoinAggregateTransform(
    `type`: joinaggregate,
    as: (js.Array[String | SignalRef | Null]) | SignalRef = null,
    fields: (js.Array[FieldRef | Null]) | SignalRef = null,
    groupby: js.Array[FieldRef] | SignalRef = null,
    ops: (js.Array[AggregateOp | SignalRef]) | SignalRef = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (groupby != null) __obj.updateDynamic("groupby")(groupby.asInstanceOf[js.Any])
    if (ops != null) __obj.updateDynamic("ops")(ops.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def LinkPathTransform(
    `type`: linkpath,
    as: String | SignalRef = null,
    orient: LinkPathOrient | SignalRef = null,
    require: SignalRef = null,
    shape: LinkPathShape | SignalRef = null,
    sourceX: FieldRef = null,
    sourceY: FieldRef = null,
    targetX: FieldRef = null,
    targetY: FieldRef = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
    if (require != null) __obj.updateDynamic("require")(require.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (sourceX != null) __obj.updateDynamic("sourceX")(sourceX.asInstanceOf[js.Any])
    if (sourceY != null) __obj.updateDynamic("sourceY")(sourceY.asInstanceOf[js.Any])
    if (targetX != null) __obj.updateDynamic("targetX")(targetX.asInstanceOf[js.Any])
    if (targetY != null) __obj.updateDynamic("targetY")(targetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def GeoShapeTransform(
    `type`: geoshape,
    as: String | SignalRef = null,
    field: FieldRef = null,
    pointRadius: Double | SignalRef | ExprRef = null,
    projection: ProjectionName = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (pointRadius != null) __obj.updateDynamic("pointRadius")(pointRadius.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def KDETransform(
    field: FieldRef,
    `type`: kde,
    as: (Vector2[String | SignalRef]) | SignalRef = null,
    bandwidth: Double | SignalRef = null,
    counts: Boolean | SignalRef = null,
    cumulative: Boolean | SignalRef = null,
    extent: (Vector2[Double | SignalRef]) | SignalRef = null,
    groupby: js.Array[FieldRef] | SignalRef = null,
    maxsteps: Double | SignalRef = null,
    minsteps: Double | SignalRef = null,
    resolve: KDEResolve | SignalRef = null,
    steps: Double | SignalRef = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (bandwidth != null) __obj.updateDynamic("bandwidth")(bandwidth.asInstanceOf[js.Any])
    if (counts != null) __obj.updateDynamic("counts")(counts.asInstanceOf[js.Any])
    if (cumulative != null) __obj.updateDynamic("cumulative")(cumulative.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (groupby != null) __obj.updateDynamic("groupby")(groupby.asInstanceOf[js.Any])
    if (maxsteps != null) __obj.updateDynamic("maxsteps")(maxsteps.asInstanceOf[js.Any])
    if (minsteps != null) __obj.updateDynamic("minsteps")(minsteps.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(resolve.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def PieTransform(
    `type`: pie,
    as: (Vector2[String | SignalRef]) | SignalRef = null,
    endAngle: Double | SignalRef = null,
    field: FieldRef = null,
    sort: Boolean | SignalRef = null,
    startAngle: Double | SignalRef = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def GeoJSONTransform(
    `type`: geojson,
    fields: Vector2[FieldRef] | SignalRef = null,
    geojson: FieldRef = null,
    signal: SignalName = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (geojson != null) __obj.updateDynamic("geojson")(geojson.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def PartitionTransform(
    `type`: partition,
    as: (Vector6[String | SignalRef]) | SignalRef = null,
    field: FieldRef = null,
    padding: Double | SignalRef = null,
    round: Boolean | SignalRef = null,
    size: (Vector2[Double | SignalRef]) | SignalRef = null,
    sort: Compare = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def KDE2DTransform(
    size: (js.Array[Double | SignalRef]) | SignalRef,
    `type`: kde2d,
    x: String | TransformField,
    y: String | TransformField,
    as: String | SignalRef = null,
    bandwidth: (js.Array[Double | SignalRef]) | SignalRef = null,
    cellSize: Double | SignalRef = null,
    counts: Boolean | SignalRef = null,
    groupby: (js.Array[String | TransformField]) | SignalRef = null,
    weight: String | TransformField = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (bandwidth != null) __obj.updateDynamic("bandwidth")(bandwidth.asInstanceOf[js.Any])
    if (cellSize != null) __obj.updateDynamic("cellSize")(cellSize.asInstanceOf[js.Any])
    if (counts != null) __obj.updateDynamic("counts")(counts.asInstanceOf[js.Any])
    if (groupby != null) __obj.updateDynamic("groupby")(groupby.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def FoldTransform(
    fields: js.Array[FieldRef] | SignalRef,
    `type`: fold,
    as: (Vector2[String | SignalRef]) | SignalRef = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def FlattenTransform(
    fields: js.Array[FieldRef] | SignalRef,
    `type`: flatten,
    as: (js.Array[String | SignalRef]) | SignalRef = null,
    index: String | SignalRef = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def NestTransform(`type`: nest, generate: Boolean | SignalRef = null, keys: js.Array[FieldRef] | SignalRef = null): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (generate != null) __obj.updateDynamic("generate")(generate.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def ProjectTransform(
    `type`: project,
    as: (js.Array[String | SignalRef | Null]) | SignalRef = null,
    fields: js.Array[FieldRef] | SignalRef = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def DotBinTransform(
    field: FieldRef,
    `type`: dotbin,
    as: String | SignalRef = null,
    groupby: js.Array[FieldRef] | SignalRef = null,
    signal: SignalName = null,
    smooth: Boolean | SignalRef = null,
    step: Double | SignalRef = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (groupby != null) __obj.updateDynamic("groupby")(groupby.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (smooth != null) __obj.updateDynamic("smooth")(smooth.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def CrossFilterTransform(
    fields: (js.Array[String | TransformField]) | SignalRef,
    query: (js.Array[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef,
    `type`: crossfilter,
    signal: SignalName = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def TimeUnitTransform(
    field: FieldRef,
    `type`: timeunit,
    as: (Vector2[String | SignalRef]) | SignalRef = null,
    interval: Boolean | SignalRef = null,
    signal: SignalName = null,
    step: Double | SignalRef = null,
    timezone: TimeZone | SignalRef = null,
    units: (js.Array[TimeUnit | SignalRef]) | SignalRef = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def BinTransform(
    extent: (Vector2[Double | SignalRef]) | SignalRef,
    field: FieldRef,
    `type`: bin,
    anchor: Double | SignalRef = null,
    as: (Vector2[String | SignalRef]) | SignalRef = null,
    base: Double | SignalRef = null,
    divide: (Vector2[Double | SignalRef]) | SignalRef = null,
    interval: Boolean | SignalRef = null,
    maxbins: Double | SignalRef = null,
    minstep: Double | SignalRef = null,
    name: String | SignalRef = null,
    nice: Boolean | SignalRef = null,
    signal: SignalName = null,
    span: Double | SignalRef = null,
    step: Double | SignalRef = null,
    steps: (js.Array[Double | SignalRef]) | SignalRef = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal(extent = extent.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (divide != null) __obj.updateDynamic("divide")(divide.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (maxbins != null) __obj.updateDynamic("maxbins")(maxbins.asInstanceOf[js.Any])
    if (minstep != null) __obj.updateDynamic("minstep")(minstep.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nice != null) __obj.updateDynamic("nice")(nice.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def TreemapTransform(
    `type`: treemap,
    as: (Vector6[String | SignalRef]) | SignalRef = null,
    field: FieldRef = null,
    method: TreemapMethod | SignalRef = null,
    padding: Double | SignalRef = null,
    paddingBottom: Double | SignalRef = null,
    paddingInner: Double | SignalRef = null,
    paddingLeft: Double | SignalRef = null,
    paddingOuter: Double | SignalRef = null,
    paddingRight: Double | SignalRef = null,
    paddingTop: Double | SignalRef = null,
    ratio: Double | SignalRef = null,
    round: Boolean | SignalRef = null,
    size: (Vector2[Double | SignalRef]) | SignalRef = null,
    sort: Compare = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (paddingInner != null) __obj.updateDynamic("paddingInner")(paddingInner.asInstanceOf[js.Any])
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (paddingOuter != null) __obj.updateDynamic("paddingOuter")(paddingOuter.asInstanceOf[js.Any])
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def ImputeTransform(
    field: FieldRef,
    key: FieldRef,
    `type`: impute,
    groupby: js.Array[FieldRef] | SignalRef = null,
    keyvals: js.Array[_] | SignalRef = null,
    method: ImputeMethod | SignalRef = null,
    value: js.Any = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (groupby != null) __obj.updateDynamic("groupby")(groupby.asInstanceOf[js.Any])
    if (keyvals != null) __obj.updateDynamic("keyvals")(keyvals.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def SampleTransform(size: Double | SignalRef, `type`: sample): _Transforms = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def DensityTransform(
    `type`: density,
    as: (Vector2[String | SignalRef]) | SignalRef = null,
    distribution: Distribution | SignalRef = null,
    extent: (Vector2[Double | SignalRef]) | SignalRef = null,
    maxsteps: Double | SignalRef = null,
    method: DensityMethod | SignalRef = null,
    minsteps: Double | SignalRef = null,
    steps: Double | SignalRef = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (distribution != null) __obj.updateDynamic("distribution")(distribution.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (maxsteps != null) __obj.updateDynamic("maxsteps")(maxsteps.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (minsteps != null) __obj.updateDynamic("minsteps")(minsteps.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def LoessTransform(
    `type`: loess,
    x: FieldRef,
    y: FieldRef,
    as: (Vector2[String | SignalRef]) | SignalRef = null,
    bandwidth: Double | SignalRef = null,
    groupby: js.Array[FieldRef] | SignalRef = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (bandwidth != null) __obj.updateDynamic("bandwidth")(bandwidth.asInstanceOf[js.Any])
    if (groupby != null) __obj.updateDynamic("groupby")(groupby.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def FormulaTransform(
    as: String | SignalRef,
    expr: ExprString,
    `type`: formula,
    initonly: js.UndefOr[Boolean] = js.undefined
  ): _Transforms = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(initonly)) __obj.updateDynamic("initonly")(initonly.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def ResolveFilterTransform(filter: SignalRef, ignore: Double | SignalRef, `type`: resolvefilter): _Transforms = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def GeoPointTransform(
    fields: Vector2[FieldRef] | SignalRef,
    projection: ProjectionName,
    `type`: geopoint,
    as: (Vector2[String | SignalRef]) | SignalRef = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def StratifyTransform(key: FieldRef, parentKey: FieldRef, `type`: stratify): _Transforms = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], parentKey = parentKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def VoronoiTransform(
    `type`: voronoi,
    x: FieldRef,
    y: FieldRef,
    as: String | SignalRef = null,
    extent: (Vector2[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef = null,
    size: (Vector2[Double | SignalRef]) | SignalRef = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def PackTransform(
    `type`: pack,
    as: (Vector5[String | SignalRef]) | SignalRef = null,
    field: FieldRef = null,
    padding: Double | SignalRef = null,
    radius: FieldRef = null,
    size: (Vector2[Double | SignalRef]) | SignalRef = null,
    sort: Compare = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def CountPatternTransform(
    field: FieldRef,
    `type`: countpattern,
    as: (Vector2[String | SignalRef]) | SignalRef = null,
    `case`: String | SignalRef = null,
    pattern: String | SignalRef = null,
    stopwords: String | SignalRef = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (`case` != null) __obj.updateDynamic("case")(`case`.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (stopwords != null) __obj.updateDynamic("stopwords")(stopwords.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def IdentifierTransform(as: String | SignalRef, `type`: identifier): _Transforms = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def QuantileTransform(
    field: FieldRef,
    `type`: quantile,
    as: (js.Array[String | SignalRef]) | SignalRef = null,
    groupby: js.Array[FieldRef] | SignalRef = null,
    probs: js.Array[Double] | SignalRef = null,
    step: Double | SignalRef = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (groupby != null) __obj.updateDynamic("groupby")(groupby.asInstanceOf[js.Any])
    if (probs != null) __obj.updateDynamic("probs")(probs.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def PivotTransform(
    field: FieldRef,
    `type`: pivot,
    value: FieldRef,
    groupby: js.Array[FieldRef] | SignalRef = null,
    key: String | TransformField = null,
    limit: Double | SignalRef = null,
    op: String | SignalRef = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (groupby != null) __obj.updateDynamic("groupby")(groupby.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (op != null) __obj.updateDynamic("op")(op.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def ForceTransform(
    `type`: force,
    alpha: Double | SignalRef = null,
    alphaMin: Double | SignalRef = null,
    alphaTarget: Double | SignalRef = null,
    forces: (js.Array[Force | SignalRef]) | SignalRef = null,
    iterations: Double | SignalRef = null,
    restart: Boolean | SignalRef = null,
    signal: SignalName = null,
    static: Boolean | SignalRef = null,
    velocityDecay: Double | SignalRef = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (alphaMin != null) __obj.updateDynamic("alphaMin")(alphaMin.asInstanceOf[js.Any])
    if (alphaTarget != null) __obj.updateDynamic("alphaTarget")(alphaTarget.asInstanceOf[js.Any])
    if (forces != null) __obj.updateDynamic("forces")(forces.asInstanceOf[js.Any])
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    if (restart != null) __obj.updateDynamic("restart")(restart.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (static != null) __obj.updateDynamic("static")(static.asInstanceOf[js.Any])
    if (velocityDecay != null) __obj.updateDynamic("velocityDecay")(velocityDecay.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def IsocontourTransform(
    `type`: isocontour,
    as: js.UndefOr[Null | String | SignalRef] = js.undefined,
    field: String | TransformField = null,
    levels: Double | SignalRef = null,
    nice: Boolean | SignalRef = null,
    resolve: shared | independent | SignalRef = null,
    scale: Double | TransformField = null,
    smooth: Boolean | SignalRef = null,
    thresholds: (js.Array[Double | SignalRef]) | SignalRef = null,
    translate: js.Array[Double] | TransformField = null,
    zero: Boolean | SignalRef = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(as)) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (levels != null) __obj.updateDynamic("levels")(levels.asInstanceOf[js.Any])
    if (nice != null) __obj.updateDynamic("nice")(nice.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(resolve.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (smooth != null) __obj.updateDynamic("smooth")(smooth.asInstanceOf[js.Any])
    if (thresholds != null) __obj.updateDynamic("thresholds")(thresholds.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (zero != null) __obj.updateDynamic("zero")(zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def LabelTransform(
    size: (Vector2[Double | SignalRef]) | SignalRef,
    `type`: label,
    anchor: js.Array[String] | String | SignalRef = null,
    as: (Vector7[String | SignalRef]) | SignalRef = null,
    avoidBaseMark: Boolean | SignalRef = null,
    avoidMarks: js.Array[String] = null,
    lineAnchor: begin | end | SignalRef = null,
    markIndex: js.UndefOr[Double] = js.undefined,
    offset: js.Array[Double] | Double | SignalRef = null,
    padding: Double | SignalRef = null,
    sort: Compare = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (avoidBaseMark != null) __obj.updateDynamic("avoidBaseMark")(avoidBaseMark.asInstanceOf[js.Any])
    if (avoidMarks != null) __obj.updateDynamic("avoidMarks")(avoidMarks.asInstanceOf[js.Any])
    if (lineAnchor != null) __obj.updateDynamic("lineAnchor")(lineAnchor.asInstanceOf[js.Any])
    if (!js.isUndefined(markIndex)) __obj.updateDynamic("markIndex")(markIndex.get.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def HeatmapTransform(
    `type`: heatmap,
    as: String | SignalRef = null,
    color: String | TransformField = null,
    field: String | TransformField = null,
    opacity: Double | TransformField = null,
    resolve: independent | shared | SignalRef = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(resolve.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def FilterTransform(expr: ExprString, `type`: filter): _Transforms = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def StackTransform(
    `type`: stack,
    as: (Vector2[String | SignalRef]) | SignalRef = null,
    field: FieldRef = null,
    groupby: js.Array[FieldRef] = null,
    offset: StackOffset | SignalRef = null,
    sort: Compare = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (groupby != null) __obj.updateDynamic("groupby")(groupby.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def LookupTransform(
    fields: js.Array[FieldRef] | SignalRef,
    from: DataName,
    key: FieldRef,
    `type`: lookup,
    as: (js.Array[String | SignalRef]) | SignalRef = null,
    default: js.Any = null,
    values: js.Array[FieldRef] | SignalRef = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def WordcloudTransform(
    `type`: wordcloud,
    as: (Vector7[String | SignalRef]) | SignalRef = null,
    font: String | TransformField = null,
    fontSize: Double | TransformField = null,
    fontSizeRange: (Vector2[Double | SignalRef]) | SignalRef = null,
    fontStyle: FontStyle | TransformField = null,
    fontWeight: FontWeight | TransformField = null,
    padding: Double | TransformField = null,
    rotate: Double | TransformField = null,
    size: (Vector2[Double | SignalRef]) | SignalRef = null,
    spiral: WordcloudSpiral | SignalRef = null,
    text: String | TransformField = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontSizeRange != null) __obj.updateDynamic("fontSizeRange")(fontSizeRange.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (spiral != null) __obj.updateDynamic("spiral")(spiral.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
  @scala.inline
  def TreeTransform(
    `type`: tree,
    as: (Vector4[String | SignalRef]) | SignalRef = null,
    field: FieldRef = null,
    method: TreeMethod | SignalRef = null,
    nodeSize: (Vector2[Double | SignalRef]) | SignalRef = null,
    separation: Boolean | SignalRef = null,
    size: (Vector2[Double | SignalRef]) | SignalRef = null,
    sort: Compare = null
  ): _Transforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (nodeSize != null) __obj.updateDynamic("nodeSize")(nodeSize.asInstanceOf[js.Any])
    if (separation != null) __obj.updateDynamic("separation")(separation.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Transforms]
  }
}

