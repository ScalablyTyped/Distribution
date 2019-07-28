package typings.vegaDashLite

import org.scalablytyped.runtime.StringDictionary
import typings.jsonDashStableDashStringify.jsonDashStableDashStringifyMod.Comparator
import typings.jsonDashStableDashStringify.jsonDashStableDashStringifyMod.Options
import typings.std.Date
import typings.std.Extract
import typings.std.Partial
import typings.std.Pick
import typings.vegaDashLite.buildSrcAxisMod.AxisPart
import typings.vegaDashLite.buildSrcBinMod.BinParams
import typings.vegaDashLite.buildSrcChannelMod.Channel
import typings.vegaDashLite.buildSrcChannelMod.GeoPositionChannel
import typings.vegaDashLite.buildSrcChannelMod.SingleDefChannel
import typings.vegaDashLite.buildSrcChannelMod.SupportedMark
import typings.vegaDashLite.buildSrcCompileCompileMod.CompileOptions
import typings.vegaDashLite.buildSrcCompileScaleTypeMod.RangeType
import typings.vegaDashLite.buildSrcCompositemarkBoxplotMod.BoxPlotStyle
import typings.vegaDashLite.buildSrcCompositemarkMod.CompositeMark
import typings.vegaDashLite.buildSrcCompositemarkMod.CompositeMarkDef
import typings.vegaDashLite.buildSrcCompositemarkMod.UnitNormalizer
import typings.vegaDashLite.buildSrcConfigMod.Config
import typings.vegaDashLite.buildSrcConfigMod.ViewConfig
import typings.vegaDashLite.buildSrcDataMod.Data
import typings.vegaDashLite.buildSrcDatetimeMod.DateTime
import typings.vegaDashLite.buildSrcDatetimeMod.DateTimeExpr
import typings.vegaDashLite.buildSrcEncodingMod.Encoding
import typings.vegaDashLite.buildSrcEncodingMod.EncodingWithFacet
import typings.vegaDashLite.buildSrcFielddefMod.ChannelDef
import typings.vegaDashLite.buildSrcFielddefMod.Conditional
import typings.vegaDashLite.buildSrcFielddefMod.Field
import typings.vegaDashLite.buildSrcFielddefMod.FieldDef
import typings.vegaDashLite.buildSrcFielddefMod.FieldDefBase
import typings.vegaDashLite.buildSrcFielddefMod.FieldRefOption
import typings.vegaDashLite.buildSrcFielddefMod.FieldTitleFormatter
import typings.vegaDashLite.buildSrcFielddefMod.RepeatRef
import typings.vegaDashLite.buildSrcLegendMod.LegendConfig
import typings.vegaDashLite.buildSrcLogicalMod.LogicalOperand
import typings.vegaDashLite.buildSrcMarkMod.AnyMark
import typings.vegaDashLite.buildSrcMarkMod.BarConfig
import typings.vegaDashLite.buildSrcMarkMod.Mark
import typings.vegaDashLite.buildSrcMarkMod.MarkConfig
import typings.vegaDashLite.buildSrcMarkMod.MarkDef
import typings.vegaDashLite.buildSrcMarkMod.TickConfig
import typings.vegaDashLite.buildSrcScaleMod.Domain
import typings.vegaDashLite.buildSrcScaleMod.ScaleType
import typings.vegaDashLite.buildSrcScaleMod.ScaleTypeIndex
import typings.vegaDashLite.buildSrcScaleMod.SchemeParams
import typings.vegaDashLite.buildSrcSortMod.Sort
import typings.vegaDashLite.buildSrcSpecMod.BaseSpec
import typings.vegaDashLite.buildSrcSpecMod.CompositeUnitSpec
import typings.vegaDashLite.buildSrcSpecMod.ExtendedLayerSpec
import typings.vegaDashLite.buildSrcSpecMod.FacetedCompositeUnitSpec
import typings.vegaDashLite.buildSrcSpecMod.GenericSpec
import typings.vegaDashLite.buildSrcSpecMod.GenericUnitSpec
import typings.vegaDashLite.buildSrcSpecMod.NormalizedLayerSpec
import typings.vegaDashLite.buildSrcSpecMod.NormalizedSpec
import typings.vegaDashLite.buildSrcSpecMod.TopLevel
import typings.vegaDashLite.buildSrcSpecMod.TopLevelSpec
import typings.vegaDashLite.buildSrcStackMod.StackOffset
import typings.vegaDashLite.buildSrcStackMod.StackProperties
import typings.vegaDashLite.buildSrcTimeunitMod.LocalSingleTimeUnit
import typings.vegaDashLite.buildSrcTimeunitMod.LocalTimeUnit
import typings.vegaDashLite.buildSrcTimeunitMod.TimeUnit
import typings.vegaDashLite.buildSrcTimeunitMod.UtcTimeUnit
import typings.vegaDashLite.buildSrcTransformMod.AggregateTransform
import typings.vegaDashLite.buildSrcTransformMod.AggregatedFieldDef
import typings.vegaDashLite.buildSrcTransformMod.BinTransform
import typings.vegaDashLite.buildSrcTransformMod.CalculateTransform
import typings.vegaDashLite.buildSrcTransformMod.LookupTransform
import typings.vegaDashLite.buildSrcTransformMod.StackTransform
import typings.vegaDashLite.buildSrcTransformMod.TimeUnitTransform
import typings.vegaDashLite.buildSrcTransformMod.Transform
import typings.vegaDashLite.buildSrcTransformMod.WindowFieldDef
import typings.vegaDashLite.buildSrcTransformMod.WindowTransform
import typings.vegaDashLite.buildSrcTypeMod.Type
import typings.vegaDashLite.buildSrcUtilMod.Dict
import typings.vegaDashLite.buildSrcUtilMod.Flag
import typings.vegaDashLite.buildSrcUtilMod.Omit
import typings.vegaDashLite.buildSrcUtilMod.StringSet
import typings.vegaDashLite.buildSrcValidateMod.RequiredChannelMap
import typings.vegaDashLite.buildSrcValidateMod.SupportedChannelMap
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgData
import typings.vegaDashLite.vegaDashLiteNumbers.`true`
import typings.vegaDashLite.vegaDashLiteStrings.`bin-linear`
import typings.vegaDashLite.vegaDashLiteStrings.`bin-ordinal`
import typings.vegaDashLite.vegaDashLiteStrings.`type`
import typings.vegaDashLite.vegaDashLiteStrings.align
import typings.vegaDashLite.vegaDashLiteStrings.angle
import typings.vegaDashLite.vegaDashLiteStrings.area
import typings.vegaDashLite.vegaDashLiteStrings.band
import typings.vegaDashLite.vegaDashLiteStrings.bar
import typings.vegaDashLite.vegaDashLiteStrings.base
import typings.vegaDashLite.vegaDashLiteStrings.baseline
import typings.vegaDashLite.vegaDashLiteStrings.circle
import typings.vegaDashLite.vegaDashLiteStrings.clamp
import typings.vegaDashLite.vegaDashLiteStrings.color
import typings.vegaDashLite.vegaDashLiteStrings.column
import typings.vegaDashLite.vegaDashLiteStrings.cornerRadius
import typings.vegaDashLite.vegaDashLiteStrings.cursor
import typings.vegaDashLite.vegaDashLiteStrings.date
import typings.vegaDashLite.vegaDashLiteStrings.day
import typings.vegaDashLite.vegaDashLiteStrings.detail
import typings.vegaDashLite.vegaDashLiteStrings.dir
import typings.vegaDashLite.vegaDashLiteStrings.domain
import typings.vegaDashLite.vegaDashLiteStrings.dx
import typings.vegaDashLite.vegaDashLiteStrings.dy
import typings.vegaDashLite.vegaDashLiteStrings.ellipsis
import typings.vegaDashLite.vegaDashLiteStrings.encode
import typings.vegaDashLite.vegaDashLiteStrings.encoding
import typings.vegaDashLite.vegaDashLiteStrings.entryPadding
import typings.vegaDashLite.vegaDashLiteStrings.exponent
import typings.vegaDashLite.vegaDashLiteStrings.extent
import typings.vegaDashLite.vegaDashLiteStrings.fill
import typings.vegaDashLite.vegaDashLiteStrings.fillOpacity
import typings.vegaDashLite.vegaDashLiteStrings.filled
import typings.vegaDashLite.vegaDashLiteStrings.font
import typings.vegaDashLite.vegaDashLiteStrings.fontSize
import typings.vegaDashLite.vegaDashLiteStrings.fontStyle
import typings.vegaDashLite.vegaDashLiteStrings.fontWeight
import typings.vegaDashLite.vegaDashLiteStrings.format
import typings.vegaDashLite.vegaDashLiteStrings.geojson
import typings.vegaDashLite.vegaDashLiteStrings.geoshape
import typings.vegaDashLite.vegaDashLiteStrings.grid
import typings.vegaDashLite.vegaDashLiteStrings.gridScale
import typings.vegaDashLite.vegaDashLiteStrings.hours
import typings.vegaDashLite.vegaDashLiteStrings.hoursminutes
import typings.vegaDashLite.vegaDashLiteStrings.hoursminutesseconds
import typings.vegaDashLite.vegaDashLiteStrings.href
import typings.vegaDashLite.vegaDashLiteStrings.interpolate
import typings.vegaDashLite.vegaDashLiteStrings.key
import typings.vegaDashLite.vegaDashLiteStrings.labelAngle
import typings.vegaDashLite.vegaDashLiteStrings.labelBound
import typings.vegaDashLite.vegaDashLiteStrings.labelFlush
import typings.vegaDashLite.vegaDashLiteStrings.labelOverlap
import typings.vegaDashLite.vegaDashLiteStrings.labelPadding
import typings.vegaDashLite.vegaDashLiteStrings.labels
import typings.vegaDashLite.vegaDashLiteStrings.latitude
import typings.vegaDashLite.vegaDashLiteStrings.latitude2
import typings.vegaDashLite.vegaDashLiteStrings.limit
import typings.vegaDashLite.vegaDashLiteStrings.line
import typings.vegaDashLite.vegaDashLiteStrings.linear
import typings.vegaDashLite.vegaDashLiteStrings.log
import typings.vegaDashLite.vegaDashLiteStrings.longitude
import typings.vegaDashLite.vegaDashLiteStrings.longitude2
import typings.vegaDashLite.vegaDashLiteStrings.main
import typings.vegaDashLite.vegaDashLiteStrings.maxExtent
import typings.vegaDashLite.vegaDashLiteStrings.milliseconds
import typings.vegaDashLite.vegaDashLiteStrings.minExtent
import typings.vegaDashLite.vegaDashLiteStrings.minutes
import typings.vegaDashLite.vegaDashLiteStrings.minutesseconds
import typings.vegaDashLite.vegaDashLiteStrings.month
import typings.vegaDashLite.vegaDashLiteStrings.monthdate
import typings.vegaDashLite.vegaDashLiteStrings.nice
import typings.vegaDashLite.vegaDashLiteStrings.nominal
import typings.vegaDashLite.vegaDashLiteStrings.offset
import typings.vegaDashLite.vegaDashLiteStrings.opacity
import typings.vegaDashLite.vegaDashLiteStrings.order
import typings.vegaDashLite.vegaDashLiteStrings.ordinal
import typings.vegaDashLite.vegaDashLiteStrings.orient
import typings.vegaDashLite.vegaDashLiteStrings.padding
import typings.vegaDashLite.vegaDashLiteStrings.paddingInner
import typings.vegaDashLite.vegaDashLiteStrings.paddingOuter
import typings.vegaDashLite.vegaDashLiteStrings.point
import typings.vegaDashLite.vegaDashLiteStrings.position
import typings.vegaDashLite.vegaDashLiteStrings.pow
import typings.vegaDashLite.vegaDashLiteStrings.quantile
import typings.vegaDashLite.vegaDashLiteStrings.quantitative
import typings.vegaDashLite.vegaDashLiteStrings.quantize
import typings.vegaDashLite.vegaDashLiteStrings.quarter
import typings.vegaDashLite.vegaDashLiteStrings.quartermonth
import typings.vegaDashLite.vegaDashLiteStrings.radius
import typings.vegaDashLite.vegaDashLiteStrings.range
import typings.vegaDashLite.vegaDashLiteStrings.rangeStep
import typings.vegaDashLite.vegaDashLiteStrings.raw
import typings.vegaDashLite.vegaDashLiteStrings.rect
import typings.vegaDashLite.vegaDashLiteStrings.reverse
import typings.vegaDashLite.vegaDashLiteStrings.round
import typings.vegaDashLite.vegaDashLiteStrings.row
import typings.vegaDashLite.vegaDashLiteStrings.rule
import typings.vegaDashLite.vegaDashLiteStrings.scale
import typings.vegaDashLite.vegaDashLiteStrings.scheme
import typings.vegaDashLite.vegaDashLiteStrings.seconds
import typings.vegaDashLite.vegaDashLiteStrings.secondsmilliseconds
import typings.vegaDashLite.vegaDashLiteStrings.sequential
import typings.vegaDashLite.vegaDashLiteStrings.shape
import typings.vegaDashLite.vegaDashLiteStrings.size
import typings.vegaDashLite.vegaDashLiteStrings.sqrt
import typings.vegaDashLite.vegaDashLiteStrings.square
import typings.vegaDashLite.vegaDashLiteStrings.stroke
import typings.vegaDashLite.vegaDashLiteStrings.strokeCap
import typings.vegaDashLite.vegaDashLiteStrings.strokeDash
import typings.vegaDashLite.vegaDashLiteStrings.strokeDashOffset
import typings.vegaDashLite.vegaDashLiteStrings.strokeJoin
import typings.vegaDashLite.vegaDashLiteStrings.strokeMiterLimit
import typings.vegaDashLite.vegaDashLiteStrings.strokeOpacity
import typings.vegaDashLite.vegaDashLiteStrings.strokeWidth
import typings.vegaDashLite.vegaDashLiteStrings.temporal
import typings.vegaDashLite.vegaDashLiteStrings.tension
import typings.vegaDashLite.vegaDashLiteStrings.text
import typings.vegaDashLite.vegaDashLiteStrings.theta
import typings.vegaDashLite.vegaDashLiteStrings.threshold
import typings.vegaDashLite.vegaDashLiteStrings.tick
import typings.vegaDashLite.vegaDashLiteStrings.tickCount
import typings.vegaDashLite.vegaDashLiteStrings.tickSize
import typings.vegaDashLite.vegaDashLiteStrings.ticks
import typings.vegaDashLite.vegaDashLiteStrings.time
import typings.vegaDashLite.vegaDashLiteStrings.title
import typings.vegaDashLite.vegaDashLiteStrings.titleMaxLength
import typings.vegaDashLite.vegaDashLiteStrings.titlePadding
import typings.vegaDashLite.vegaDashLiteStrings.tooltip
import typings.vegaDashLite.vegaDashLiteStrings.trail
import typings.vegaDashLite.vegaDashLiteStrings.utc
import typings.vegaDashLite.vegaDashLiteStrings.utcdate
import typings.vegaDashLite.vegaDashLiteStrings.utcday
import typings.vegaDashLite.vegaDashLiteStrings.utchours
import typings.vegaDashLite.vegaDashLiteStrings.utchoursminutes
import typings.vegaDashLite.vegaDashLiteStrings.utchoursminutesseconds
import typings.vegaDashLite.vegaDashLiteStrings.utcmilliseconds
import typings.vegaDashLite.vegaDashLiteStrings.utcminutes
import typings.vegaDashLite.vegaDashLiteStrings.utcminutesseconds
import typings.vegaDashLite.vegaDashLiteStrings.utcmonth
import typings.vegaDashLite.vegaDashLiteStrings.utcmonthdate
import typings.vegaDashLite.vegaDashLiteStrings.utcquarter
import typings.vegaDashLite.vegaDashLiteStrings.utcquartermonth
import typings.vegaDashLite.vegaDashLiteStrings.utcseconds
import typings.vegaDashLite.vegaDashLiteStrings.utcsecondsmilliseconds
import typings.vegaDashLite.vegaDashLiteStrings.utcyear
import typings.vegaDashLite.vegaDashLiteStrings.utcyearmonth
import typings.vegaDashLite.vegaDashLiteStrings.utcyearmonthdate
import typings.vegaDashLite.vegaDashLiteStrings.utcyearmonthdatehours
import typings.vegaDashLite.vegaDashLiteStrings.utcyearmonthdatehoursminutes
import typings.vegaDashLite.vegaDashLiteStrings.utcyearmonthdatehoursminutesseconds
import typings.vegaDashLite.vegaDashLiteStrings.utcyearquarter
import typings.vegaDashLite.vegaDashLiteStrings.utcyearquartermonth
import typings.vegaDashLite.vegaDashLiteStrings.values
import typings.vegaDashLite.vegaDashLiteStrings.x
import typings.vegaDashLite.vegaDashLiteStrings.x2
import typings.vegaDashLite.vegaDashLiteStrings.y
import typings.vegaDashLite.vegaDashLiteStrings.y2
import typings.vegaDashLite.vegaDashLiteStrings.year
import typings.vegaDashLite.vegaDashLiteStrings.yearmonth
import typings.vegaDashLite.vegaDashLiteStrings.yearmonthdate
import typings.vegaDashLite.vegaDashLiteStrings.yearmonthdatehours
import typings.vegaDashLite.vegaDashLiteStrings.yearmonthdatehoursminutes
import typings.vegaDashLite.vegaDashLiteStrings.yearmonthdatehoursminutesseconds
import typings.vegaDashLite.vegaDashLiteStrings.yearquarter
import typings.vegaDashLite.vegaDashLiteStrings.yearquartermonth
import typings.vegaDashLite.vegaDashLiteStrings.zero
import typings.vegaDashLite.vegaDashLiteStrings.zindex
import typings.vegaDashTypings.typesSpecTransformMod.AggregateOp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite", JSImport.Namespace)
@js.native
object vegaDashLiteMod extends js.Object {
  val version: String = js.native
  def compile(inputSpec: TopLevelSpec): Anon_Spec = js.native
  def compile(inputSpec: TopLevelSpec, opt: CompileOptions): Anon_Spec = js.native
  @JSName("aggregate")
  @js.native
  object aggregateNs extends js.Object {
    val AGGREGATE_OPS: js.Array[AggregateOp] = js.native
    val COUNTING_OPS: js.Array[AggregateOp] = js.native
    val SHARED_DOMAIN_OPS: js.Array[AggregateOp] = js.native
    val SUM_OPS: js.Array[AggregateOp] = js.native
    def isAggregateOp(a: String): /* is vega-typings.vega-typings/types/spec/transform.AggregateOp */ Boolean = js.native
    def isCountingAggregateOp(aggregate: String): Boolean = js.native
    @js.native
    object SHARED_DOMAIN_OP_INDEX extends /* T */ StringDictionary[`true`]
    
  }
  
