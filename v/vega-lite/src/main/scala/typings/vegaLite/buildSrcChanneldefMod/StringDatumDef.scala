package typings.vegaLite.buildSrcChanneldefMod

import typings.vegaLite.buildSrcTypeMod.Type
import typings.vegaLite.buildSrcUtilMod.Dict
import typings.vegaLite.vegaLiteStrings.number
import typings.vegaLite.vegaLiteStrings.time
import typings.vegaTypings.typesSpecEncodeMod.Text
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent vega-lite.vega-lite/build/src/channeldef.DatumDef<F, vega-lite.vega-lite/build/src/channeldef.PrimitiveValue | vega-lite.vega-lite/build/src/datetime.DateTime | vega-lite.vega-lite/build/src/expr.ExprRef | vega.vega.SignalRef> */
/* Inlined parent vega-lite.vega-lite/build/src/channeldef.FormatMixins */
trait StringDatumDef[F /* <: Field */] extends StObject {
  
  /**
    * Relative position on a band of a stacked, binned, time unit, or band scale. For example, the marks will be positioned at the beginning of the band if set to `0`, and at the middle of the band if set to `0.5`.
    *
    * @minimum 0
    * @maximum 1
    */
  var bandPosition: js.UndefOr[Double] = js.undefined
  
  /**
    * A constant value in data domain.
    */
  var datum: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: F extends vega-lite.vega-lite/build/src/channeldef.RepeatRef ? vega-lite.vega-lite/build/src/channeldef.PrimitiveValue | vega-lite.vega-lite/build/src/datetime.DateTime | vega-lite.vega-lite/build/src/expr.ExprRef | vega-typings.vega-typings/types/spec/signal.SignalRef | vega-lite.vega-lite/build/src/channeldef.RepeatRef : vega-lite.vega-lite/build/src/channeldef.PrimitiveValue | vega-lite.vega-lite/build/src/datetime.DateTime | vega-lite.vega-lite/build/src/expr.ExprRef | vega-typings.vega-typings/types/spec/signal.SignalRef */ js.Any
  ] = js.undefined
  
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
  var format: js.UndefOr[String | Dict[Any]] = js.undefined
  
  /**
    * The format type for labels. One of `"number"`, `"time"`, or a [registered custom format type](https://vega.github.io/vega-lite/docs/config.html#custom-format-type).
    *
    * __Default value:__
    * - `"time"` for temporal fields and ordinal and nominal fields with `timeUnit`.
    * - `"number"` for quantitative fields as well as ordinal and nominal fields without `timeUnit`.
    */
  var formatType: js.UndefOr[number | time | String] = js.undefined
  
  /**
    * A title for the field. If `null`, the title will be removed.
    *
    * __Default value:__  derived from the field's name and transformation function (`aggregate`, `bin` and `timeUnit`). If the field has an aggregate function, the function is displayed as part of the title (e.g., `"Sum of Profit"`). If the field is binned or has a time unit applied, the applied function is shown in parentheses (e.g., `"Profit (binned)"`, `"Transaction Date (year-month)"`). Otherwise, the title is simply the field name.
    *
    * __Notes__:
    *
    * 1) You can customize the default field title format by providing the [`fieldTitle`](https://vega.github.io/vega-lite/docs/config.html#top-level-config) property in the [config](https://vega.github.io/vega-lite/docs/config.html) or [`fieldTitle` function via the `compile` function's options](https://vega.github.io/vega-lite/usage/compile.html#field-title).
    *
    * 2) If both field definition's `title` and axis, header, or legend `title` are defined, axis/header/legend title will be used.
    */
  var title: js.UndefOr[Text | Null | SignalRef] = js.undefined
  
  var `type`: js.UndefOr[Type] = js.undefined
}
object StringDatumDef {
  
  inline def apply[F /* <: Field */](): StringDatumDef[F] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringDatumDef[F]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringDatumDef[?], F /* <: Field */] (val x: Self & StringDatumDef[F]) extends AnyVal {
    
    inline def setBandPosition(value: Double): Self = StObject.set(x, "bandPosition", value.asInstanceOf[js.Any])
    
    inline def setBandPositionUndefined: Self = StObject.set(x, "bandPosition", js.undefined)
    
    inline def setDatum(
      value: /* import warning: importer.ImportType#apply Failed type conversion: F extends vega-lite.vega-lite/build/src/channeldef.RepeatRef ? vega-lite.vega-lite/build/src/channeldef.PrimitiveValue | vega-lite.vega-lite/build/src/datetime.DateTime | vega-lite.vega-lite/build/src/expr.ExprRef | vega-typings.vega-typings/types/spec/signal.SignalRef | vega-lite.vega-lite/build/src/channeldef.RepeatRef : vega-lite.vega-lite/build/src/channeldef.PrimitiveValue | vega-lite.vega-lite/build/src/datetime.DateTime | vega-lite.vega-lite/build/src/expr.ExprRef | vega-typings.vega-typings/types/spec/signal.SignalRef */ js.Any
    ): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
    
    inline def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
    
    inline def setFormat(value: String | Dict[Any]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatType(value: number | time | String): Self = StObject.set(x, "formatType", value.asInstanceOf[js.Any])
    
    inline def setFormatTypeUndefined: Self = StObject.set(x, "formatType", js.undefined)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setTitle(value: Text | SignalRef): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value*))
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
