package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite", JSImport.Namespace)
@js.native
object vegaDashLiteMod extends js.Object {
  val version: java.lang.String = js.native
  def compile(inputSpec: vegaDashLiteLib.buildSrcSpecMod.TopLevelSpec): vegaDashLiteLib.Anon_Spec = js.native
  def compile(
    inputSpec: vegaDashLiteLib.buildSrcSpecMod.TopLevelSpec,
    opt: vegaDashLiteLib.buildSrcCompileCompileMod.CompileOptions
  ): vegaDashLiteLib.Anon_Spec = js.native
  @JSName("aggregate")
  @js.native
  object aggregateNs extends js.Object {
    val AGGREGATE_OPS: js.Array[vegaDashTypingsLib.typesSpecTransformMod.AggregateOp] = js.native
    val COUNTING_OPS: js.Array[vegaDashTypingsLib.typesSpecTransformMod.AggregateOp] = js.native
    val SHARED_DOMAIN_OPS: js.Array[vegaDashTypingsLib.typesSpecTransformMod.AggregateOp] = js.native
    val SUM_OPS: js.Array[vegaDashTypingsLib.typesSpecTransformMod.AggregateOp] = js.native
    def isAggregateOp(a: java.lang.String): /* is vega-typings.vega-typings/types/spec/transform.AggregateOp */ scala.Boolean = js.native
    def isCountingAggregateOp(aggregate: java.lang.String): scala.Boolean = js.native
    @js.native
    object SHARED_DOMAIN_OP_INDEX
      extends /* T */ org.scalablytyped.runtime.StringDictionary[vegaDashLiteLib.vegaDashLiteLibNumbers.`true`]
    
  }
  
  @JSName("axis")
  @js.native
  object axisNs extends js.Object {
    val AXIS_PARTS: js.Array[vegaDashLiteLib.buildSrcAxisMod.AxisPart] = js.native
    val AXIS_PROPERTIES: js.Array[
        vegaDashLiteLib.vegaDashLiteLibStrings.title | vegaDashLiteLib.vegaDashLiteLibStrings.orient | vegaDashLiteLib.vegaDashLiteLibStrings.zindex | vegaDashLiteLib.vegaDashLiteLibStrings.ticks | vegaDashLiteLib.vegaDashLiteLibStrings.labels | vegaDashLiteLib.vegaDashLiteLibStrings.labelBound | vegaDashLiteLib.vegaDashLiteLibStrings.labelFlush | vegaDashLiteLib.vegaDashLiteLibStrings.labelPadding | vegaDashLiteLib.vegaDashLiteLibStrings.labelOverlap | vegaDashLiteLib.vegaDashLiteLibStrings.domain | vegaDashLiteLib.vegaDashLiteLibStrings.grid | vegaDashLiteLib.vegaDashLiteLibStrings.tickSize | vegaDashLiteLib.vegaDashLiteLibStrings.tickCount | vegaDashLiteLib.vegaDashLiteLibStrings.format | vegaDashLiteLib.vegaDashLiteLibStrings.values | vegaDashLiteLib.vegaDashLiteLibStrings.offset | vegaDashLiteLib.vegaDashLiteLibStrings.position | vegaDashLiteLib.vegaDashLiteLibStrings.titlePadding | vegaDashLiteLib.vegaDashLiteLibStrings.minExtent | vegaDashLiteLib.vegaDashLiteLibStrings.maxExtent | vegaDashLiteLib.vegaDashLiteLibStrings.labelAngle | vegaDashLiteLib.vegaDashLiteLibStrings.encoding | vegaDashLiteLib.vegaDashLiteLibStrings.titleMaxLength
      ] = js.native
    val VG_AXIS_PROPERTIES: js.Array[
        vegaDashLiteLib.vegaDashLiteLibStrings.title | vegaDashLiteLib.vegaDashLiteLibStrings.orient | vegaDashLiteLib.vegaDashLiteLibStrings.scale | vegaDashLiteLib.vegaDashLiteLibStrings.zindex | vegaDashLiteLib.vegaDashLiteLibStrings.ticks | vegaDashLiteLib.vegaDashLiteLibStrings.labels | vegaDashLiteLib.vegaDashLiteLibStrings.labelBound | vegaDashLiteLib.vegaDashLiteLibStrings.labelFlush | vegaDashLiteLib.vegaDashLiteLibStrings.labelPadding | vegaDashLiteLib.vegaDashLiteLibStrings.labelOverlap | vegaDashLiteLib.vegaDashLiteLibStrings.domain | vegaDashLiteLib.vegaDashLiteLibStrings.grid | vegaDashLiteLib.vegaDashLiteLibStrings.gridScale | vegaDashLiteLib.vegaDashLiteLibStrings.tickSize | vegaDashLiteLib.vegaDashLiteLibStrings.tickCount | vegaDashLiteLib.vegaDashLiteLibStrings.format | vegaDashLiteLib.vegaDashLiteLibStrings.values | vegaDashLiteLib.vegaDashLiteLibStrings.offset | vegaDashLiteLib.vegaDashLiteLibStrings.position | vegaDashLiteLib.vegaDashLiteLibStrings.titlePadding | vegaDashLiteLib.vegaDashLiteLibStrings.minExtent | vegaDashLiteLib.vegaDashLiteLibStrings.maxExtent | vegaDashLiteLib.vegaDashLiteLibStrings.encode
      ] = js.native
    def isAxisProperty(prop: java.lang.String): scala.Boolean = js.native
  }
  
  @JSName("bin")
  @js.native
  object binNs extends js.Object {
    def autoMaxBins(channel: vegaDashLiteLib.buildSrcChannelMod.Channel): scala.Double = js.native
    def binToString(bin: scala.Boolean): java.lang.String = js.native
    def binToString(bin: vegaDashLiteLib.buildSrcBinMod.BinParams): java.lang.String = js.native
    def isBinParams(bin: scala.Boolean): /* is vega-lite.vega-lite/build/src/bin.BinParams */ scala.Boolean = js.native
    def isBinParams(bin: vegaDashLiteLib.buildSrcBinMod.BinParams): /* is vega-lite.vega-lite/build/src/bin.BinParams */ scala.Boolean = js.native
  }
  