  @JSName("axis")
  @js.native
  object axisNs extends js.Object {
    val AXIS_PARTS: js.Array[AxisPart] = js.native
    val AXIS_PROPERTIES: js.Array[
        title | orient | zindex | ticks | labels | labelBound | labelFlush | labelPadding | labelOverlap | domain | grid | tickSize | tickCount | format | values | offset | position | titlePadding | minExtent | maxExtent | labelAngle | encoding | titleMaxLength
      ] = js.native
    val VG_AXIS_PROPERTIES: js.Array[
        title | orient | scale | zindex | ticks | labels | labelBound | labelFlush | labelPadding | labelOverlap | domain | grid | gridScale | tickSize | tickCount | format | values | offset | position | titlePadding | minExtent | maxExtent | encode
      ] = js.native
    def isAxisProperty(prop: String): Boolean = js.native
  }
  
  @JSName("bin")
  @js.native
  object binNs extends js.Object {
    def autoMaxBins(channel: Channel): Double = js.native
    def binToString(bin: Boolean): String = js.native
    def binToString(bin: BinParams): String = js.native
    def isBinParams(bin: Boolean): /* is vega-lite.vega-lite/build/src/bin.BinParams */ Boolean = js.native
    def isBinParams(bin: BinParams): /* is vega-lite.vega-lite/build/src/bin.BinParams */ Boolean = js.native
  }
  
