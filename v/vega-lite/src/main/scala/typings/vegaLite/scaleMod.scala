package typings.vegaLite

import typings.vegaLite.anon.FieldString
import typings.vegaLite.channelMod.Channel
import typings.vegaLite.datetimeMod.DateTime
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.srcSelectionMod.SelectionExtent
import typings.vegaLite.srcTypeMod.Type
import typings.vegaLite.vegaLiteStrings.`bin-ordinal`
import typings.vegaLite.vegaLiteStrings.`ordinal-position`
import typings.vegaLite.vegaLiteStrings.`type`
import typings.vegaLite.vegaLiteStrings.align
import typings.vegaLite.vegaLiteStrings.band
import typings.vegaLite.vegaLiteStrings.base
import typings.vegaLite.vegaLiteStrings.bins
import typings.vegaLite.vegaLiteStrings.clamp
import typings.vegaLite.vegaLiteStrings.constant
import typings.vegaLite.vegaLiteStrings.discretizing
import typings.vegaLite.vegaLiteStrings.domain
import typings.vegaLite.vegaLiteStrings.domainMax
import typings.vegaLite.vegaLiteStrings.domainMid
import typings.vegaLite.vegaLiteStrings.domainMin
import typings.vegaLite.vegaLiteStrings.exponent
import typings.vegaLite.vegaLiteStrings.identity
import typings.vegaLite.vegaLiteStrings.interpolate
import typings.vegaLite.vegaLiteStrings.linear
import typings.vegaLite.vegaLiteStrings.log
import typings.vegaLite.vegaLiteStrings.nice
import typings.vegaLite.vegaLiteStrings.numeric
import typings.vegaLite.vegaLiteStrings.ordinal
import typings.vegaLite.vegaLiteStrings.padding
import typings.vegaLite.vegaLiteStrings.paddingInner
import typings.vegaLite.vegaLiteStrings.paddingOuter
import typings.vegaLite.vegaLiteStrings.point
import typings.vegaLite.vegaLiteStrings.pow
import typings.vegaLite.vegaLiteStrings.quantile
import typings.vegaLite.vegaLiteStrings.quantize
import typings.vegaLite.vegaLiteStrings.range
import typings.vegaLite.vegaLiteStrings.rangeMax
import typings.vegaLite.vegaLiteStrings.rangeMin
import typings.vegaLite.vegaLiteStrings.reverse
import typings.vegaLite.vegaLiteStrings.round
import typings.vegaLite.vegaLiteStrings.scheme
import typings.vegaLite.vegaLiteStrings.sequential
import typings.vegaLite.vegaLiteStrings.sqrt
import typings.vegaLite.vegaLiteStrings.symlog
import typings.vegaLite.vegaLiteStrings.threshold
import typings.vegaLite.vegaLiteStrings.time
import typings.vegaLite.vegaLiteStrings.unaggregated
import typings.vegaLite.vegaLiteStrings.utc
import typings.vegaLite.vegaLiteStrings.zero
import typings.vegaTypings.scaleMod.RangeEnum
import typings.vegaTypings.scaleMod.ScaleBins
import typings.vegaTypings.scaleMod.ScaleInterpolateEnum
import typings.vegaTypings.scaleMod.ScaleInterpolateParams
import typings.vegaTypings.scaleMod.TimeInterval
import typings.vegaTypings.scaleMod.TimeIntervalStep
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scaleMod {
  
  @JSImport("vega-lite/build/src/scale", "CONTINUOUS_DOMAIN_SCALES")
  @js.native
  val CONTINUOUS_DOMAIN_SCALES: js.Array[ScaleType] = js.native
  
  @JSImport("vega-lite/build/src/scale", "CONTINUOUS_TO_CONTINUOUS_SCALES")
  @js.native
  val CONTINUOUS_TO_CONTINUOUS_SCALES: js.Array[ScaleType] = js.native
  
  @JSImport("vega-lite/build/src/scale", "CONTINUOUS_TO_DISCRETE_SCALES")
  @js.native
  val CONTINUOUS_TO_DISCRETE_SCALES: js.Array[ScaleType] = js.native
  
  @JSImport("vega-lite/build/src/scale", "DISCRETE_DOMAIN_SCALES")
  @js.native
  val DISCRETE_DOMAIN_SCALES: js.Array[ScaleType] = js.native
  
  @JSImport("vega-lite/build/src/scale", "NON_TYPE_DOMAIN_RANGE_VEGA_SCALE_PROPERTIES")
  @js.native
  val NON_TYPE_DOMAIN_RANGE_VEGA_SCALE_PROPERTIES: js.Array[
    reverse | round | base | zero | padding | nice | domainMin | domainMax | domainMid | bins | interpolate | clamp | constant | exponent | paddingInner | paddingOuter | align
  ] = js.native
  
  @JSImport("vega-lite/build/src/scale", "QUANTITATIVE_SCALES")
  @js.native
  val QUANTITATIVE_SCALES: js.Array[ScaleType] = js.native
  
  /* Inlined std.Record<vega-lite.vega-lite/build/src/scale.ScaleType, vega-lite.vega-lite/build/src/scale.ScaleType | 'numeric' | 'ordinal-position' | 'discretizing'> */
  object SCALE_CATEGORY_INDEX {
    
    @JSImport("vega-lite/build/src/scale", "SCALE_CATEGORY_INDEX")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vega-lite/build/src/scale", "SCALE_CATEGORY_INDEX.band")
    @js.native
    def band: ScaleType | numeric | `ordinal-position` | discretizing = js.native
    @scala.inline
    def band_=(x: ScaleType | numeric | `ordinal-position` | discretizing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("band")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/scale", "SCALE_CATEGORY_INDEX.bin-ordinal")
    @js.native
    def binOrdinal: ScaleType | numeric | `ordinal-position` | discretizing = js.native
    
    @scala.inline
    def binOrdinal_=(x: ScaleType | numeric | `ordinal-position` | discretizing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bin-ordinal")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/scale", "SCALE_CATEGORY_INDEX.identity")
    @js.native
    def identity: ScaleType | numeric | `ordinal-position` | discretizing = js.native
    @scala.inline
    def identity_=(x: ScaleType | numeric | `ordinal-position` | discretizing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identity")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/scale", "SCALE_CATEGORY_INDEX.linear")
    @js.native
    def linear: ScaleType | numeric | `ordinal-position` | discretizing = js.native
    @scala.inline
    def linear_=(x: ScaleType | numeric | `ordinal-position` | discretizing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linear")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/scale", "SCALE_CATEGORY_INDEX.log")
    @js.native
    def log: ScaleType | numeric | `ordinal-position` | discretizing = js.native
    @scala.inline
    def log_=(x: ScaleType | numeric | `ordinal-position` | discretizing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("log")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/scale", "SCALE_CATEGORY_INDEX.ordinal")
    @js.native
    def ordinal: ScaleType | numeric | `ordinal-position` | discretizing = js.native
    @scala.inline
    def ordinal_=(x: ScaleType | numeric | `ordinal-position` | discretizing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/scale", "SCALE_CATEGORY_INDEX.point")
    @js.native
    def point: ScaleType | numeric | `ordinal-position` | discretizing = js.native
    @scala.inline
    def point_=(x: ScaleType | numeric | `ordinal-position` | discretizing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("point")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/scale", "SCALE_CATEGORY_INDEX.pow")
    @js.native
    def pow: ScaleType | numeric | `ordinal-position` | discretizing = js.native
    @scala.inline
    def pow_=(x: ScaleType | numeric | `ordinal-position` | discretizing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pow")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/scale", "SCALE_CATEGORY_INDEX.quantile")
    @js.native
    def quantile: ScaleType | numeric | `ordinal-position` | discretizing = js.native
    @scala.inline
    def quantile_=(x: ScaleType | numeric | `ordinal-position` | discretizing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("quantile")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/scale", "SCALE_CATEGORY_INDEX.quantize")
    @js.native
    def quantize: ScaleType | numeric | `ordinal-position` | discretizing = js.native
    @scala.inline
    def quantize_=(x: ScaleType | numeric | `ordinal-position` | discretizing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("quantize")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/scale", "SCALE_CATEGORY_INDEX.sequential")
    @js.native
    def sequential: ScaleType | numeric | `ordinal-position` | discretizing = js.native
    @scala.inline
    def sequential_=(x: ScaleType | numeric | `ordinal-position` | discretizing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sequential")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/scale", "SCALE_CATEGORY_INDEX.sqrt")
    @js.native
    def sqrt: ScaleType | numeric | `ordinal-position` | discretizing = js.native
    @scala.inline
    def sqrt_=(x: ScaleType | numeric | `ordinal-position` | discretizing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sqrt")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/scale", "SCALE_CATEGORY_INDEX.symlog")
    @js.native
    def symlog: ScaleType | numeric | `ordinal-position` | discretizing = js.native
    @scala.inline
    def symlog_=(x: ScaleType | numeric | `ordinal-position` | discretizing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symlog")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/scale", "SCALE_CATEGORY_INDEX.threshold")
    @js.native
    def threshold: ScaleType | numeric | `ordinal-position` | discretizing = js.native
    @scala.inline
    def threshold_=(x: ScaleType | numeric | `ordinal-position` | discretizing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("threshold")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/scale", "SCALE_CATEGORY_INDEX.time")
    @js.native
    def time: ScaleType | numeric | `ordinal-position` | discretizing = js.native
    @scala.inline
    def time_=(x: ScaleType | numeric | `ordinal-position` | discretizing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("time")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/scale", "SCALE_CATEGORY_INDEX.utc")
    @js.native
    def utc: ScaleType | numeric | `ordinal-position` | discretizing = js.native
    @scala.inline
    def utc_=(x: ScaleType | numeric | `ordinal-position` | discretizing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("utc")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("vega-lite/build/src/scale", "SCALE_PROPERTIES")
  @js.native
  val SCALE_PROPERTIES: js.Array[
    reverse | round | base | zero | padding | `type` | range | nice | domain | domainMin | domainMax | domainMid | bins | interpolate | clamp | constant | exponent | paddingInner | paddingOuter | align | rangeMax | rangeMin | scheme
  ] = js.native
  
  @JSImport("vega-lite/build/src/scale", "SCALE_TYPES")
  @js.native
  val SCALE_TYPES: js.Array[typings.vegaTypings.scaleMod.ScaleType] = js.native
  
  /* Inlined vega-lite.vega-lite/build/src/scale.ValueOf<{ readonly LINEAR :'linear',  readonly LOG :'log',  readonly POW :'pow',  readonly SQRT :'sqrt',  readonly SYMLOG :'symlog',  readonly IDENTITY :'identity',  readonly SEQUENTIAL :'sequential',  readonly TIME :'time',  readonly UTC :'utc',  readonly QUANTILE :'quantile',  readonly QUANTIZE :'quantize',  readonly THRESHOLD :'threshold',  readonly BIN_ORDINAL :'bin-ordinal',  readonly ORDINAL :'ordinal',  readonly POINT :'point',  readonly BAND :'band'}> */
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.ordinal
    - typings.vegaLite.vegaLiteStrings.utc
    - typings.vegaLite.vegaLiteStrings.sqrt
    - typings.vegaLite.vegaLiteStrings.`bin-ordinal`
    - typings.vegaLite.vegaLiteStrings.point
    - typings.vegaLite.vegaLiteStrings.time
    - typings.vegaLite.vegaLiteStrings.threshold
    - typings.vegaLite.vegaLiteStrings.pow
    - typings.vegaLite.vegaLiteStrings.quantize
    - typings.vegaLite.vegaLiteStrings.band
    - typings.vegaLite.vegaLiteStrings.linear
    - typings.vegaLite.vegaLiteStrings.sequential
    - typings.vegaLite.vegaLiteStrings.symlog
    - typings.vegaLite.vegaLiteStrings.log
    - typings.vegaLite.vegaLiteStrings.quantile
    - typings.vegaLite.vegaLiteStrings.identity
  */
  trait ScaleType extends StObject
  object ScaleType {
    
    @JSImport("vega-lite/build/src/scale", "ScaleType.BAND")
    @js.native
    val BAND: band = js.native
    
    @JSImport("vega-lite/build/src/scale", "ScaleType.BIN_ORDINAL")
    @js.native
    val BIN_ORDINAL: `bin-ordinal` = js.native
    
    @JSImport("vega-lite/build/src/scale", "ScaleType.IDENTITY")
    @js.native
    val IDENTITY: identity = js.native
    
    @JSImport("vega-lite/build/src/scale", "ScaleType.LINEAR")
    @js.native
    val LINEAR: linear = js.native
    
    @JSImport("vega-lite/build/src/scale", "ScaleType.LOG")
    @js.native
    val LOG: log = js.native
    
    @JSImport("vega-lite/build/src/scale", "ScaleType.ORDINAL")
    @js.native
    val ORDINAL: ordinal = js.native
    
    @JSImport("vega-lite/build/src/scale", "ScaleType.POINT")
    @js.native
    val POINT: point = js.native
    
    @JSImport("vega-lite/build/src/scale", "ScaleType.POW")
    @js.native
    val POW: pow = js.native
    
    @JSImport("vega-lite/build/src/scale", "ScaleType.QUANTILE")
    @js.native
    val QUANTILE: quantile = js.native
    
    @JSImport("vega-lite/build/src/scale", "ScaleType.QUANTIZE")
    @js.native
    val QUANTIZE: quantize = js.native
    
    @JSImport("vega-lite/build/src/scale", "ScaleType.SEQUENTIAL")
    @js.native
    val SEQUENTIAL: sequential = js.native
    
    @JSImport("vega-lite/build/src/scale", "ScaleType.SQRT")
    @js.native
    val SQRT: sqrt = js.native
    
    @JSImport("vega-lite/build/src/scale", "ScaleType.SYMLOG")
    @js.native
    val SYMLOG: symlog = js.native
    
    @JSImport("vega-lite/build/src/scale", "ScaleType.THRESHOLD")
    @js.native
    val THRESHOLD: threshold = js.native
    
    @JSImport("vega-lite/build/src/scale", "ScaleType.TIME")
    @js.native
    val TIME: time = js.native
    
    @JSImport("vega-lite/build/src/scale", "ScaleType.UTC")
    @js.native
    val UTC: utc = js.native
  }
  
  @JSImport("vega-lite/build/src/scale", "TIME_SCALE_TYPES")
  @js.native
  val TIME_SCALE_TYPES: js.Array[ScaleType] = js.native
  
  @JSImport("vega-lite/build/src/scale", "channelScalePropertyIncompatability")
  @js.native
  def channelScalePropertyIncompatability(
    channel: Channel,
    propName: /* keyof vega-lite.vega-lite/build/src/scale.Scale<vega-lite.vega-lite/build/src/expr.ExprRef | vega-typings.vega-typings/types/spec/signal.SignalRef> */ `type` | domain | domainMid | domainMax | domainMin | reverse | range | rangeMax | rangeMin | scheme | align | bins | round | padding | paddingInner | paddingOuter | clamp | nice | base | exponent | constant | zero | interpolate
  ): String = js.native
  
  @JSImport("vega-lite/build/src/scale", "channelSupportScaleType")
  @js.native
  def channelSupportScaleType(channel: Channel, scaleType: ScaleType): Boolean = js.native
  
  @JSImport("vega-lite/build/src/scale", "defaultScaleConfig")
  @js.native
  val defaultScaleConfig: ScaleConfig[SignalRef] = js.native
  
  @JSImport("vega-lite/build/src/scale", "hasContinuousDomain")
  @js.native
  def hasContinuousDomain(`type`: ScaleType): Boolean = js.native
  
  @JSImport("vega-lite/build/src/scale", "hasDiscreteDomain")
  @js.native
  def hasDiscreteDomain(`type`: ScaleType): Boolean = js.native
  
  @JSImport("vega-lite/build/src/scale", "isContinuousToContinuous")
  @js.native
  def isContinuousToContinuous(`type`: ScaleType): Boolean = js.native
  
  @JSImport("vega-lite/build/src/scale", "isContinuousToDiscrete")
  @js.native
  def isContinuousToDiscrete(`type`: ScaleType): Boolean = js.native
  
  @JSImport("vega-lite/build/src/scale", "isDomainUnionWith")
  @js.native
  def isDomainUnionWith(domain: Domain): /* is vega-lite.vega-lite/build/src/scale.DomainUnionWith */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/scale", "isExtendedScheme")
  @js.native
  def isExtendedScheme(scheme: Scheme): /* is vega-lite.vega-lite/build/src/scale.SchemeParams */ Boolean = js.native
  @JSImport("vega-lite/build/src/scale", "isExtendedScheme")
  @js.native
  def isExtendedScheme(scheme: SignalRef): /* is vega-lite.vega-lite/build/src/scale.SchemeParams */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/scale", "isQuantitative")
  @js.native
  def isQuantitative(`type`: ScaleType): Boolean = js.native
  
  @JSImport("vega-lite/build/src/scale", "isSelectionDomain")
  @js.native
  def isSelectionDomain(domain: Domain): /* is vega-lite.vega-lite/build/src/selection.SelectionExtent */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/scale", "scaleCompatible")
  @js.native
  def scaleCompatible(scaleType1: ScaleType, scaleType2: ScaleType): Boolean = js.native
  
  @JSImport("vega-lite/build/src/scale", "scaleTypePrecedence")
  @js.native
  def scaleTypePrecedence(scaleType: ScaleType): Double = js.native
  
  @JSImport("vega-lite/build/src/scale", "scaleTypeSupportDataType")
  @js.native
  def scaleTypeSupportDataType(specifiedType: ScaleType, fieldDefType: Type): Boolean = js.native
  
  @JSImport("vega-lite/build/src/scale", "scaleTypeSupportProperty")
  @js.native
  def scaleTypeSupportProperty(
    scaleType: ScaleType,
    propName: /* keyof vega-lite.vega-lite/build/src/scale.Scale<vega-lite.vega-lite/build/src/expr.ExprRef | vega-typings.vega-typings/types/spec/signal.SignalRef> */ `type` | domain | domainMid | domainMax | domainMin | reverse | range | rangeMax | rangeMin | scheme | align | bins | round | padding | paddingInner | paddingOuter | clamp | nice | base | exponent | constant | zero | interpolate
  ): Boolean = js.native
  
  /* Rewritten from type alias, can be one of: 
    - js.Array[
  scala.Null | java.lang.String | scala.Double | scala.Boolean | typings.vegaLite.datetimeMod.DateTime | typings.vegaTypings.signalMod.SignalRef]
    - typings.vegaLite.vegaLiteStrings.unaggregated
    - typings.vegaLite.srcSelectionMod.SelectionExtent
    - typings.vegaTypings.signalMod.SignalRef
    - typings.vegaLite.scaleMod.DomainUnionWith
  */
  type Domain = _Domain | (js.Array[Null | String | Double | Boolean | DateTime | SignalRef]) | SignalRef
  
  @js.native
  trait DomainUnionWith extends _Domain {
    
    /**
      * Customized domain values to be union with the field's values.
      *
      * 1) `domain` for _quantitative_ fields can take one of the following forms:
      *
      * - a two-element array with minimum and maximum values.
      * - an array with more than two entries, for [Piecewise  quantitative scales](https://vega.github.io/vega-lite/docs/scale.html#piecewise). (Alternatively, the `domainMid` property can be set for a diverging scale.)
      * - a string value `"unaggregated"`, if the input field is aggregated, to indicate that the domain should include the raw data values prior to the aggregation.
      *
      * 2) `domain` for _temporal_ fields can be a two-element array minimum and maximum values, in the form of either timestamps or the [DateTime definition objects](https://vega.github.io/vega-lite/docs/types.html#datetime).
      *
      * 3) `domain` for _ordinal_ and _nominal_ fields can be an array that lists valid input values.
      */
    var unionWith: js.Array[Boolean | DateTime | Double | String] = js.native
  }
  object DomainUnionWith {
    
    @scala.inline
    def apply(unionWith: js.Array[Boolean | DateTime | Double | String]): DomainUnionWith = {
      val __obj = js.Dynamic.literal(unionWith = unionWith.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomainUnionWith]
    }
    
    @scala.inline
    implicit class DomainUnionWithMutableBuilder[Self <: DomainUnionWith] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnionWith(value: js.Array[Boolean | DateTime | Double | String]): Self = StObject.set(x, "unionWith", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnionWithVarargs(value: (Boolean | DateTime | Double | String)*): Self = StObject.set(x, "unionWith", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Scale[ES /* <: ExprRef | SignalRef */] extends StObject {
    
    /**
      * The alignment of the steps within the scale range.
      *
      * This value must lie in the range `[0,1]`. A value of `0.5` indicates that the steps should be centered within the range. A value of `0` or `1` may be used to shift the bands to one side, say to position them adjacent to an axis.
      *
      * __Default value:__ `0.5`
      */
    var align: js.UndefOr[Double | ES] = js.native
    
    /**
      * The logarithm base of the `log` scale (default `10`).
      */
    var base: js.UndefOr[Double | ES] = js.native
    
    /**
      * Bin boundaries can be provided to scales as either an explicit array of bin boundaries or as a bin specification object. The legal values are:
      * - An [array](../types/#Array) literal of bin boundary values. For example, `[0, 5, 10, 15, 20]`. The array must include both starting and ending boundaries. The previous example uses five values to indicate a total of four bin intervals: [0-5), [5-10), [10-15), [15-20]. Array literals may include signal references as elements.
      * - A [bin specification object](https://vega.github.io/vega-lite/docs/scale.html#bins) that indicates the bin _step_ size, and optionally the _start_ and _stop_ boundaries.
      * - An array of bin boundaries over the scale domain. If provided, axes and legends will use the bin boundaries to inform the choice of tick marks and text labels.
      */
    var bins: js.UndefOr[ScaleBins] = js.native
    
    /**
      * If `true`, values that exceed the data domain are clamped to either the minimum or maximum range value
      *
      * __Default value:__ derived from the [scale config](https://vega.github.io/vega-lite/docs/config.html#scale-config)'s `clamp` (`true` by default).
      */
    var clamp: js.UndefOr[Boolean | ES] = js.native
    
    /**
      * A constant determining the slope of the symlog function around zero. Only used for `symlog` scales.
      *
      * __Default value:__ `1`
      */
    var constant: js.UndefOr[Double | ES] = js.native
    
    /**
      * Customized domain values in the form of constant values or dynamic values driven by a selection.
      *
      * 1) Constant `domain` for _quantitative_ fields can take one of the following forms:
      *
      * - A two-element array with minimum and maximum values. To create a diverging scale, this two-element array can be combined with the `domainMid` property.
      * - An array with more than two entries, for [Piecewise quantitative scales](https://vega.github.io/vega-lite/docs/scale.html#piecewise).
      * - A string value `"unaggregated"`, if the input field is aggregated, to indicate that the domain should include the raw data values prior to the aggregation.
      *
      * 2) Constant `domain` for _temporal_ fields can be a two-element array with minimum and maximum values, in the form of either timestamps or the [DateTime definition objects](https://vega.github.io/vega-lite/docs/types.html#datetime).
      *
      * 3) Constant `domain` for _ordinal_ and _nominal_ fields can be an array that lists valid input values.
      *
      * 4) To combine (union) specified constant domain with the field's values, `domain` can be an object with a `unionWith` property that specify constant domain to be combined. For example, `domain: {unionWith: [0, 100]}` for a quantitative scale means that the scale domain always includes `[0, 100]`, but will include other values in the fields beyond `[0, 100]`.
      *
      * 5) Domain can also takes an object defining a field or encoding of a selection that [interactively determines](https://vega.github.io/vega-lite/docs/selection.html#scale-domains) the scale domain.
      */
    var domain: js.UndefOr[
        (js.Array[Null | String | Double | Boolean | DateTime | ES]) | unaggregated | SelectionExtent | DomainUnionWith | ES
      ] = js.native
    
    /**
      * Sets the maximum value in the scale domain, overriding the `domain` property. This property is only intended for use with scales having continuous domains.
      */
    var domainMax: js.UndefOr[Double | DateTime | ES] = js.native
    
    /**
      * Inserts a single mid-point value into a two-element domain. The mid-point value must lie between the domain minimum and maximum values. This property can be useful for setting a midpoint for [diverging color scales](https://vega.github.io/vega-lite/docs/scale.html#piecewise). The domainMid property is only intended for use with scales supporting continuous, piecewise domains.
      */
    var domainMid: js.UndefOr[Double | ES] = js.native
    
    /**
      * Sets the minimum value in the scale domain, overriding the domain property. This property is only intended for use with scales having continuous domains.
      */
    var domainMin: js.UndefOr[Double | DateTime | ES] = js.native
    
    /**
      * The exponent of the `pow` scale.
      */
    var exponent: js.UndefOr[Double | ES] = js.native
    
    /**
      * The interpolation method for range values. By default, a general interpolator for numbers, dates, strings and colors (in HCL space) is used. For color ranges, this property allows interpolation in alternative color spaces. Legal values include `rgb`, `hsl`, `hsl-long`, `lab`, `hcl`, `hcl-long`, `cubehelix` and `cubehelix-long` ('-long' variants use longer paths in polar coordinate spaces). If object-valued, this property accepts an object with a string-valued _type_ property and an optional numeric _gamma_ property applicable to rgb and cubehelix interpolators. For more, see the [d3-interpolate documentation](https://github.com/d3/d3-interpolate).
      *
      * * __Default value:__ `hcl`
      */
    var interpolate: js.UndefOr[ScaleInterpolateEnum | ES | ScaleInterpolateParams] = js.native
    
    /**
      * Extending the domain so that it starts and ends on nice round values. This method typically modifies the scale’s domain, and may only extend the bounds to the nearest round value. Nicing is useful if the domain is computed from data and may be irregular. For example, for a domain of _[0.201479…, 0.996679…]_, a nice domain might be _[0.2, 1.0]_.
      *
      * For quantitative scales such as linear, `nice` can be either a boolean flag or a number. If `nice` is a number, it will represent a desired tick count. This allows greater control over the step size used to extend the bounds, guaranteeing that the returned ticks will exactly cover the domain.
      *
      * For temporal fields with time and utc scales, the `nice` value can be a string indicating the desired time interval. Legal values are `"millisecond"`, `"second"`, `"minute"`, `"hour"`, `"day"`, `"week"`, `"month"`, and `"year"`. Alternatively, `time` and `utc` scales can accept an object-valued interval specifier of the form `{"interval": "month", "step": 3}`, which includes a desired number of interval steps. Here, the domain would snap to quarter (Jan, Apr, Jul, Oct) boundaries.
      *
      * __Default value:__ `true` for unbinned _quantitative_ fields; `false` otherwise.
      *
      */
    var nice: js.UndefOr[Boolean | Double | TimeInterval | TimeIntervalStep | ES] = js.native
    
    /**
      * For _[continuous](https://vega.github.io/vega-lite/docs/scale.html#continuous)_ scales, expands the scale domain to accommodate the specified number of pixels on each of the scale range. The scale range must represent pixels for this parameter to function as intended. Padding adjustment is performed prior to all other adjustments, including the effects of the `zero`, `nice`, `domainMin`, and `domainMax` properties.
      *
      * For _[band](https://vega.github.io/vega-lite/docs/scale.html#band)_ scales, shortcut for setting `paddingInner` and `paddingOuter` to the same value.
      *
      * For _[point](https://vega.github.io/vega-lite/docs/scale.html#point)_ scales, alias for `paddingOuter`.
      *
      * __Default value:__ For _continuous_ scales, derived from the [scale config](https://vega.github.io/vega-lite/docs/scale.html#config)'s `continuousPadding`.
      * For _band and point_ scales, see `paddingInner` and `paddingOuter`. By default, Vega-Lite sets padding such that _width/height = number of unique values * step_.
      *
      * @minimum 0
      */
    var padding: js.UndefOr[Double | ES] = js.native
    
    /**
      * The inner padding (spacing) within each band step of band scales, as a fraction of the step size. This value must lie in the range [0,1].
      *
      * For point scale, this property is invalid as point scales do not have internal band widths (only step sizes between bands).
      *
      * __Default value:__ derived from the [scale config](https://vega.github.io/vega-lite/docs/scale.html#config)'s `bandPaddingInner`.
      *
      * @minimum 0
      * @maximum 1
      */
    var paddingInner: js.UndefOr[Double | ES] = js.native
    
    /**
      * The outer padding (spacing) at the ends of the range of band and point scales,
      * as a fraction of the step size. This value must lie in the range [0,1].
      *
      * __Default value:__ derived from the [scale config](https://vega.github.io/vega-lite/docs/scale.html#config)'s `bandPaddingOuter` for band scales and `pointPadding` for point scales.
      * By default, Vega-Lite sets outer padding such that _width/height = number of unique values * step_.
      *
      * @minimum 0
      * @maximum 1
      */
    var paddingOuter: js.UndefOr[Double | ES] = js.native
    
    /**
      * The range of the scale. One of:
      *
      * - A string indicating a [pre-defined named scale range](https://vega.github.io/vega-lite/docs/scale.html#range-config) (e.g., example, `"symbol"`, or `"diverging"`).
      *
      * - For [continuous scales](https://vega.github.io/vega-lite/docs/scale.html#continuous), two-element array indicating  minimum and maximum values, or an array with more than two entries for specifying a [piecewise scale](https://vega.github.io/vega-lite/docs/scale.html#piecewise).
      *
      * - For [discrete](https://vega.github.io/vega-lite/docs/scale.html#discrete) and [discretizing](https://vega.github.io/vega-lite/docs/scale.html#discretizing) scales, an array of desired output values or an object with a `field` property representing the range values.  For example, if a field `color` contains CSS color names, we can set `range` to `{field: "color"}`.
      *
      * __Notes:__
      *
      * 1) For color scales you can also specify a color [`scheme`](https://vega.github.io/vega-lite/docs/scale.html#scheme) instead of `range`.
      *
      * 2) Any directly specified `range` for `x` and `y` channels will be ignored. Range can be customized via the view's corresponding [size](https://vega.github.io/vega-lite/docs/size.html) (`width` and `height`).
      */
    var range: js.UndefOr[RangeEnum | (js.Array[Double | String | js.Array[Double] | ES]) | FieldString] = js.native
    
    /**
      * Sets the maximum value in the scale range, overriding the `range` property or the default range. This property is only intended for use with scales having continuous ranges.
      */
    var rangeMax: js.UndefOr[Double | String | ES] = js.native
    
    /**
      * Sets the minimum value in the scale range, overriding the `range` property or the default range. This property is only intended for use with scales having continuous ranges.
      */
    var rangeMin: js.UndefOr[Double | String | ES] = js.native
    
    /**
      * If true, reverses the order of the scale range.
      * __Default value:__ `false`.
      */
    var reverse: js.UndefOr[Boolean | ES] = js.native
    
    /**
      * If `true`, rounds numeric output values to integers. This can be helpful for snapping to the pixel grid.
      *
      * __Default value:__ `false`.
      */
    var round: js.UndefOr[Boolean | ES] = js.native
    
    /**
      * A string indicating a color [scheme](https://vega.github.io/vega-lite/docs/scale.html#scheme) name (e.g., `"category10"` or `"blues"`) or a [scheme parameter object](https://vega.github.io/vega-lite/docs/scale.html#scheme-params).
      *
      * Discrete color schemes may be used with [discrete](https://vega.github.io/vega-lite/docs/scale.html#discrete) or [discretizing](https://vega.github.io/vega-lite/docs/scale.html#discretizing) scales. Continuous color schemes are intended for use with color scales.
      *
      * For the full list of supported schemes, please refer to the [Vega Scheme](https://vega.github.io/vega/docs/schemes/#reference) reference.
      */
    var scheme: js.UndefOr[String | SchemeParams | ES] = js.native
    
    /**
      * The type of scale. Vega-Lite supports the following categories of scale types:
      *
      * 1) [**Continuous Scales**](https://vega.github.io/vega-lite/docs/scale.html#continuous) -- mapping continuous domains to continuous output ranges ([`"linear"`](https://vega.github.io/vega-lite/docs/scale.html#linear), [`"pow"`](https://vega.github.io/vega-lite/docs/scale.html#pow), [`"sqrt"`](https://vega.github.io/vega-lite/docs/scale.html#sqrt), [`"symlog"`](https://vega.github.io/vega-lite/docs/scale.html#symlog), [`"log"`](https://vega.github.io/vega-lite/docs/scale.html#log), [`"time"`](https://vega.github.io/vega-lite/docs/scale.html#time), [`"utc"`](https://vega.github.io/vega-lite/docs/scale.html#utc).
      *
      * 2) [**Discrete Scales**](https://vega.github.io/vega-lite/docs/scale.html#discrete) -- mapping discrete domains to discrete ([`"ordinal"`](https://vega.github.io/vega-lite/docs/scale.html#ordinal)) or continuous ([`"band"`](https://vega.github.io/vega-lite/docs/scale.html#band) and [`"point"`](https://vega.github.io/vega-lite/docs/scale.html#point)) output ranges.
      *
      * 3) [**Discretizing Scales**](https://vega.github.io/vega-lite/docs/scale.html#discretizing) -- mapping continuous domains to discrete output ranges [`"bin-ordinal"`](https://vega.github.io/vega-lite/docs/scale.html#bin-ordinal), [`"quantile"`](https://vega.github.io/vega-lite/docs/scale.html#quantile), [`"quantize"`](https://vega.github.io/vega-lite/docs/scale.html#quantize) and [`"threshold"`](https://vega.github.io/vega-lite/docs/scale.html#threshold).
      *
      * __Default value:__ please see the [scale type table](https://vega.github.io/vega-lite/docs/scale.html#type).
      */
    var `type`: js.UndefOr[ScaleType] = js.native
    
    /**
      * If `true`, ensures that a zero baseline value is included in the scale domain.
      *
      * __Default value:__ `true` for x and y channels if the quantitative field is not binned and no custom `domain` is provided; `false` otherwise.
      *
      * __Note:__ Log, time, and utc scales do not support `zero`.
      */
    var zero: js.UndefOr[Boolean | ES] = js.native
  }
  object Scale {
    
    @scala.inline
    def apply[ES /* <: ExprRef | SignalRef */](): Scale[ES] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Scale[ES]]
    }
    
    @scala.inline
    implicit class ScaleMutableBuilder[Self <: Scale[_], ES /* <: ExprRef | SignalRef */] (val x: Self with Scale[ES]) extends AnyVal {
      
      @scala.inline
      def setAlign(value: Double | ES): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setBase(value: Double | ES): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setBins(value: ScaleBins): Self = StObject.set(x, "bins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinsUndefined: Self = StObject.set(x, "bins", js.undefined)
      
      @scala.inline
      def setBinsVarargs(value: (Double | SignalRef)*): Self = StObject.set(x, "bins", js.Array(value :_*))
      
      @scala.inline
      def setClamp(value: Boolean | ES): Self = StObject.set(x, "clamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClampUndefined: Self = StObject.set(x, "clamp", js.undefined)
      
      @scala.inline
      def setConstant(value: Double | ES): Self = StObject.set(x, "constant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstantUndefined: Self = StObject.set(x, "constant", js.undefined)
      
      @scala.inline
      def setDomain(
        value: (js.Array[Null | String | Double | Boolean | DateTime | ES]) | unaggregated | SelectionExtent | DomainUnionWith | ES
      ): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainMax(value: Double | DateTime | ES): Self = StObject.set(x, "domainMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainMaxUndefined: Self = StObject.set(x, "domainMax", js.undefined)
      
      @scala.inline
      def setDomainMid(value: Double | ES): Self = StObject.set(x, "domainMid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainMidUndefined: Self = StObject.set(x, "domainMid", js.undefined)
      
      @scala.inline
      def setDomainMin(value: Double | DateTime | ES): Self = StObject.set(x, "domainMin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainMinUndefined: Self = StObject.set(x, "domainMin", js.undefined)
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setDomainVarargs(value: (Null | String | Double | Boolean | DateTime | ES)*): Self = StObject.set(x, "domain", js.Array(value :_*))
      
      @scala.inline
      def setExponent(value: Double | ES): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExponentUndefined: Self = StObject.set(x, "exponent", js.undefined)
      
      @scala.inline
      def setInterpolate(value: ScaleInterpolateEnum | ES | ScaleInterpolateParams): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
      
      @scala.inline
      def setNice(value: Boolean | Double | TimeInterval | TimeIntervalStep | ES): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNiceUndefined: Self = StObject.set(x, "nice", js.undefined)
      
      @scala.inline
      def setPadding(value: Double | ES): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingInner(value: Double | ES): Self = StObject.set(x, "paddingInner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingInnerUndefined: Self = StObject.set(x, "paddingInner", js.undefined)
      
      @scala.inline
      def setPaddingOuter(value: Double | ES): Self = StObject.set(x, "paddingOuter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingOuterUndefined: Self = StObject.set(x, "paddingOuter", js.undefined)
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setRange(value: RangeEnum | (js.Array[Double | String | js.Array[Double] | ES]) | FieldString): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeMax(value: Double | String | ES): Self = StObject.set(x, "rangeMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeMaxUndefined: Self = StObject.set(x, "rangeMax", js.undefined)
      
      @scala.inline
      def setRangeMin(value: Double | String | ES): Self = StObject.set(x, "rangeMin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeMinUndefined: Self = StObject.set(x, "rangeMin", js.undefined)
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setRangeVarargs(value: (Double | String | js.Array[Double] | ES)*): Self = StObject.set(x, "range", js.Array(value :_*))
      
      @scala.inline
      def setReverse(value: Boolean | ES): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      @scala.inline
      def setRound(value: Boolean | ES): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      @scala.inline
      def setScheme(value: String | SchemeParams | ES): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
      
      @scala.inline
      def setType(value: ScaleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setZero(value: Boolean | ES): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
    }
  }
  
  @js.native
  trait ScaleConfig[ES /* <: ExprRef | SignalRef */] extends StObject {
    
    /**
      * Default inner padding for `x` and `y` band-ordinal scales.
      *
      * __Default value:__
      * - `barBandPaddingInner` for bar marks (`0.1` by default)
      * - `rectBandPaddingInner` for rect and other marks (`0` by default)
      *
      * @minimum 0
      * @maximum 1
      */
    var bandPaddingInner: js.UndefOr[Double | ES] = js.native
    
    /**
      * Default outer padding for `x` and `y` band-ordinal scales.
      *
      * __Default value:__ `paddingInner/2` (which makes _width/height = number of unique values * step_)
      *
      * @minimum 0
      * @maximum 1
      */
    var bandPaddingOuter: js.UndefOr[Double | ES] = js.native
    
    /**
      * Default inner padding for `x` and `y` band-ordinal scales of `"bar"` marks.
      *
      * __Default value:__ `0.1`
      *
      * @minimum 0
      * @maximum 1
      */
    var barBandPaddingInner: js.UndefOr[Double | ES] = js.native
    
    /**
      * If true, values that exceed the data domain are clamped to either the minimum or maximum range value
      */
    var clamp: js.UndefOr[Boolean | ES] = js.native
    
    /**
      * Default padding for continuous scales.
      *
      * __Default:__ `5` for continuous x-scale of a vertical bar and continuous y-scale of a horizontal bar.; `0` otherwise.
      *
      * @minimum 0
      */
    var continuousPadding: js.UndefOr[Double | ES] = js.native
    
    /**
      * The default max value for mapping quantitative fields to bar's size/bandSize.
      *
      * If undefined (default), we will use the axis's size (width or height) - 1.
      * @minimum 0
      */
    var maxBandSize: js.UndefOr[Double] = js.native
    
    /**
      * The default max value for mapping quantitative fields to text's size/fontSize.
      *
      * __Default value:__ `40`
      *
      * @minimum 0
      */
    var maxFontSize: js.UndefOr[Double] = js.native
    
    /**
      * Default max opacity for mapping a field to opacity.
      *
      * __Default value:__ `0.8`
      *
      * @minimum 0
      * @maximum 1
      */
    var maxOpacity: js.UndefOr[Double] = js.native
    
    /**
      * Default max value for point size scale.
      * @minimum 0
      */
    var maxSize: js.UndefOr[Double] = js.native
    
    /**
      * Default max strokeWidth for the scale of strokeWidth for rule and line marks and of size for trail marks.
      *
      * __Default value:__ `4`
      *
      * @minimum 0
      */
    var maxStrokeWidth: js.UndefOr[Double] = js.native
    
    /**
      * The default min value for mapping quantitative fields to bar and tick's size/bandSize scale with zero=false.
      *
      * __Default value:__ `2`
      *
      * @minimum 0
      */
    var minBandSize: js.UndefOr[Double] = js.native
    
    /**
      * The default min value for mapping quantitative fields to tick's size/fontSize scale with zero=false
      *
      * __Default value:__ `8`
      *
      * @minimum 0
      */
    var minFontSize: js.UndefOr[Double] = js.native
    
    /**
      * Default minimum opacity for mapping a field to opacity.
      *
      * __Default value:__ `0.3`
      *
      * @minimum 0
      * @maximum 1
      */
    var minOpacity: js.UndefOr[Double] = js.native
    
    /**
      * Default minimum value for point size scale with zero=false.
      *
      * __Default value:__ `9`
      *
      * @minimum 0
      */
    var minSize: js.UndefOr[Double] = js.native
    
    /**
      * Default minimum strokeWidth for the scale of strokeWidth for rule and line marks and of size for trail marks with zero=false.
      *
      * __Default value:__ `1`
      *
      * @minimum 0
      */
    var minStrokeWidth: js.UndefOr[Double] = js.native
    
    /**
      * Default outer padding for `x` and `y` point-ordinal scales.
      *
      * __Default value:__ `0.5` (which makes _width/height = number of unique values * step_)
      *
      * @minimum 0
      * @maximum 1
      */
    var pointPadding: js.UndefOr[Double | ES] = js.native
    
    /**
      * Default range cardinality for [`quantile`](https://vega.github.io/vega-lite/docs/scale.html#quantile) scale.
      *
      * __Default value:__ `4`
      *
      * @minimum 0
      */
    var quantileCount: js.UndefOr[Double] = js.native
    
    /**
      * Default range cardinality for [`quantize`](https://vega.github.io/vega-lite/docs/scale.html#quantize) scale.
      *
      * __Default value:__ `4`
      *
      * @minimum 0
      */
    var quantizeCount: js.UndefOr[Double] = js.native
    
    /**
      * Default inner padding for `x` and `y` band-ordinal scales of `"rect"` marks.
      *
      * __Default value:__ `0`
      *
      * @minimum 0
      * @maximum 1
      */
    var rectBandPaddingInner: js.UndefOr[Double | ES] = js.native
    
    /**
      * If true, rounds numeric output values to integers.
      * This can be helpful for snapping to the pixel grid.
      * (Only available for `x`, `y`, and `size` scales.)
      */
    var round: js.UndefOr[Boolean | ES] = js.native
    
    /**
      * Use the source data range before aggregation as scale domain instead of aggregated data for aggregate axis.
      *
      * This is equivalent to setting `domain` to `"unaggregate"` for aggregated _quantitative_ fields by default.
      *
      * This property only works with aggregate functions that produce values within the raw data domain (`"mean"`, `"average"`, `"median"`, `"q1"`, `"q3"`, `"min"`, `"max"`). For other aggregations that produce values outside of the raw data domain (e.g. `"count"`, `"sum"`), this property is ignored.
      *
      * __Default value:__ `false`
      */
    var useUnaggregatedDomain: js.UndefOr[Boolean] = js.native
    
    /**
      * Reverse x-scale by default (useful for right-to-left charts).
      */
    var xReverse: js.UndefOr[Boolean | ES] = js.native
  }
  object ScaleConfig {
    
    @scala.inline
    def apply[ES /* <: ExprRef | SignalRef */](): ScaleConfig[ES] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScaleConfig[ES]]
    }
    
    @scala.inline
    implicit class ScaleConfigMutableBuilder[Self <: ScaleConfig[_], ES /* <: ExprRef | SignalRef */] (val x: Self with ScaleConfig[ES]) extends AnyVal {
      
      @scala.inline
      def setBandPaddingInner(value: Double | ES): Self = StObject.set(x, "bandPaddingInner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBandPaddingInnerUndefined: Self = StObject.set(x, "bandPaddingInner", js.undefined)
      
      @scala.inline
      def setBandPaddingOuter(value: Double | ES): Self = StObject.set(x, "bandPaddingOuter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBandPaddingOuterUndefined: Self = StObject.set(x, "bandPaddingOuter", js.undefined)
      
      @scala.inline
      def setBarBandPaddingInner(value: Double | ES): Self = StObject.set(x, "barBandPaddingInner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarBandPaddingInnerUndefined: Self = StObject.set(x, "barBandPaddingInner", js.undefined)
      
      @scala.inline
      def setClamp(value: Boolean | ES): Self = StObject.set(x, "clamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClampUndefined: Self = StObject.set(x, "clamp", js.undefined)
      
      @scala.inline
      def setContinuousPadding(value: Double | ES): Self = StObject.set(x, "continuousPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContinuousPaddingUndefined: Self = StObject.set(x, "continuousPadding", js.undefined)
      
      @scala.inline
      def setMaxBandSize(value: Double): Self = StObject.set(x, "maxBandSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBandSizeUndefined: Self = StObject.set(x, "maxBandSize", js.undefined)
      
      @scala.inline
      def setMaxFontSize(value: Double): Self = StObject.set(x, "maxFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFontSizeUndefined: Self = StObject.set(x, "maxFontSize", js.undefined)
      
      @scala.inline
      def setMaxOpacity(value: Double): Self = StObject.set(x, "maxOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxOpacityUndefined: Self = StObject.set(x, "maxOpacity", js.undefined)
      
      @scala.inline
      def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      @scala.inline
      def setMaxStrokeWidth(value: Double): Self = StObject.set(x, "maxStrokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxStrokeWidthUndefined: Self = StObject.set(x, "maxStrokeWidth", js.undefined)
      
      @scala.inline
      def setMinBandSize(value: Double): Self = StObject.set(x, "minBandSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinBandSizeUndefined: Self = StObject.set(x, "minBandSize", js.undefined)
      
      @scala.inline
      def setMinFontSize(value: Double): Self = StObject.set(x, "minFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinFontSizeUndefined: Self = StObject.set(x, "minFontSize", js.undefined)
      
      @scala.inline
      def setMinOpacity(value: Double): Self = StObject.set(x, "minOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinOpacityUndefined: Self = StObject.set(x, "minOpacity", js.undefined)
      
      @scala.inline
      def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
      
      @scala.inline
      def setMinStrokeWidth(value: Double): Self = StObject.set(x, "minStrokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinStrokeWidthUndefined: Self = StObject.set(x, "minStrokeWidth", js.undefined)
      
      @scala.inline
      def setPointPadding(value: Double | ES): Self = StObject.set(x, "pointPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointPaddingUndefined: Self = StObject.set(x, "pointPadding", js.undefined)
      
      @scala.inline
      def setQuantileCount(value: Double): Self = StObject.set(x, "quantileCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantileCountUndefined: Self = StObject.set(x, "quantileCount", js.undefined)
      
      @scala.inline
      def setQuantizeCount(value: Double): Self = StObject.set(x, "quantizeCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantizeCountUndefined: Self = StObject.set(x, "quantizeCount", js.undefined)
      
      @scala.inline
      def setRectBandPaddingInner(value: Double | ES): Self = StObject.set(x, "rectBandPaddingInner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRectBandPaddingInnerUndefined: Self = StObject.set(x, "rectBandPaddingInner", js.undefined)
      
      @scala.inline
      def setRound(value: Boolean | ES): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      @scala.inline
      def setUseUnaggregatedDomain(value: Boolean): Self = StObject.set(x, "useUnaggregatedDomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseUnaggregatedDomainUndefined: Self = StObject.set(x, "useUnaggregatedDomain", js.undefined)
      
      @scala.inline
      def setXReverse(value: Boolean | ES): Self = StObject.set(x, "xReverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXReverseUndefined: Self = StObject.set(x, "xReverse", js.undefined)
    }
  }
  
  type Scheme = String | SchemeParams
  
  @js.native
  trait SchemeParams extends StObject {
    
    /**
      * The number of colors to use in the scheme. This can be useful for scale types such as `"quantize"`, which use the length of the scale range to determine the number of discrete bins for the scale domain.
      */
    var count: js.UndefOr[Double | SignalRef] = js.native
    
    /**
      * The extent of the color range to use. For example `[0.2, 1]` will rescale the color scheme such that color values in the range _[0, 0.2)_ are excluded from the scheme.
      */
    var extent: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.native
    
    /**
      * A color scheme name for ordinal scales (e.g., `"category10"` or `"blues"`).
      *
      * For the full list of supported schemes, please refer to the [Vega Scheme](https://vega.github.io/vega/docs/schemes/#reference) reference.
      */
    var name: String | SignalRef = js.native
  }
  object SchemeParams {
    
    @scala.inline
    def apply(name: String | SignalRef): SchemeParams = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemeParams]
    }
    
    @scala.inline
    implicit class SchemeParamsMutableBuilder[Self <: SchemeParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double | SignalRef): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setExtent(value: (js.Array[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      @scala.inline
      def setExtentVarargs(value: (Double | SignalRef)*): Self = StObject.set(x, "extent", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String | SignalRef): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type ValueOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  
  trait _Domain extends StObject
}