  @JSName("channel")
  @js.native
  object channelNs extends js.Object {
    val CHANNELS: js.Array[vegaDashLiteLib.buildSrcChannelMod.Channel] = js.native
    val COLOR: vegaDashLiteLib.vegaDashLiteLibStrings.color = js.native
    val COLUMN: vegaDashLiteLib.vegaDashLiteLibStrings.column = js.native
    val DETAIL: vegaDashLiteLib.vegaDashLiteLibStrings.detail = js.native
    val FILL: vegaDashLiteLib.vegaDashLiteLibStrings.fill = js.native
    val GEOPOSITION_CHANNELS: js.Array[vegaDashLiteLib.buildSrcChannelMod.GeoPositionChannel] = js.native
    val GEOPOSITION_CHANNEL_INDEX: vegaDashLiteLib.buildSrcUtilMod.Flag[vegaDashLiteLib.buildSrcChannelMod.GeoPositionChannel] = js.native
    val HREF: vegaDashLiteLib.vegaDashLiteLibStrings.href = js.native
    val KEY: vegaDashLiteLib.vegaDashLiteLibStrings.key = js.native
    val LATITUDE: vegaDashLiteLib.vegaDashLiteLibStrings.latitude = js.native
    val LATITUDE2: vegaDashLiteLib.vegaDashLiteLibStrings.latitude2 = js.native
    val LONGITUDE: vegaDashLiteLib.vegaDashLiteLibStrings.longitude = js.native
    val LONGITUDE2: vegaDashLiteLib.vegaDashLiteLibStrings.longitude2 = js.native
    val NONPOSITION_CHANNELS: js.Array[
        vegaDashLiteLib.vegaDashLiteLibStrings.text | vegaDashLiteLib.vegaDashLiteLibStrings.shape | vegaDashLiteLib.vegaDashLiteLibStrings.color | vegaDashLiteLib.vegaDashLiteLibStrings.fill | vegaDashLiteLib.vegaDashLiteLibStrings.stroke | vegaDashLiteLib.vegaDashLiteLibStrings.opacity | vegaDashLiteLib.vegaDashLiteLibStrings.size | vegaDashLiteLib.vegaDashLiteLibStrings.detail | vegaDashLiteLib.vegaDashLiteLibStrings.key | vegaDashLiteLib.vegaDashLiteLibStrings.tooltip | vegaDashLiteLib.vegaDashLiteLibStrings.href | vegaDashLiteLib.vegaDashLiteLibStrings.order
      ] = js.native
    val NONPOSITION_SCALE_CHANNELS: js.Array[
        vegaDashLiteLib.vegaDashLiteLibStrings.shape | vegaDashLiteLib.vegaDashLiteLibStrings.color | vegaDashLiteLib.vegaDashLiteLibStrings.fill | vegaDashLiteLib.vegaDashLiteLibStrings.stroke | vegaDashLiteLib.vegaDashLiteLibStrings.opacity | vegaDashLiteLib.vegaDashLiteLibStrings.size
      ] = js.native
    val OPACITY: vegaDashLiteLib.vegaDashLiteLibStrings.opacity = js.native
    val ORDER: vegaDashLiteLib.vegaDashLiteLibStrings.order = js.native
    val POSITION_SCALE_CHANNELS: js.Array[
        vegaDashLiteLib.vegaDashLiteLibStrings.x | vegaDashLiteLib.vegaDashLiteLibStrings.y
      ] = js.native
    val ROW: vegaDashLiteLib.vegaDashLiteLibStrings.row = js.native
    val SCALE_CHANNELS: js.Array[
        vegaDashLiteLib.vegaDashLiteLibStrings.shape | vegaDashLiteLib.vegaDashLiteLibStrings.x | vegaDashLiteLib.vegaDashLiteLibStrings.y | vegaDashLiteLib.vegaDashLiteLibStrings.color | vegaDashLiteLib.vegaDashLiteLibStrings.fill | vegaDashLiteLib.vegaDashLiteLibStrings.stroke | vegaDashLiteLib.vegaDashLiteLibStrings.opacity | vegaDashLiteLib.vegaDashLiteLibStrings.size
      ] = js.native
    val SHAPE: vegaDashLiteLib.vegaDashLiteLibStrings.shape = js.native
    val SINGLE_DEF_CHANNELS: js.Array[vegaDashLiteLib.buildSrcChannelMod.SingleDefChannel] = js.native
    val SIZE: vegaDashLiteLib.vegaDashLiteLibStrings.size = js.native
    val STROKE: vegaDashLiteLib.vegaDashLiteLibStrings.stroke = js.native
    val TEXT: vegaDashLiteLib.vegaDashLiteLibStrings.text = js.native
    val TOOLTIP: vegaDashLiteLib.vegaDashLiteLibStrings.tooltip = js.native
    val UNIT_CHANNELS: js.Array[
        vegaDashLiteLib.vegaDashLiteLibStrings.text | vegaDashLiteLib.vegaDashLiteLibStrings.shape | vegaDashLiteLib.vegaDashLiteLibStrings.x | vegaDashLiteLib.vegaDashLiteLibStrings.y | vegaDashLiteLib.vegaDashLiteLibStrings.x2 | vegaDashLiteLib.vegaDashLiteLibStrings.y2 | vegaDashLiteLib.vegaDashLiteLibStrings.longitude | vegaDashLiteLib.vegaDashLiteLibStrings.latitude | vegaDashLiteLib.vegaDashLiteLibStrings.longitude2 | vegaDashLiteLib.vegaDashLiteLibStrings.latitude2 | vegaDashLiteLib.vegaDashLiteLibStrings.color | vegaDashLiteLib.vegaDashLiteLibStrings.fill | vegaDashLiteLib.vegaDashLiteLibStrings.stroke | vegaDashLiteLib.vegaDashLiteLibStrings.opacity | vegaDashLiteLib.vegaDashLiteLibStrings.size | vegaDashLiteLib.vegaDashLiteLibStrings.detail | vegaDashLiteLib.vegaDashLiteLibStrings.key | vegaDashLiteLib.vegaDashLiteLibStrings.tooltip | vegaDashLiteLib.vegaDashLiteLibStrings.href | vegaDashLiteLib.vegaDashLiteLibStrings.order
      ] = js.native
    val X: vegaDashLiteLib.vegaDashLiteLibStrings.x = js.native
    val X2: vegaDashLiteLib.vegaDashLiteLibStrings.x2 = js.native
    val Y: vegaDashLiteLib.vegaDashLiteLibStrings.y = js.native
    val Y2: vegaDashLiteLib.vegaDashLiteLibStrings.y2 = js.native
    def getSupportedMark(channel: vegaDashLiteLib.buildSrcChannelMod.Channel): vegaDashLiteLib.buildSrcChannelMod.SupportedMark = js.native
    def isChannel(str: java.lang.String): /* is vega-lite.vega-lite/build/src/channel.Channel */ scala.Boolean = js.native
    def isColorChannel(channel: vegaDashLiteLib.buildSrcChannelMod.Channel): /* is vega-lite.vega-lite/build/src/channel.ColorChannel */ scala.Boolean = js.native
    def isScaleChannel(channel: vegaDashLiteLib.buildSrcChannelMod.Channel): /* is vega-lite.vega-lite/build/src/channel.ScaleChannel */ scala.Boolean = js.native
    def rangeType(channel: vegaDashLiteLib.buildSrcChannelMod.Channel): vegaDashLiteLib.buildSrcCompileScaleTypeMod.RangeType = js.native
    def supportMark(channel: vegaDashLiteLib.buildSrcChannelMod.Channel, mark: vegaDashLiteLib.buildSrcMarkMod.Mark): scala.Boolean = js.native
    @JSName("Channel")
    @js.native
    object ChannelNs extends js.Object {
      val COLOR: vegaDashLiteLib.vegaDashLiteLibStrings.color = js.native
      val COLUMN: vegaDashLiteLib.vegaDashLiteLibStrings.column = js.native
      val DETAIL: vegaDashLiteLib.vegaDashLiteLibStrings.detail = js.native
      val FILL: vegaDashLiteLib.vegaDashLiteLibStrings.fill = js.native
      val HREF: vegaDashLiteLib.vegaDashLiteLibStrings.href = js.native
      val KEY: vegaDashLiteLib.vegaDashLiteLibStrings.key = js.native
      val LATITUDE: vegaDashLiteLib.vegaDashLiteLibStrings.latitude = js.native
      val LATITUDE2: vegaDashLiteLib.vegaDashLiteLibStrings.latitude2 = js.native
      val LONGITUDE: vegaDashLiteLib.vegaDashLiteLibStrings.longitude = js.native
      val LONGITUDE2: vegaDashLiteLib.vegaDashLiteLibStrings.longitude2 = js.native
      val OPACITY: vegaDashLiteLib.vegaDashLiteLibStrings.opacity = js.native
      val ORDER: vegaDashLiteLib.vegaDashLiteLibStrings.order = js.native
      val ROW: vegaDashLiteLib.vegaDashLiteLibStrings.row = js.native
      val SHAPE: vegaDashLiteLib.vegaDashLiteLibStrings.shape = js.native
      val SIZE: vegaDashLiteLib.vegaDashLiteLibStrings.size = js.native
      val STROKE: vegaDashLiteLib.vegaDashLiteLibStrings.stroke = js.native
      val TEXT: vegaDashLiteLib.vegaDashLiteLibStrings.text = js.native
      val TOOLTIP: vegaDashLiteLib.vegaDashLiteLibStrings.tooltip = js.native
      val X: vegaDashLiteLib.vegaDashLiteLibStrings.x = js.native
      val X2: vegaDashLiteLib.vegaDashLiteLibStrings.x2 = js.native
      val Y: vegaDashLiteLib.vegaDashLiteLibStrings.y = js.native
      val Y2: vegaDashLiteLib.vegaDashLiteLibStrings.y2 = js.native
    }
    
  }
  