  @JSName("channel")
  @js.native
  object channelNs extends js.Object {
    val CHANNELS: js.Array[Channel] = js.native
    val COLOR: color = js.native
    val COLUMN: column = js.native
    val DETAIL: detail = js.native
    val FILL: fill = js.native
    val GEOPOSITION_CHANNELS: js.Array[GeoPositionChannel] = js.native
    val GEOPOSITION_CHANNEL_INDEX: Flag[GeoPositionChannel] = js.native
    val HREF: href = js.native
    val KEY: key = js.native
    val LATITUDE: latitude = js.native
    val LATITUDE2: latitude2 = js.native
    val LONGITUDE: longitude = js.native
    val LONGITUDE2: longitude2 = js.native
    val NONPOSITION_CHANNELS: js.Array[
        text | shape | color | fill | stroke | opacity | size | detail | key | tooltip | href | order
      ] = js.native
    val NONPOSITION_SCALE_CHANNELS: js.Array[shape | color | fill | stroke | opacity | size] = js.native
    val OPACITY: opacity = js.native
    val ORDER: order = js.native
    val POSITION_SCALE_CHANNELS: js.Array[x | y] = js.native
    val ROW: row = js.native
    val SCALE_CHANNELS: js.Array[shape | x | y | color | fill | stroke | opacity | size] = js.native
    val SHAPE: shape = js.native
    val SINGLE_DEF_CHANNELS: js.Array[SingleDefChannel] = js.native
    val SIZE: size = js.native
    val STROKE: stroke = js.native
    val TEXT: text = js.native
    val TOOLTIP: tooltip = js.native
    val UNIT_CHANNELS: js.Array[
        text | shape | x | y | x2 | y2 | longitude | latitude | longitude2 | latitude2 | color | fill | stroke | opacity | size | detail | key | tooltip | href | order
      ] = js.native
    val X: x = js.native
    val X2: x2 = js.native
    val Y: y = js.native
    val Y2: y2 = js.native
    def getSupportedMark(channel: Channel): SupportedMark = js.native
    def isChannel(str: String): /* is vega-lite.vega-lite/build/src/channel.Channel */ Boolean = js.native
    def isColorChannel(channel: Channel): /* is vega-lite.vega-lite/build/src/channel.ColorChannel */ Boolean = js.native
    def isScaleChannel(channel: Channel): /* is vega-lite.vega-lite/build/src/channel.ScaleChannel */ Boolean = js.native
    def rangeType(channel: Channel): RangeType = js.native
    def supportMark(channel: Channel, mark: Mark): Boolean = js.native
    @JSName("Channel")
    @js.native
    object ChannelNs extends js.Object {
      val COLOR: color = js.native
      val COLUMN: column = js.native
      val DETAIL: detail = js.native
      val FILL: fill = js.native
      val HREF: href = js.native
      val KEY: key = js.native
      val LATITUDE: latitude = js.native
      val LATITUDE2: latitude2 = js.native
      val LONGITUDE: longitude = js.native
      val LONGITUDE2: longitude2 = js.native
      val OPACITY: opacity = js.native
      val ORDER: order = js.native
      val ROW: row = js.native
      val SHAPE: shape = js.native
      val SIZE: size = js.native
      val STROKE: stroke = js.native
      val TEXT: text = js.native
      val TOOLTIP: tooltip = js.native
      val X: x = js.native
      val X2: x2 = js.native
      val Y: y = js.native
      val Y2: y2 = js.native
    }
    
  }
  
