package typings.vegaLite.channeldefMod

import typings.vegaLite.datetimeMod.DateTime
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.srcTypeMod.Type
import typings.vegaLite.utilMod.Dict
import typings.vegaLite.vegaLiteStrings.number
import typings.vegaLite.vegaLiteStrings.time
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent vega-lite.vega-lite/build/src/channeldef.DatumDef<F, vega-lite.vega-lite/build/src/channeldef.PrimitiveValue | vega-lite.vega-lite/build/src/datetime.DateTime | vega-lite.vega-lite/build/src/expr.ExprRef | vega.vega.SignalRef> */
/* Inlined parent vega-lite.vega-lite/build/src/guide.FormatMixins */
trait StringDatumDef[F /* <: Field */] extends StObject {
  
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
    * When used with the default `"number"` and `"time"` format type, the text formatting pattern for labels of guides (axes, legends, headers) and text marks.
    *
    * - If the format type is `"number"` (e.g., for quantitative fields), this is D3's [number format pattern](https://github.com/d3/d3-format#locale_format).
    * - If the format type is `"time"` (e.g., for temporal fields), this is D3's [time format pattern](https://github.com/d3/d3-time-format#locale_format).
    *
    * See the [format documentation](https://vega.github.io/vega-lite/docs/format.html) for more examples.
    *
    * When used with a [custom `formatType`](https://vega.github.io/vega-lite/docs/config.html#custom-format-type), this value will be passed as `format` alongside `datum.value` to the registered function.
    *
    * __Default value:__  Derived from [numberFormat](https://vega.github.io/vega-lite/docs/config.html#format) config for number format and from [timeFormat](https://vega.github.io/vega-lite/docs/config.html#format) config for time format.
    */
  var format: js.UndefOr[String | Dict[js.Any]] = js.undefined
  
  /**
    * The format type for labels. One of `"number"`, `"time"`, or a [registered custom format type](https://vega.github.io/vega-lite/docs/config.html#custom-format-type).
    *
    * __Default value:__
    * - `"time"` for temporal fields and ordinal and nominal fields with `timeUnit`.
    * - `"number"` for quantitative fields as well as ordinal and nominal fields without `timeUnit`.
    */
  var formatType: js.UndefOr[number | time | String] = js.undefined
  
  /**
    * [Vega expression](https://vega.github.io/vega/docs/expressions/) for customizing labels text.
    *
    * __Note:__ The label text and value can be assessed via the `label` and `value` properties of the axis's backing `datum` object.
    */
  var labelExpr: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[Type] = js.undefined
}
object StringDatumDef {
  
  @scala.inline
  def apply[F /* <: Field */](): StringDatumDef[F] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringDatumDef[F]]
  }
  
  @scala.inline
  implicit class StringDatumDefMutableBuilder[Self <: StringDatumDef[?], F /* <: Field */] (val x: Self & StringDatumDef[F]) extends AnyVal {
    
    @scala.inline
    def setBand(value: Double): Self = StObject.set(x, "band", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandUndefined: Self = StObject.set(x, "band", js.undefined)
    
    @scala.inline
    def setDatum(value: PrimitiveValue | DateTime | ExprRef | SignalRef | RepeatRef): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatumNull: Self = StObject.set(x, "datum", null)
    
    @scala.inline
    def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
    
    @scala.inline
    def setFormat(value: String | Dict[js.Any]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatType(value: number | time | String): Self = StObject.set(x, "formatType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatTypeUndefined: Self = StObject.set(x, "formatType", js.undefined)
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setLabelExpr(value: String): Self = StObject.set(x, "labelExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelExprUndefined: Self = StObject.set(x, "labelExpr", js.undefined)
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
