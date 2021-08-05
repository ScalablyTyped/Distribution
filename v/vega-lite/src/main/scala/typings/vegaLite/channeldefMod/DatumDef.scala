package typings.vegaLite.channeldefMod

import typings.vegaLite.datetimeMod.DateTime
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.srcTypeMod.Type
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<vega-lite.vega-lite/build/src/channeldef.TypeMixins<vega-lite.vega-lite/build/src/type.Type>> */
/* Inlined parent vega-lite.vega-lite/build/src/channeldef.BandMixins */
trait DatumDef[F /* <: Field */, V /* <: PrimitiveValue | DateTime | ExprRef | SignalRef */] extends StObject {
  
  /**
    * For rect-based marks (`rect`, `bar`, and `image`), mark size relative to bandwidth of [band scales](https://vega.github.io/vega-lite/docs/scale.html#band), bins or time units. If set to `1`, the mark size is set to the bandwidth, the bin interval, or the time unit interval. If set to `0.5`, the mark size is half of the bandwidth or the time unit interval.
    *
    * For other marks, relative position on a band of a stacked, binned, time unit or band scale. If set to `0`, the marks will be positioned at the beginning of the band. If set to `0.5`, the marks will be positioned in the middle of the band.
    *
    * @minimum 0
    * @maximum 1
    */
  var band: js.UndefOr[Double] = js.undefined
  
  /**
    * A constant value in data domain.
    */
  var datum: js.UndefOr[V | RepeatRef] = js.undefined
  
  var `type`: js.UndefOr[Type] = js.undefined
}
object DatumDef {
  
  inline def apply[F /* <: Field */, V /* <: PrimitiveValue | DateTime | ExprRef | SignalRef */](): DatumDef[F, V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatumDef[F, V]]
  }
  
  extension [Self <: DatumDef[?, ?], F /* <: Field */, V /* <: PrimitiveValue | DateTime | ExprRef | SignalRef */](x: Self & (DatumDef[F, V])) {
    
    inline def setBand(value: Double): Self = StObject.set(x, "band", value.asInstanceOf[js.Any])
    
    inline def setBandUndefined: Self = StObject.set(x, "band", js.undefined)
    
    inline def setDatum(value: V | RepeatRef): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
    
    inline def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