  @JSName("compositeMark")
  @js.native
  object compositeMarkNs extends js.Object {
    val COMPOSITE_MARK_STYLES: js.Array[BoxPlotStyle] = js.native
    def add(mark: String, normalizer: UnitNormalizer): Unit = js.native
    def normalize(spec: GenericUnitSpec[_, AnyMark], config: Config): NormalizedLayerSpec = js.native
    def remove(mark: String): Unit = js.native
    @js.native
    object VL_ONLY_COMPOSITE_MARK_SPECIFIC_CONFIG_PROPERTY_INDEX extends js.Object {
      var box: js.UndefOr[
            js.Array[
              dir | font | text | shape | orient | extent | color | fill | stroke | opacity | size | tooltip | href | interpolate | angle | baseline | fontSize | fontWeight | limit | strokeWidth | strokeDash | strokeDashOffset | strokeOpacity | strokeJoin | strokeMiterLimit | fillOpacity | filled | strokeCap | tension | align | dx | dy | radius | ellipsis | theta | fontStyle | cursor | cornerRadius
            ]
          ] = js.native
      var boxMid: js.UndefOr[
            js.Array[
              dir | font | text | shape | orient | color | fill | stroke | opacity | size | tooltip | href | interpolate | angle | baseline | fontSize | fontWeight | limit | strokeWidth | strokeDash | strokeDashOffset | strokeOpacity | strokeJoin | strokeMiterLimit | fillOpacity | filled | strokeCap | tension | align | dx | dy | radius | ellipsis | theta | fontStyle | cursor | cornerRadius
            ]
          ] = js.native
      var boxWhisker: js.UndefOr[
            js.Array[
              dir | font | text | shape | orient | color | fill | stroke | opacity | size | tooltip | href | interpolate | angle | baseline | fontSize | fontWeight | limit | strokeWidth | strokeDash | strokeDashOffset | strokeOpacity | strokeJoin | strokeMiterLimit | fillOpacity | filled | strokeCap | tension | align | dx | dy | radius | ellipsis | theta | fontStyle | cursor | cornerRadius
            ]
          ] = js.native
    }
    
  }
  
  @JSName("config")
  @js.native
  object configNs extends js.Object {
    val defaultConfig: Config = js.native
    val defaultViewConfig: ViewConfig = js.native
    def initConfig(config: Config): Config = js.native
    def stripAndRedirectConfig(config: Config): Config = js.native
  }
  
  @JSName("data")
  @js.native
  object dataNs extends js.Object {
    val MAIN: main = js.native
    val RAW: raw = js.native
    def isInlineData(data: Partial[Data | VgData]): /* is vega-lite.vega-lite/build/src/data.InlineData */ Boolean = js.native
    def isNamedData(data: Partial[Data]): /* is vega-lite.vega-lite/build/src/data.NamedData */ Boolean = js.native
    def isUrlData(data: Partial[Data | VgData]): /* is vega-lite.vega-lite/build/src/data.UrlData */ Boolean = js.native
  }
  