  @JSName("compositeMark")
  @js.native
  object compositeMarkNs extends js.Object {
    val COMPOSITE_MARK_STYLES: js.Array[vegaDashLiteLib.buildSrcCompositemarkBoxplotMod.BoxPlotStyle] = js.native
    def add(mark: java.lang.String, normalizer: vegaDashLiteLib.buildSrcCompositemarkMod.UnitNormalizer): scala.Unit = js.native
    def normalize(
      spec: vegaDashLiteLib.buildSrcSpecMod.GenericUnitSpec[_, vegaDashLiteLib.buildSrcMarkMod.AnyMark],
      config: vegaDashLiteLib.buildSrcConfigMod.Config
    ): vegaDashLiteLib.buildSrcSpecMod.NormalizedLayerSpec = js.native
    def remove(mark: java.lang.String): scala.Unit = js.native
    @js.native
    object VL_ONLY_COMPOSITE_MARK_SPECIFIC_CONFIG_PROPERTY_INDEX extends js.Object {
      var box: js.UndefOr[
            js.Array[
              vegaDashLiteLib.vegaDashLiteLibStrings.dir | vegaDashLiteLib.vegaDashLiteLibStrings.font | vegaDashLiteLib.vegaDashLiteLibStrings.text | vegaDashLiteLib.vegaDashLiteLibStrings.shape | vegaDashLiteLib.vegaDashLiteLibStrings.orient | vegaDashLiteLib.vegaDashLiteLibStrings.extent | vegaDashLiteLib.vegaDashLiteLibStrings.color | vegaDashLiteLib.vegaDashLiteLibStrings.fill | vegaDashLiteLib.vegaDashLiteLibStrings.stroke | vegaDashLiteLib.vegaDashLiteLibStrings.opacity | vegaDashLiteLib.vegaDashLiteLibStrings.size | vegaDashLiteLib.vegaDashLiteLibStrings.tooltip | vegaDashLiteLib.vegaDashLiteLibStrings.href | vegaDashLiteLib.vegaDashLiteLibStrings.interpolate | vegaDashLiteLib.vegaDashLiteLibStrings.angle | vegaDashLiteLib.vegaDashLiteLibStrings.baseline | vegaDashLiteLib.vegaDashLiteLibStrings.fontSize | vegaDashLiteLib.vegaDashLiteLibStrings.fontWeight | vegaDashLiteLib.vegaDashLiteLibStrings.limit | vegaDashLiteLib.vegaDashLiteLibStrings.strokeWidth | vegaDashLiteLib.vegaDashLiteLibStrings.strokeDash | vegaDashLiteLib.vegaDashLiteLibStrings.strokeDashOffset | vegaDashLiteLib.vegaDashLiteLibStrings.strokeOpacity | vegaDashLiteLib.vegaDashLiteLibStrings.strokeJoin | vegaDashLiteLib.vegaDashLiteLibStrings.strokeMiterLimit | vegaDashLiteLib.vegaDashLiteLibStrings.fillOpacity | vegaDashLiteLib.vegaDashLiteLibStrings.filled | vegaDashLiteLib.vegaDashLiteLibStrings.strokeCap | vegaDashLiteLib.vegaDashLiteLibStrings.tension | vegaDashLiteLib.vegaDashLiteLibStrings.align | vegaDashLiteLib.vegaDashLiteLibStrings.dx | vegaDashLiteLib.vegaDashLiteLibStrings.dy | vegaDashLiteLib.vegaDashLiteLibStrings.radius | vegaDashLiteLib.vegaDashLiteLibStrings.ellipsis | vegaDashLiteLib.vegaDashLiteLibStrings.theta | vegaDashLiteLib.vegaDashLiteLibStrings.fontStyle | vegaDashLiteLib.vegaDashLiteLibStrings.cursor | vegaDashLiteLib.vegaDashLiteLibStrings.cornerRadius
            ]
          ] = js.native
      var boxMid: js.UndefOr[
            js.Array[
              vegaDashLiteLib.vegaDashLiteLibStrings.dir | vegaDashLiteLib.vegaDashLiteLibStrings.font | vegaDashLiteLib.vegaDashLiteLibStrings.text | vegaDashLiteLib.vegaDashLiteLibStrings.shape | vegaDashLiteLib.vegaDashLiteLibStrings.orient | vegaDashLiteLib.vegaDashLiteLibStrings.color | vegaDashLiteLib.vegaDashLiteLibStrings.fill | vegaDashLiteLib.vegaDashLiteLibStrings.stroke | vegaDashLiteLib.vegaDashLiteLibStrings.opacity | vegaDashLiteLib.vegaDashLiteLibStrings.size | vegaDashLiteLib.vegaDashLiteLibStrings.tooltip | vegaDashLiteLib.vegaDashLiteLibStrings.href | vegaDashLiteLib.vegaDashLiteLibStrings.interpolate | vegaDashLiteLib.vegaDashLiteLibStrings.angle | vegaDashLiteLib.vegaDashLiteLibStrings.baseline | vegaDashLiteLib.vegaDashLiteLibStrings.fontSize | vegaDashLiteLib.vegaDashLiteLibStrings.fontWeight | vegaDashLiteLib.vegaDashLiteLibStrings.limit | vegaDashLiteLib.vegaDashLiteLibStrings.strokeWidth | vegaDashLiteLib.vegaDashLiteLibStrings.strokeDash | vegaDashLiteLib.vegaDashLiteLibStrings.strokeDashOffset | vegaDashLiteLib.vegaDashLiteLibStrings.strokeOpacity | vegaDashLiteLib.vegaDashLiteLibStrings.strokeJoin | vegaDashLiteLib.vegaDashLiteLibStrings.strokeMiterLimit | vegaDashLiteLib.vegaDashLiteLibStrings.fillOpacity | vegaDashLiteLib.vegaDashLiteLibStrings.filled | vegaDashLiteLib.vegaDashLiteLibStrings.strokeCap | vegaDashLiteLib.vegaDashLiteLibStrings.tension | vegaDashLiteLib.vegaDashLiteLibStrings.align | vegaDashLiteLib.vegaDashLiteLibStrings.dx | vegaDashLiteLib.vegaDashLiteLibStrings.dy | vegaDashLiteLib.vegaDashLiteLibStrings.radius | vegaDashLiteLib.vegaDashLiteLibStrings.ellipsis | vegaDashLiteLib.vegaDashLiteLibStrings.theta | vegaDashLiteLib.vegaDashLiteLibStrings.fontStyle | vegaDashLiteLib.vegaDashLiteLibStrings.cursor | vegaDashLiteLib.vegaDashLiteLibStrings.cornerRadius
            ]
          ] = js.native
      var boxWhisker: js.UndefOr[
            js.Array[
              vegaDashLiteLib.vegaDashLiteLibStrings.dir | vegaDashLiteLib.vegaDashLiteLibStrings.font | vegaDashLiteLib.vegaDashLiteLibStrings.text | vegaDashLiteLib.vegaDashLiteLibStrings.shape | vegaDashLiteLib.vegaDashLiteLibStrings.orient | vegaDashLiteLib.vegaDashLiteLibStrings.color | vegaDashLiteLib.vegaDashLiteLibStrings.fill | vegaDashLiteLib.vegaDashLiteLibStrings.stroke | vegaDashLiteLib.vegaDashLiteLibStrings.opacity | vegaDashLiteLib.vegaDashLiteLibStrings.size | vegaDashLiteLib.vegaDashLiteLibStrings.tooltip | vegaDashLiteLib.vegaDashLiteLibStrings.href | vegaDashLiteLib.vegaDashLiteLibStrings.interpolate | vegaDashLiteLib.vegaDashLiteLibStrings.angle | vegaDashLiteLib.vegaDashLiteLibStrings.baseline | vegaDashLiteLib.vegaDashLiteLibStrings.fontSize | vegaDashLiteLib.vegaDashLiteLibStrings.fontWeight | vegaDashLiteLib.vegaDashLiteLibStrings.limit | vegaDashLiteLib.vegaDashLiteLibStrings.strokeWidth | vegaDashLiteLib.vegaDashLiteLibStrings.strokeDash | vegaDashLiteLib.vegaDashLiteLibStrings.strokeDashOffset | vegaDashLiteLib.vegaDashLiteLibStrings.strokeOpacity | vegaDashLiteLib.vegaDashLiteLibStrings.strokeJoin | vegaDashLiteLib.vegaDashLiteLibStrings.strokeMiterLimit | vegaDashLiteLib.vegaDashLiteLibStrings.fillOpacity | vegaDashLiteLib.vegaDashLiteLibStrings.filled | vegaDashLiteLib.vegaDashLiteLibStrings.strokeCap | vegaDashLiteLib.vegaDashLiteLibStrings.tension | vegaDashLiteLib.vegaDashLiteLibStrings.align | vegaDashLiteLib.vegaDashLiteLibStrings.dx | vegaDashLiteLib.vegaDashLiteLibStrings.dy | vegaDashLiteLib.vegaDashLiteLibStrings.radius | vegaDashLiteLib.vegaDashLiteLibStrings.ellipsis | vegaDashLiteLib.vegaDashLiteLibStrings.theta | vegaDashLiteLib.vegaDashLiteLibStrings.fontStyle | vegaDashLiteLib.vegaDashLiteLibStrings.cursor | vegaDashLiteLib.vegaDashLiteLibStrings.cornerRadius
            ]
          ] = js.native
    }
    
  }
  
  @JSName("config")
  @js.native
  object configNs extends js.Object {
    val defaultConfig: vegaDashLiteLib.buildSrcConfigMod.Config = js.native
    val defaultViewConfig: vegaDashLiteLib.buildSrcConfigMod.ViewConfig = js.native
    def initConfig(config: vegaDashLiteLib.buildSrcConfigMod.Config): vegaDashLiteLib.buildSrcConfigMod.Config = js.native
    def stripAndRedirectConfig(config: vegaDashLiteLib.buildSrcConfigMod.Config): vegaDashLiteLib.buildSrcConfigMod.Config = js.native
  }
  
  @JSName("data")
  @js.native
  object dataNs extends js.Object {
    val MAIN: vegaDashLiteLib.vegaDashLiteLibStrings.main = js.native
    val RAW: vegaDashLiteLib.vegaDashLiteLibStrings.raw = js.native
    def isInlineData(
      data: stdLib.Partial[
          vegaDashLiteLib.buildSrcDataMod.Data | vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgData
        ]
    ): /* is vega-lite.vega-lite/build/src/data.InlineData */ scala.Boolean = js.native
    def isNamedData(data: stdLib.Partial[vegaDashLiteLib.buildSrcDataMod.Data]): /* is vega-lite.vega-lite/build/src/data.NamedData */ scala.Boolean = js.native
    def isUrlData(
      data: stdLib.Partial[
          vegaDashLiteLib.buildSrcDataMod.Data | vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgData
        ]
    ): /* is vega-lite.vega-lite/build/src/data.UrlData */ scala.Boolean = js.native
  }
  
  @JSName("datetime")
  @js.native
  object datetimeNs extends js.Object {
    val DAYS: js.Array[java.lang.String] = js.native
    val MONTHS: js.Array[java.lang.String] = js.native
    val SHORT_DAYS: js.Array[java.lang.String] = js.native
    val SHORT_MONTHS: js.Array[java.lang.String] = js.native
    def dateTimeExpr(d: vegaDashLiteLib.buildSrcDatetimeMod.DateTime): java.lang.String = js.native
    def dateTimeExpr(d: vegaDashLiteLib.buildSrcDatetimeMod.DateTimeExpr): java.lang.String = js.native
    def dateTimeExpr(d: vegaDashLiteLib.buildSrcDatetimeMod.DateTimeExpr, normalize: scala.Boolean): java.lang.String = js.native
    def dateTimeExpr(d: vegaDashLiteLib.buildSrcDatetimeMod.DateTime, normalize: scala.Boolean): java.lang.String = js.native
    def isDateTime(o: js.Any): /* is vega-lite.vega-lite/build/src/datetime.DateTime */ scala.Boolean = js.native
  }
  
  @JSName("encoding")
  @js.native
  object encodingNs extends js.Object {
    def channelHasField(
      encoding: vegaDashLiteLib.buildSrcEncodingMod.EncodingWithFacet[vegaDashLiteLib.buildSrcFielddefMod.Field],
      channel: vegaDashLiteLib.buildSrcChannelMod.Channel
    ): scala.Boolean = js.native
    def fieldDefs(
      encoding: vegaDashLiteLib.buildSrcEncodingMod.EncodingWithFacet[vegaDashLiteLib.buildSrcFielddefMod.Field]
    ): js.Array[
        vegaDashLiteLib.buildSrcFielddefMod.FieldDef[vegaDashLiteLib.buildSrcFielddefMod.Field]
      ] = js.native
    def forEach(
      mapping: js.Any,
      f: js.Function2[
          /* fd */ vegaDashLiteLib.buildSrcFielddefMod.FieldDef[java.lang.String], 
          /* c */ vegaDashLiteLib.buildSrcChannelMod.Channel, 
          scala.Unit
        ]
    ): scala.Unit = js.native
    def forEach(
      mapping: js.Any,
      f: js.Function2[
          /* fd */ vegaDashLiteLib.buildSrcFielddefMod.FieldDef[java.lang.String], 
          /* c */ vegaDashLiteLib.buildSrcChannelMod.Channel, 
          scala.Unit
        ],
      thisArg: js.Any
    ): scala.Unit = js.native
    def isAggregate(
      encoding: vegaDashLiteLib.buildSrcEncodingMod.EncodingWithFacet[vegaDashLiteLib.buildSrcFielddefMod.Field]
    ): scala.Boolean = js.native
    def isRanged(encoding: vegaDashLiteLib.buildSrcEncodingMod.EncodingWithFacet[_]): scala.Boolean = js.native
    def normalizeEncoding(
      encoding: vegaDashLiteLib.buildSrcEncodingMod.Encoding[java.lang.String],
      mark: vegaDashLiteLib.buildSrcMarkMod.Mark
    ): vegaDashLiteLib.buildSrcEncodingMod.Encoding[java.lang.String] = js.native
    def reduce[T, U /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
    {[ k in vega-lite.vega-lite/build/src/channel.Channel ]:? any}
      */ vegaDashLiteLib.vegaDashLiteLibStrings.reduce with js.Any */](
      mapping: U,
      f: js.Function3[
          /* acc */ js.Any, 
          /* fd */ vegaDashLiteLib.buildSrcFielddefMod.FieldDef[java.lang.String], 
          /* c */ vegaDashLiteLib.buildSrcChannelMod.Channel, 
          U
        ],
      init: T
    ): js.Any = js.native
    def reduce[T, U /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
    {[ k in vega-lite.vega-lite/build/src/channel.Channel ]:? any}
      */ vegaDashLiteLib.vegaDashLiteLibStrings.reduce with js.Any */](
      mapping: U,
      f: js.Function3[
          /* acc */ js.Any, 
          /* fd */ vegaDashLiteLib.buildSrcFielddefMod.FieldDef[java.lang.String], 
          /* c */ vegaDashLiteLib.buildSrcChannelMod.Channel, 
          U
        ],
      init: T,
      thisArg: js.Any
    ): js.Any = js.native
  }
  
