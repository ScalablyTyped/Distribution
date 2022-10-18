package typings.vegaLite.buildSrcVegaDotschemaMod

import typings.vegaTypings.typesSpecScaleMod.RangeBand
import typings.vegaTypings.typesSpecScaleMod.RangeRawArray
import typings.vegaTypings.typesSpecScaleMod.RangeScheme
import typings.vegaTypings.typesSpecScaleMod.ScaleBins
import typings.vegaTypings.typesSpecScaleMod.ScaleData
import typings.vegaTypings.typesSpecScaleMod.ScaleInterpolate
import typings.vegaTypings.typesSpecScaleMod.ScaleType
import typings.vegaTypings.typesSpecScaleMod.TimeInterval
import typings.vegaTypings.typesSpecScaleMod.TimeIntervalStep
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<vega.vega.BaseScale, 'type'> & {  range :vega.vega.RangeScheme | vega.vega.RangeBand | vega.vega.ScaleData | undefined,   nice :boolean | number | vega.vega.TimeInterval | vega.vega.TimeIntervalStep | vega.vega.SignalRef | undefined,   zero :boolean | vega.vega.SignalRef | undefined} & std.Omit<std.Omit<vega.vega.LinearScale, 'type'> & std.Omit<vega.vega.LogScale, 'type'> & std.Omit<vega.vega.SymLogScale, 'type'> & std.Omit<std.Partial<vega.vega.PowScale>, 'type'> & // use partial so exponent is not required
std.Omit<vega.vega.SqrtScale, 'type'> & std.Omit<vega.vega.IdentityScale, 'type'> & std.Omit<vega.vega.TimeScale, 'type'> & std.Omit<vega.vega.QuantileScale, 'type'> & std.Omit<vega.vega.QuantizeScale, 'type'> & std.Omit<vega.vega.ThresholdScale, 'type'> & std.Omit<vega.vega.BinOrdinalScale, 'type'> & std.Omit<vega.vega.SequentialScale, 'type'> & std.Omit<vega.vega.BandScale, 'type'> & std.Omit<vega.vega.PointScale, 'type'> & std.Omit<vega.vega.OrdinalScale, 'type'>, 'range' | 'nice' | 'zero'> */
trait VgScale extends StObject {
  
  var align: js.UndefOr[Double | SignalRef] = js.undefined
  
  var base: js.UndefOr[Double | SignalRef] = js.undefined
  
  var bins: js.UndefOr[ScaleBins] = js.undefined
  
  var clamp: js.UndefOr[Boolean | SignalRef] = js.undefined
  
  var constant: js.UndefOr[Double | SignalRef] = js.undefined
  
  var domain: js.UndefOr[(js.Array[Null | String | Double | Boolean | SignalRef]) | ScaleData | SignalRef] = js.undefined
  
  var domainImplicit: js.UndefOr[Boolean | SignalRef] = js.undefined
  
  var domainMax: js.UndefOr[Double | SignalRef] = js.undefined
  
  var domainMid: js.UndefOr[Double | SignalRef] = js.undefined
  
  var domainMin: js.UndefOr[Double | SignalRef] = js.undefined
  
  var domainRaw: js.UndefOr[Null | js.Array[Any] | SignalRef] = js.undefined
  
  var exponent: js.UndefOr[Double | SignalRef] = js.undefined
  
  var interpolate: js.UndefOr[ScaleInterpolate] = js.undefined
  
  var name: String
  
  var nice: js.UndefOr[Boolean | Double | TimeInterval | TimeIntervalStep | SignalRef] = js.undefined
  
  var padding: js.UndefOr[Double | SignalRef] = js.undefined
  
  var paddingInner: js.UndefOr[Double | SignalRef] = js.undefined
  
  var paddingOuter: js.UndefOr[Double | SignalRef] = js.undefined
  
  var range: js.UndefOr[RangeScheme | RangeBand | ScaleData] = js.undefined
  
  var reverse: js.UndefOr[Boolean | SignalRef] = js.undefined
  
  var round: js.UndefOr[Boolean | SignalRef] = js.undefined
  
  var `type`: js.UndefOr[ScaleType] = js.undefined
  
  var zero: js.UndefOr[Boolean | SignalRef] = js.undefined
}
object VgScale {
  