  @JSName("datetime")
  @js.native
  object datetimeNs extends js.Object {
    val DAYS: js.Array[String] = js.native
    val MONTHS: js.Array[String] = js.native
    val SHORT_DAYS: js.Array[String] = js.native
    val SHORT_MONTHS: js.Array[String] = js.native
    def dateTimeExpr(d: DateTime): String = js.native
    def dateTimeExpr(d: DateTimeExpr): String = js.native
    def dateTimeExpr(d: DateTimeExpr, normalize: Boolean): String = js.native
    def dateTimeExpr(d: DateTime, normalize: Boolean): String = js.native
    def isDateTime(o: js.Any): /* is vega-lite.vega-lite/build/src/datetime.DateTime */ Boolean = js.native
  }
  
  @JSName("encoding")
  @js.native
  object encodingNs extends js.Object {
    def channelHasField(encoding: EncodingWithFacet[Field], channel: Channel): Boolean = js.native
    def fieldDefs(encoding: EncodingWithFacet[Field]): js.Array[FieldDef[Field]] = js.native
    def forEach(mapping: js.Any, f: js.Function2[/* fd */ FieldDef[String], /* c */ Channel, Unit]): Unit = js.native
    def forEach(
      mapping: js.Any,
      f: js.Function2[/* fd */ FieldDef[String], /* c */ Channel, Unit],
      thisArg: js.Any
    ): Unit = js.native
    def isAggregate(encoding: EncodingWithFacet[Field]): Boolean = js.native
    def isRanged(encoding: EncodingWithFacet[_]): Boolean = js.native
    def normalizeEncoding(encoding: Encoding[String], mark: Mark): Encoding[String] = js.native
    def reduce[T, U /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
    {[ k in vega-lite.vega-lite/build/src/channel.Channel ]:? any}
      */ typings.vegaDashLite.vegaDashLiteStrings.reduce with js.Any */](
      mapping: U,
      f: js.Function3[/* acc */ js.Any, /* fd */ FieldDef[String], /* c */ Channel, U],
      init: T
    ): js.Any = js.native
    def reduce[T, U /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
    {[ k in vega-lite.vega-lite/build/src/channel.Channel ]:? any}
      */ typings.vegaDashLite.vegaDashLiteStrings.reduce with js.Any */](
      mapping: U,
      f: js.Function3[/* acc */ js.Any, /* fd */ FieldDef[String], /* c */ Channel, U],
      init: T,
      thisArg: js.Any
    ): js.Any = js.native
  }
  
  @JSName("fieldDef")
  @js.native
  object fieldDefNs extends js.Object {
    val defaultTitleFormatter: FieldTitleFormatter = js.native
    def channelCompatibility(fieldDef: FieldDef[Field], channel: Channel): Anon_Compatible = js.native
    def defaultType(fieldDef: FieldDef[Field], channel: Channel): Type = js.native
    def functionalTitleFormatter(fieldDef: FieldDefBase[String], config: Config): String = js.native
    def getFieldDef[F](channelDef: ChannelDef[F]): FieldDef[F] = js.native
    def hasConditionalFieldDef[F](channelDef: ChannelDef[F]): Boolean = js.native
    def hasConditionalValueDef[F](channelDef: ChannelDef[F]): Boolean = js.native
    def isConditionalDef[F](channelDef: ChannelDef[F]): /* is vega-lite.vega-lite/build/src/fielddef.ChannelDefWithCondition<vega-lite.vega-lite/build/src/fielddef.FieldDef<F>> */ Boolean = js.native
    def isConditionalSelection[T](c: Conditional[T]): /* is vega-lite.vega-lite/build/src/fielddef.ConditionalSelection<T> */ Boolean = js.native
    def isContinuous(fieldDef: FieldDef[Field]): Boolean = js.native
    def isCount(fieldDef: FieldDefBase[Field]): Boolean = js.native
    def isDiscrete(fieldDef: FieldDef[Field]): Boolean = js.native
    def isFieldDef[F](channelDef: ChannelDef[F]): Boolean = js.native
    def isNumberFieldDef(fieldDef: FieldDef[_]): Boolean = js.native
    def isRepeatRef(field: Field): /* is vega-lite.vega-lite/build/src/fielddef.RepeatRef */ Boolean = js.native
    def isScaleFieldDef[F](channelDef: ChannelDef[F]): /* is vega-lite.vega-lite/build/src/fielddef.ScaleFieldDef<F> */ Boolean = js.native
    def isStringFieldDef(fieldDef: ChannelDef[String | RepeatRef]): /* is vega-lite.vega-lite/build/src/fielddef.FieldDef<string> */ Boolean = js.native
    def isTimeFieldDef(fieldDef: FieldDef[_]): Boolean = js.native
    def isValueDef[F](channelDef: ChannelDef[F]): /* is vega-lite.vega-lite/build/src/fielddef.ValueDef */ Boolean = js.native
    def normalize(channelDef: ChannelDef[String], channel: Channel): ChannelDef[_] = js.native
    def normalizeBin(bin: Boolean, channel: Channel): BinParams = js.native
    def normalizeBin(bin: BinParams, channel: Channel): BinParams = js.native
    def normalizeFieldDef(fieldDef: FieldDef[String], channel: Channel): FieldDef[String] = js.native
    def resetTitleFormatter(): Unit = js.native
    def setTitleFormatter(formatter: FieldTitleFormatter): Unit = js.native
    def title(fieldDef: FieldDefBase[String], config: Config): String = js.native
    def toFieldDefBase(fieldDef: FieldDef[String]): FieldDefBase[String] = js.native
    def valueArray(fieldDef: FieldDef[String], values: js.Array[Double | String | Boolean | DateTime]): js.Array[String | Double | Boolean | DateTime | Anon_Signal] = js.native
    def valueExpr(v: String, hasTimeUnitTypeTimeUndefinedIfExprNotRequired: Anon_Time): String = js.native
    def valueExpr(v: Boolean, hasTimeUnitTypeTimeUndefinedIfExprNotRequired: Anon_Time): String = js.native
    def valueExpr(v: Double, hasTimeUnitTypeTimeUndefinedIfExprNotRequired: Anon_Time): String = js.native
    def valueExpr(v: DateTime, hasTimeUnitTypeTimeUndefinedIfExprNotRequired: Anon_Time): String = js.native
    def verbalTitleFormatter(fieldDef: FieldDefBase[String], config: Config): String = js.native
    def vgField(fieldDef: FieldDefBase[String]): String = js.native
    def vgField(fieldDef: FieldDefBase[String], opt: FieldRefOption): String = js.native
    def vgField(fieldDef: AggregatedFieldDef): String = js.native
    def vgField(fieldDef: AggregatedFieldDef, opt: FieldRefOption): String = js.native
    def vgField(fieldDef: WindowFieldDef): String = js.native
    def vgField(fieldDef: WindowFieldDef, opt: FieldRefOption): String = js.native
  }
  