  @JSName("fieldDef")
  @js.native
  object fieldDefNs extends js.Object {
    val defaultTitleFormatter: vegaDashLiteLib.buildSrcFielddefMod.FieldTitleFormatter = js.native
    def channelCompatibility(
      fieldDef: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[vegaDashLiteLib.buildSrcFielddefMod.Field],
      channel: vegaDashLiteLib.buildSrcChannelMod.Channel
    ): vegaDashLiteLib.Anon_Compatible = js.native
    def defaultType(
      fieldDef: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[vegaDashLiteLib.buildSrcFielddefMod.Field],
      channel: vegaDashLiteLib.buildSrcChannelMod.Channel
    ): vegaDashLiteLib.buildSrcTypeMod.Type = js.native
    def functionalTitleFormatter(
      fieldDef: vegaDashLiteLib.buildSrcFielddefMod.FieldDefBase[java.lang.String],
      config: vegaDashLiteLib.buildSrcConfigMod.Config
    ): java.lang.String = js.native
    def getFieldDef[F](channelDef: vegaDashLiteLib.buildSrcFielddefMod.ChannelDef[F]): vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F] = js.native
    def hasConditionalFieldDef[F](channelDef: vegaDashLiteLib.buildSrcFielddefMod.ChannelDef[F]): scala.Boolean = js.native
    def hasConditionalValueDef[F](channelDef: vegaDashLiteLib.buildSrcFielddefMod.ChannelDef[F]): scala.Boolean = js.native
    def isConditionalDef[F](channelDef: vegaDashLiteLib.buildSrcFielddefMod.ChannelDef[F]): /* is vega-lite.vega-lite/build/src/fielddef.ChannelDefWithCondition<vega-lite.vega-lite/build/src/fielddef.FieldDef<F>> */ scala.Boolean = js.native
    def isConditionalSelection[T](c: vegaDashLiteLib.buildSrcFielddefMod.Conditional[T]): /* is vega-lite.vega-lite/build/src/fielddef.ConditionalSelection<T> */ scala.Boolean = js.native
    def isContinuous(fieldDef: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[vegaDashLiteLib.buildSrcFielddefMod.Field]): scala.Boolean = js.native
    def isCount(
      fieldDef: vegaDashLiteLib.buildSrcFielddefMod.FieldDefBase[vegaDashLiteLib.buildSrcFielddefMod.Field]
    ): scala.Boolean = js.native
    def isDiscrete(fieldDef: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[vegaDashLiteLib.buildSrcFielddefMod.Field]): scala.Boolean = js.native
    def isFieldDef[F](channelDef: vegaDashLiteLib.buildSrcFielddefMod.ChannelDef[F]): scala.Boolean = js.native
    def isNumberFieldDef(fieldDef: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[_]): scala.Boolean = js.native
    def isRepeatRef(field: vegaDashLiteLib.buildSrcFielddefMod.Field): /* is vega-lite.vega-lite/build/src/fielddef.RepeatRef */ scala.Boolean = js.native
    def isScaleFieldDef[F](channelDef: vegaDashLiteLib.buildSrcFielddefMod.ChannelDef[F]): /* is vega-lite.vega-lite/build/src/fielddef.ScaleFieldDef<F> */ scala.Boolean = js.native
    def isStringFieldDef(
      fieldDef: vegaDashLiteLib.buildSrcFielddefMod.ChannelDef[java.lang.String | vegaDashLiteLib.buildSrcFielddefMod.RepeatRef]
    ): /* is vega-lite.vega-lite/build/src/fielddef.FieldDef<string> */ scala.Boolean = js.native
    def isTimeFieldDef(fieldDef: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[_]): scala.Boolean = js.native
    def isValueDef[F](channelDef: vegaDashLiteLib.buildSrcFielddefMod.ChannelDef[F]): /* is vega-lite.vega-lite/build/src/fielddef.ValueDef */ scala.Boolean = js.native
    def normalize(
      channelDef: vegaDashLiteLib.buildSrcFielddefMod.ChannelDef[java.lang.String],
      channel: vegaDashLiteLib.buildSrcChannelMod.Channel
    ): vegaDashLiteLib.buildSrcFielddefMod.ChannelDef[_] = js.native
    def normalizeBin(bin: scala.Boolean, channel: vegaDashLiteLib.buildSrcChannelMod.Channel): vegaDashLiteLib.buildSrcBinMod.BinParams = js.native
    def normalizeBin(bin: vegaDashLiteLib.buildSrcBinMod.BinParams, channel: vegaDashLiteLib.buildSrcChannelMod.Channel): vegaDashLiteLib.buildSrcBinMod.BinParams = js.native
    def normalizeFieldDef(
      fieldDef: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[java.lang.String],
      channel: vegaDashLiteLib.buildSrcChannelMod.Channel
    ): vegaDashLiteLib.buildSrcFielddefMod.FieldDef[java.lang.String] = js.native
    def resetTitleFormatter(): scala.Unit = js.native
    def setTitleFormatter(formatter: vegaDashLiteLib.buildSrcFielddefMod.FieldTitleFormatter): scala.Unit = js.native
    def title(
      fieldDef: vegaDashLiteLib.buildSrcFielddefMod.FieldDefBase[java.lang.String],
      config: vegaDashLiteLib.buildSrcConfigMod.Config
    ): java.lang.String = js.native
    def toFieldDefBase(fieldDef: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[java.lang.String]): vegaDashLiteLib.buildSrcFielddefMod.FieldDefBase[java.lang.String] = js.native
    def valueArray(
      fieldDef: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[java.lang.String],
      values: js.Array[
          scala.Double | java.lang.String | scala.Boolean | vegaDashLiteLib.buildSrcDatetimeMod.DateTime
        ]
    ): js.Array[
        java.lang.String | scala.Double | scala.Boolean | vegaDashLiteLib.buildSrcDatetimeMod.DateTime | vegaDashLiteLib.Anon_Signal
      ] = js.native
    def valueExpr(v: java.lang.String, hasTimeUnitTypeTimeUndefinedIfExprNotRequired: vegaDashLiteLib.Anon_Time): java.lang.String = js.native
    def valueExpr(v: scala.Boolean, hasTimeUnitTypeTimeUndefinedIfExprNotRequired: vegaDashLiteLib.Anon_Time): java.lang.String = js.native
    def valueExpr(v: scala.Double, hasTimeUnitTypeTimeUndefinedIfExprNotRequired: vegaDashLiteLib.Anon_Time): java.lang.String = js.native
    def valueExpr(
      v: vegaDashLiteLib.buildSrcDatetimeMod.DateTime,
      hasTimeUnitTypeTimeUndefinedIfExprNotRequired: vegaDashLiteLib.Anon_Time
    ): java.lang.String = js.native
    def verbalTitleFormatter(
      fieldDef: vegaDashLiteLib.buildSrcFielddefMod.FieldDefBase[java.lang.String],
      config: vegaDashLiteLib.buildSrcConfigMod.Config
    ): java.lang.String = js.native
    def vgField(fieldDef: vegaDashLiteLib.buildSrcFielddefMod.FieldDefBase[java.lang.String]): java.lang.String = js.native
    def vgField(
      fieldDef: vegaDashLiteLib.buildSrcFielddefMod.FieldDefBase[java.lang.String],
      opt: vegaDashLiteLib.buildSrcFielddefMod.FieldRefOption
    ): java.lang.String = js.native
    def vgField(fieldDef: vegaDashLiteLib.buildSrcTransformMod.AggregatedFieldDef): java.lang.String = js.native
    def vgField(
      fieldDef: vegaDashLiteLib.buildSrcTransformMod.AggregatedFieldDef,
      opt: vegaDashLiteLib.buildSrcFielddefMod.FieldRefOption
    ): java.lang.String = js.native
    def vgField(fieldDef: vegaDashLiteLib.buildSrcTransformMod.WindowFieldDef): java.lang.String = js.native
    def vgField(
      fieldDef: vegaDashLiteLib.buildSrcTransformMod.WindowFieldDef,
      opt: vegaDashLiteLib.buildSrcFielddefMod.FieldRefOption
    ): java.lang.String = js.native
  }
  
  @JSName("header")
  @js.native
  object headerNs extends js.Object {
    val HEADER_LABEL_PROPERTIES: js.Array[java.lang.String] = js.native
    val HEADER_TITLE_PROPERTIES: js.Array[java.lang.String] = js.native
  }
  
  @JSName("legend")
  @js.native
  object legendNs extends js.Object {
    val LEGEND_PROPERTIES: js.Array[
        vegaDashLiteLib.vegaDashLiteLibStrings.title | vegaDashLiteLib.vegaDashLiteLibStrings.padding | vegaDashLiteLib.vegaDashLiteLibStrings.`type` | vegaDashLiteLib.vegaDashLiteLibStrings.orient | vegaDashLiteLib.vegaDashLiteLibStrings.zindex | vegaDashLiteLib.vegaDashLiteLibStrings.tickCount | vegaDashLiteLib.vegaDashLiteLibStrings.format | vegaDashLiteLib.vegaDashLiteLibStrings.values | vegaDashLiteLib.vegaDashLiteLibStrings.offset | vegaDashLiteLib.vegaDashLiteLibStrings.entryPadding
      ] = js.native
    val VG_LEGEND_PROPERTIES: js.Array[
        vegaDashLiteLib.vegaDashLiteLibStrings.title | vegaDashLiteLib.vegaDashLiteLibStrings.padding | vegaDashLiteLib.vegaDashLiteLibStrings.`type` | vegaDashLiteLib.vegaDashLiteLibStrings.shape | vegaDashLiteLib.vegaDashLiteLibStrings.orient | vegaDashLiteLib.vegaDashLiteLibStrings.zindex | vegaDashLiteLib.vegaDashLiteLibStrings.tickCount | vegaDashLiteLib.vegaDashLiteLibStrings.format | vegaDashLiteLib.vegaDashLiteLibStrings.values | vegaDashLiteLib.vegaDashLiteLibStrings.offset | vegaDashLiteLib.vegaDashLiteLibStrings.encode | vegaDashLiteLib.vegaDashLiteLibStrings.fill | vegaDashLiteLib.vegaDashLiteLibStrings.stroke | vegaDashLiteLib.vegaDashLiteLibStrings.opacity | vegaDashLiteLib.vegaDashLiteLibStrings.size | vegaDashLiteLib.vegaDashLiteLibStrings.entryPadding
      ] = js.native
    val defaultLegendConfig: vegaDashLiteLib.buildSrcLegendMod.LegendConfig = js.native
  }
  
  @JSName("mark")
  @js.native
  object markNs extends js.Object {
    val AREA: vegaDashLiteLib.vegaDashLiteLibStrings.area = js.native
    val BAR: vegaDashLiteLib.vegaDashLiteLibStrings.bar = js.native
    val CIRCLE: vegaDashLiteLib.vegaDashLiteLibStrings.circle = js.native
    val FILL_CONFIG: js.Array[java.lang.String] = js.native
    val FILL_STROKE_CONFIG: js.Array[js.Any] = js.native
    val GEOSHAPE: vegaDashLiteLib.vegaDashLiteLibStrings.geoshape = js.native
    val LINE: vegaDashLiteLib.vegaDashLiteLibStrings.line = js.native
    val POINT: vegaDashLiteLib.vegaDashLiteLibStrings.point = js.native
    val PRIMITIVE_MARKS: js.Array[vegaDashLiteLib.buildSrcMarkMod.Mark] = js.native
    val RECT: vegaDashLiteLib.vegaDashLiteLibStrings.rect = js.native
    val RULE: vegaDashLiteLib.vegaDashLiteLibStrings.rule = js.native
    val SQUARE: vegaDashLiteLib.vegaDashLiteLibStrings.square = js.native
    val STROKE_CONFIG: js.Array[java.lang.String] = js.native
    val TEXT: vegaDashLiteLib.vegaDashLiteLibStrings.text = js.native
    val TICK: vegaDashLiteLib.vegaDashLiteLibStrings.tick = js.native
    val TRAIL: vegaDashLiteLib.vegaDashLiteLibStrings.trail = js.native
    val VL_ONLY_MARK_CONFIG_PROPERTIES: js.Array[
        vegaDashLiteLib.vegaDashLiteLibStrings.filled | vegaDashLiteLib.vegaDashLiteLibStrings.color
      ] = js.native
    val defaultBarConfig: vegaDashLiteLib.buildSrcMarkMod.BarConfig = js.native
    val defaultMarkConfig: vegaDashLiteLib.buildSrcMarkMod.MarkConfig = js.native
    val defaultTickConfig: vegaDashLiteLib.buildSrcMarkMod.TickConfig = js.native
    def isMark(m: java.lang.String): /* is vega-lite.vega-lite/build/src/mark.Mark */ scala.Boolean = js.native
    def isMarkDef(mark: vegaDashLiteLib.buildSrcMarkMod.AnyMark): scala.Boolean = js.native
    def isPathMark(m: vegaDashLiteLib.buildSrcCompositemarkMod.CompositeMark): scala.Boolean = js.native
    def isPathMark(m: vegaDashLiteLib.buildSrcMarkMod.Mark): scala.Boolean = js.native
    def isPrimitiveMark(mark: vegaDashLiteLib.buildSrcCompositemarkMod.CompositeMark): /* is vega-lite.vega-lite/build/src/mark.Mark */ scala.Boolean = js.native
    def isPrimitiveMark(mark: vegaDashLiteLib.buildSrcCompositemarkMod.CompositeMarkDef): /* is vega-lite.vega-lite/build/src/mark.Mark */ scala.Boolean = js.native
    def isPrimitiveMark(mark: vegaDashLiteLib.buildSrcMarkMod.Mark): /* is vega-lite.vega-lite/build/src/mark.Mark */ scala.Boolean = js.native
    def isPrimitiveMark(mark: vegaDashLiteLib.buildSrcMarkMod.MarkDef): /* is vega-lite.vega-lite/build/src/mark.Mark */ scala.Boolean = js.native
    @JSName("Mark")
    @js.native
    object MarkNs extends js.Object {
      val AREA: vegaDashLiteLib.vegaDashLiteLibStrings.area = js.native
      val BAR: vegaDashLiteLib.vegaDashLiteLibStrings.bar = js.native
      val CIRCLE: vegaDashLiteLib.vegaDashLiteLibStrings.circle = js.native
      val GEOSHAPE: vegaDashLiteLib.vegaDashLiteLibStrings.geoshape = js.native
      val LINE: vegaDashLiteLib.vegaDashLiteLibStrings.line = js.native
      val POINT: vegaDashLiteLib.vegaDashLiteLibStrings.point = js.native
      val RECT: vegaDashLiteLib.vegaDashLiteLibStrings.rect = js.native
      val RULE: vegaDashLiteLib.vegaDashLiteLibStrings.rule = js.native
      val SQUARE: vegaDashLiteLib.vegaDashLiteLibStrings.square = js.native
      val TEXT: vegaDashLiteLib.vegaDashLiteLibStrings.text = js.native
      val TICK: vegaDashLiteLib.vegaDashLiteLibStrings.tick = js.native
      val TRAIL: vegaDashLiteLib.vegaDashLiteLibStrings.trail = js.native
    }
    
  }
  
  @JSName("scale")
  @js.native
  object scaleNs extends js.Object {
    val CONTINUOUS_DOMAIN_SCALES: js.Array[vegaDashLiteLib.buildSrcScaleMod.ScaleType] = js.native
    val CONTINUOUS_TO_CONTINUOUS_SCALES: js.Array[vegaDashLiteLib.buildSrcScaleMod.ScaleType] = js.native
    val DISCRETE_DOMAIN_SCALES: js.Array[vegaDashLiteLib.buildSrcScaleMod.ScaleType] = js.native
    val NON_TYPE_DOMAIN_RANGE_VEGA_SCALE_PROPERTIES: js.Array[
        vegaDashLiteLib.vegaDashLiteLibStrings.reverse | vegaDashLiteLib.vegaDashLiteLibStrings.base | vegaDashLiteLib.vegaDashLiteLibStrings.padding | vegaDashLiteLib.vegaDashLiteLibStrings.zero | vegaDashLiteLib.vegaDashLiteLibStrings.nice | vegaDashLiteLib.vegaDashLiteLibStrings.round | vegaDashLiteLib.vegaDashLiteLibStrings.paddingInner | vegaDashLiteLib.vegaDashLiteLibStrings.paddingOuter | vegaDashLiteLib.vegaDashLiteLibStrings.clamp | vegaDashLiteLib.vegaDashLiteLibStrings.exponent | vegaDashLiteLib.vegaDashLiteLibStrings.interpolate
      ] = js.native
    val SCALE_PROPERTIES: js.Array[
        vegaDashLiteLib.vegaDashLiteLibStrings.reverse | vegaDashLiteLib.vegaDashLiteLibStrings.base | vegaDashLiteLib.vegaDashLiteLibStrings.padding | vegaDashLiteLib.vegaDashLiteLibStrings.`type` | vegaDashLiteLib.vegaDashLiteLibStrings.domain | vegaDashLiteLib.vegaDashLiteLibStrings.range | vegaDashLiteLib.vegaDashLiteLibStrings.zero | vegaDashLiteLib.vegaDashLiteLibStrings.nice | vegaDashLiteLib.vegaDashLiteLibStrings.rangeStep | vegaDashLiteLib.vegaDashLiteLibStrings.scheme | vegaDashLiteLib.vegaDashLiteLibStrings.round | vegaDashLiteLib.vegaDashLiteLibStrings.paddingInner | vegaDashLiteLib.vegaDashLiteLibStrings.paddingOuter | vegaDashLiteLib.vegaDashLiteLibStrings.clamp | vegaDashLiteLib.vegaDashLiteLibStrings.exponent | vegaDashLiteLib.vegaDashLiteLibStrings.interpolate
      ] = js.native
    val SCALE_TYPES: js.Array[vegaDashLiteLib.buildSrcScaleMod.ScaleType] = js.native
    val SCALE_TYPE_INDEX: vegaDashLiteLib.buildSrcScaleMod.ScaleTypeIndex = js.native
    val TIME_SCALE_TYPES: js.Array[vegaDashLiteLib.buildSrcScaleMod.ScaleType] = js.native
    def channelScalePropertyIncompatability(
      channel: vegaDashLiteLib.buildSrcChannelMod.Channel,
      propName: vegaDashLiteLib.vegaDashLiteLibStrings.`type` | vegaDashLiteLib.vegaDashLiteLibStrings.domain | vegaDashLiteLib.vegaDashLiteLibStrings.reverse | vegaDashLiteLib.vegaDashLiteLibStrings.range | vegaDashLiteLib.vegaDashLiteLibStrings.rangeStep | vegaDashLiteLib.vegaDashLiteLibStrings.scheme | vegaDashLiteLib.vegaDashLiteLibStrings.round | vegaDashLiteLib.vegaDashLiteLibStrings.padding | vegaDashLiteLib.vegaDashLiteLibStrings.paddingInner | vegaDashLiteLib.vegaDashLiteLibStrings.paddingOuter | vegaDashLiteLib.vegaDashLiteLibStrings.clamp | vegaDashLiteLib.vegaDashLiteLibStrings.nice | vegaDashLiteLib.vegaDashLiteLibStrings.base | vegaDashLiteLib.vegaDashLiteLibStrings.exponent | vegaDashLiteLib.vegaDashLiteLibStrings.zero | vegaDashLiteLib.vegaDashLiteLibStrings.interpolate
    ): java.lang.String = js.native
    def channelSupportScaleType(
      channel: vegaDashLiteLib.buildSrcChannelMod.Channel,
      scaleType: vegaDashLiteLib.buildSrcScaleMod.ScaleType
    ): scala.Boolean = js.native
    def getSupportedScaleType(
      channel: vegaDashLiteLib.buildSrcChannelMod.Channel,
      fieldDefType: vegaDashLiteLib.buildSrcTypeMod.Type
    ): js.Array[vegaDashLiteLib.buildSrcScaleMod.ScaleType] = js.native
    def getSupportedScaleType(
      channel: vegaDashLiteLib.buildSrcChannelMod.Channel,
      fieldDefType: vegaDashLiteLib.buildSrcTypeMod.Type,
      bin: scala.Boolean
    ): js.Array[vegaDashLiteLib.buildSrcScaleMod.ScaleType] = js.native
    def hasContinuousDomain(`type`: vegaDashLiteLib.buildSrcScaleMod.ScaleType): scala.Boolean = js.native
    def hasDiscreteDomain(`type`: vegaDashLiteLib.buildSrcScaleMod.ScaleType): scala.Boolean = js.native
    def isBinScale(`type`: vegaDashLiteLib.buildSrcScaleMod.ScaleType): scala.Boolean = js.native
    def isContinuousToContinuous(`type`: vegaDashLiteLib.buildSrcScaleMod.ScaleType): scala.Boolean = js.native
    def isExtendedScheme(scheme: java.lang.String): /* is vega-lite.vega-lite/build/src/scale.SchemeParams */ scala.Boolean = js.native
    def isExtendedScheme(scheme: vegaDashLiteLib.buildSrcScaleMod.SchemeParams): /* is vega-lite.vega-lite/build/src/scale.SchemeParams */ scala.Boolean = js.native
    def isSelectionDomain(domain: vegaDashLiteLib.buildSrcScaleMod.Domain): /* is vega-lite.vega-lite/build/src/scale.SelectionDomain */ scala.Boolean = js.native
    def scaleCompatible(
      scaleType1: vegaDashLiteLib.buildSrcScaleMod.ScaleType,
      scaleType2: vegaDashLiteLib.buildSrcScaleMod.ScaleType
    ): scala.Boolean = js.native
    def scaleTypePrecedence(scaleType: vegaDashLiteLib.buildSrcScaleMod.ScaleType): scala.Double = js.native
    def scaleTypeSupportDataType(
      specifiedType: vegaDashLiteLib.buildSrcScaleMod.ScaleType,
      fieldDefType: vegaDashLiteLib.buildSrcTypeMod.Type,
      bin: scala.Boolean
    ): scala.Boolean = js.native
    def scaleTypeSupportDataType(
      specifiedType: vegaDashLiteLib.buildSrcScaleMod.ScaleType,
      fieldDefType: vegaDashLiteLib.buildSrcTypeMod.Type,
      bin: vegaDashLiteLib.buildSrcBinMod.BinParams
    ): scala.Boolean = js.native
    def scaleTypeSupportProperty(
      scaleType: vegaDashLiteLib.buildSrcScaleMod.ScaleType,
      propName: vegaDashLiteLib.vegaDashLiteLibStrings.`type` | vegaDashLiteLib.vegaDashLiteLibStrings.domain | vegaDashLiteLib.vegaDashLiteLibStrings.reverse | vegaDashLiteLib.vegaDashLiteLibStrings.range | vegaDashLiteLib.vegaDashLiteLibStrings.rangeStep | vegaDashLiteLib.vegaDashLiteLibStrings.scheme | vegaDashLiteLib.vegaDashLiteLibStrings.round | vegaDashLiteLib.vegaDashLiteLibStrings.padding | vegaDashLiteLib.vegaDashLiteLibStrings.paddingInner | vegaDashLiteLib.vegaDashLiteLibStrings.paddingOuter | vegaDashLiteLib.vegaDashLiteLibStrings.clamp | vegaDashLiteLib.vegaDashLiteLibStrings.nice | vegaDashLiteLib.vegaDashLiteLibStrings.base | vegaDashLiteLib.vegaDashLiteLibStrings.exponent | vegaDashLiteLib.vegaDashLiteLibStrings.zero | vegaDashLiteLib.vegaDashLiteLibStrings.interpolate
    ): scala.Boolean = js.native
    @JSName("ScaleType")
    @js.native
    object ScaleTypeNs extends js.Object {
      val BAND: vegaDashLiteLib.vegaDashLiteLibStrings.band = js.native
      val BIN_LINEAR: vegaDashLiteLib.vegaDashLiteLibStrings.`bin-linear` = js.native
      val BIN_ORDINAL: vegaDashLiteLib.vegaDashLiteLibStrings.`bin-ordinal` = js.native
      val LINEAR: vegaDashLiteLib.vegaDashLiteLibStrings.linear = js.native
      val LOG: vegaDashLiteLib.vegaDashLiteLibStrings.log = js.native
      val ORDINAL: vegaDashLiteLib.vegaDashLiteLibStrings.ordinal = js.native
      val POINT: vegaDashLiteLib.vegaDashLiteLibStrings.point = js.native
      val POW: vegaDashLiteLib.vegaDashLiteLibStrings.pow = js.native
      val QUANTILE: vegaDashLiteLib.vegaDashLiteLibStrings.quantile = js.native
      val QUANTIZE: vegaDashLiteLib.vegaDashLiteLibStrings.quantize = js.native
      val SEQUENTIAL: vegaDashLiteLib.vegaDashLiteLibStrings.sequential = js.native
      val SQRT: vegaDashLiteLib.vegaDashLiteLibStrings.sqrt = js.native
      val THRESHOLD: vegaDashLiteLib.vegaDashLiteLibStrings.threshold = js.native
      val TIME: vegaDashLiteLib.vegaDashLiteLibStrings.time = js.native
      val UTC: vegaDashLiteLib.vegaDashLiteLibStrings.utc = js.native
    }
    
    @js.native
    object defaultScaleConfig extends js.Object {
      var bandPaddingInner: scala.Double = js.native
      var facetSpacing: scala.Double = js.native
      var maxFontSize: scala.Double = js.native
      var maxOpacity: scala.Double = js.native
      var maxStrokeWidth: scala.Double = js.native
      var minBandSize: scala.Double = js.native
      var minFontSize: scala.Double = js.native
      var minOpacity: scala.Double = js.native
      var minSize: scala.Double = js.native
      var minStrokeWidth: scala.Double = js.native
      var pointPadding: scala.Double = js.native
      var rangeStep: scala.Double = js.native
      var textXRangeStep: scala.Double = js.native
    }
    
  }
  
  @JSName("sort")
  @js.native
  object sortNs extends js.Object {
    def isSortArray[F](sort: vegaDashLiteLib.buildSrcSortMod.Sort[F]): scala.Boolean = js.native
    def isSortField[F](sort: vegaDashLiteLib.buildSrcSortMod.Sort[F]): /* is vega-lite.vega-lite/build/src/sort.EncodingSortField<F> */ scala.Boolean = js.native
  }
  
  @JSName("spec")
  @js.native
  object specNs extends js.Object {
    def fieldDefs(spec: vegaDashLiteLib.buildSrcSpecMod.GenericSpec[_, _]): js.Array[vegaDashLiteLib.buildSrcFielddefMod.FieldDef[_]] = js.native
    def isConcatSpec(spec: vegaDashLiteLib.buildSrcSpecMod.BaseSpec): scala.Boolean = js.native
    def isFacetSpec(spec: vegaDashLiteLib.buildSrcSpecMod.BaseSpec): /* is vega-lite.vega-lite/build/src/spec.GenericFacetSpec<any, any> */ scala.Boolean = js.native
    def isHConcatSpec(spec: vegaDashLiteLib.buildSrcSpecMod.BaseSpec): /* is vega-lite.vega-lite/build/src/spec.GenericHConcatSpec<any, any> */ scala.Boolean = js.native
    def isLayerSpec(spec: vegaDashLiteLib.buildSrcSpecMod.BaseSpec): /* is vega-lite.vega-lite/build/src/spec.GenericLayerSpec<any> */ scala.Boolean = js.native
    def isRepeatSpec(spec: vegaDashLiteLib.buildSrcSpecMod.BaseSpec): /* is vega-lite.vega-lite/build/src/spec.GenericRepeatSpec<any, any> */ scala.Boolean = js.native
    def isStacked(
      spec: vegaDashLiteLib.buildSrcSpecMod.TopLevel[vegaDashLiteLib.buildSrcSpecMod.FacetedCompositeUnitSpec]
    ): scala.Boolean = js.native
    def isStacked(
      spec: vegaDashLiteLib.buildSrcSpecMod.TopLevel[vegaDashLiteLib.buildSrcSpecMod.FacetedCompositeUnitSpec],
      config: vegaDashLiteLib.buildSrcConfigMod.Config
    ): scala.Boolean = js.native
    def isUnitSpec(spec: vegaDashLiteLib.buildSrcSpecMod.BaseSpec): scala.Boolean = js.native
    def isVConcatSpec(spec: vegaDashLiteLib.buildSrcSpecMod.BaseSpec): /* is vega-lite.vega-lite/build/src/spec.GenericVConcatSpec<any, any> */ scala.Boolean = js.native
    def normalize(
      spec: (vegaDashLiteLib.buildSrcSpecMod.GenericSpec[
          vegaDashLiteLib.buildSrcSpecMod.CompositeUnitSpec, 
          vegaDashLiteLib.buildSrcSpecMod.ExtendedLayerSpec
        ]) | vegaDashLiteLib.buildSrcSpecMod.TopLevelSpec,
      config: vegaDashLiteLib.buildSrcConfigMod.Config
    ): vegaDashLiteLib.buildSrcSpecMod.NormalizedSpec = js.native
    def normalize(
      spec: vegaDashLiteLib.buildSrcSpecMod.FacetedCompositeUnitSpec,
      config: vegaDashLiteLib.buildSrcConfigMod.Config
    ): vegaDashLiteLib.buildSrcSpecMod.NormalizedSpec = js.native
  }
  
  @JSName("stack")
  @js.native
  object stackNs extends js.Object {
    val STACKABLE_MARKS: js.Array[
        vegaDashLiteLib.vegaDashLiteLibStrings.square | vegaDashLiteLib.vegaDashLiteLibStrings.area | vegaDashLiteLib.vegaDashLiteLibStrings.circle | vegaDashLiteLib.vegaDashLiteLibStrings.line | vegaDashLiteLib.vegaDashLiteLibStrings.text | vegaDashLiteLib.vegaDashLiteLibStrings.rule | vegaDashLiteLib.vegaDashLiteLibStrings.point | vegaDashLiteLib.vegaDashLiteLibStrings.bar | vegaDashLiteLib.vegaDashLiteLibStrings.tick
      ] = js.native
    val STACK_BY_DEFAULT_MARKS: js.Array[
        vegaDashLiteLib.vegaDashLiteLibStrings.area | vegaDashLiteLib.vegaDashLiteLibStrings.bar
      ] = js.native
    def isStackOffset(s: java.lang.String): /* is vega-lite.vega-lite/build/src/stack.StackOffset */ scala.Boolean = js.native
    def stack(
      m: vegaDashLiteLib.buildSrcMarkMod.MarkDef,
      encoding: vegaDashLiteLib.buildSrcEncodingMod.Encoding[vegaDashLiteLib.buildSrcFielddefMod.Field],
      stackConfig: vegaDashLiteLib.buildSrcStackMod.StackOffset
    ): vegaDashLiteLib.buildSrcStackMod.StackProperties = js.native
    def stack(
      m: vegaDashLiteLib.buildSrcMarkMod.Mark,
      encoding: vegaDashLiteLib.buildSrcEncodingMod.Encoding[vegaDashLiteLib.buildSrcFielddefMod.Field],
      stackConfig: vegaDashLiteLib.buildSrcStackMod.StackOffset
    ): vegaDashLiteLib.buildSrcStackMod.StackProperties = js.native
  }
  
  @JSName("timeUnit")
  @js.native
  object timeUnitNs extends js.Object {
    val TIMEUNITS: js.Array[vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit] = js.native
    val TIMEUNIT_PARTS: js.Array[vegaDashLiteLib.buildSrcTimeunitMod.LocalSingleTimeUnit] = js.native
    def containsTimeUnit(
      fullTimeUnit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit,
      timeUnit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit
    ): scala.Boolean = js.native
    def convert(unit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit, date: stdLib.Date): stdLib.Date = js.native
    def fieldExpr(fullTimeUnit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit, field: java.lang.String): java.lang.String = js.native
    def formatExpression(
      timeUnit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit,
      field: java.lang.String,
      shortTimeLabels: scala.Boolean,
      isUTCScale: scala.Boolean
    ): java.lang.String = js.native
    def getLocalTimeUnit(t: vegaDashLiteLib.buildSrcTimeunitMod.UtcTimeUnit): vegaDashLiteLib.buildSrcTimeunitMod.LocalTimeUnit = js.native
    def getTimeUnitParts(timeUnit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit): js.Array[_] = js.native
    def isLocalSingleTimeUnit(timeUnit: java.lang.String): /* is vega-lite.vega-lite/build/src/timeunit.LocalSingleTimeUnit */ scala.Boolean = js.native
    def isTimeUnit(t: java.lang.String): /* is vega-lite.vega-lite/build/src/timeunit.TimeUnit */ scala.Boolean = js.native
    def isUTCTimeUnit(t: java.lang.String): /* is vega-lite.vega-lite/build/src/timeunit.UtcTimeUnit */ scala.Boolean = js.native
    def isUtcSingleTimeUnit(timeUnit: java.lang.String): /* is vega-lite.vega-lite/build/src/timeunit.UtcSingleTimeUnit */ scala.Boolean = js.native
    def normalizeTimeUnit(timeUnit: vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit): vegaDashLiteLib.buildSrcTimeunitMod.TimeUnit = js.native
    @JSName("TimeUnit")
    @js.native
    object TimeUnitNs extends js.Object {
      val DATE: vegaDashLiteLib.vegaDashLiteLibStrings.date = js.native
      val DAY: vegaDashLiteLib.vegaDashLiteLibStrings.day = js.native
      val HOURS: vegaDashLiteLib.vegaDashLiteLibStrings.hours = js.native
      val HOURSMINUTES: vegaDashLiteLib.vegaDashLiteLibStrings.hoursminutes = js.native
      val HOURSMINUTESSECONDS: vegaDashLiteLib.vegaDashLiteLibStrings.hoursminutesseconds = js.native
      val MILLISECONDS: vegaDashLiteLib.vegaDashLiteLibStrings.milliseconds = js.native
      val MINUTES: vegaDashLiteLib.vegaDashLiteLibStrings.minutes = js.native
      val MINUTESSECONDS: vegaDashLiteLib.vegaDashLiteLibStrings.minutesseconds = js.native
      val MONTH: vegaDashLiteLib.vegaDashLiteLibStrings.month = js.native
      val MONTHDATE: vegaDashLiteLib.vegaDashLiteLibStrings.monthdate = js.native
      val QUARTER: vegaDashLiteLib.vegaDashLiteLibStrings.quarter = js.native
      val QUARTERMONTH: vegaDashLiteLib.vegaDashLiteLibStrings.quartermonth = js.native
      val SECONDS: vegaDashLiteLib.vegaDashLiteLibStrings.seconds = js.native
      val SECONDSMILLISECONDS: vegaDashLiteLib.vegaDashLiteLibStrings.secondsmilliseconds = js.native
      val UTCDATE: vegaDashLiteLib.vegaDashLiteLibStrings.utcdate = js.native
      val UTCDAY: vegaDashLiteLib.vegaDashLiteLibStrings.utcday = js.native
      val UTCHOURS: vegaDashLiteLib.vegaDashLiteLibStrings.utchours = js.native
      val UTCHOURSMINUTES: vegaDashLiteLib.vegaDashLiteLibStrings.utchoursminutes = js.native
      val UTCHOURSMINUTESSECONDS: vegaDashLiteLib.vegaDashLiteLibStrings.utchoursminutesseconds = js.native
      val UTCMILLISECONDS: vegaDashLiteLib.vegaDashLiteLibStrings.utcmilliseconds = js.native
      val UTCMINUTES: vegaDashLiteLib.vegaDashLiteLibStrings.utcminutes = js.native
      val UTCMINUTESSECONDS: vegaDashLiteLib.vegaDashLiteLibStrings.utcminutesseconds = js.native
      val UTCMONTH: vegaDashLiteLib.vegaDashLiteLibStrings.utcmonth = js.native
      val UTCMONTHDATE: vegaDashLiteLib.vegaDashLiteLibStrings.utcmonthdate = js.native
      val UTCQUARTER: vegaDashLiteLib.vegaDashLiteLibStrings.utcquarter = js.native
      val UTCQUARTERMONTH: vegaDashLiteLib.vegaDashLiteLibStrings.utcquartermonth = js.native
      val UTCSECONDS: vegaDashLiteLib.vegaDashLiteLibStrings.utcseconds = js.native
      val UTCSECONDSMILLISECONDS: vegaDashLiteLib.vegaDashLiteLibStrings.utcsecondsmilliseconds = js.native
      val UTCYEAR: vegaDashLiteLib.vegaDashLiteLibStrings.utcyear = js.native
      val UTCYEARMONTH: vegaDashLiteLib.vegaDashLiteLibStrings.utcyearmonth = js.native
      val UTCYEARMONTHDATE: vegaDashLiteLib.vegaDashLiteLibStrings.utcyearmonthdate = js.native
      val UTCYEARMONTHDATEHOURS: vegaDashLiteLib.vegaDashLiteLibStrings.utcyearmonthdatehours = js.native
      val UTCYEARMONTHDATEHOURSMINUTES: vegaDashLiteLib.vegaDashLiteLibStrings.utcyearmonthdatehoursminutes = js.native
      val UTCYEARMONTHDATEHOURSMINUTESSECONDS: vegaDashLiteLib.vegaDashLiteLibStrings.utcyearmonthdatehoursminutesseconds = js.native
      val UTCYEARQUARTER: vegaDashLiteLib.vegaDashLiteLibStrings.utcyearquarter = js.native
      val UTCYEARQUARTERMONTH: vegaDashLiteLib.vegaDashLiteLibStrings.utcyearquartermonth = js.native
      val YEAR: vegaDashLiteLib.vegaDashLiteLibStrings.year = js.native
      val YEARMONTH: vegaDashLiteLib.vegaDashLiteLibStrings.yearmonth = js.native
      val YEARMONTHDATE: vegaDashLiteLib.vegaDashLiteLibStrings.yearmonthdate = js.native
      val YEARMONTHDATEHOURS: vegaDashLiteLib.vegaDashLiteLibStrings.yearmonthdatehours = js.native
      val YEARMONTHDATEHOURSMINUTES: vegaDashLiteLib.vegaDashLiteLibStrings.yearmonthdatehoursminutes = js.native
      val YEARMONTHDATEHOURSMINUTESSECONDS: vegaDashLiteLib.vegaDashLiteLibStrings.yearmonthdatehoursminutesseconds = js.native
      val YEARQUARTER: vegaDashLiteLib.vegaDashLiteLibStrings.yearquarter = js.native
      val YEARQUARTERMONTH: vegaDashLiteLib.vegaDashLiteLibStrings.yearquartermonth = js.native
    }
    
  }
  
  @JSName("transform")
  @js.native
  object transformNs extends js.Object {
    def isAggregate(t: vegaDashLiteLib.buildSrcTransformMod.Transform): /* is vega-lite.vega-lite/build/src/transform.AggregateTransform */ scala.Boolean = js.native
    def isBin(t: vegaDashLiteLib.buildSrcTransformMod.Transform): /* is vega-lite.vega-lite/build/src/transform.BinTransform */ scala.Boolean = js.native
    def isCalculate(t: vegaDashLiteLib.buildSrcTransformMod.Transform): /* is vega-lite.vega-lite/build/src/transform.CalculateTransform */ scala.Boolean = js.native
    def isFilter(t: vegaDashLiteLib.buildSrcTransformMod.Transform): /* is vega-lite.vega-lite/build/src/transform.FilterTransform */ scala.Boolean = js.native
    def isLookup(t: vegaDashLiteLib.buildSrcTransformMod.Transform): /* is vega-lite.vega-lite/build/src/transform.LookupTransform */ scala.Boolean = js.native
    def isStack(t: vegaDashLiteLib.buildSrcTransformMod.Transform): /* is vega-lite.vega-lite/build/src/transform.StackTransform */ scala.Boolean = js.native
    def isTimeUnit(t: vegaDashLiteLib.buildSrcTransformMod.Transform): /* is vega-lite.vega-lite/build/src/transform.TimeUnitTransform */ scala.Boolean = js.native
    def isWindow(t: vegaDashLiteLib.buildSrcTransformMod.Transform): /* is vega-lite.vega-lite/build/src/transform.WindowTransform */ scala.Boolean = js.native
    def normalizeTransform(transform: js.Array[vegaDashLiteLib.buildSrcTransformMod.Transform]): js.Array[
        vegaDashLiteLib.buildSrcTransformMod.CalculateTransform | vegaDashLiteLib.buildSrcTransformMod.LookupTransform | vegaDashLiteLib.buildSrcTransformMod.BinTransform | vegaDashLiteLib.buildSrcTransformMod.TimeUnitTransform | vegaDashLiteLib.buildSrcTransformMod.AggregateTransform | vegaDashLiteLib.buildSrcTransformMod.WindowTransform | vegaDashLiteLib.buildSrcTransformMod.StackTransform | vegaDashLiteLib.Anon_Filter
      ] = js.native
  }
  
  @JSName("type")
  @js.native
  object typeNs extends js.Object {
    val GEOJSON: vegaDashLiteLib.vegaDashLiteLibStrings.geojson = js.native
    val NOMINAL: vegaDashLiteLib.vegaDashLiteLibStrings.nominal = js.native
    val ORDINAL: vegaDashLiteLib.vegaDashLiteLibStrings.ordinal = js.native
    val QUANTITATIVE: vegaDashLiteLib.vegaDashLiteLibStrings.quantitative = js.native
    val TEMPORAL: vegaDashLiteLib.vegaDashLiteLibStrings.temporal = js.native
    val TYPE_INDEX: vegaDashLiteLib.buildSrcUtilMod.Flag[vegaDashLiteLib.buildSrcTypeMod.Type] = js.native
    def getFullName(`type`: java.lang.String): vegaDashLiteLib.buildSrcTypeMod.Type = js.native
    def getFullName(`type`: vegaDashLiteLib.buildSrcTypeMod.Type): vegaDashLiteLib.buildSrcTypeMod.Type = js.native
    def isType(t: js.Any): /* is vega-lite.vega-lite/build/src/type.Type */ scala.Boolean = js.native
    @JSName("Type")
    @js.native
    object TypeNs extends js.Object {
      val GEOJSON: vegaDashLiteLib.vegaDashLiteLibStrings.geojson = js.native
      val LATITUDE: vegaDashLiteLib.vegaDashLiteLibStrings.latitude = js.native
      val LONGITUDE: vegaDashLiteLib.vegaDashLiteLibStrings.longitude = js.native
      val NOMINAL: vegaDashLiteLib.vegaDashLiteLibStrings.nominal = js.native
      val ORDINAL: vegaDashLiteLib.vegaDashLiteLibStrings.ordinal = js.native
      val QUANTITATIVE: vegaDashLiteLib.vegaDashLiteLibStrings.quantitative = js.native
      val TEMPORAL: vegaDashLiteLib.vegaDashLiteLibStrings.temporal = js.native
    }
    
  }
  
  @JSName("util")
  @js.native
  object utilNs extends js.Object {
    def accessPathDepth(path: java.lang.String): scala.Double = js.native
    def accessPathWithDatum(path: java.lang.String): java.lang.String = js.native
    def accessPathWithDatum(path: java.lang.String, datum: java.lang.String): java.lang.String = js.native
    def contains[T](array: js.Array[T], item: T): scala.Boolean = js.native
    def deleteNestedProperty(obj: js.Any, orderedProps: js.Array[java.lang.String]): scala.Boolean = js.native
    def differ[T](dict: vegaDashLiteLib.buildSrcUtilMod.Dict[T], other: vegaDashLiteLib.buildSrcUtilMod.Dict[T]): scala.Boolean = js.native
    def differArray[T](array: js.Array[T], other: js.Array[T]): scala.Boolean = js.native
    def duplicate[T](obj: T): T = js.native
    def every[T](
      arr: js.Array[T],
      f: js.Function3[/* d */ T, /* k */ js.UndefOr[js.Any], /* i */ js.UndefOr[js.Any], scala.Boolean]
    ): scala.Boolean = js.native
    def flagKeys[S /* <: java.lang.String */](f: vegaDashLiteLib.buildSrcUtilMod.Flag[S]): js.Array[S] = js.native
    def flatAccessWithDatum(path: java.lang.String): java.lang.String = js.native
    def flatAccessWithDatum(path: java.lang.String, datum: java.lang.String): java.lang.String = js.native
    def flatten(arrays: js.Array[_]): js.Any = js.native
    def hasIntersection(a: vegaDashLiteLib.buildSrcUtilMod.StringSet, b: vegaDashLiteLib.buildSrcUtilMod.StringSet): scala.Boolean = js.native
    def hash(a: js.Any): java.lang.String | scala.Double = js.native
    def isBoolean(b: js.Any): /* is boolean */ scala.Boolean = js.native
    def isNumeric(num: java.lang.String): scala.Boolean = js.native
    def isNumeric(num: scala.Double): scala.Boolean = js.native
    def keys[T](o: T): js.Array[stdLib.Extract[java.lang.String, java.lang.String]] = js.native
    def logicalExpr[T](op: vegaDashLiteLib.buildSrcLogicalMod.LogicalOperand[T], cb: js.Function): java.lang.String = js.native
    def mergeDeep[T](dest: T, src: stdLib.Partial[T]*): T = js.native
    def omit[T /* <: js.Object */, K /* <: java.lang.String */](obj: T, props: js.Array[K]): vegaDashLiteLib.buildSrcUtilMod.Omit[T, K] = js.native
    def pick[T /* <: js.Object */, K /* <: java.lang.String */](obj: T, props: js.Array[K]): stdLib.Pick[T, K] = js.native
    def removePathFromField(path: java.lang.String): java.lang.String = js.native
    def replacePathInField(path: java.lang.String): java.lang.String = js.native
    def some[T](
      arr: js.Array[T],
      f: js.Function3[/* d */ T, /* k */ js.UndefOr[js.Any], /* i */ js.UndefOr[js.Any], scala.Boolean]
    ): scala.Boolean = js.native
    def titlecase(s: java.lang.String): java.lang.String = js.native
    def union[T](array: js.Array[T], other: js.Array[T]): js.Array[T] = js.native
    def unique[T](values: js.Array[T], f: js.Function1[/* item */ T, java.lang.String | scala.Double]): js.Array[T] = js.native
    def vals[T](x: org.scalablytyped.runtime.StringDictionary[T]): js.Array[T] = js.native
    def varName(s: java.lang.String): java.lang.String = js.native
    def without[T](array: js.Array[T], excludedItems: js.Array[T]): js.Array[T] = js.native
    @js.native
    object stringify extends js.Object {
      def apply(obj: js.Any): java.lang.String = js.native
      def apply(obj: js.Any, opts: jsonDashStableDashStringifyLib.jsonDashStableDashStringifyMod.Comparator): java.lang.String = js.native
      def apply(obj: js.Any, opts: jsonDashStableDashStringifyLib.jsonDashStableDashStringifyMod.Options): java.lang.String = js.native
    }
    
  }
  
  @JSName("validate")
  @js.native
  object validateNs extends js.Object {
    val DEFAULT_REQUIRED_CHANNEL_MAP: vegaDashLiteLib.buildSrcValidateMod.RequiredChannelMap = js.native
    val DEFAULT_SUPPORTED_CHANNEL_TYPE: vegaDashLiteLib.buildSrcValidateMod.SupportedChannelMap = js.native
    def getEncodingMappingError(spec: vegaDashLiteLib.buildSrcSpecMod.FacetedCompositeUnitSpec): java.lang.String = js.native
    def getEncodingMappingError(
      spec: vegaDashLiteLib.buildSrcSpecMod.FacetedCompositeUnitSpec,
      requiredChannelMap: vegaDashLiteLib.buildSrcValidateMod.RequiredChannelMap
    ): java.lang.String = js.native
    def getEncodingMappingError(
      spec: vegaDashLiteLib.buildSrcSpecMod.FacetedCompositeUnitSpec,
      requiredChannelMap: vegaDashLiteLib.buildSrcValidateMod.RequiredChannelMap,
      supportedChannelMap: vegaDashLiteLib.buildSrcValidateMod.SupportedChannelMap
    ): java.lang.String = js.native
  }
  
}

