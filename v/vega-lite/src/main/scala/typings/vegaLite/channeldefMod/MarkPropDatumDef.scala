package typings.vegaLite.channeldefMod

import typings.vegaLite.datetimeMod.DateTime
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.legendMod.Legend
import typings.vegaLite.scaleMod.Scale
import typings.vegaLite.srcTypeMod.Type
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vega-lite.vega-lite/build/src/channeldef.LegendMixins & vega-lite.vega-lite/build/src/channeldef.ScaleDatumDef<F> */
trait MarkPropDatumDef[F /* <: Field */] extends StObject {
  
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
  var datum: js.UndefOr[PrimitiveValue | DateTime | ExprRef | SignalRef | RepeatRef] = js.undefined
  
  /**
    * An object defining properties of the legend.
    * If `null`, the legend for the encoding channel will be removed.
    *
    * __Default value:__ If undefined, default [legend properties](https://vega.github.io/vega-lite/docs/legend.html) are applied.
    *
    * __See also:__ [`legend`](https://vega.github.io/vega-lite/docs/legend.html) documentation.
    */
  var legend: js.UndefOr[(Legend[ExprRef | SignalRef]) | Null] = js.undefined
  
  /**
    * An object defining properties of the channel's scale, which is the function that transforms values in the data domain (numbers, dates, strings, etc) to visual values (pixels, colors, sizes) of the encoding channels.
    *
    * If `null`, the scale will be [disabled and the data value will be directly encoded](https://vega.github.io/vega-lite/docs/scale.html#disable).
    *
    * __Default value:__ If undefined, default [scale properties](https://vega.github.io/vega-lite/docs/scale.html) are applied.
    *
    * __See also:__ [`scale`](https://vega.github.io/vega-lite/docs/scale.html) documentation.
    */
  var scale: js.UndefOr[(Scale[ExprRef | SignalRef]) | Null] = js.undefined
  
  var `type`: js.UndefOr[Type] = js.undefined
}
object MarkPropDatumDef {
  
  inline def apply[F /* <: Field */](): MarkPropDatumDef[F] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkPropDatumDef[F]]
  }
  
  extension [Self <: MarkPropDatumDef[?], F /* <: Field */](x: Self & MarkPropDatumDef[F]) {
    
    inline def setBand(value: Double): Self = StObject.set(x, "band", value.asInstanceOf[js.Any])
    
    inline def setBandUndefined: Self = StObject.set(x, "band", js.undefined)
    
    inline def setDatum(value: PrimitiveValue | DateTime | ExprRef | SignalRef | RepeatRef): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
    
    inline def setDatumNull: Self = StObject.set(x, "datum", null)
    
    inline def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
    
    inline def setLegend(value: Legend[ExprRef | SignalRef]): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendNull: Self = StObject.set(x, "legend", null)
    
    inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    inline def setScale(value: Scale[ExprRef | SignalRef]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleNull: Self = StObject.set(x, "scale", null)
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
