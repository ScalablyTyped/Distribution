package typings.vegaLite.buildSrcChanneldefMod

import typings.vegaLite.buildSrcUtilMod.Dict
import typings.vegaLite.vegaLiteStrings.number
import typings.vegaLite.vegaLiteStrings.time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatMixins extends StObject {
  
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
}
object FormatMixins {
  
  inline def apply(): FormatMixins = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatMixins]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormatMixins] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: String | Dict[Any]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatType(value: number | time | String): Self = StObject.set(x, "formatType", value.asInstanceOf[js.Any])
    
    inline def setFormatTypeUndefined: Self = StObject.set(x, "formatType", js.undefined)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
