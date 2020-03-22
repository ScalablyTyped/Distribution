package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsBooleans.`false`
import typings.vegaTypings.vegaTypingsStrings.`bin-ordinal`
import typings.vegaTypings.vegaTypingsStrings.band
import typings.vegaTypings.vegaTypingsStrings.identity
import typings.vegaTypings.vegaTypingsStrings.linear
import typings.vegaTypings.vegaTypingsStrings.log
import typings.vegaTypings.vegaTypingsStrings.ordinal
import typings.vegaTypings.vegaTypingsStrings.point
import typings.vegaTypings.vegaTypingsStrings.pow
import typings.vegaTypings.vegaTypingsStrings.quantile
import typings.vegaTypings.vegaTypingsStrings.quantize
import typings.vegaTypings.vegaTypingsStrings.sequential
import typings.vegaTypings.vegaTypingsStrings.sqrt
import typings.vegaTypings.vegaTypingsStrings.symlog
import typings.vegaTypings.vegaTypingsStrings.threshold
import typings.vegaTypings.vegaTypingsStrings.time
import typings.vegaTypings.vegaTypingsStrings.utc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.scaleMod.OrdinalScale
  - typings.vegaTypings.scaleMod.BandScale
  - typings.vegaTypings.scaleMod.PointScale
  - typings.vegaTypings.scaleMod.SequentialScale
  - typings.vegaTypings.scaleMod.TimeScale
  - typings.vegaTypings.scaleMod.IdentityScale
  - typings.vegaTypings.scaleMod.LinearScale
  - typings.vegaTypings.scaleMod.LogScale
  - typings.vegaTypings.scaleMod.SymLogScale
  - typings.vegaTypings.scaleMod.PowScale
  - typings.vegaTypings.scaleMod.SqrtScale
  - typings.vegaTypings.scaleMod.QuantileScale
  - typings.vegaTypings.scaleMod.QuantizeScale
  - typings.vegaTypings.scaleMod.ThresholdScale
  - typings.vegaTypings.scaleMod.BinOrdinalScale
*/
trait Scale extends js.Object