  @JSName("header")
  @js.native
  object headerNs extends js.Object {
    val HEADER_LABEL_PROPERTIES: js.Array[String] = js.native
    val HEADER_TITLE_PROPERTIES: js.Array[String] = js.native
  }
  
  @JSName("legend")
  @js.native
  object legendNs extends js.Object {
    val LEGEND_PROPERTIES: js.Array[
        title | padding | `type` | orient | zindex | tickCount | format | values | offset | entryPadding
      ] = js.native
    val VG_LEGEND_PROPERTIES: js.Array[
        title | padding | `type` | shape | orient | zindex | tickCount | format | values | offset | encode | fill | stroke | opacity | size | entryPadding
      ] = js.native
    val defaultLegendConfig: LegendConfig = js.native
  }
  
  @JSName("mark")
  @js.native
  object markNs extends js.Object {
    val AREA: area = js.native
    val BAR: bar = js.native
    val CIRCLE: circle = js.native
    val FILL_CONFIG: js.Array[String] = js.native
    val FILL_STROKE_CONFIG: js.Array[js.Any] = js.native
    val GEOSHAPE: geoshape = js.native
    val LINE: line = js.native
    val POINT: point = js.native
    val PRIMITIVE_MARKS: js.Array[Mark] = js.native
    val RECT: rect = js.native
    val RULE: rule = js.native
    val SQUARE: square = js.native
    val STROKE_CONFIG: js.Array[String] = js.native
    val TEXT: text = js.native
    val TICK: tick = js.native
    val TRAIL: trail = js.native
    val VL_ONLY_MARK_CONFIG_PROPERTIES: js.Array[filled | color] = js.native
    val defaultBarConfig: BarConfig = js.native
    val defaultMarkConfig: MarkConfig = js.native
    val defaultTickConfig: TickConfig = js.native
    def isMark(m: String): /* is vega-lite.vega-lite/build/src/mark.Mark */ Boolean = js.native
    def isMarkDef(mark: AnyMark): Boolean = js.native
    def isPathMark(m: CompositeMark): Boolean = js.native
    def isPathMark(m: Mark): Boolean = js.native
    def isPrimitiveMark(mark: CompositeMark): /* is vega-lite.vega-lite/build/src/mark.Mark */ Boolean = js.native
    def isPrimitiveMark(mark: CompositeMarkDef): /* is vega-lite.vega-lite/build/src/mark.Mark */ Boolean = js.native
    def isPrimitiveMark(mark: Mark): /* is vega-lite.vega-lite/build/src/mark.Mark */ Boolean = js.native
    def isPrimitiveMark(mark: MarkDef): /* is vega-lite.vega-lite/build/src/mark.Mark */ Boolean = js.native
    @JSName("Mark")
    @js.native
    object MarkNs extends js.Object {
      val AREA: area = js.native
      val BAR: bar = js.native
      val CIRCLE: circle = js.native
      val GEOSHAPE: geoshape = js.native
      val LINE: line = js.native
      val POINT: point = js.native
      val RECT: rect = js.native
      val RULE: rule = js.native
      val SQUARE: square = js.native
      val TEXT: text = js.native
      val TICK: tick = js.native
      val TRAIL: trail = js.native
    }
    
  }
  
  @JSName("scale")
  @js.native
  object scaleNs extends js.Object {
    val CONTINUOUS_DOMAIN_SCALES: js.Array[ScaleType] = js.native
    val CONTINUOUS_TO_CONTINUOUS_SCALES: js.Array[ScaleType] = js.native
    val DISCRETE_DOMAIN_SCALES: js.Array[ScaleType] = js.native
    val NON_TYPE_DOMAIN_RANGE_VEGA_SCALE_PROPERTIES: js.Array[
        reverse | base | padding | zero | nice | round | paddingInner | paddingOuter | clamp | exponent | interpolate
      ] = js.native
    val SCALE_PROPERTIES: js.Array[
        reverse | base | padding | `type` | domain | range | zero | nice | rangeStep | scheme | round | paddingInner | paddingOuter | clamp | exponent | interpolate
      ] = js.native
    val SCALE_TYPES: js.Array[ScaleType] = js.native
    val SCALE_TYPE_INDEX: ScaleTypeIndex = js.native
    val TIME_SCALE_TYPES: js.Array[ScaleType] = js.native
    def channelScalePropertyIncompatability(
      channel: Channel,
      propName: `type` | domain | reverse | range | rangeStep | scheme | round | padding | paddingInner | paddingOuter | clamp | nice | base | exponent | zero | interpolate
    ): String = js.native
    def channelSupportScaleType(channel: Channel, scaleType: ScaleType): Boolean = js.native
    def getSupportedScaleType(channel: Channel, fieldDefType: Type): js.Array[ScaleType] = js.native
    def getSupportedScaleType(channel: Channel, fieldDefType: Type, bin: Boolean): js.Array[ScaleType] = js.native
    def hasContinuousDomain(`type`: ScaleType): Boolean = js.native
    def hasDiscreteDomain(`type`: ScaleType): Boolean = js.native
    def isBinScale(`type`: ScaleType): Boolean = js.native
    def isContinuousToContinuous(`type`: ScaleType): Boolean = js.native
    def isExtendedScheme(scheme: String): /* is vega-lite.vega-lite/build/src/scale.SchemeParams */ Boolean = js.native
    def isExtendedScheme(scheme: SchemeParams): /* is vega-lite.vega-lite/build/src/scale.SchemeParams */ Boolean = js.native
    def isSelectionDomain(domain: Domain): /* is vega-lite.vega-lite/build/src/scale.SelectionDomain */ Boolean = js.native
    def scaleCompatible(scaleType1: ScaleType, scaleType2: ScaleType): Boolean = js.native
    def scaleTypePrecedence(scaleType: ScaleType): Double = js.native
    def scaleTypeSupportDataType(specifiedType: ScaleType, fieldDefType: Type, bin: Boolean): Boolean = js.native
    def scaleTypeSupportDataType(specifiedType: ScaleType, fieldDefType: Type, bin: BinParams): Boolean = js.native
    def scaleTypeSupportProperty(
      scaleType: ScaleType,
      propName: `type` | domain | reverse | range | rangeStep | scheme | round | padding | paddingInner | paddingOuter | clamp | nice | base | exponent | zero | interpolate
    ): Boolean = js.native
    @JSName("ScaleType")
    @js.native
    object ScaleTypeNs extends js.Object {
      val BAND: band = js.native
      val BIN_LINEAR: `bin-linear` = js.native
      val BIN_ORDINAL: `bin-ordinal` = js.native
      val LINEAR: linear = js.native
      val LOG: log = js.native
      val ORDINAL: ordinal = js.native
      val POINT: point = js.native
      val POW: pow = js.native
      val QUANTILE: quantile = js.native
      val QUANTIZE: quantize = js.native
      val SEQUENTIAL: sequential = js.native
      val SQRT: sqrt = js.native
      val THRESHOLD: threshold = js.native
      val TIME: time = js.native
      val UTC: utc = js.native
    }
    