  inline def apply(name: String): VgScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[VgScale]
  }
  
  extension [Self <: VgScale](x: Self) {
    
    inline def setAlign(value: Double | SignalRef): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setBase(value: Double | SignalRef): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    inline def setBins(value: ScaleBins): Self = StObject.set(x, "bins", value.asInstanceOf[js.Any])
    
    inline def setBinsUndefined: Self = StObject.set(x, "bins", js.undefined)
    
    inline def setBinsVarargs(value: (Double | SignalRef)*): Self = StObject.set(x, "bins", js.Array(value*))
    
    inline def setClamp(value: Boolean | SignalRef): Self = StObject.set(x, "clamp", value.asInstanceOf[js.Any])
    
    inline def setClampUndefined: Self = StObject.set(x, "clamp", js.undefined)
    
    inline def setConstant(value: Double | SignalRef): Self = StObject.set(x, "constant", value.asInstanceOf[js.Any])
    
    inline def setConstantUndefined: Self = StObject.set(x, "constant", js.undefined)
    
    inline def setDomain(value: (js.Array[Null | String | Double | Boolean | SignalRef]) | ScaleData | SignalRef): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainImplicit(value: Boolean | SignalRef): Self = StObject.set(x, "domainImplicit", value.asInstanceOf[js.Any])
    
    inline def setDomainImplicitUndefined: Self = StObject.set(x, "domainImplicit", js.undefined)
    
    inline def setDomainMax(value: Double | SignalRef): Self = StObject.set(x, "domainMax", value.asInstanceOf[js.Any])
    
    inline def setDomainMaxUndefined: Self = StObject.set(x, "domainMax", js.undefined)
    
    inline def setDomainMid(value: Double | SignalRef): Self = StObject.set(x, "domainMid", value.asInstanceOf[js.Any])
    
    inline def setDomainMidUndefined: Self = StObject.set(x, "domainMid", js.undefined)
    
    inline def setDomainMin(value: Double | SignalRef): Self = StObject.set(x, "domainMin", value.asInstanceOf[js.Any])
    
    inline def setDomainMinUndefined: Self = StObject.set(x, "domainMin", js.undefined)
    
    inline def setDomainRaw(value: js.Array[Any] | SignalRef): Self = StObject.set(x, "domainRaw", value.asInstanceOf[js.Any])
    
    inline def setDomainRawNull: Self = StObject.set(x, "domainRaw", null)
    
    inline def setDomainRawUndefined: Self = StObject.set(x, "domainRaw", js.undefined)
    
    inline def setDomainRawVarargs(value: Any*): Self = StObject.set(x, "domainRaw", js.Array(value*))
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setDomainVarargs(value: (Null | String | Double | Boolean | SignalRef)*): Self = StObject.set(x, "domain", js.Array(value*))
    
    inline def setExponent(value: Double | SignalRef): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
    
    inline def setExponentUndefined: Self = StObject.set(x, "exponent", js.undefined)
    
    inline def setInterpolate(value: ScaleInterpolate): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
    
    inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNice(value: Boolean | Double | TimeInterval | TimeIntervalStep | SignalRef): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
    
    inline def setNiceUndefined: Self = StObject.set(x, "nice", js.undefined)
    
    inline def setPadding(value: Double | SignalRef): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingInner(value: Double | SignalRef): Self = StObject.set(x, "paddingInner", value.asInstanceOf[js.Any])
    
    inline def setPaddingInnerUndefined: Self = StObject.set(x, "paddingInner", js.undefined)
    
    inline def setPaddingOuter(value: Double | SignalRef): Self = StObject.set(x, "paddingOuter", value.asInstanceOf[js.Any])
    
    inline def setPaddingOuterUndefined: Self = StObject.set(x, "paddingOuter", js.undefined)
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setRange(value: RangeScheme | RangeBand | ScaleData): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRangeVarargs(value: (Boolean | Double | Null | RangeRawArray | SignalRef | String)*): Self = StObject.set(x, "range", js.Array(value*))
    
    inline def setReverse(value: Boolean | SignalRef): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setRound(value: Boolean | SignalRef): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    
    inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
    
    inline def setType(value: ScaleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setZero(value: Boolean | SignalRef): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
    
    inline def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
  }
}