object Scale {
  @scala.inline
  def PowScale(
    exponent: Double | SignalRef,
    name: String,
    `type`: pow,
    bins: ScaleBins = null,
    clamp: Boolean | SignalRef = null,
    domain: (js.Array[Null | String | Double | Boolean | SignalRef]) | ScaleData | SignalRef = null,
    domainMax: Double | SignalRef = null,
    domainMid: Double | SignalRef = null,
    domainMin: Double | SignalRef = null,
    domainRaw: js.Array[_] | SignalRef = null,
    interpolate: ScaleInterpolate = null,
    nice: Boolean | Double | SignalRef = null,
    padding: Double | SignalRef = null,
    range: RangeScheme = null,
    reverse: Boolean | SignalRef = null,
    round: Boolean | SignalRef = null,
    zero: Boolean | SignalRef = null
  ): Scale = {
    val __obj = js.Dynamic.literal(exponent = exponent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bins != null) __obj.updateDynamic("bins")(bins.asInstanceOf[js.Any])
    if (clamp != null) __obj.updateDynamic("clamp")(clamp.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (domainMax != null) __obj.updateDynamic("domainMax")(domainMax.asInstanceOf[js.Any])
    if (domainMid != null) __obj.updateDynamic("domainMid")(domainMid.asInstanceOf[js.Any])
    if (domainMin != null) __obj.updateDynamic("domainMin")(domainMin.asInstanceOf[js.Any])
    if (domainRaw != null) __obj.updateDynamic("domainRaw")(domainRaw.asInstanceOf[js.Any])
    if (interpolate != null) __obj.updateDynamic("interpolate")(interpolate.asInstanceOf[js.Any])
    if (nice != null) __obj.updateDynamic("nice")(nice.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (reverse != null) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (zero != null) __obj.updateDynamic("zero")(zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def PointScale(
    name: String,
    `type`: point,
    align: Double | SignalRef = null,
    domain: (js.Array[Null | String | Double | Boolean | SignalRef]) | ScaleData | SignalRef = null,
    domainMax: Double | SignalRef = null,
    domainMid: Double | SignalRef = null,
    domainMin: Double | SignalRef = null,
    domainRaw: js.Array[_] | SignalRef = null,
    padding: Double | SignalRef = null,
    paddingOuter: Double | SignalRef = null,
    range: RangeBand = null,
    reverse: Boolean | SignalRef = null,
    round: Boolean | SignalRef = null
  ): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (domainMax != null) __obj.updateDynamic("domainMax")(domainMax.asInstanceOf[js.Any])
    if (domainMid != null) __obj.updateDynamic("domainMid")(domainMid.asInstanceOf[js.Any])
    if (domainMin != null) __obj.updateDynamic("domainMin")(domainMin.asInstanceOf[js.Any])
    if (domainRaw != null) __obj.updateDynamic("domainRaw")(domainRaw.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingOuter != null) __obj.updateDynamic("paddingOuter")(paddingOuter.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (reverse != null) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def LinearScale(
    name: String,
    bins: ScaleBins = null,
    clamp: Boolean | SignalRef = null,
    domain: (js.Array[Null | String | Double | Boolean | SignalRef]) | ScaleData | SignalRef = null,
    domainMax: Double | SignalRef = null,
    domainMid: Double | SignalRef = null,
    domainMin: Double | SignalRef = null,
    domainRaw: js.Array[_] | SignalRef = null,
    interpolate: ScaleInterpolate = null,
    nice: Boolean | Double | SignalRef = null,
    padding: Double | SignalRef = null,
    range: RangeScheme = null,
    reverse: Boolean | SignalRef = null,
    round: Boolean | SignalRef = null,
    `type`: linear = null,
    zero: Boolean | SignalRef = null
  ): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (bins != null) __obj.updateDynamic("bins")(bins.asInstanceOf[js.Any])
    if (clamp != null) __obj.updateDynamic("clamp")(clamp.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (domainMax != null) __obj.updateDynamic("domainMax")(domainMax.asInstanceOf[js.Any])
    if (domainMid != null) __obj.updateDynamic("domainMid")(domainMid.asInstanceOf[js.Any])
    if (domainMin != null) __obj.updateDynamic("domainMin")(domainMin.asInstanceOf[js.Any])
    if (domainRaw != null) __obj.updateDynamic("domainRaw")(domainRaw.asInstanceOf[js.Any])
    if (interpolate != null) __obj.updateDynamic("interpolate")(interpolate.asInstanceOf[js.Any])
    if (nice != null) __obj.updateDynamic("nice")(nice.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (reverse != null) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (zero != null) __obj.updateDynamic("zero")(zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def SqrtScale(
    name: String,
    `type`: sqrt,
    bins: ScaleBins = null,
    clamp: Boolean | SignalRef = null,
    domain: (js.Array[Null | String | Double | Boolean | SignalRef]) | ScaleData | SignalRef = null,
    domainMax: Double | SignalRef = null,
    domainMid: Double | SignalRef = null,
    domainMin: Double | SignalRef = null,
    domainRaw: js.Array[_] | SignalRef = null,
    interpolate: ScaleInterpolate = null,
    nice: Boolean | Double | SignalRef = null,
    padding: Double | SignalRef = null,
    range: RangeScheme = null,
    reverse: Boolean | SignalRef = null,
    round: Boolean | SignalRef = null,
    zero: Boolean | SignalRef = null
  ): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bins != null) __obj.updateDynamic("bins")(bins.asInstanceOf[js.Any])
    if (clamp != null) __obj.updateDynamic("clamp")(clamp.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (domainMax != null) __obj.updateDynamic("domainMax")(domainMax.asInstanceOf[js.Any])
    if (domainMid != null) __obj.updateDynamic("domainMid")(domainMid.asInstanceOf[js.Any])
    if (domainMin != null) __obj.updateDynamic("domainMin")(domainMin.asInstanceOf[js.Any])
    if (domainRaw != null) __obj.updateDynamic("domainRaw")(domainRaw.asInstanceOf[js.Any])
    if (interpolate != null) __obj.updateDynamic("interpolate")(interpolate.asInstanceOf[js.Any])
    if (nice != null) __obj.updateDynamic("nice")(nice.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (reverse != null) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (zero != null) __obj.updateDynamic("zero")(zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def SymLogScale(
    name: String,
    `type`: symlog,
    bins: ScaleBins = null,
    clamp: Boolean | SignalRef = null,
    constant: Double | SignalRef = null,
    domain: (js.Array[Null | String | Double | Boolean | SignalRef]) | ScaleData | SignalRef = null,
    domainMax: Double | SignalRef = null,
    domainMid: Double | SignalRef = null,
    domainMin: Double | SignalRef = null,
    domainRaw: js.Array[_] | SignalRef = null,
    interpolate: ScaleInterpolate = null,
    nice: Boolean | Double | SignalRef = null,
    padding: Double | SignalRef = null,
    range: RangeScheme = null,
    reverse: Boolean | SignalRef = null,
    round: Boolean | SignalRef = null,
    zero: Boolean | SignalRef = null
  ): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bins != null) __obj.updateDynamic("bins")(bins.asInstanceOf[js.Any])
    if (clamp != null) __obj.updateDynamic("clamp")(clamp.asInstanceOf[js.Any])
    if (constant != null) __obj.updateDynamic("constant")(constant.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (domainMax != null) __obj.updateDynamic("domainMax")(domainMax.asInstanceOf[js.Any])
    if (domainMid != null) __obj.updateDynamic("domainMid")(domainMid.asInstanceOf[js.Any])
    if (domainMin != null) __obj.updateDynamic("domainMin")(domainMin.asInstanceOf[js.Any])
    if (domainRaw != null) __obj.updateDynamic("domainRaw")(domainRaw.asInstanceOf[js.Any])
    if (interpolate != null) __obj.updateDynamic("interpolate")(interpolate.asInstanceOf[js.Any])
    if (nice != null) __obj.updateDynamic("nice")(nice.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (reverse != null) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (zero != null) __obj.updateDynamic("zero")(zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def TimeScale(
    name: String,
    `type`: time | utc,
    bins: ScaleBins = null,
    clamp: Boolean | SignalRef = null,
    domain: (js.Array[Null | String | Double | Boolean | SignalRef]) | ScaleData | SignalRef = null,
    domainMax: Double | SignalRef = null,
    domainMid: Double | SignalRef = null,
    domainMin: Double | SignalRef = null,
    domainRaw: js.Array[_] | SignalRef = null,
    interpolate: ScaleInterpolate = null,
    nice: Boolean | TimeInterval | TimeIntervalStep | SignalRef = null,
    padding: Double | SignalRef = null,
    range: RangeScheme = null,
    reverse: Boolean | SignalRef = null,
    round: Boolean | SignalRef = null
  ): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bins != null) __obj.updateDynamic("bins")(bins.asInstanceOf[js.Any])
    if (clamp != null) __obj.updateDynamic("clamp")(clamp.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (domainMax != null) __obj.updateDynamic("domainMax")(domainMax.asInstanceOf[js.Any])
    if (domainMid != null) __obj.updateDynamic("domainMid")(domainMid.asInstanceOf[js.Any])
    if (domainMin != null) __obj.updateDynamic("domainMin")(domainMin.asInstanceOf[js.Any])
    if (domainRaw != null) __obj.updateDynamic("domainRaw")(domainRaw.asInstanceOf[js.Any])
    if (interpolate != null) __obj.updateDynamic("interpolate")(interpolate.asInstanceOf[js.Any])
    if (nice != null) __obj.updateDynamic("nice")(nice.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (reverse != null) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def QuantizeScale(
    name: String,
    domain: (js.Array[Null | String | Double | Boolean | SignalRef]) | ScaleData | SignalRef = null,
    domainMax: Double | SignalRef = null,
    domainMid: Double | SignalRef = null,
    domainMin: Double | SignalRef = null,
    domainRaw: js.Array[_] | SignalRef = null,
    nice: Boolean | Double | SignalRef = null,
    padding: Double | SignalRef = null,
    range: RangeScheme = null,
    reverse: Boolean | SignalRef = null,
    round: Boolean | SignalRef = null,
    `type`: quantize = null,
    zero: Boolean | SignalRef = null
  ): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (domainMax != null) __obj.updateDynamic("domainMax")(domainMax.asInstanceOf[js.Any])
    if (domainMid != null) __obj.updateDynamic("domainMid")(domainMid.asInstanceOf[js.Any])
    if (domainMin != null) __obj.updateDynamic("domainMin")(domainMin.asInstanceOf[js.Any])
    if (domainRaw != null) __obj.updateDynamic("domainRaw")(domainRaw.asInstanceOf[js.Any])
    if (nice != null) __obj.updateDynamic("nice")(nice.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (reverse != null) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (zero != null) __obj.updateDynamic("zero")(zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def BandScale(
    name: String,
    `type`: band,
    align: Double | SignalRef = null,
    domain: (js.Array[Null | String | Double | Boolean | SignalRef]) | ScaleData | SignalRef = null,
    domainMax: Double | SignalRef = null,
    domainMid: Double | SignalRef = null,
    domainMin: Double | SignalRef = null,
    domainRaw: js.Array[_] | SignalRef = null,
    padding: Double | SignalRef = null,
    paddingInner: Double | SignalRef = null,
    paddingOuter: Double | SignalRef = null,
    range: RangeBand = null,
    reverse: Boolean | SignalRef = null,
    round: Boolean | SignalRef = null
  ): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (domainMax != null) __obj.updateDynamic("domainMax")(domainMax.asInstanceOf[js.Any])
    if (domainMid != null) __obj.updateDynamic("domainMid")(domainMid.asInstanceOf[js.Any])
    if (domainMin != null) __obj.updateDynamic("domainMin")(domainMin.asInstanceOf[js.Any])
    if (domainRaw != null) __obj.updateDynamic("domainRaw")(domainRaw.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingInner != null) __obj.updateDynamic("paddingInner")(paddingInner.asInstanceOf[js.Any])
    if (paddingOuter != null) __obj.updateDynamic("paddingOuter")(paddingOuter.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (reverse != null) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def BinOrdinalScale(
    name: String,
    `type`: `bin-ordinal`,
    bins: ScaleBins = null,
    domain: (js.Array[Null | String | Double | Boolean | SignalRef]) | ScaleData | SignalRef = null,
    domainMax: Double | SignalRef = null,
    domainMid: Double | SignalRef = null,
    domainMin: Double | SignalRef = null,
    domainRaw: js.Array[_] | SignalRef = null,
    interpolate: ScaleInterpolate = null,
    range: RangeScheme | ScaleData = null,
    reverse: Boolean | SignalRef = null,
    round: Boolean | SignalRef = null
  ): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bins != null) __obj.updateDynamic("bins")(bins.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (domainMax != null) __obj.updateDynamic("domainMax")(domainMax.asInstanceOf[js.Any])
    if (domainMid != null) __obj.updateDynamic("domainMid")(domainMid.asInstanceOf[js.Any])
    if (domainMin != null) __obj.updateDynamic("domainMin")(domainMin.asInstanceOf[js.Any])
    if (domainRaw != null) __obj.updateDynamic("domainRaw")(domainRaw.asInstanceOf[js.Any])
    if (interpolate != null) __obj.updateDynamic("interpolate")(interpolate.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (reverse != null) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def QuantileScale(
    name: String,
    domain: (js.Array[Null | String | Double | Boolean | SignalRef]) | ScaleData | SignalRef = null,
    domainMax: Double | SignalRef = null,
    domainMid: Double | SignalRef = null,
    domainMin: Double | SignalRef = null,
    domainRaw: js.Array[_] | SignalRef = null,
    interpolate: ScaleInterpolate = null,
    range: RangeScheme = null,
    reverse: Boolean | SignalRef = null,
    round: Boolean | SignalRef = null,
    `type`: quantile = null
  ): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (domainMax != null) __obj.updateDynamic("domainMax")(domainMax.asInstanceOf[js.Any])
    if (domainMid != null) __obj.updateDynamic("domainMid")(domainMid.asInstanceOf[js.Any])
    if (domainMin != null) __obj.updateDynamic("domainMin")(domainMin.asInstanceOf[js.Any])
    if (domainRaw != null) __obj.updateDynamic("domainRaw")(domainRaw.asInstanceOf[js.Any])
    if (interpolate != null) __obj.updateDynamic("interpolate")(interpolate.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (reverse != null) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def OrdinalScale(
    name: String,
    `type`: ordinal,
    domain: (js.Array[Null | String | Double | Boolean | SignalRef]) | ScaleData | SignalRef = null,
    domainImplicit: Boolean | SignalRef = null,
    domainMax: Double | SignalRef = null,
    domainMid: Double | SignalRef = null,
    domainMin: Double | SignalRef = null,
    domainRaw: js.Array[_] | SignalRef = null,
    interpolate: ScaleInterpolate = null,
    range: RangeScheme | ScaleData = null,
    reverse: Boolean | SignalRef = null,
    round: Boolean | SignalRef = null
  ): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (domainImplicit != null) __obj.updateDynamic("domainImplicit")(domainImplicit.asInstanceOf[js.Any])
    if (domainMax != null) __obj.updateDynamic("domainMax")(domainMax.asInstanceOf[js.Any])
    if (domainMid != null) __obj.updateDynamic("domainMid")(domainMid.asInstanceOf[js.Any])
    if (domainMin != null) __obj.updateDynamic("domainMin")(domainMin.asInstanceOf[js.Any])
    if (domainRaw != null) __obj.updateDynamic("domainRaw")(domainRaw.asInstanceOf[js.Any])
    if (interpolate != null) __obj.updateDynamic("interpolate")(interpolate.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (reverse != null) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def LogScale(
    name: String,
    `type`: log,
    base: Double | SignalRef = null,
    bins: ScaleBins = null,
    clamp: Boolean | SignalRef = null,
    domain: (js.Array[Null | String | Double | Boolean | SignalRef]) | ScaleData | SignalRef = null,
    domainMax: Double | SignalRef = null,
    domainMid: Double | SignalRef = null,
    domainMin: Double | SignalRef = null,
    domainRaw: js.Array[_] | SignalRef = null,
    interpolate: ScaleInterpolate = null,
    nice: Boolean | Double | SignalRef = null,
    padding: Double | SignalRef = null,
    range: RangeScheme = null,
    reverse: Boolean | SignalRef = null,
    round: Boolean | SignalRef = null,
    zero: `false` = null
  ): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (bins != null) __obj.updateDynamic("bins")(bins.asInstanceOf[js.Any])
    if (clamp != null) __obj.updateDynamic("clamp")(clamp.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (domainMax != null) __obj.updateDynamic("domainMax")(domainMax.asInstanceOf[js.Any])
    if (domainMid != null) __obj.updateDynamic("domainMid")(domainMid.asInstanceOf[js.Any])
    if (domainMin != null) __obj.updateDynamic("domainMin")(domainMin.asInstanceOf[js.Any])
    if (domainRaw != null) __obj.updateDynamic("domainRaw")(domainRaw.asInstanceOf[js.Any])
    if (interpolate != null) __obj.updateDynamic("interpolate")(interpolate.asInstanceOf[js.Any])
    if (nice != null) __obj.updateDynamic("nice")(nice.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (reverse != null) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (zero != null) __obj.updateDynamic("zero")(zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def SequentialScale(
    name: String,
    `type`: sequential,
    bins: ScaleBins = null,
    clamp: Boolean | SignalRef = null,
    domain: (js.Array[Null | String | Double | Boolean | SignalRef]) | ScaleData | SignalRef = null,
    domainMax: Double | SignalRef = null,
    domainMid: Double | SignalRef = null,
    domainMin: Double | SignalRef = null,
    domainRaw: js.Array[_] | SignalRef = null,
    interpolate: ScaleInterpolate = null,
    nice: Boolean | Double | SignalRef = null,
    padding: Double | SignalRef = null,
    range: RangeScheme = null,
    reverse: Boolean | SignalRef = null,
    round: Boolean | SignalRef = null,
    zero: Boolean | SignalRef = null
  ): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bins != null) __obj.updateDynamic("bins")(bins.asInstanceOf[js.Any])
    if (clamp != null) __obj.updateDynamic("clamp")(clamp.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (domainMax != null) __obj.updateDynamic("domainMax")(domainMax.asInstanceOf[js.Any])
    if (domainMid != null) __obj.updateDynamic("domainMid")(domainMid.asInstanceOf[js.Any])
    if (domainMin != null) __obj.updateDynamic("domainMin")(domainMin.asInstanceOf[js.Any])
    if (domainRaw != null) __obj.updateDynamic("domainRaw")(domainRaw.asInstanceOf[js.Any])
    if (interpolate != null) __obj.updateDynamic("interpolate")(interpolate.asInstanceOf[js.Any])
    if (nice != null) __obj.updateDynamic("nice")(nice.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (reverse != null) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (zero != null) __obj.updateDynamic("zero")(zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def IdentityScale(
    name: String,
    `type`: identity,
    domain: (js.Array[Null | String | Double | Boolean | SignalRef]) | ScaleData | SignalRef = null,
    domainMax: Double | SignalRef = null,
    domainMid: Double | SignalRef = null,
    domainMin: Double | SignalRef = null,
    domainRaw: js.Array[_] | SignalRef = null,
    nice: Boolean | SignalRef = null,
    reverse: Boolean | SignalRef = null,
    round: Boolean | SignalRef = null
  ): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (domainMax != null) __obj.updateDynamic("domainMax")(domainMax.asInstanceOf[js.Any])
    if (domainMid != null) __obj.updateDynamic("domainMid")(domainMid.asInstanceOf[js.Any])
    if (domainMin != null) __obj.updateDynamic("domainMin")(domainMin.asInstanceOf[js.Any])
    if (domainRaw != null) __obj.updateDynamic("domainRaw")(domainRaw.asInstanceOf[js.Any])
    if (nice != null) __obj.updateDynamic("nice")(nice.asInstanceOf[js.Any])
    if (reverse != null) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def ThresholdScale(
    name: String,
    domain: (js.Array[Null | String | Double | Boolean | SignalRef]) | ScaleData | SignalRef = null,
    domainMax: Double | SignalRef = null,
    domainMid: Double | SignalRef = null,
    domainMin: Double | SignalRef = null,
    domainRaw: js.Array[_] | SignalRef = null,
    nice: Boolean | Double | SignalRef = null,
    padding: Double | SignalRef = null,
    range: RangeScheme = null,
    reverse: Boolean | SignalRef = null,
    round: Boolean | SignalRef = null,
    `type`: threshold = null,
    zero: Boolean | SignalRef = null
  ): Scale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (domainMax != null) __obj.updateDynamic("domainMax")(domainMax.asInstanceOf[js.Any])
    if (domainMid != null) __obj.updateDynamic("domainMid")(domainMid.asInstanceOf[js.Any])
    if (domainMin != null) __obj.updateDynamic("domainMin")(domainMin.asInstanceOf[js.Any])
    if (domainRaw != null) __obj.updateDynamic("domainRaw")(domainRaw.asInstanceOf[js.Any])
    if (nice != null) __obj.updateDynamic("nice")(nice.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (reverse != null) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (zero != null) __obj.updateDynamic("zero")(zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
}