    @js.native
    object defaultScaleConfig extends js.Object {
      var bandPaddingInner: Double = js.native
      var facetSpacing: Double = js.native
      var maxFontSize: Double = js.native
      var maxOpacity: Double = js.native
      var maxStrokeWidth: Double = js.native
      var minBandSize: Double = js.native
      var minFontSize: Double = js.native
      var minOpacity: Double = js.native
      var minSize: Double = js.native
      var minStrokeWidth: Double = js.native
      var pointPadding: Double = js.native
      var rangeStep: Double = js.native
      var textXRangeStep: Double = js.native
    }
    
  }
  
  @JSName("sort")
  @js.native
  object sortNs extends js.Object {
    def isSortArray[F](sort: Sort[F]): Boolean = js.native
    def isSortField[F](sort: Sort[F]): /* is vega-lite.vega-lite/build/src/sort.EncodingSortField<F> */ Boolean = js.native
  }
  
  @JSName("spec")
  @js.native
  object specNs extends js.Object {
    def fieldDefs(spec: GenericSpec[_, _]): js.Array[FieldDef[_]] = js.native
    def isConcatSpec(spec: BaseSpec): Boolean = js.native
    def isFacetSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec.GenericFacetSpec<any, any> */ Boolean = js.native
    def isHConcatSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec.GenericHConcatSpec<any, any> */ Boolean = js.native
    def isLayerSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec.GenericLayerSpec<any> */ Boolean = js.native
    def isRepeatSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec.GenericRepeatSpec<any, any> */ Boolean = js.native
    def isStacked(spec: TopLevel[FacetedCompositeUnitSpec]): Boolean = js.native
    def isStacked(spec: TopLevel[FacetedCompositeUnitSpec], config: Config): Boolean = js.native
    def isUnitSpec(spec: BaseSpec): Boolean = js.native
    def isVConcatSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec.GenericVConcatSpec<any, any> */ Boolean = js.native
    def normalize(spec: (GenericSpec[CompositeUnitSpec, ExtendedLayerSpec]) | TopLevelSpec, config: Config): NormalizedSpec = js.native
    def normalize(spec: FacetedCompositeUnitSpec, config: Config): NormalizedSpec = js.native
  }
  
  @JSName("stack")
  @js.native
  object stackNs extends js.Object {
    val STACKABLE_MARKS: js.Array[square | area | circle | line | text | rule | point | bar | tick] = js.native
    val STACK_BY_DEFAULT_MARKS: js.Array[area | bar] = js.native
    def isStackOffset(s: String): /* is vega-lite.vega-lite/build/src/stack.StackOffset */ Boolean = js.native
    def stack(m: MarkDef, encoding: Encoding[Field], stackConfig: StackOffset): StackProperties = js.native
    def stack(m: Mark, encoding: Encoding[Field], stackConfig: StackOffset): StackProperties = js.native
  }
  
  @JSName("timeUnit")
  @js.native
  object timeUnitNs extends js.Object {
    val TIMEUNITS: js.Array[TimeUnit] = js.native
    val TIMEUNIT_PARTS: js.Array[LocalSingleTimeUnit] = js.native
    def containsTimeUnit(fullTimeUnit: TimeUnit, timeUnit: TimeUnit): Boolean = js.native
    def convert(unit: TimeUnit, date: Date): Date = js.native
    def fieldExpr(fullTimeUnit: TimeUnit, field: String): String = js.native
    def formatExpression(timeUnit: TimeUnit, field: String, shortTimeLabels: Boolean, isUTCScale: Boolean): String = js.native
    def getLocalTimeUnit(t: UtcTimeUnit): LocalTimeUnit = js.native
    def getTimeUnitParts(timeUnit: TimeUnit): js.Array[_] = js.native
    def isLocalSingleTimeUnit(timeUnit: String): /* is vega-lite.vega-lite/build/src/timeunit.LocalSingleTimeUnit */ Boolean = js.native
    def isTimeUnit(t: String): /* is vega-lite.vega-lite/build/src/timeunit.TimeUnit */ Boolean = js.native
    def isUTCTimeUnit(t: String): /* is vega-lite.vega-lite/build/src/timeunit.UtcTimeUnit */ Boolean = js.native
    def isUtcSingleTimeUnit(timeUnit: String): /* is vega-lite.vega-lite/build/src/timeunit.UtcSingleTimeUnit */ Boolean = js.native
    def normalizeTimeUnit(timeUnit: TimeUnit): TimeUnit = js.native
    @JSName("TimeUnit")
    @js.native
    object TimeUnitNs extends js.Object {
      val DATE: date = js.native
      val DAY: day = js.native
      val HOURS: hours = js.native
      val HOURSMINUTES: hoursminutes = js.native
      val HOURSMINUTESSECONDS: hoursminutesseconds = js.native
      val MILLISECONDS: milliseconds = js.native
      val MINUTES: minutes = js.native
      val MINUTESSECONDS: minutesseconds = js.native
      val MONTH: month = js.native
      val MONTHDATE: monthdate = js.native
      val QUARTER: quarter = js.native
      val QUARTERMONTH: quartermonth = js.native
      val SECONDS: seconds = js.native
      val SECONDSMILLISECONDS: secondsmilliseconds = js.native
      val UTCDATE: utcdate = js.native
      val UTCDAY: utcday = js.native
      val UTCHOURS: utchours = js.native
      val UTCHOURSMINUTES: utchoursminutes = js.native
      val UTCHOURSMINUTESSECONDS: utchoursminutesseconds = js.native
      val UTCMILLISECONDS: utcmilliseconds = js.native
      val UTCMINUTES: utcminutes = js.native
      val UTCMINUTESSECONDS: utcminutesseconds = js.native
      val UTCMONTH: utcmonth = js.native
      val UTCMONTHDATE: utcmonthdate = js.native
      val UTCQUARTER: utcquarter = js.native
      val UTCQUARTERMONTH: utcquartermonth = js.native
      val UTCSECONDS: utcseconds = js.native
      val UTCSECONDSMILLISECONDS: utcsecondsmilliseconds = js.native
      val UTCYEAR: utcyear = js.native
      val UTCYEARMONTH: utcyearmonth = js.native
      val UTCYEARMONTHDATE: utcyearmonthdate = js.native
      val UTCYEARMONTHDATEHOURS: utcyearmonthdatehours = js.native
      val UTCYEARMONTHDATEHOURSMINUTES: utcyearmonthdatehoursminutes = js.native
      val UTCYEARMONTHDATEHOURSMINUTESSECONDS: utcyearmonthdatehoursminutesseconds = js.native
      val UTCYEARQUARTER: utcyearquarter = js.native
      val UTCYEARQUARTERMONTH: utcyearquartermonth = js.native
      val YEAR: year = js.native
      val YEARMONTH: yearmonth = js.native
      val YEARMONTHDATE: yearmonthdate = js.native
      val YEARMONTHDATEHOURS: yearmonthdatehours = js.native
      val YEARMONTHDATEHOURSMINUTES: yearmonthdatehoursminutes = js.native
      val YEARMONTHDATEHOURSMINUTESSECONDS: yearmonthdatehoursminutesseconds = js.native
      val YEARQUARTER: yearquarter = js.native
      val YEARQUARTERMONTH: yearquartermonth = js.native
    }
    
  }
  
