package typings.vegaLite

import typings.vegaLite.aggregateMod.Aggregate
import typings.vegaLite.aggregateMod.NonArgAggregateOp
import typings.vegaLite.axisMod.AxisPart
import typings.vegaLite.axisMod.ConditionalAxisProp
import typings.vegaLite.binMod._Bin
import typings.vegaLite.boxplotMod.BoxPlotPart
import typings.vegaLite.channelMod.Channel
import typings.vegaLite.channelMod.ColorChannel
import typings.vegaLite.channelMod.FacetChannel
import typings.vegaLite.channelMod.GeoPositionChannel
import typings.vegaLite.channelMod.PolarPositionChannel
import typings.vegaLite.channelMod.PolarPositionScaleChannel
import typings.vegaLite.channelMod.PositionChannel
import typings.vegaLite.channelMod.PositionScaleChannel
import typings.vegaLite.channelMod.SecondaryRangeChannel
import typings.vegaLite.channelMod._MainChannelOf
import typings.vegaLite.channelMod._SecondaryChannelOf
import typings.vegaLite.channeldefMod.TypeForShape
import typings.vegaLite.errorbandMod.ErrorBandPart
import typings.vegaLite.errorbarMod.ErrorBarCenter
import typings.vegaLite.errorbarMod.ErrorBarExtent
import typings.vegaLite.errorbarMod.ErrorBarPart
import typings.vegaLite.errorbarMod.ErrorInputType
import typings.vegaLite.headerComponentMod.HeaderChannel
import typings.vegaLite.headerComponentMod.HeaderType
import typings.vegaLite.layoutsizeComponentMod.LayoutSizeType
import typings.vegaLite.layoutsizeComponentMod._LayoutSize
import typings.vegaLite.projectMod.TupleStoreType
import typings.vegaLite.scaleMod.ScaleType
import typings.vegaLite.scaleMod._Domain
import typings.vegaLite.sortMod.SortByChannel
import typings.vegaLite.sortMod.SortByChannelDesc
import typings.vegaLite.sortMod.SortOrder
import typings.vegaLite.specBaseMod.SpecType
import typings.vegaLite.specBaseMod.StepFor
import typings.vegaLite.splitMod.SplitParentProperty
import typings.vegaLite.srcDataMod.DataFormatType
import typings.vegaLite.srcDataMod._ParseValue
import typings.vegaLite.srcMarkMod.Mark
import typings.vegaLite.srcResolveMod.ResolveMode
import typings.vegaLite.srcSelectionMod.LegendBinding
import typings.vegaLite.srcSelectionMod.SelectionResolution
import typings.vegaLite.srcSelectionMod.SelectionType
import typings.vegaLite.srcStackMod.StackOffset
import typings.vegaLite.srcTimeunitMod.LocalMultiTimeUnit
import typings.vegaLite.srcTimeunitMod.LocalSingleTimeUnit
import typings.vegaLite.srcTimeunitMod.TimeUnitFormat
import typings.vegaLite.srcTimeunitMod.UtcMultiTimeUnit
import typings.vegaLite.srcTimeunitMod.UtcSingleTimeUnit
import typings.vegaLite.srcTypeMod.StandardType
import typings.vegaLite.srcTypeMod.Type
import typings.vegaLite.toplevelMod.AutosizeType
import typings.vegaLite.toplevelMod.FitType
import typings.vegaLite.transformMod.WindowOnlyOp
import typings.vegaLite.typeMod._RangeType
import typings.vegaLite.vegaSchemaMod.VgEncodeChannel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vegaLiteStrings {
  
  @js.native
  sealed trait `-color`
    extends StObject
       with SortByChannelDesc
  inline def `-color`: `-color` = "-color".asInstanceOf[`-color`]
  
  @js.native
  sealed trait `-fill`
    extends StObject
       with SortByChannelDesc
  inline def `-fill`: `-fill` = "-fill".asInstanceOf[`-fill`]
  
  @js.native
  sealed trait `-fillOpacity`
    extends StObject
       with SortByChannelDesc
  inline def `-fillOpacity`: `-fillOpacity` = "-fillOpacity".asInstanceOf[`-fillOpacity`]
  
  @js.native
  sealed trait `-opacity`
    extends StObject
       with SortByChannelDesc
  inline def `-opacity`: `-opacity` = "-opacity".asInstanceOf[`-opacity`]
  
  @js.native
  sealed trait `-shape`
    extends StObject
       with SortByChannelDesc
  inline def `-shape`: `-shape` = "-shape".asInstanceOf[`-shape`]
  
  @js.native
  sealed trait `-size`
    extends StObject
       with SortByChannelDesc
  inline def `-size`: `-size` = "-size".asInstanceOf[`-size`]
  
  @js.native
  sealed trait `-stroke`
    extends StObject
       with SortByChannelDesc
  inline def `-stroke`: `-stroke` = "-stroke".asInstanceOf[`-stroke`]
  
  @js.native
  sealed trait `-strokeOpacity`
    extends StObject
       with SortByChannelDesc
  inline def `-strokeOpacity`: `-strokeOpacity` = "-strokeOpacity".asInstanceOf[`-strokeOpacity`]
  
  @js.native
  sealed trait `-strokeWidth`
    extends StObject
       with SortByChannelDesc
  inline def `-strokeWidth`: `-strokeWidth` = "-strokeWidth".asInstanceOf[`-strokeWidth`]
  
  @js.native
  sealed trait `-text`
    extends StObject
       with SortByChannelDesc
  inline def `-text`: `-text` = "-text".asInstanceOf[`-text`]
  
  @js.native
  sealed trait `-x`
    extends StObject
       with SortByChannelDesc
  inline def `-x`: `-x` = "-x".asInstanceOf[`-x`]
  
  @js.native
  sealed trait `-y`
    extends StObject
       with SortByChannelDesc
  inline def `-y`: `-y` = "-y".asInstanceOf[`-y`]
  
  @js.native
  sealed trait DeepPartial extends StObject
  inline def DeepPartial: DeepPartial = "DeepPartial".asInstanceOf[DeepPartial]
  
  @js.native
  sealed trait E
    extends StObject
       with TupleStoreType
  inline def E: E = "E".asInstanceOf[E]
  
  @js.native
  sealed trait Flag extends StObject
  inline def Flag: Flag = "Flag".asInstanceOf[Flag]
  
  @js.native
  sealed trait MapExcludeAndKeepSignalAs extends StObject
  inline def MapExcludeAndKeepSignalAs: MapExcludeAndKeepSignalAs = "MapExcludeAndKeepSignalAs".asInstanceOf[MapExcludeAndKeepSignalAs]
  
  @js.native
  sealed trait MappedExclude extends StObject
  inline def MappedExclude: MappedExclude = "MappedExclude".asInstanceOf[MappedExclude]
  
  @js.native
  sealed trait PartialIndex extends StObject
  inline def PartialIndex: PartialIndex = "PartialIndex".asInstanceOf[PartialIndex]
  
  @js.native
  sealed trait R
    extends StObject
       with TupleStoreType
  inline def R: R = "R".asInstanceOf[R]
  
  @js.native
  sealed trait `R-RE`
    extends StObject
       with TupleStoreType
  inline def `R-RE`: `R-RE` = "R-RE".asInstanceOf[`R-RE`]
  
  @js.native
  sealed trait _empty
    extends StObject
       with SplitParentProperty
  inline def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait `aggregated-error`
    extends StObject
       with ErrorInputType
  inline def `aggregated-error`: `aggregated-error` = "aggregated-error".asInstanceOf[`aggregated-error`]
  
  @js.native
  sealed trait `aggregated-upper-lower`
    extends StObject
       with ErrorInputType
  inline def `aggregated-upper-lower`: `aggregated-upper-lower` = "aggregated-upper-lower".asInstanceOf[`aggregated-upper-lower`]
  
  @js.native
  sealed trait align
    extends StObject
       with VgEncodeChannel
  inline def align: align = "align".asInstanceOf[align]
  
  @js.native
  sealed trait always extends StObject
  inline def always: always = "always".asInstanceOf[always]
  
  @js.native
  sealed trait anchor extends StObject
  inline def anchor: anchor = "anchor".asInstanceOf[anchor]
  
  @js.native
  sealed trait angle
    extends StObject
       with Channel
       with VgEncodeChannel
  inline def angle: angle = "angle".asInstanceOf[angle]
  
  @js.native
  sealed trait arc
    extends StObject
       with Mark
  inline def arc: arc = "arc".asInstanceOf[arc]
  
  @js.native
  sealed trait area
    extends StObject
       with Mark
  inline def area: area = "area".asInstanceOf[area]
  
  @js.native
  sealed trait argmax
    extends StObject
       with Aggregate
  inline def argmax: argmax = "argmax".asInstanceOf[argmax]
  
  @js.native
  sealed trait argmin
    extends StObject
       with Aggregate
  inline def argmin: argmin = "argmin".asInstanceOf[argmin]
  
  @js.native
  sealed trait aria extends StObject
  inline def aria: aria = "aria".asInstanceOf[aria]
  
  @js.native
  sealed trait ariaRole extends StObject
  inline def ariaRole: ariaRole = "ariaRole".asInstanceOf[ariaRole]
  
  @js.native
  sealed trait ariaRoleDescription extends StObject
  inline def ariaRoleDescription: ariaRoleDescription = "ariaRoleDescription".asInstanceOf[ariaRoleDescription]
  
  @js.native
  sealed trait ascending
    extends StObject
       with SortOrder
  inline def ascending: ascending = "ascending".asInstanceOf[ascending]
  
  @js.native
  sealed trait aspect extends StObject
  inline def aspect: aspect = "aspect".asInstanceOf[aspect]
  
  @js.native
  sealed trait average
    extends StObject
       with Aggregate
       with NonArgAggregateOp
  inline def average: average = "average".asInstanceOf[average]
  
  @js.native
  sealed trait axis
    extends StObject
       with AxisPart
       with SplitParentProperty
  inline def axis: axis = "axis".asInstanceOf[axis]
  
  @js.native
  sealed trait axisBand extends StObject
  inline def axisBand: axisBand = "axisBand".asInstanceOf[axisBand]
  
  @js.native
  sealed trait axisBottom extends StObject
  inline def axisBottom: axisBottom = "axisBottom".asInstanceOf[axisBottom]
  
  @js.native
  sealed trait axisDiscrete extends StObject
  inline def axisDiscrete: axisDiscrete = "axisDiscrete".asInstanceOf[axisDiscrete]
  
  @js.native
  sealed trait axisLeft extends StObject
  inline def axisLeft: axisLeft = "axisLeft".asInstanceOf[axisLeft]
  
  @js.native
  sealed trait axisPoint extends StObject
  inline def axisPoint: axisPoint = "axisPoint".asInstanceOf[axisPoint]
  
  @js.native
  sealed trait axisQuantitative extends StObject
  inline def axisQuantitative: axisQuantitative = "axisQuantitative".asInstanceOf[axisQuantitative]
  
  @js.native
  sealed trait axisRight extends StObject
  inline def axisRight: axisRight = "axisRight".asInstanceOf[axisRight]
  
  @js.native
  sealed trait axisTemporal extends StObject
  inline def axisTemporal: axisTemporal = "axisTemporal".asInstanceOf[axisTemporal]
  
  @js.native
  sealed trait axisTop extends StObject
  inline def axisTop: axisTop = "axisTop".asInstanceOf[axisTop]
  
  @js.native
  sealed trait axisX extends StObject
  inline def axisX: axisX = "axisX".asInstanceOf[axisX]
  
  @js.native
  sealed trait axisXBand extends StObject
  inline def axisXBand: axisXBand = "axisXBand".asInstanceOf[axisXBand]
  
  @js.native
  sealed trait axisXDiscrete extends StObject
  inline def axisXDiscrete: axisXDiscrete = "axisXDiscrete".asInstanceOf[axisXDiscrete]
  
  @js.native
  sealed trait axisXPoint extends StObject
  inline def axisXPoint: axisXPoint = "axisXPoint".asInstanceOf[axisXPoint]
  
  @js.native
  sealed trait axisXQuantitative extends StObject
  inline def axisXQuantitative: axisXQuantitative = "axisXQuantitative".asInstanceOf[axisXQuantitative]
  
  @js.native
  sealed trait axisXTemporal extends StObject
  inline def axisXTemporal: axisXTemporal = "axisXTemporal".asInstanceOf[axisXTemporal]
  
  @js.native
  sealed trait axisY extends StObject
  inline def axisY: axisY = "axisY".asInstanceOf[axisY]
  
  @js.native
  sealed trait axisYBand extends StObject
  inline def axisYBand: axisYBand = "axisYBand".asInstanceOf[axisYBand]
  
  @js.native
  sealed trait axisYDiscrete extends StObject
  inline def axisYDiscrete: axisYDiscrete = "axisYDiscrete".asInstanceOf[axisYDiscrete]
  
  @js.native
  sealed trait axisYPoint extends StObject
  inline def axisYPoint: axisYPoint = "axisYPoint".asInstanceOf[axisYPoint]
  
  @js.native
  sealed trait axisYQuantitative extends StObject
  inline def axisYQuantitative: axisYQuantitative = "axisYQuantitative".asInstanceOf[axisYQuantitative]
  
  @js.native
  sealed trait axisYTemporal extends StObject
  inline def axisYTemporal: axisYTemporal = "axisYTemporal".asInstanceOf[axisYTemporal]
  
  @js.native
  sealed trait band
    extends StObject
       with ErrorBandPart
       with ScaleType
  inline def band: band = "band".asInstanceOf[band]
  
  @js.native
  sealed trait bandPosition extends StObject
  inline def bandPosition: bandPosition = "bandPosition".asInstanceOf[bandPosition]
  
  @js.native
  sealed trait bandSize extends StObject
  inline def bandSize: bandSize = "bandSize".asInstanceOf[bandSize]
  
  @js.native
  sealed trait bar
    extends StObject
       with Mark
  inline def bar: bar = "bar".asInstanceOf[bar]
  
  @js.native
  sealed trait base extends StObject
  inline def base: base = "base".asInstanceOf[base]
  
  @js.native
  sealed trait baseline
    extends StObject
       with VgEncodeChannel
  inline def baseline: baseline = "baseline".asInstanceOf[baseline]
  
  @js.native
  sealed trait `bin-ordinal`
    extends StObject
       with ScaleType
  inline def `bin-ordinal`: `bin-ordinal` = "bin-ordinal".asInstanceOf[`bin-ordinal`]
  
  @js.native
  sealed trait binSpacing extends StObject
  inline def binSpacing: binSpacing = "binSpacing".asInstanceOf[binSpacing]
  
  @js.native
  sealed trait binned
    extends StObject
       with _Bin
  inline def binned: binned = "binned".asInstanceOf[binned]
  
  @js.native
  sealed trait bins extends StObject
  inline def bins: bins = "bins".asInstanceOf[bins]
  
  @js.native
  sealed trait blend extends StObject
  inline def blend: blend = "blend".asInstanceOf[blend]
  
  @js.native
  sealed trait boolean
    extends StObject
       with _ParseValue
  inline def boolean: boolean = "boolean".asInstanceOf[boolean]
  
  @js.native
  sealed trait borders
    extends StObject
       with ErrorBandPart
  inline def borders: borders = "borders".asInstanceOf[borders]
  
  @js.native
  sealed trait both extends StObject
  inline def both: both = "both".asInstanceOf[both]
  
  @js.native
  sealed trait bottom extends StObject
  inline def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait box
    extends StObject
       with BoxPlotPart
  inline def box: box = "box".asInstanceOf[box]
  
  @js.native
  sealed trait boxplot extends StObject
  inline def boxplot: boxplot = "boxplot".asInstanceOf[boxplot]
  
  @js.native
  sealed trait center
    extends StObject
       with StackOffset
  inline def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait childHeight
    extends StObject
       with LayoutSizeType
  inline def childHeight: childHeight = "childHeight".asInstanceOf[childHeight]
  
  @js.native
  sealed trait childWidth
    extends StObject
       with LayoutSizeType
  inline def childWidth: childWidth = "childWidth".asInstanceOf[childWidth]
  
  @js.native
  sealed trait ci
    extends StObject
       with ErrorBarExtent
  inline def ci: ci = "ci".asInstanceOf[ci]
  
  @js.native
  sealed trait ci0
    extends StObject
       with Aggregate
       with NonArgAggregateOp
  inline def ci0: ci0 = "ci0".asInstanceOf[ci0]
  
  @js.native
  sealed trait ci1
    extends StObject
       with Aggregate
       with NonArgAggregateOp
  inline def ci1: ci1 = "ci1".asInstanceOf[ci1]
  
  @js.native
  sealed trait circle
    extends StObject
       with Mark
  inline def circle: circle = "circle".asInstanceOf[circle]
  
  @js.native
  sealed trait clamp extends StObject
  inline def clamp: clamp = "clamp".asInstanceOf[clamp]
  
  @js.native
  sealed trait clip
    extends StObject
       with VgEncodeChannel
  inline def clip: clip = "clip".asInstanceOf[clip]
  
  @js.native
  sealed trait clipAngle extends StObject
  inline def clipAngle: clipAngle = "clipAngle".asInstanceOf[clipAngle]
  
  @js.native
  sealed trait clipExtent extends StObject
  inline def clipExtent: clipExtent = "clipExtent".asInstanceOf[clipExtent]
  
  @js.native
  sealed trait clipHeight extends StObject
  inline def clipHeight: clipHeight = "clipHeight".asInstanceOf[clipHeight]
  
  @js.native
  sealed trait coefficient extends StObject
  inline def coefficient: coefficient = "coefficient".asInstanceOf[coefficient]
  
  @js.native
  sealed trait color
    extends StObject
       with Channel
       with ColorChannel
       with SortByChannel
  inline def color: color = "color".asInstanceOf[color]
  
  @js.native
  sealed trait column
    extends StObject
       with FacetChannel
       with HeaderChannel
  inline def column: column = "column".asInstanceOf[column]
  
  @js.native
  sealed trait columnPadding extends StObject
  inline def columnPadding: columnPadding = "columnPadding".asInstanceOf[columnPadding]
  
  @js.native
  sealed trait columns extends StObject
  inline def columns: columns = "columns".asInstanceOf[columns]
  
  @js.native
  sealed trait concat
    extends StObject
       with SpecType
  inline def concat: concat = "concat".asInstanceOf[concat]
  
  @js.native
  sealed trait constant extends StObject
  inline def constant: constant = "constant".asInstanceOf[constant]
  
  @js.native
  sealed trait container
    extends StObject
       with _LayoutSize
  inline def container: container = "container".asInstanceOf[container]
  
  @js.native
  sealed trait content extends StObject
  inline def content: content = "content".asInstanceOf[content]
  
  @js.native
  sealed trait continuous
    extends StObject
       with _RangeType
  inline def continuous: continuous = "continuous".asInstanceOf[continuous]
  
  @js.native
  sealed trait continuousBandSize extends StObject
  inline def continuousBandSize: continuousBandSize = "continuousBandSize".asInstanceOf[continuousBandSize]
  
  @js.native
  sealed trait cornerRadius
    extends StObject
       with VgEncodeChannel
  inline def cornerRadius: cornerRadius = "cornerRadius".asInstanceOf[cornerRadius]
  
  @js.native
  sealed trait cornerRadiusBottomLeft
    extends StObject
       with VgEncodeChannel
  inline def cornerRadiusBottomLeft: cornerRadiusBottomLeft = "cornerRadiusBottomLeft".asInstanceOf[cornerRadiusBottomLeft]
  
  @js.native
  sealed trait cornerRadiusBottomRight
    extends StObject
       with VgEncodeChannel
  inline def cornerRadiusBottomRight: cornerRadiusBottomRight = "cornerRadiusBottomRight".asInstanceOf[cornerRadiusBottomRight]
  
  @js.native
  sealed trait cornerRadiusEnd extends StObject
  inline def cornerRadiusEnd: cornerRadiusEnd = "cornerRadiusEnd".asInstanceOf[cornerRadiusEnd]
  
  @js.native
  sealed trait cornerRadiusTopLeft
    extends StObject
       with VgEncodeChannel
  inline def cornerRadiusTopLeft: cornerRadiusTopLeft = "cornerRadiusTopLeft".asInstanceOf[cornerRadiusTopLeft]
  
  @js.native
  sealed trait cornerRadiusTopRight
    extends StObject
       with VgEncodeChannel
  inline def cornerRadiusTopRight: cornerRadiusTopRight = "cornerRadiusTopRight".asInstanceOf[cornerRadiusTopRight]
  
  @js.native
  sealed trait count
    extends StObject
       with Aggregate
       with NonArgAggregateOp
  inline def count: count = "count".asInstanceOf[count]
  
  @js.native
  sealed trait csv
    extends StObject
       with DataFormatType
  inline def csv: csv = "csv".asInstanceOf[csv]
  
  @js.native
  sealed trait cume_dist
    extends StObject
       with WindowOnlyOp
  inline def cume_dist: cume_dist = "cume_dist".asInstanceOf[cume_dist]
  
  @js.native
  sealed trait cursor
    extends StObject
       with VgEncodeChannel
  inline def cursor: cursor = "cursor".asInstanceOf[cursor]
  
  @js.native
  sealed trait data extends StObject
  inline def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait date
    extends StObject
       with LocalSingleTimeUnit
       with TimeUnitFormat
       with _ParseValue
  inline def date: date = "date".asInstanceOf[date]
  
  @js.native
  sealed trait datum extends StObject
  inline def datum: datum = "datum".asInstanceOf[datum]
  
  @js.native
  sealed trait datumDotdatum extends StObject
  inline def datumDotdatum: datumDotdatum = "datum.datum".asInstanceOf[datumDotdatum]
  
  @js.native
  sealed trait day
    extends StObject
       with LocalSingleTimeUnit
       with TimeUnitFormat
  inline def day: day = "day".asInstanceOf[day]
  
  @js.native
  sealed trait dayhours
    extends StObject
       with LocalMultiTimeUnit
  inline def dayhours: dayhours = "dayhours".asInstanceOf[dayhours]
  
  @js.native
  sealed trait dayhoursminutes
    extends StObject
       with LocalMultiTimeUnit
  inline def dayhoursminutes: dayhoursminutes = "dayhoursminutes".asInstanceOf[dayhoursminutes]
  
  @js.native
  sealed trait dayhoursminutesseconds
    extends StObject
       with LocalMultiTimeUnit
  inline def dayhoursminutesseconds: dayhoursminutesseconds = "dayhoursminutesseconds".asInstanceOf[dayhoursminutesseconds]
  
  @js.native
  sealed trait dayofyear
    extends StObject
       with LocalSingleTimeUnit
  inline def dayofyear: dayofyear = "dayofyear".asInstanceOf[dayofyear]
  
  @js.native
  sealed trait defined
    extends StObject
       with VgEncodeChannel
  inline def defined: defined = "defined".asInstanceOf[defined]
  
  @js.native
  sealed trait dense_rank
    extends StObject
       with WindowOnlyOp
  inline def dense_rank: dense_rank = "dense_rank".asInstanceOf[dense_rank]
  
  @js.native
  sealed trait descending
    extends StObject
       with SortOrder
  inline def descending: descending = "descending".asInstanceOf[descending]
  
  @js.native
  sealed trait description
    extends StObject
       with Channel
  inline def description: description = "description".asInstanceOf[description]
  
  @js.native
  sealed trait detail
    extends StObject
       with Channel
  inline def detail: detail = "detail".asInstanceOf[detail]
  
  @js.native
  sealed trait dir
    extends StObject
       with VgEncodeChannel
  inline def dir: dir = "dir".asInstanceOf[dir]
  
  @js.native
  sealed trait direction extends StObject
  inline def direction: direction = "direction".asInstanceOf[direction]
  
  @js.native
  sealed trait disable extends StObject
  inline def disable: disable = "disable".asInstanceOf[disable]
  
  @js.native
  sealed trait discrete
    extends StObject
       with _RangeType
  inline def discrete: discrete = "discrete".asInstanceOf[discrete]
  
  @js.native
  sealed trait discreteBandSize extends StObject
  inline def discreteBandSize: discreteBandSize = "discreteBandSize".asInstanceOf[discreteBandSize]
  
  @js.native
  sealed trait discretizing extends StObject
  inline def discretizing: discretizing = "discretizing".asInstanceOf[discretizing]
  
  @js.native
  sealed trait distance extends StObject
  inline def distance: distance = "distance".asInstanceOf[distance]
  
  @js.native
  sealed trait distinct
    extends StObject
       with Aggregate
       with NonArgAggregateOp
  inline def distinct: distinct = "distinct".asInstanceOf[distinct]
  
  @js.native
  sealed trait domain
    extends StObject
       with AxisPart
  inline def domain: domain = "domain".asInstanceOf[domain]
  
  @js.native
  sealed trait domainCap extends StObject
  inline def domainCap: domainCap = "domainCap".asInstanceOf[domainCap]
  
  @js.native
  sealed trait domainColor extends StObject
  inline def domainColor: domainColor = "domainColor".asInstanceOf[domainColor]
  
  @js.native
  sealed trait domainDash extends StObject
  inline def domainDash: domainDash = "domainDash".asInstanceOf[domainDash]
  
  @js.native
  sealed trait domainDashOffset extends StObject
  inline def domainDashOffset: domainDashOffset = "domainDashOffset".asInstanceOf[domainDashOffset]
  
  @js.native
  sealed trait domainMax extends StObject
  inline def domainMax: domainMax = "domainMax".asInstanceOf[domainMax]
  
  @js.native
  sealed trait domainMid extends StObject
  inline def domainMid: domainMid = "domainMid".asInstanceOf[domainMid]
  
  @js.native
  sealed trait domainMin extends StObject
  inline def domainMin: domainMin = "domainMin".asInstanceOf[domainMin]
  
  @js.native
  sealed trait domainOpacity extends StObject
  inline def domainOpacity: domainOpacity = "domainOpacity".asInstanceOf[domainOpacity]
  
  @js.native
  sealed trait domainWidth extends StObject
  inline def domainWidth: domainWidth = "domainWidth".asInstanceOf[domainWidth]
  
  @js.native
  sealed trait domains extends StObject
  inline def domains: domains = "domains".asInstanceOf[domains]
  
  @js.native
  sealed trait dsv
    extends StObject
       with DataFormatType
  inline def dsv: dsv = "dsv".asInstanceOf[dsv]
  
  @js.native
  sealed trait dx
    extends StObject
       with VgEncodeChannel
  inline def dx: dx = "dx".asInstanceOf[dx]
  
  @js.native
  sealed trait dy
    extends StObject
       with VgEncodeChannel
  inline def dy: dy = "dy".asInstanceOf[dy]
  
  @js.native
  sealed trait ellipsis
    extends StObject
       with VgEncodeChannel
  inline def ellipsis: ellipsis = "ellipsis".asInstanceOf[ellipsis]
  
  @js.native
  sealed trait encode extends StObject
  inline def encode: encode = "encode".asInstanceOf[encode]
  
  @js.native
  sealed trait encoding extends StObject
  inline def encoding: encoding = "encoding".asInstanceOf[encoding]
  
  @js.native
  sealed trait end extends StObject
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait endAngle
    extends StObject
       with VgEncodeChannel
  inline def endAngle: endAngle = "endAngle".asInstanceOf[endAngle]
  
  @js.native
  sealed trait errorband extends StObject
  inline def errorband: errorband = "errorband".asInstanceOf[errorband]
  
  @js.native
  sealed trait errorbar extends StObject
  inline def errorbar: errorbar = "errorbar".asInstanceOf[errorbar]
  
  @js.native
  sealed trait exp extends StObject
  inline def exp: exp = "exp".asInstanceOf[exp]
  
  @js.native
  sealed trait exponent extends StObject
  inline def exponent: exponent = "exponent".asInstanceOf[exponent]
  
  @js.native
  sealed trait extent extends StObject
  inline def extent: extent = "extent".asInstanceOf[extent]
  
  @js.native
  sealed trait facet
    extends StObject
       with FacetChannel
       with SpecType
  inline def facet: facet = "facet".asInstanceOf[facet]
  
  @js.native
  sealed trait fill
    extends StObject
       with Channel
       with ColorChannel
       with SortByChannel
       with VgEncodeChannel
  inline def fill: fill = "fill".asInstanceOf[fill]
  
  @js.native
  sealed trait fillColor extends StObject
  inline def fillColor: fillColor = "fillColor".asInstanceOf[fillColor]
  
  @js.native
  sealed trait fillOpacity
    extends StObject
       with Channel
       with SortByChannel
       with VgEncodeChannel
  inline def fillOpacity: fillOpacity = "fillOpacity".asInstanceOf[fillOpacity]
  
  @js.native
  sealed trait filled extends StObject
  inline def filled: filled = "filled".asInstanceOf[filled]
  
  @js.native
  sealed trait filter extends StObject
  inline def filter: filter = "filter".asInstanceOf[filter]
  
  @js.native
  sealed trait first_value
    extends StObject
       with WindowOnlyOp
  inline def first_value: first_value = "first_value".asInstanceOf[first_value]
  
  @js.native
  sealed trait fit
    extends StObject
       with AutosizeType
       with FitType
  inline def fit: fit = "fit".asInstanceOf[fit]
  
  @js.native
  sealed trait `fit-x`
    extends StObject
       with AutosizeType
       with FitType
  inline def `fit-x`: `fit-x` = "fit-x".asInstanceOf[`fit-x`]
  
  @js.native
  sealed trait `fit-y`
    extends StObject
       with AutosizeType
       with FitType
  inline def `fit-y`: `fit-y` = "fit-y".asInstanceOf[`fit-y`]
  
  @js.native
  sealed trait flexible
    extends StObject
       with _RangeType
  inline def flexible: flexible = "flexible".asInstanceOf[flexible]
  
  @js.native
  sealed trait flush extends StObject
  inline def flush: flush = "flush".asInstanceOf[flush]
  
  @js.native
  sealed trait font
    extends StObject
       with VgEncodeChannel
  inline def font: font = "font".asInstanceOf[font]
  
  @js.native
  sealed trait fontSize
    extends StObject
       with VgEncodeChannel
  inline def fontSize: fontSize = "fontSize".asInstanceOf[fontSize]
  
  @js.native
  sealed trait fontStyle
    extends StObject
       with VgEncodeChannel
  inline def fontStyle: fontStyle = "fontStyle".asInstanceOf[fontStyle]
  
  @js.native
  sealed trait fontWeight
    extends StObject
       with VgEncodeChannel
  inline def fontWeight: fontWeight = "fontWeight".asInstanceOf[fontWeight]
  
  @js.native
  sealed trait footer
    extends StObject
       with HeaderType
  inline def footer: footer = "footer".asInstanceOf[footer]
  
  @js.native
  sealed trait format extends StObject
  inline def format: format = "format".asInstanceOf[format]
  
  @js.native
  sealed trait formatType extends StObject
  inline def formatType: formatType = "formatType".asInstanceOf[formatType]
  
  @js.native
  sealed trait fraction extends StObject
  inline def fraction: fraction = "fraction".asInstanceOf[fraction]
  
  @js.native
  sealed trait frame extends StObject
  inline def frame: frame = "frame".asInstanceOf[frame]
  
  @js.native
  sealed trait full extends StObject
  inline def full: full = "full".asInstanceOf[full]
  
  @js.native
  sealed trait functional extends StObject
  inline def functional: functional = "functional".asInstanceOf[functional]
  
  @js.native
  sealed trait geojson
    extends StObject
       with Type
       with TypeForShape
  inline def geojson: geojson = "geojson".asInstanceOf[geojson]
  
  @js.native
  sealed trait geoshape
    extends StObject
       with Mark
  inline def geoshape: geoshape = "geoshape".asInstanceOf[geoshape]
  
  @js.native
  sealed trait global
    extends StObject
       with SelectionResolution
  inline def global: global = "global".asInstanceOf[global]
  
  @js.native
  sealed trait gradient extends StObject
  inline def gradient: gradient = "gradient".asInstanceOf[gradient]
  
  @js.native
  sealed trait gradientDirection extends StObject
  inline def gradientDirection: gradientDirection = "gradientDirection".asInstanceOf[gradientDirection]
  
  @js.native
  sealed trait gradientHorizontalMaxLength extends StObject
  inline def gradientHorizontalMaxLength: gradientHorizontalMaxLength = "gradientHorizontalMaxLength".asInstanceOf[gradientHorizontalMaxLength]
  
  @js.native
  sealed trait gradientHorizontalMinLength extends StObject
  inline def gradientHorizontalMinLength: gradientHorizontalMinLength = "gradientHorizontalMinLength".asInstanceOf[gradientHorizontalMinLength]
  
  @js.native
  sealed trait gradientLabelLimit extends StObject
  inline def gradientLabelLimit: gradientLabelLimit = "gradientLabelLimit".asInstanceOf[gradientLabelLimit]
  
  @js.native
  sealed trait gradientLabelOffset extends StObject
  inline def gradientLabelOffset: gradientLabelOffset = "gradientLabelOffset".asInstanceOf[gradientLabelOffset]
  
  @js.native
  sealed trait gradientLength extends StObject
  inline def gradientLength: gradientLength = "gradientLength".asInstanceOf[gradientLength]
  
  @js.native
  sealed trait gradientOpacity extends StObject
  inline def gradientOpacity: gradientOpacity = "gradientOpacity".asInstanceOf[gradientOpacity]
  
  @js.native
  sealed trait gradientStrokeColor extends StObject
  inline def gradientStrokeColor: gradientStrokeColor = "gradientStrokeColor".asInstanceOf[gradientStrokeColor]
  
  @js.native
  sealed trait gradientStrokeWidth extends StObject
  inline def gradientStrokeWidth: gradientStrokeWidth = "gradientStrokeWidth".asInstanceOf[gradientStrokeWidth]
  
  @js.native
  sealed trait gradientThickness extends StObject
  inline def gradientThickness: gradientThickness = "gradientThickness".asInstanceOf[gradientThickness]
  
  @js.native
  sealed trait gradientVerticalMaxLength extends StObject
  inline def gradientVerticalMaxLength: gradientVerticalMaxLength = "gradientVerticalMaxLength".asInstanceOf[gradientVerticalMaxLength]
  
  @js.native
  sealed trait gradientVerticalMinLength extends StObject
  inline def gradientVerticalMinLength: gradientVerticalMinLength = "gradientVerticalMinLength".asInstanceOf[gradientVerticalMinLength]
  
  @js.native
  sealed trait greedy extends StObject
  inline def greedy: greedy = "greedy".asInstanceOf[greedy]
  
  @js.native
  sealed trait grid
    extends StObject
       with AxisPart
  inline def grid: grid = "grid".asInstanceOf[grid]
  
  @js.native
  sealed trait gridAlign extends StObject
  inline def gridAlign: gridAlign = "gridAlign".asInstanceOf[gridAlign]
  
  @js.native
  sealed trait gridCap extends StObject
  inline def gridCap: gridCap = "gridCap".asInstanceOf[gridCap]
  
  @js.native
  sealed trait gridColor
    extends StObject
       with ConditionalAxisProp
  inline def gridColor: gridColor = "gridColor".asInstanceOf[gridColor]
  
  @js.native
  sealed trait gridDash
    extends StObject
       with ConditionalAxisProp
  inline def gridDash: gridDash = "gridDash".asInstanceOf[gridDash]
  
  @js.native
  sealed trait gridDashOffset
    extends StObject
       with ConditionalAxisProp
  inline def gridDashOffset: gridDashOffset = "gridDashOffset".asInstanceOf[gridDashOffset]
  
  @js.native
  sealed trait gridOpacity
    extends StObject
       with ConditionalAxisProp
  inline def gridOpacity: gridOpacity = "gridOpacity".asInstanceOf[gridOpacity]
  
  @js.native
  sealed trait gridScale extends StObject
  inline def gridScale: gridScale = "gridScale".asInstanceOf[gridScale]
  
  @js.native
  sealed trait gridWidth
    extends StObject
       with ConditionalAxisProp
  inline def gridWidth: gridWidth = "gridWidth".asInstanceOf[gridWidth]
  
  @js.native
  sealed trait group extends StObject
  inline def group: group = "group".asInstanceOf[group]
  
  @js.native
  sealed trait header
    extends StObject
       with HeaderType
  inline def header: header = "header".asInstanceOf[header]
  
  @js.native
  sealed trait headerColumn extends StObject
  inline def headerColumn: headerColumn = "headerColumn".asInstanceOf[headerColumn]
  
  @js.native
  sealed trait headerFacet extends StObject
  inline def headerFacet: headerFacet = "headerFacet".asInstanceOf[headerFacet]
  
  @js.native
  sealed trait headerRow extends StObject
  inline def headerRow: headerRow = "headerRow".asInstanceOf[headerRow]
  
  @js.native
  sealed trait height
    extends StObject
       with LayoutSizeType
       with VgEncodeChannel
  inline def height: height = "height".asInstanceOf[height]
  
  @js.native
  sealed trait hide extends StObject
  inline def hide: hide = "hide".asInstanceOf[hide]
  
  @js.native
  sealed trait horizontal extends StObject
  inline def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @js.native
  sealed trait hours
    extends StObject
       with LocalSingleTimeUnit
       with TimeUnitFormat
  inline def hours: hours = "hours".asInstanceOf[hours]
  
  @js.native
  sealed trait `hours-minutes`
    extends StObject
       with TimeUnitFormat
  inline def `hours-minutes`: `hours-minutes` = "hours-minutes".asInstanceOf[`hours-minutes`]
  
  @js.native
  sealed trait hoursminutes
    extends StObject
       with LocalMultiTimeUnit
  inline def hoursminutes: hoursminutes = "hoursminutes".asInstanceOf[hoursminutes]
  
  @js.native
  sealed trait hoursminutesseconds
    extends StObject
       with LocalMultiTimeUnit
  inline def hoursminutesseconds: hoursminutesseconds = "hoursminutesseconds".asInstanceOf[hoursminutesseconds]
  
  @js.native
  sealed trait href
    extends StObject
       with Channel
       with VgEncodeChannel
  inline def href: href = "href".asInstanceOf[href]
  
  @js.native
  sealed trait identity
    extends StObject
       with ScaleType
  inline def identity: identity = "identity".asInstanceOf[identity]
  
  @js.native
  sealed trait ignore extends StObject
  inline def ignore: ignore = "ignore".asInstanceOf[ignore]
  
  @js.native
  sealed trait image
    extends StObject
       with Mark
  inline def image: image = "image".asInstanceOf[image]
  
  @js.native
  sealed trait include extends StObject
  inline def include: include = "include".asInstanceOf[include]
  
  @js.native
  sealed trait independent
    extends StObject
       with ResolveMode
  inline def independent: independent = "independent".asInstanceOf[independent]
  
  @js.native
  sealed trait innerRadius
    extends StObject
       with VgEncodeChannel
  inline def innerRadius: innerRadius = "innerRadius".asInstanceOf[innerRadius]
  
  @js.native
  sealed trait interpolate
    extends StObject
       with VgEncodeChannel
  inline def interpolate: interpolate = "interpolate".asInstanceOf[interpolate]
  
  @js.native
  sealed trait intersect
    extends StObject
       with SelectionResolution
  inline def intersect: intersect = "intersect".asInstanceOf[intersect]
  
  @js.native
  sealed trait interval
    extends StObject
       with SelectionType
  inline def interval: interval = "interval".asInstanceOf[interval]
  
  @js.native
  sealed trait invalid extends StObject
  inline def invalid: invalid = "invalid".asInstanceOf[invalid]
  
  @js.native
  sealed trait iqr
    extends StObject
       with ErrorBarExtent
  inline def iqr: iqr = "iqr".asInstanceOf[iqr]
  
  @js.native
  sealed trait joinaggregate extends StObject
  inline def joinaggregate: joinaggregate = "joinaggregate".asInstanceOf[joinaggregate]
  
  @js.native
  sealed trait json
    extends StObject
       with DataFormatType
  inline def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait key
    extends StObject
       with Channel
  inline def key: key = "key".asInstanceOf[key]
  
  @js.native
  sealed trait labelAlign
    extends StObject
       with ConditionalAxisProp
  inline def labelAlign: labelAlign = "labelAlign".asInstanceOf[labelAlign]
  
  @js.native
  sealed trait labelAnchor extends StObject
  inline def labelAnchor: labelAnchor = "labelAnchor".asInstanceOf[labelAnchor]
  
  @js.native
  sealed trait labelAngle extends StObject
  inline def labelAngle: labelAngle = "labelAngle".asInstanceOf[labelAngle]
  
  @js.native
  sealed trait labelBaseline
    extends StObject
       with ConditionalAxisProp
  inline def labelBaseline: labelBaseline = "labelBaseline".asInstanceOf[labelBaseline]
  
  @js.native
  sealed trait labelBound extends StObject
  inline def labelBound: labelBound = "labelBound".asInstanceOf[labelBound]
  
  @js.native
  sealed trait labelColor
    extends StObject
       with ConditionalAxisProp
  inline def labelColor: labelColor = "labelColor".asInstanceOf[labelColor]
  
  @js.native
  sealed trait labelExpr extends StObject
  inline def labelExpr: labelExpr = "labelExpr".asInstanceOf[labelExpr]
  
  @js.native
  sealed trait labelFlush extends StObject
  inline def labelFlush: labelFlush = "labelFlush".asInstanceOf[labelFlush]
  
  @js.native
  sealed trait labelFlushOffset extends StObject
  inline def labelFlushOffset: labelFlushOffset = "labelFlushOffset".asInstanceOf[labelFlushOffset]
  
  @js.native
  sealed trait labelFont
    extends StObject
       with ConditionalAxisProp
  inline def labelFont: labelFont = "labelFont".asInstanceOf[labelFont]
  
  @js.native
  sealed trait labelFontSize
    extends StObject
       with ConditionalAxisProp
  inline def labelFontSize: labelFontSize = "labelFontSize".asInstanceOf[labelFontSize]
  
  @js.native
  sealed trait labelFontStyle
    extends StObject
       with ConditionalAxisProp
  inline def labelFontStyle: labelFontStyle = "labelFontStyle".asInstanceOf[labelFontStyle]
  
  @js.native
  sealed trait labelFontWeight
    extends StObject
       with ConditionalAxisProp
  inline def labelFontWeight: labelFontWeight = "labelFontWeight".asInstanceOf[labelFontWeight]
  
  @js.native
  sealed trait labelLimit extends StObject
  inline def labelLimit: labelLimit = "labelLimit".asInstanceOf[labelLimit]
  
  @js.native
  sealed trait labelLineHeight extends StObject
  inline def labelLineHeight: labelLineHeight = "labelLineHeight".asInstanceOf[labelLineHeight]
  
  @js.native
  sealed trait labelOffset
    extends StObject
       with ConditionalAxisProp
  inline def labelOffset: labelOffset = "labelOffset".asInstanceOf[labelOffset]
  
  @js.native
  sealed trait labelOpacity
    extends StObject
       with ConditionalAxisProp
  inline def labelOpacity: labelOpacity = "labelOpacity".asInstanceOf[labelOpacity]
  
  @js.native
  sealed trait labelOrient extends StObject
  inline def labelOrient: labelOrient = "labelOrient".asInstanceOf[labelOrient]
  
  @js.native
  sealed trait labelOverlap extends StObject
  inline def labelOverlap: labelOverlap = "labelOverlap".asInstanceOf[labelOverlap]
  
  @js.native
  sealed trait labelPadding
    extends StObject
       with ConditionalAxisProp
  inline def labelPadding: labelPadding = "labelPadding".asInstanceOf[labelPadding]
  
  @js.native
  sealed trait labelSeparation extends StObject
  inline def labelSeparation: labelSeparation = "labelSeparation".asInstanceOf[labelSeparation]
  
  @js.native
  sealed trait labels
    extends StObject
       with AxisPart
  inline def labels: labels = "labels".asInstanceOf[labels]
  
  @js.native
  sealed trait lag
    extends StObject
       with WindowOnlyOp
  inline def lag: lag = "lag".asInstanceOf[lag]
  
  @js.native
  sealed trait last_value
    extends StObject
       with WindowOnlyOp
  inline def last_value: last_value = "last_value".asInstanceOf[last_value]
  
  @js.native
  sealed trait latitude
    extends StObject
       with Channel
       with GeoPositionChannel
       with _MainChannelOf[Any]
  inline def latitude: latitude = "latitude".asInstanceOf[latitude]
  
  @js.native
  sealed trait latitude2
    extends StObject
       with Channel
       with GeoPositionChannel
       with SecondaryRangeChannel
       with _SecondaryChannelOf[Any]
  inline def latitude2: latitude2 = "latitude2".asInstanceOf[latitude2]
  
  @js.native
  sealed trait layer
    extends StObject
       with SpecType
  inline def layer: layer = "layer".asInstanceOf[layer]
  
  @js.native
  sealed trait layout extends StObject
  inline def layout: layout = "layout".asInstanceOf[layout]
  
  @js.native
  sealed trait lead
    extends StObject
       with WindowOnlyOp
  inline def lead: lead = "lead".asInstanceOf[lead]
  
  @js.native
  sealed trait left extends StObject
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait legend
    extends StObject
       with LegendBinding
       with SplitParentProperty
  inline def legend: legend = "legend".asInstanceOf[legend]
  
  @js.native
  sealed trait legendX extends StObject
  inline def legendX: legendX = "legendX".asInstanceOf[legendX]
  
  @js.native
  sealed trait legendY extends StObject
  inline def legendY: legendY = "legendY".asInstanceOf[legendY]
  
  @js.native
  sealed trait limit
    extends StObject
       with VgEncodeChannel
  inline def limit: limit = "limit".asInstanceOf[limit]
  
  @js.native
  sealed trait line
    extends StObject
       with Mark
  inline def line: line = "line".asInstanceOf[line]
  
  @js.native
  sealed trait lineBreak extends StObject
  inline def lineBreak: lineBreak = "lineBreak".asInstanceOf[lineBreak]
  
  @js.native
  sealed trait lineHeight extends StObject
  inline def lineHeight: lineHeight = "lineHeight".asInstanceOf[lineHeight]
  
  @js.native
  sealed trait linear
    extends StObject
       with ScaleType
  inline def linear: linear = "linear".asInstanceOf[linear]
  
  @js.native
  sealed trait lobes extends StObject
  inline def lobes: lobes = "lobes".asInstanceOf[lobes]
  
  @js.native
  sealed trait log
    extends StObject
       with ScaleType
  inline def log: log = "log".asInstanceOf[log]
  
  @js.native
  sealed trait longitude
    extends StObject
       with Channel
       with GeoPositionChannel
       with _MainChannelOf[Any]
  inline def longitude: longitude = "longitude".asInstanceOf[longitude]
  
  @js.native
  sealed trait longitude2
    extends StObject
       with Channel
       with GeoPositionChannel
       with SecondaryRangeChannel
       with _SecondaryChannelOf[Any]
  inline def longitude2: longitude2 = "longitude2".asInstanceOf[longitude2]
  
  @js.native
  sealed trait main extends StObject
  inline def main: main = "main".asInstanceOf[main]
  
  @js.native
  sealed trait mark extends StObject
  inline def mark: mark = "mark".asInstanceOf[mark]
  
  @js.native
  sealed trait max
    extends StObject
       with Aggregate
       with NonArgAggregateOp
  inline def max: max = "max".asInstanceOf[max]
  
  @js.native
  sealed trait maxExtent extends StObject
  inline def maxExtent: maxExtent = "maxExtent".asInstanceOf[maxExtent]
  
  @js.native
  sealed trait mean
    extends StObject
       with Aggregate
       with ErrorBarCenter
       with NonArgAggregateOp
  inline def mean: mean = "mean".asInstanceOf[mean]
  
  @js.native
  sealed trait median
    extends StObject
       with Aggregate
       with BoxPlotPart
       with ErrorBarCenter
       with NonArgAggregateOp
  inline def median: median = "median".asInstanceOf[median]
  
  @js.native
  sealed trait merged
    extends StObject
       with _LayoutSize
  inline def merged: merged = "merged".asInstanceOf[merged]
  
  @js.native
  sealed trait mid extends StObject
  inline def mid: mid = "mid".asInstanceOf[mid]
  
  @js.native
  sealed trait middle extends StObject
  inline def middle: middle = "middle".asInstanceOf[middle]
  
  @js.native
  sealed trait milliseconds
    extends StObject
       with LocalSingleTimeUnit
       with TimeUnitFormat
  inline def milliseconds: milliseconds = "milliseconds".asInstanceOf[milliseconds]
  
  @js.native
  sealed trait min
    extends StObject
       with Aggregate
       with NonArgAggregateOp
  inline def min: min = "min".asInstanceOf[min]
  
  @js.native
  sealed trait `min-max` extends StObject
  inline def `min-max`: `min-max` = "min-max".asInstanceOf[`min-max`]
  
  @js.native
  sealed trait minExtent extends StObject
  inline def minExtent: minExtent = "minExtent".asInstanceOf[minExtent]
  
  @js.native
  sealed trait minutes
    extends StObject
       with LocalSingleTimeUnit
       with TimeUnitFormat
  inline def minutes: minutes = "minutes".asInstanceOf[minutes]
  
  @js.native
  sealed trait minutesseconds
    extends StObject
       with LocalMultiTimeUnit
  inline def minutesseconds: minutesseconds = "minutesseconds".asInstanceOf[minutesseconds]
  
  @js.native
  sealed trait missing
    extends StObject
       with Aggregate
       with NonArgAggregateOp
  inline def missing: missing = "missing".asInstanceOf[missing]
  
  @js.native
  sealed trait month
    extends StObject
       with LocalSingleTimeUnit
       with TimeUnitFormat
  inline def month: month = "month".asInstanceOf[month]
  
  @js.native
  sealed trait monthdate
    extends StObject
       with LocalMultiTimeUnit
  inline def monthdate: monthdate = "monthdate".asInstanceOf[monthdate]
  
  @js.native
  sealed trait monthdatehours
    extends StObject
       with LocalMultiTimeUnit
  inline def monthdatehours: monthdatehours = "monthdatehours".asInstanceOf[monthdatehours]
  
  @js.native
  sealed trait monthdatehoursminutes
    extends StObject
       with LocalMultiTimeUnit
  inline def monthdatehoursminutes: monthdatehoursminutes = "monthdatehoursminutes".asInstanceOf[monthdatehoursminutes]
  
  @js.native
  sealed trait monthdatehoursminutesseconds
    extends StObject
       with LocalMultiTimeUnit
  inline def monthdatehoursminutesseconds: monthdatehoursminutesseconds = "monthdatehoursminutesseconds".asInstanceOf[monthdatehoursminutesseconds]
  
  @js.native
  sealed trait nice extends StObject
  inline def nice: nice = "nice".asInstanceOf[nice]
  
  @js.native
  sealed trait nominal
    extends StObject
       with StandardType
       with Type
       with TypeForShape
  inline def nominal: nominal = "nominal".asInstanceOf[nominal]
  
  @js.native
  sealed trait none
    extends StObject
       with AutosizeType
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait normalize
    extends StObject
       with StackOffset
  inline def normalize: normalize = "normalize".asInstanceOf[normalize]
  
  @js.native
  sealed trait nth_value
    extends StObject
       with WindowOnlyOp
  inline def nth_value: nth_value = "nth_value".asInstanceOf[nth_value]
  
  @js.native
  sealed trait ntile
    extends StObject
       with WindowOnlyOp
  inline def ntile: ntile = "ntile".asInstanceOf[ntile]
  
  @js.native
  sealed trait number
    extends StObject
       with _ParseValue
  inline def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait numeric extends StObject
  inline def numeric: numeric = "numeric".asInstanceOf[numeric]
  
  @js.native
  sealed trait offset
    extends StObject
       with StepFor
  inline def offset: offset = "offset".asInstanceOf[offset]
  
  @js.native
  sealed trait opacity
    extends StObject
       with Channel
       with SortByChannel
       with VgEncodeChannel
  inline def opacity: opacity = "opacity".asInstanceOf[opacity]
  
  @js.native
  sealed trait order
    extends StObject
       with Channel
  inline def order: order = "order".asInstanceOf[order]
  
  @js.native
  sealed trait ordinal
    extends StObject
       with ScaleType
       with StandardType
       with Type
       with TypeForShape
  inline def ordinal: ordinal = "ordinal".asInstanceOf[ordinal]
  
  @js.native
  sealed trait `ordinal-position` extends StObject
  inline def `ordinal-position`: `ordinal-position` = "ordinal-position".asInstanceOf[`ordinal-position`]
  
  @js.native
  sealed trait orient
    extends StObject
       with VgEncodeChannel
  inline def orient: orient = "orient".asInstanceOf[orient]
  
  @js.native
  sealed trait outerRadius
    extends StObject
       with VgEncodeChannel
  inline def outerRadius: outerRadius = "outerRadius".asInstanceOf[outerRadius]
  
  @js.native
  sealed trait outliers
    extends StObject
       with BoxPlotPart
  inline def outliers: outliers = "outliers".asInstanceOf[outliers]
  
  @js.native
  sealed trait pad
    extends StObject
       with AutosizeType
  inline def pad: pad = "pad".asInstanceOf[pad]
  
  @js.native
  sealed trait padAngle extends StObject
  inline def padAngle: padAngle = "padAngle".asInstanceOf[padAngle]
  
  @js.native
  sealed trait padding extends StObject
  inline def padding: padding = "padding".asInstanceOf[padding]
  
  @js.native
  sealed trait paddingInner extends StObject
  inline def paddingInner: paddingInner = "paddingInner".asInstanceOf[paddingInner]
  
  @js.native
  sealed trait paddingOuter extends StObject
  inline def paddingOuter: paddingOuter = "paddingOuter".asInstanceOf[paddingOuter]
  
  @js.native
  sealed trait parallel extends StObject
  inline def parallel: parallel = "parallel".asInstanceOf[parallel]
  
  @js.native
  sealed trait parallels extends StObject
  inline def parallels: parallels = "parallels".asInstanceOf[parallels]
  
  @js.native
  sealed trait parent extends StObject
  inline def parent: parent = "parent".asInstanceOf[parent]
  
  @js.native
  sealed trait path
    extends StObject
       with VgEncodeChannel
  inline def path: path = "path".asInstanceOf[path]
  
  @js.native
  sealed trait percent_rank
    extends StObject
       with WindowOnlyOp
  inline def percent_rank: percent_rank = "percent_rank".asInstanceOf[percent_rank]
  
  @js.native
  sealed trait plain extends StObject
  inline def plain: plain = "plain".asInstanceOf[plain]
  
  @js.native
  sealed trait point
    extends StObject
       with Mark
       with ScaleType
       with SelectionType
  inline def point: point = "point".asInstanceOf[point]
  
  @js.native
  sealed trait pointRadius extends StObject
  inline def pointRadius: pointRadius = "pointRadius".asInstanceOf[pointRadius]
  
  @js.native
  sealed trait poly extends StObject
  inline def poly: poly = "poly".asInstanceOf[poly]
  
  @js.native
  sealed trait position
    extends StObject
       with StepFor
  inline def position: position = "position".asInstanceOf[position]
  
  @js.native
  sealed trait pow
    extends StObject
       with ScaleType
  inline def pow: pow = "pow".asInstanceOf[pow]
  
  @js.native
  sealed trait precision extends StObject
  inline def precision: precision = "precision".asInstanceOf[precision]
  
  @js.native
  sealed trait product
    extends StObject
       with Aggregate
       with NonArgAggregateOp
  inline def product: product = "product".asInstanceOf[product]
  
  @js.native
  sealed trait property extends StObject
  inline def property: property = "property".asInstanceOf[property]
  
  @js.native
  sealed trait q1
    extends StObject
       with Aggregate
       with NonArgAggregateOp
  inline def q1: q1 = "q1".asInstanceOf[q1]
  
  @js.native
  sealed trait q3
    extends StObject
       with Aggregate
       with NonArgAggregateOp
  inline def q3: q3 = "q3".asInstanceOf[q3]
  
  @js.native
  sealed trait quad extends StObject
  inline def quad: quad = "quad".asInstanceOf[quad]
  
  @js.native
  sealed trait quantile
    extends StObject
       with ScaleType
  inline def quantile: quantile = "quantile".asInstanceOf[quantile]
  
  @js.native
  sealed trait quantitative
    extends StObject
       with StandardType
       with Type
  inline def quantitative: quantitative = "quantitative".asInstanceOf[quantitative]
  
  @js.native
  sealed trait quantize
    extends StObject
       with ScaleType
  inline def quantize: quantize = "quantize".asInstanceOf[quantize]
  
  @js.native
  sealed trait quarter
    extends StObject
       with LocalSingleTimeUnit
       with TimeUnitFormat
  inline def quarter: quarter = "quarter".asInstanceOf[quarter]
  
  @js.native
  sealed trait quartermonth
    extends StObject
       with LocalMultiTimeUnit
  inline def quartermonth: quartermonth = "quartermonth".asInstanceOf[quartermonth]
  
  @js.native
  sealed trait radius
    extends StObject
       with Channel
       with PolarPositionChannel
       with PolarPositionScaleChannel
       with VgEncodeChannel
       with _MainChannelOf[Any]
  inline def radius: radius = "radius".asInstanceOf[radius]
  
  @js.native
  sealed trait radius2
    extends StObject
       with Channel
       with PolarPositionChannel
       with SecondaryRangeChannel
       with _SecondaryChannelOf[Any]
  inline def radius2: radius2 = "radius2".asInstanceOf[radius2]
  
  @js.native
  sealed trait radius2Offset extends StObject
  inline def radius2Offset: radius2Offset = "radius2Offset".asInstanceOf[radius2Offset]
  
  @js.native
  sealed trait radiusOffset extends StObject
  inline def radiusOffset: radiusOffset = "radiusOffset".asInstanceOf[radiusOffset]
  
  @js.native
  sealed trait range extends StObject
  inline def range: range = "range".asInstanceOf[range]
  
  @js.native
  sealed trait rangeMax extends StObject
  inline def rangeMax: rangeMax = "rangeMax".asInstanceOf[rangeMax]
  
  @js.native
  sealed trait rangeMin extends StObject
  inline def rangeMin: rangeMin = "rangeMin".asInstanceOf[rangeMin]
  
  @js.native
  sealed trait rank
    extends StObject
       with WindowOnlyOp
  inline def rank: rank = "rank".asInstanceOf[rank]
  
  @js.native
  sealed trait ratio extends StObject
  inline def ratio: ratio = "ratio".asInstanceOf[ratio]
  
  @js.native
  sealed trait raw
    extends StObject
       with ErrorInputType
  inline def raw: raw = "raw".asInstanceOf[raw]
  
  @js.native
  sealed trait rect
    extends StObject
       with Mark
  inline def rect: rect = "rect".asInstanceOf[rect]
  
  @js.native
  sealed trait reflectX extends StObject
  inline def reflectX: reflectX = "reflectX".asInstanceOf[reflectX]
  
  @js.native
  sealed trait reflectY extends StObject
  inline def reflectY: reflectY = "reflectY".asInstanceOf[reflectY]
  
  @js.native
  sealed trait repeat extends StObject
  inline def repeat: repeat = "repeat".asInstanceOf[repeat]
  
  @js.native
  sealed trait reverse extends StObject
  inline def reverse: reverse = "reverse".asInstanceOf[reverse]
  
  @js.native
  sealed trait right extends StObject
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait rotate extends StObject
  inline def rotate: rotate = "rotate".asInstanceOf[rotate]
  
  @js.native
  sealed trait round extends StObject
  inline def round: round = "round".asInstanceOf[round]
  
  @js.native
  sealed trait row
    extends StObject
       with FacetChannel
       with HeaderChannel
  inline def row: row = "row".asInstanceOf[row]
  
  @js.native
  sealed trait rowPadding extends StObject
  inline def rowPadding: rowPadding = "rowPadding".asInstanceOf[rowPadding]
  
  @js.native
  sealed trait row_number
    extends StObject
       with WindowOnlyOp
  inline def row_number: row_number = "row_number".asInstanceOf[row_number]
  
  @js.native
  sealed trait rule
    extends StObject
       with BoxPlotPart
       with ErrorBarPart
       with Mark
  inline def rule: rule = "rule".asInstanceOf[rule]
  
  @js.native
  sealed trait scale
    extends StObject
       with SplitParentProperty
  inline def scale: scale = "scale".asInstanceOf[scale]
  
  @js.native
  sealed trait scaleX
    extends StObject
       with VgEncodeChannel
  inline def scaleX: scaleX = "scaleX".asInstanceOf[scaleX]
  
  @js.native
  sealed trait scaleY
    extends StObject
       with VgEncodeChannel
  inline def scaleY: scaleY = "scaleY".asInstanceOf[scaleY]
  
  @js.native
  sealed trait scales extends StObject
  inline def scales: scales = "scales".asInstanceOf[scales]
  
  @js.native
  sealed trait scheme extends StObject
  inline def scheme: scheme = "scheme".asInstanceOf[scheme]
  
  @js.native
  sealed trait seconds
    extends StObject
       with LocalSingleTimeUnit
       with TimeUnitFormat
  inline def seconds: seconds = "seconds".asInstanceOf[seconds]
  
  @js.native
  sealed trait secondsmilliseconds
    extends StObject
       with LocalMultiTimeUnit
  inline def secondsmilliseconds: secondsmilliseconds = "secondsmilliseconds".asInstanceOf[secondsmilliseconds]
  
  @js.native
  sealed trait selections extends StObject
  inline def selections: selections = "selections".asInstanceOf[selections]
  
  @js.native
  sealed trait sequential
    extends StObject
       with ScaleType
  inline def sequential: sequential = "sequential".asInstanceOf[sequential]
  
  @js.native
  sealed trait shape
    extends StObject
       with Channel
       with SortByChannel
       with VgEncodeChannel
  inline def shape: shape = "shape".asInstanceOf[shape]
  
  @js.native
  sealed trait shared
    extends StObject
       with ResolveMode
  inline def shared: shared = "shared".asInstanceOf[shared]
  
  @js.native
  sealed trait size
    extends StObject
       with Channel
       with SortByChannel
       with VgEncodeChannel
  inline def size: size = "size".asInstanceOf[size]
  
  @js.native
  sealed trait smooth extends StObject
  inline def smooth: smooth = "smooth".asInstanceOf[smooth]
  
  @js.native
  sealed trait spacing extends StObject
  inline def spacing: spacing = "spacing".asInstanceOf[spacing]
  
  @js.native
  sealed trait sqrt
    extends StObject
       with ScaleType
  inline def sqrt: sqrt = "sqrt".asInstanceOf[sqrt]
  
  @js.native
  sealed trait square
    extends StObject
       with Mark
  inline def square: square = "square".asInstanceOf[square]
  
  @js.native
  sealed trait start extends StObject
  inline def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait startAngle
    extends StObject
       with VgEncodeChannel
  inline def startAngle: startAngle = "startAngle".asInstanceOf[startAngle]
  
  @js.native
  sealed trait stderr
    extends StObject
       with Aggregate
       with ErrorBarExtent
       with NonArgAggregateOp
  inline def stderr: stderr = "stderr".asInstanceOf[stderr]
  
  @js.native
  sealed trait stdev
    extends StObject
       with Aggregate
       with ErrorBarExtent
       with NonArgAggregateOp
  inline def stdev: stdev = "stdev".asInstanceOf[stdev]
  
  @js.native
  sealed trait stdevp
    extends StObject
       with Aggregate
       with NonArgAggregateOp
  inline def stdevp: stdevp = "stdevp".asInstanceOf[stdevp]
  
  @js.native
  sealed trait step
    extends StObject
       with _LayoutSize
  inline def step: step = "step".asInstanceOf[step]
  
  @js.native
  sealed trait string
    extends StObject
       with _ParseValue
  inline def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait stroke
    extends StObject
       with Channel
       with ColorChannel
       with SortByChannel
       with VgEncodeChannel
  inline def stroke: stroke = "stroke".asInstanceOf[stroke]
  
  @js.native
  sealed trait strokeCap
    extends StObject
       with VgEncodeChannel
  inline def strokeCap: strokeCap = "strokeCap".asInstanceOf[strokeCap]
  
  @js.native
  sealed trait strokeColor extends StObject
  inline def strokeColor: strokeColor = "strokeColor".asInstanceOf[strokeColor]
  
  @js.native
  sealed trait strokeDash
    extends StObject
       with Channel
       with VgEncodeChannel
  inline def strokeDash: strokeDash = "strokeDash".asInstanceOf[strokeDash]
  
  @js.native
  sealed trait strokeDashOffset
    extends StObject
       with VgEncodeChannel
  inline def strokeDashOffset: strokeDashOffset = "strokeDashOffset".asInstanceOf[strokeDashOffset]
  
  @js.native
  sealed trait strokeForeground
    extends StObject
       with VgEncodeChannel
  inline def strokeForeground: strokeForeground = "strokeForeground".asInstanceOf[strokeForeground]
  
  @js.native
  sealed trait strokeJoin
    extends StObject
       with VgEncodeChannel
  inline def strokeJoin: strokeJoin = "strokeJoin".asInstanceOf[strokeJoin]
  
  @js.native
  sealed trait strokeMiterLimit
    extends StObject
       with VgEncodeChannel
  inline def strokeMiterLimit: strokeMiterLimit = "strokeMiterLimit".asInstanceOf[strokeMiterLimit]
  
  @js.native
  sealed trait strokeOffset
    extends StObject
       with VgEncodeChannel
  inline def strokeOffset: strokeOffset = "strokeOffset".asInstanceOf[strokeOffset]
  
  @js.native
  sealed trait strokeOpacity
    extends StObject
       with Channel
       with SortByChannel
       with VgEncodeChannel
  inline def strokeOpacity: strokeOpacity = "strokeOpacity".asInstanceOf[strokeOpacity]
  
  @js.native
  sealed trait strokeWidth
    extends StObject
       with Channel
       with SortByChannel
       with VgEncodeChannel
  inline def strokeWidth: strokeWidth = "strokeWidth".asInstanceOf[strokeWidth]
  
  @js.native
  sealed trait style extends StObject
  inline def style: style = "style".asInstanceOf[style]
  
  @js.native
  sealed trait subtitleColor extends StObject
  inline def subtitleColor: subtitleColor = "subtitleColor".asInstanceOf[subtitleColor]
  
  @js.native
  sealed trait subtitleFont extends StObject
  inline def subtitleFont: subtitleFont = "subtitleFont".asInstanceOf[subtitleFont]
  
  @js.native
  sealed trait subtitleFontSize extends StObject
  inline def subtitleFontSize: subtitleFontSize = "subtitleFontSize".asInstanceOf[subtitleFontSize]
  
  @js.native
  sealed trait subtitleFontStyle extends StObject
  inline def subtitleFontStyle: subtitleFontStyle = "subtitleFontStyle".asInstanceOf[subtitleFontStyle]
  
  @js.native
  sealed trait subtitleFontWeight extends StObject
  inline def subtitleFontWeight: subtitleFontWeight = "subtitleFontWeight".asInstanceOf[subtitleFontWeight]
  
  @js.native
  sealed trait subtitleLineHeight extends StObject
  inline def subtitleLineHeight: subtitleLineHeight = "subtitleLineHeight".asInstanceOf[subtitleLineHeight]
  
  @js.native
  sealed trait subtitlePadding extends StObject
  inline def subtitlePadding: subtitlePadding = "subtitlePadding".asInstanceOf[subtitlePadding]
  
  @js.native
  sealed trait sum
    extends StObject
       with Aggregate
       with NonArgAggregateOp
  inline def sum: sum = "sum".asInstanceOf[sum]
  
  @js.native
  sealed trait symbol extends StObject
  inline def symbol: symbol = "symbol".asInstanceOf[symbol]
  
  @js.native
  sealed trait symbolBaseFillColor extends StObject
  inline def symbolBaseFillColor: symbolBaseFillColor = "symbolBaseFillColor".asInstanceOf[symbolBaseFillColor]
  
  @js.native
  sealed trait symbolBaseStrokeColor extends StObject
  inline def symbolBaseStrokeColor: symbolBaseStrokeColor = "symbolBaseStrokeColor".asInstanceOf[symbolBaseStrokeColor]
  
  @js.native
  sealed trait symbolDash extends StObject
  inline def symbolDash: symbolDash = "symbolDash".asInstanceOf[symbolDash]
  
  @js.native
  sealed trait symbolDashOffset extends StObject
  inline def symbolDashOffset: symbolDashOffset = "symbolDashOffset".asInstanceOf[symbolDashOffset]
  
  @js.native
  sealed trait symbolDirection extends StObject
  inline def symbolDirection: symbolDirection = "symbolDirection".asInstanceOf[symbolDirection]
  
  @js.native
  sealed trait symbolFillColor extends StObject
  inline def symbolFillColor: symbolFillColor = "symbolFillColor".asInstanceOf[symbolFillColor]
  
  @js.native
  sealed trait symbolLimit extends StObject
  inline def symbolLimit: symbolLimit = "symbolLimit".asInstanceOf[symbolLimit]
  
  @js.native
  sealed trait symbolOffset extends StObject
  inline def symbolOffset: symbolOffset = "symbolOffset".asInstanceOf[symbolOffset]
  
  @js.native
  sealed trait symbolOpacity extends StObject
  inline def symbolOpacity: symbolOpacity = "symbolOpacity".asInstanceOf[symbolOpacity]
  
  @js.native
  sealed trait symbolSize extends StObject
  inline def symbolSize: symbolSize = "symbolSize".asInstanceOf[symbolSize]
  
  @js.native
  sealed trait symbolStrokeColor extends StObject
  inline def symbolStrokeColor: symbolStrokeColor = "symbolStrokeColor".asInstanceOf[symbolStrokeColor]
  
  @js.native
  sealed trait symbolStrokeWidth extends StObject
  inline def symbolStrokeWidth: symbolStrokeWidth = "symbolStrokeWidth".asInstanceOf[symbolStrokeWidth]
  
  @js.native
  sealed trait symbolType extends StObject
  inline def symbolType: symbolType = "symbolType".asInstanceOf[symbolType]
  
  @js.native
  sealed trait symlog
    extends StObject
       with ScaleType
  inline def symlog: symlog = "symlog".asInstanceOf[symlog]
  
  @js.native
  sealed trait temporal
    extends StObject
       with StandardType
       with Type
  inline def temporal: temporal = "temporal".asInstanceOf[temporal]
  
  @js.native
  sealed trait tension
    extends StObject
       with VgEncodeChannel
  inline def tension: tension = "tension".asInstanceOf[tension]
  
  @js.native
  sealed trait text
    extends StObject
       with Channel
       with Mark
       with SortByChannel
       with VgEncodeChannel
  inline def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait theta
    extends StObject
       with Channel
       with PolarPositionChannel
       with PolarPositionScaleChannel
       with VgEncodeChannel
       with _MainChannelOf[Any]
  inline def theta: theta = "theta".asInstanceOf[theta]
  
  @js.native
  sealed trait theta2
    extends StObject
       with Channel
       with PolarPositionChannel
       with SecondaryRangeChannel
       with _SecondaryChannelOf[Any]
  inline def theta2: theta2 = "theta2".asInstanceOf[theta2]
  
  @js.native
  sealed trait theta2Offset extends StObject
  inline def theta2Offset: theta2Offset = "theta2Offset".asInstanceOf[theta2Offset]
  
  @js.native
  sealed trait thetaOffset extends StObject
  inline def thetaOffset: thetaOffset = "thetaOffset".asInstanceOf[thetaOffset]
  
  @js.native
  sealed trait thickness extends StObject
  inline def thickness: thickness = "thickness".asInstanceOf[thickness]
  
  @js.native
  sealed trait threshold
    extends StObject
       with ScaleType
  inline def threshold: threshold = "threshold".asInstanceOf[threshold]
  
  @js.native
  sealed trait tick
    extends StObject
       with Mark
  inline def tick: tick = "tick".asInstanceOf[tick]
  
  @js.native
  sealed trait tickBand extends StObject
  inline def tickBand: tickBand = "tickBand".asInstanceOf[tickBand]
  
  @js.native
  sealed trait tickCap extends StObject
  inline def tickCap: tickCap = "tickCap".asInstanceOf[tickCap]
  
  @js.native
  sealed trait tickColor
    extends StObject
       with ConditionalAxisProp
  inline def tickColor: tickColor = "tickColor".asInstanceOf[tickColor]
  
  @js.native
  sealed trait tickCount extends StObject
  inline def tickCount: tickCount = "tickCount".asInstanceOf[tickCount]
  
  @js.native
  sealed trait tickDash
    extends StObject
       with ConditionalAxisProp
  inline def tickDash: tickDash = "tickDash".asInstanceOf[tickDash]
  
  @js.native
  sealed trait tickDashOffset
    extends StObject
       with ConditionalAxisProp
  inline def tickDashOffset: tickDashOffset = "tickDashOffset".asInstanceOf[tickDashOffset]
  
  @js.native
  sealed trait tickExtra extends StObject
  inline def tickExtra: tickExtra = "tickExtra".asInstanceOf[tickExtra]
  
  @js.native
  sealed trait tickMinStep extends StObject
  inline def tickMinStep: tickMinStep = "tickMinStep".asInstanceOf[tickMinStep]
  
  @js.native
  sealed trait tickOffset extends StObject
  inline def tickOffset: tickOffset = "tickOffset".asInstanceOf[tickOffset]
  
  @js.native
  sealed trait tickOpacity
    extends StObject
       with ConditionalAxisProp
  inline def tickOpacity: tickOpacity = "tickOpacity".asInstanceOf[tickOpacity]
  
  @js.native
  sealed trait tickRound extends StObject
  inline def tickRound: tickRound = "tickRound".asInstanceOf[tickRound]
  
  @js.native
  sealed trait tickSize
    extends StObject
       with ConditionalAxisProp
  inline def tickSize: tickSize = "tickSize".asInstanceOf[tickSize]
  
  @js.native
  sealed trait tickWidth
    extends StObject
       with ConditionalAxisProp
  inline def tickWidth: tickWidth = "tickWidth".asInstanceOf[tickWidth]
  
  @js.native
  sealed trait ticks
    extends StObject
       with AxisPart
       with BoxPlotPart
       with ErrorBarPart
  inline def ticks: ticks = "ticks".asInstanceOf[ticks]
  
  @js.native
  sealed trait tilt extends StObject
  inline def tilt: tilt = "tilt".asInstanceOf[tilt]
  
  @js.native
  sealed trait time
    extends StObject
       with ScaleType
  inline def time: time = "time".asInstanceOf[time]
  
  @js.native
  sealed trait timeUnitBandPosition extends StObject
  inline def timeUnitBandPosition: timeUnitBandPosition = "timeUnitBandPosition".asInstanceOf[timeUnitBandPosition]
  
  @js.native
  sealed trait timeUnitBandSize extends StObject
  inline def timeUnitBandSize: timeUnitBandSize = "timeUnitBandSize".asInstanceOf[timeUnitBandSize]
  
  @js.native
  sealed trait title
    extends StObject
       with AxisPart
  inline def title: title = "title".asInstanceOf[title]
  
  @js.native
  sealed trait titleAlign extends StObject
  inline def titleAlign: titleAlign = "titleAlign".asInstanceOf[titleAlign]
  
  @js.native
  sealed trait titleAnchor extends StObject
  inline def titleAnchor: titleAnchor = "titleAnchor".asInstanceOf[titleAnchor]
  
  @js.native
  sealed trait titleAngle extends StObject
  inline def titleAngle: titleAngle = "titleAngle".asInstanceOf[titleAngle]
  
  @js.native
  sealed trait titleBaseline extends StObject
  inline def titleBaseline: titleBaseline = "titleBaseline".asInstanceOf[titleBaseline]
  
  @js.native
  sealed trait titleColor extends StObject
  inline def titleColor: titleColor = "titleColor".asInstanceOf[titleColor]
  
  @js.native
  sealed trait titleFont extends StObject
  inline def titleFont: titleFont = "titleFont".asInstanceOf[titleFont]
  
  @js.native
  sealed trait titleFontSize extends StObject
  inline def titleFontSize: titleFontSize = "titleFontSize".asInstanceOf[titleFontSize]
  
  @js.native
  sealed trait titleFontStyle extends StObject
  inline def titleFontStyle: titleFontStyle = "titleFontStyle".asInstanceOf[titleFontStyle]
  
  @js.native
  sealed trait titleFontWeight extends StObject
  inline def titleFontWeight: titleFontWeight = "titleFontWeight".asInstanceOf[titleFontWeight]
  
  @js.native
  sealed trait titleLimit extends StObject
  inline def titleLimit: titleLimit = "titleLimit".asInstanceOf[titleLimit]
  
  @js.native
  sealed trait titleLineHeight extends StObject
  inline def titleLineHeight: titleLineHeight = "titleLineHeight".asInstanceOf[titleLineHeight]
  
  @js.native
  sealed trait titleOpacity extends StObject
  inline def titleOpacity: titleOpacity = "titleOpacity".asInstanceOf[titleOpacity]
  
  @js.native
  sealed trait titleOrient extends StObject
  inline def titleOrient: titleOrient = "titleOrient".asInstanceOf[titleOrient]
  
  @js.native
  sealed trait titlePadding extends StObject
  inline def titlePadding: titlePadding = "titlePadding".asInstanceOf[titlePadding]
  
  @js.native
  sealed trait titleX extends StObject
  inline def titleX: titleX = "titleX".asInstanceOf[titleX]
  
  @js.native
  sealed trait titleY extends StObject
  inline def titleY: titleY = "titleY".asInstanceOf[titleY]
  
  @js.native
  sealed trait tooltip
    extends StObject
       with Channel
       with VgEncodeChannel
  inline def tooltip: tooltip = "tooltip".asInstanceOf[tooltip]
  
  @js.native
  sealed trait top extends StObject
  inline def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait topojson
    extends StObject
       with DataFormatType
  inline def topojson: topojson = "topojson".asInstanceOf[topojson]
  
  @js.native
  sealed trait trail
    extends StObject
       with Mark
  inline def trail: trail = "trail".asInstanceOf[trail]
  
  @js.native
  sealed trait translate extends StObject
  inline def translate: translate = "translate".asInstanceOf[translate]
  
  @js.native
  sealed trait transparent extends StObject
  inline def transparent: transparent = "transparent".asInstanceOf[transparent]
  
  @js.native
  sealed trait tsv
    extends StObject
       with DataFormatType
  inline def tsv: tsv = "tsv".asInstanceOf[tsv]
  
  @js.native
  sealed trait tukey extends StObject
  inline def tukey: tukey = "tukey".asInstanceOf[tukey]
  
  @js.native
  sealed trait `type` extends StObject
  inline def `type`: `type` = "type".asInstanceOf[`type`]
  
  @js.native
  sealed trait unaggregated
    extends StObject
       with _Domain
  inline def unaggregated: unaggregated = "unaggregated".asInstanceOf[unaggregated]
  
  @js.native
  sealed trait union
    extends StObject
       with SelectionResolution
  inline def union: union = "union".asInstanceOf[union]
  
  @js.native
  sealed trait unit
    extends StObject
       with SpecType
  inline def unit: unit = "unit".asInstanceOf[unit]
  
  @js.native
  sealed trait unselectedOpacity extends StObject
  inline def unselectedOpacity: unselectedOpacity = "unselectedOpacity".asInstanceOf[unselectedOpacity]
  
  @js.native
  sealed trait url
    extends StObject
       with Channel
       with VgEncodeChannel
  inline def url: url = "url".asInstanceOf[url]
  
  @js.native
  sealed trait utc
    extends StObject
       with ScaleType
  inline def utc: utc = "utc".asInstanceOf[utc]
  
  @js.native
  sealed trait utcdate
    extends StObject
       with UtcSingleTimeUnit
  inline def utcdate: utcdate = "utcdate".asInstanceOf[utcdate]
  
  @js.native
  sealed trait utcday
    extends StObject
       with UtcSingleTimeUnit
  inline def utcday: utcday = "utcday".asInstanceOf[utcday]
  
  @js.native
  sealed trait utcdayhours
    extends StObject
       with UtcMultiTimeUnit
  inline def utcdayhours: utcdayhours = "utcdayhours".asInstanceOf[utcdayhours]
  
  @js.native
  sealed trait utcdayhoursminutes
    extends StObject
       with UtcMultiTimeUnit
  inline def utcdayhoursminutes: utcdayhoursminutes = "utcdayhoursminutes".asInstanceOf[utcdayhoursminutes]
  
  @js.native
  sealed trait utcdayhoursminutesseconds
    extends StObject
       with UtcMultiTimeUnit
  inline def utcdayhoursminutesseconds: utcdayhoursminutesseconds = "utcdayhoursminutesseconds".asInstanceOf[utcdayhoursminutesseconds]
  
  @js.native
  sealed trait utcdayofyear
    extends StObject
       with UtcSingleTimeUnit
  inline def utcdayofyear: utcdayofyear = "utcdayofyear".asInstanceOf[utcdayofyear]
  
  @js.native
  sealed trait utchours
    extends StObject
       with UtcSingleTimeUnit
  inline def utchours: utchours = "utchours".asInstanceOf[utchours]
  
  @js.native
  sealed trait utchoursminutes
    extends StObject
       with UtcMultiTimeUnit
  inline def utchoursminutes: utchoursminutes = "utchoursminutes".asInstanceOf[utchoursminutes]
  
  @js.native
  sealed trait utchoursminutesseconds
    extends StObject
       with UtcMultiTimeUnit
  inline def utchoursminutesseconds: utchoursminutesseconds = "utchoursminutesseconds".asInstanceOf[utchoursminutesseconds]
  
  @js.native
  sealed trait utcmilliseconds
    extends StObject
       with UtcSingleTimeUnit
  inline def utcmilliseconds: utcmilliseconds = "utcmilliseconds".asInstanceOf[utcmilliseconds]
  
  @js.native
  sealed trait utcminutes
    extends StObject
       with UtcSingleTimeUnit
  inline def utcminutes: utcminutes = "utcminutes".asInstanceOf[utcminutes]
  
  @js.native
  sealed trait utcminutesseconds
    extends StObject
       with UtcMultiTimeUnit
  inline def utcminutesseconds: utcminutesseconds = "utcminutesseconds".asInstanceOf[utcminutesseconds]
  
  @js.native
  sealed trait utcmonth
    extends StObject
       with UtcSingleTimeUnit
  inline def utcmonth: utcmonth = "utcmonth".asInstanceOf[utcmonth]
  
  @js.native
  sealed trait utcmonthdate
    extends StObject
       with UtcMultiTimeUnit
  inline def utcmonthdate: utcmonthdate = "utcmonthdate".asInstanceOf[utcmonthdate]
  
  @js.native
  sealed trait utcmonthdatehours
    extends StObject
       with UtcMultiTimeUnit
  inline def utcmonthdatehours: utcmonthdatehours = "utcmonthdatehours".asInstanceOf[utcmonthdatehours]
  
  @js.native
  sealed trait utcmonthdatehoursminutes
    extends StObject
       with UtcMultiTimeUnit
  inline def utcmonthdatehoursminutes: utcmonthdatehoursminutes = "utcmonthdatehoursminutes".asInstanceOf[utcmonthdatehoursminutes]
  
  @js.native
  sealed trait utcmonthdatehoursminutesseconds
    extends StObject
       with UtcMultiTimeUnit
  inline def utcmonthdatehoursminutesseconds: utcmonthdatehoursminutesseconds = "utcmonthdatehoursminutesseconds".asInstanceOf[utcmonthdatehoursminutesseconds]
  
  @js.native
  sealed trait utcquarter
    extends StObject
       with UtcSingleTimeUnit
  inline def utcquarter: utcquarter = "utcquarter".asInstanceOf[utcquarter]
  
  @js.native
  sealed trait utcquartermonth
    extends StObject
       with UtcMultiTimeUnit
  inline def utcquartermonth: utcquartermonth = "utcquartermonth".asInstanceOf[utcquartermonth]
  
  @js.native
  sealed trait utcseconds
    extends StObject
       with UtcSingleTimeUnit
  inline def utcseconds: utcseconds = "utcseconds".asInstanceOf[utcseconds]
  
  @js.native
  sealed trait utcsecondsmilliseconds
    extends StObject
       with UtcMultiTimeUnit
  inline def utcsecondsmilliseconds: utcsecondsmilliseconds = "utcsecondsmilliseconds".asInstanceOf[utcsecondsmilliseconds]
  
  @js.native
  sealed trait utcweek
    extends StObject
       with UtcSingleTimeUnit
  inline def utcweek: utcweek = "utcweek".asInstanceOf[utcweek]
  
  @js.native
  sealed trait utcweekday
    extends StObject
       with UtcMultiTimeUnit
  inline def utcweekday: utcweekday = "utcweekday".asInstanceOf[utcweekday]
  
  @js.native
  sealed trait utcweekdayhoursminutes
    extends StObject
       with UtcMultiTimeUnit
  inline def utcweekdayhoursminutes: utcweekdayhoursminutes = "utcweekdayhoursminutes".asInstanceOf[utcweekdayhoursminutes]
  
  @js.native
  sealed trait utcweekdayhoursminutesseconds
    extends StObject
       with UtcMultiTimeUnit
  inline def utcweekdayhoursminutesseconds: utcweekdayhoursminutesseconds = "utcweekdayhoursminutesseconds".asInstanceOf[utcweekdayhoursminutesseconds]
  
  @js.native
  sealed trait utcweeksdayhours
    extends StObject
       with UtcMultiTimeUnit
  inline def utcweeksdayhours: utcweeksdayhours = "utcweeksdayhours".asInstanceOf[utcweeksdayhours]
  
  @js.native
  sealed trait utcyear
    extends StObject
       with UtcSingleTimeUnit
  inline def utcyear: utcyear = "utcyear".asInstanceOf[utcyear]
  
  @js.native
  sealed trait utcyeardayofyear
    extends StObject
       with UtcMultiTimeUnit
  inline def utcyeardayofyear: utcyeardayofyear = "utcyeardayofyear".asInstanceOf[utcyeardayofyear]
  
  @js.native
  sealed trait utcyearmonth
    extends StObject
       with UtcMultiTimeUnit
  inline def utcyearmonth: utcyearmonth = "utcyearmonth".asInstanceOf[utcyearmonth]
  
  @js.native
  sealed trait utcyearmonthdate
    extends StObject
       with UtcMultiTimeUnit
  inline def utcyearmonthdate: utcyearmonthdate = "utcyearmonthdate".asInstanceOf[utcyearmonthdate]
  
  @js.native
  sealed trait utcyearmonthdatehours
    extends StObject
       with UtcMultiTimeUnit
  inline def utcyearmonthdatehours: utcyearmonthdatehours = "utcyearmonthdatehours".asInstanceOf[utcyearmonthdatehours]
  
  @js.native
  sealed trait utcyearmonthdatehoursminutes
    extends StObject
       with UtcMultiTimeUnit
  inline def utcyearmonthdatehoursminutes: utcyearmonthdatehoursminutes = "utcyearmonthdatehoursminutes".asInstanceOf[utcyearmonthdatehoursminutes]
  
  @js.native
  sealed trait utcyearmonthdatehoursminutesseconds
    extends StObject
       with UtcMultiTimeUnit
  inline def utcyearmonthdatehoursminutesseconds: utcyearmonthdatehoursminutesseconds = "utcyearmonthdatehoursminutesseconds".asInstanceOf[utcyearmonthdatehoursminutesseconds]
  
  @js.native
  sealed trait utcyearquarter
    extends StObject
       with UtcMultiTimeUnit
  inline def utcyearquarter: utcyearquarter = "utcyearquarter".asInstanceOf[utcyearquarter]
  
  @js.native
  sealed trait utcyearquartermonth
    extends StObject
       with UtcMultiTimeUnit
  inline def utcyearquartermonth: utcyearquartermonth = "utcyearquartermonth".asInstanceOf[utcyearquartermonth]
  
  @js.native
  sealed trait utcyearweek
    extends StObject
       with UtcMultiTimeUnit
  inline def utcyearweek: utcyearweek = "utcyearweek".asInstanceOf[utcyearweek]
  
  @js.native
  sealed trait utcyearweekday
    extends StObject
       with UtcMultiTimeUnit
  inline def utcyearweekday: utcyearweekday = "utcyearweekday".asInstanceOf[utcyearweekday]
  
  @js.native
  sealed trait utcyearweekdayhours
    extends StObject
       with UtcMultiTimeUnit
  inline def utcyearweekdayhours: utcyearweekdayhours = "utcyearweekdayhours".asInstanceOf[utcyearweekdayhours]
  
  @js.native
  sealed trait utcyearweekdayhoursminutes
    extends StObject
       with UtcMultiTimeUnit
  inline def utcyearweekdayhoursminutes: utcyearweekdayhoursminutes = "utcyearweekdayhoursminutes".asInstanceOf[utcyearweekdayhoursminutes]
  
  @js.native
  sealed trait utcyearweekdayhoursminutesseconds
    extends StObject
       with UtcMultiTimeUnit
  inline def utcyearweekdayhoursminutesseconds: utcyearweekdayhoursminutesseconds = "utcyearweekdayhoursminutesseconds".asInstanceOf[utcyearweekdayhoursminutesseconds]
  
  @js.native
  sealed trait valid
    extends StObject
       with Aggregate
       with NonArgAggregateOp
  inline def valid: valid = "valid".asInstanceOf[valid]
  
  @js.native
  sealed trait values
    extends StObject
       with Aggregate
       with NonArgAggregateOp
  inline def values: values = "values".asInstanceOf[values]
  
  @js.native
  sealed trait variance
    extends StObject
       with Aggregate
       with NonArgAggregateOp
  inline def variance: variance = "variance".asInstanceOf[variance]
  
  @js.native
  sealed trait variancep
    extends StObject
       with Aggregate
       with NonArgAggregateOp
  inline def variancep: variancep = "variancep".asInstanceOf[variancep]
  
  @js.native
  sealed trait verbal extends StObject
  inline def verbal: verbal = "verbal".asInstanceOf[verbal]
  
  @js.native
  sealed trait visual extends StObject
  inline def visual: visual = "visual".asInstanceOf[visual]
  
  @js.native
  sealed trait week
    extends StObject
       with LocalSingleTimeUnit
       with TimeUnitFormat
  inline def week: week = "week".asInstanceOf[week]
  
  @js.native
  sealed trait weekday
    extends StObject
       with LocalMultiTimeUnit
  inline def weekday: weekday = "weekday".asInstanceOf[weekday]
  
  @js.native
  sealed trait weekdayhoursminutes
    extends StObject
       with LocalMultiTimeUnit
  inline def weekdayhoursminutes: weekdayhoursminutes = "weekdayhoursminutes".asInstanceOf[weekdayhoursminutes]
  
  @js.native
  sealed trait weekdayhoursminutesseconds
    extends StObject
       with LocalMultiTimeUnit
  inline def weekdayhoursminutesseconds: weekdayhoursminutesseconds = "weekdayhoursminutesseconds".asInstanceOf[weekdayhoursminutesseconds]
  
  @js.native
  sealed trait weeksdayhours
    extends StObject
       with LocalMultiTimeUnit
  inline def weeksdayhours: weeksdayhours = "weeksdayhours".asInstanceOf[weeksdayhours]
  
  @js.native
  sealed trait width
    extends StObject
       with LayoutSizeType
       with VgEncodeChannel
  inline def width: width = "width".asInstanceOf[width]
  
  @js.native
  sealed trait x
    extends StObject
       with Channel
       with PositionChannel
       with PositionScaleChannel
       with SortByChannel
       with VgEncodeChannel
       with _MainChannelOf[Any]
  inline def x: x = "x".asInstanceOf[x]
  
  @js.native
  sealed trait x2
    extends StObject
       with Channel
       with PositionChannel
       with SecondaryRangeChannel
       with VgEncodeChannel
       with _SecondaryChannelOf[Any]
  inline def x2: x2 = "x2".asInstanceOf[x2]
  
  @js.native
  sealed trait x2Offset extends StObject
  inline def x2Offset: x2Offset = "x2Offset".asInstanceOf[x2Offset]
  
  @js.native
  sealed trait xOffset
    extends StObject
       with Channel
  inline def xOffset: xOffset = "xOffset".asInstanceOf[xOffset]
  
  @js.native
  sealed trait xc
    extends StObject
       with VgEncodeChannel
  inline def xc: xc = "xc".asInstanceOf[xc]
  
  @js.native
  sealed trait y
    extends StObject
       with Channel
       with PositionChannel
       with PositionScaleChannel
       with SortByChannel
       with VgEncodeChannel
       with _MainChannelOf[Any]
  inline def y: y = "y".asInstanceOf[y]
  
  @js.native
  sealed trait y2
    extends StObject
       with Channel
       with PositionChannel
       with SecondaryRangeChannel
       with VgEncodeChannel
       with _SecondaryChannelOf[Any]
  inline def y2: y2 = "y2".asInstanceOf[y2]
  
  @js.native
  sealed trait y2Offset extends StObject
  inline def y2Offset: y2Offset = "y2Offset".asInstanceOf[y2Offset]
  
  @js.native
  sealed trait yOffset
    extends StObject
       with Channel
  inline def yOffset: yOffset = "yOffset".asInstanceOf[yOffset]
  
  @js.native
  sealed trait yc
    extends StObject
       with VgEncodeChannel
  inline def yc: yc = "yc".asInstanceOf[yc]
  
  @js.native
  sealed trait year
    extends StObject
       with LocalSingleTimeUnit
       with TimeUnitFormat
  inline def year: year = "year".asInstanceOf[year]
  
  @js.native
  sealed trait `year-month`
    extends StObject
       with TimeUnitFormat
  inline def `year-month`: `year-month` = "year-month".asInstanceOf[`year-month`]
  
  @js.native
  sealed trait `year-month-date`
    extends StObject
       with TimeUnitFormat
  inline def `year-month-date`: `year-month-date` = "year-month-date".asInstanceOf[`year-month-date`]
  
  @js.native
  sealed trait yeardayofyear
    extends StObject
       with LocalMultiTimeUnit
  inline def yeardayofyear: yeardayofyear = "yeardayofyear".asInstanceOf[yeardayofyear]
  
  @js.native
  sealed trait yearmonth
    extends StObject
       with LocalMultiTimeUnit
  inline def yearmonth: yearmonth = "yearmonth".asInstanceOf[yearmonth]
  
  @js.native
  sealed trait yearmonthdate
    extends StObject
       with LocalMultiTimeUnit
  inline def yearmonthdate: yearmonthdate = "yearmonthdate".asInstanceOf[yearmonthdate]
  
  @js.native
  sealed trait yearmonthdatehours
    extends StObject
       with LocalMultiTimeUnit
  inline def yearmonthdatehours: yearmonthdatehours = "yearmonthdatehours".asInstanceOf[yearmonthdatehours]
  
  @js.native
  sealed trait yearmonthdatehoursminutes
    extends StObject
       with LocalMultiTimeUnit
  inline def yearmonthdatehoursminutes: yearmonthdatehoursminutes = "yearmonthdatehoursminutes".asInstanceOf[yearmonthdatehoursminutes]
  
  @js.native
  sealed trait yearmonthdatehoursminutesseconds
    extends StObject
       with LocalMultiTimeUnit
  inline def yearmonthdatehoursminutesseconds: yearmonthdatehoursminutesseconds = "yearmonthdatehoursminutesseconds".asInstanceOf[yearmonthdatehoursminutesseconds]
  
  @js.native
  sealed trait yearquarter
    extends StObject
       with LocalMultiTimeUnit
  inline def yearquarter: yearquarter = "yearquarter".asInstanceOf[yearquarter]
  
  @js.native
  sealed trait yearquartermonth
    extends StObject
       with LocalMultiTimeUnit
  inline def yearquartermonth: yearquartermonth = "yearquartermonth".asInstanceOf[yearquartermonth]
  
  @js.native
  sealed trait yearweek
    extends StObject
       with LocalMultiTimeUnit
  inline def yearweek: yearweek = "yearweek".asInstanceOf[yearweek]
  
  @js.native
  sealed trait yearweekday
    extends StObject
       with LocalMultiTimeUnit
  inline def yearweekday: yearweekday = "yearweekday".asInstanceOf[yearweekday]
  
  @js.native
  sealed trait yearweekdayhours
    extends StObject
       with LocalMultiTimeUnit
  inline def yearweekdayhours: yearweekdayhours = "yearweekdayhours".asInstanceOf[yearweekdayhours]
  
  @js.native
  sealed trait yearweekdayhoursminutes
    extends StObject
       with LocalMultiTimeUnit
  inline def yearweekdayhoursminutes: yearweekdayhoursminutes = "yearweekdayhoursminutes".asInstanceOf[yearweekdayhoursminutes]
  
  @js.native
  sealed trait yearweekdayhoursminutesseconds
    extends StObject
       with LocalMultiTimeUnit
  inline def yearweekdayhoursminutesseconds: yearweekdayhoursminutesseconds = "yearweekdayhoursminutesseconds".asInstanceOf[yearweekdayhoursminutesseconds]
  
  @js.native
  sealed trait zero
    extends StObject
       with StackOffset
  inline def zero: zero = "zero".asInstanceOf[zero]
  
  @js.native
  sealed trait zeroOrMax extends StObject
  inline def zeroOrMax: zeroOrMax = "zeroOrMax".asInstanceOf[zeroOrMax]
  
  @js.native
  sealed trait zeroOrMin extends StObject
  inline def zeroOrMin: zeroOrMin = "zeroOrMin".asInstanceOf[zeroOrMin]
  
  @js.native
  sealed trait zindex extends StObject
  inline def zindex: zindex = "zindex".asInstanceOf[zindex]
}