  @JSName("transform")
  @js.native
  object transformNs extends js.Object {
    def isAggregate(t: Transform): /* is vega-lite.vega-lite/build/src/transform.AggregateTransform */ Boolean = js.native
    def isBin(t: Transform): /* is vega-lite.vega-lite/build/src/transform.BinTransform */ Boolean = js.native
    def isCalculate(t: Transform): /* is vega-lite.vega-lite/build/src/transform.CalculateTransform */ Boolean = js.native
    def isFilter(t: Transform): /* is vega-lite.vega-lite/build/src/transform.FilterTransform */ Boolean = js.native
    def isLookup(t: Transform): /* is vega-lite.vega-lite/build/src/transform.LookupTransform */ Boolean = js.native
    def isStack(t: Transform): /* is vega-lite.vega-lite/build/src/transform.StackTransform */ Boolean = js.native
    def isTimeUnit(t: Transform): /* is vega-lite.vega-lite/build/src/transform.TimeUnitTransform */ Boolean = js.native
    def isWindow(t: Transform): /* is vega-lite.vega-lite/build/src/transform.WindowTransform */ Boolean = js.native
    def normalizeTransform(transform: js.Array[Transform]): js.Array[
        CalculateTransform | LookupTransform | BinTransform | TimeUnitTransform | AggregateTransform | WindowTransform | StackTransform | Anon_Filter
      ] = js.native
  }
  
  @JSName("type")
  @js.native
  object typeNs extends js.Object {
    val GEOJSON: geojson = js.native
    val NOMINAL: nominal = js.native
    val ORDINAL: ordinal = js.native
    val QUANTITATIVE: quantitative = js.native
    val TEMPORAL: temporal = js.native
    val TYPE_INDEX: Flag[Type] = js.native
    def getFullName(`type`: String): Type = js.native
    def getFullName(`type`: Type): Type = js.native
    def isType(t: js.Any): /* is vega-lite.vega-lite/build/src/type.Type */ Boolean = js.native
    @JSName("Type")
    @js.native
    object TypeNs extends js.Object {
      val GEOJSON: geojson = js.native
      val LATITUDE: latitude = js.native
      val LONGITUDE: longitude = js.native
      val NOMINAL: nominal = js.native
      val ORDINAL: ordinal = js.native
      val QUANTITATIVE: quantitative = js.native
      val TEMPORAL: temporal = js.native
    }
    
  }
  
  @JSName("util")
  @js.native
  object utilNs extends js.Object {
    def accessPathDepth(path: String): Double = js.native
    def accessPathWithDatum(path: String): String = js.native
    def accessPathWithDatum(path: String, datum: String): String = js.native
    def contains[T](array: js.Array[T], item: T): Boolean = js.native
    def deleteNestedProperty(obj: js.Any, orderedProps: js.Array[String]): Boolean = js.native
    def differ[T](dict: Dict[T], other: Dict[T]): Boolean = js.native
    def differArray[T](array: js.Array[T], other: js.Array[T]): Boolean = js.native
    def duplicate[T](obj: T): T = js.native
    def every[T](
      arr: js.Array[T],
      f: js.Function3[/* d */ T, /* k */ js.UndefOr[js.Any], /* i */ js.UndefOr[js.Any], Boolean]
    ): Boolean = js.native
    def flagKeys[S /* <: String */](f: Flag[S]): js.Array[S] = js.native
    def flatAccessWithDatum(path: String): String = js.native
    def flatAccessWithDatum(path: String, datum: String): String = js.native
    def flatten(arrays: js.Array[_]): js.Any = js.native
    def hasIntersection(a: StringSet, b: StringSet): Boolean = js.native
    def hash(a: js.Any): String | Double = js.native
    def isBoolean(b: js.Any): /* is boolean */ Boolean = js.native
    def isNumeric(num: String): Boolean = js.native
    def isNumeric(num: Double): Boolean = js.native
    def keys[T](o: T): js.Array[Extract[String, String]] = js.native
    def logicalExpr[T](op: LogicalOperand[T], cb: js.Function): String = js.native
    def mergeDeep[T](dest: T, src: Partial[T]*): T = js.native
    def omit[T /* <: js.Object */, K /* <: String */](obj: T, props: js.Array[K]): Omit[T, K] = js.native
    def pick[T /* <: js.Object */, K /* <: String */](obj: T, props: js.Array[K]): Pick[T, K] = js.native
    def removePathFromField(path: String): String = js.native
    def replacePathInField(path: String): String = js.native
    def some[T](
      arr: js.Array[T],
      f: js.Function3[/* d */ T, /* k */ js.UndefOr[js.Any], /* i */ js.UndefOr[js.Any], Boolean]
    ): Boolean = js.native
    def titlecase(s: String): String = js.native
    def union[T](array: js.Array[T], other: js.Array[T]): js.Array[T] = js.native
    def unique[T](values: js.Array[T], f: js.Function1[/* item */ T, String | Double]): js.Array[T] = js.native
    def vals[T](x: StringDictionary[T]): js.Array[T] = js.native
    def varName(s: String): String = js.native
    def without[T](array: js.Array[T], excludedItems: js.Array[T]): js.Array[T] = js.native
    @js.native
    object stringify extends js.Object {
      def apply(obj: js.Any): String = js.native
      def apply(obj: js.Any, opts: Comparator): String = js.native
      def apply(obj: js.Any, opts: Options): String = js.native
    }
    
  }
  
  @JSName("validate")
  @js.native
  object validateNs extends js.Object {
    val DEFAULT_REQUIRED_CHANNEL_MAP: RequiredChannelMap = js.native
    val DEFAULT_SUPPORTED_CHANNEL_TYPE: SupportedChannelMap = js.native
    def getEncodingMappingError(spec: FacetedCompositeUnitSpec): String = js.native
    def getEncodingMappingError(spec: FacetedCompositeUnitSpec, requiredChannelMap: RequiredChannelMap): String = js.native
    def getEncodingMappingError(
      spec: FacetedCompositeUnitSpec,
      requiredChannelMap: RequiredChannelMap,
      supportedChannelMap: SupportedChannelMap
    ): String = js.native
  }
  
}

