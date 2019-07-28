package typings.vegaDashLite.buildSrcGuideMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Guide extends TitleMixins {
  /**
    * The formatting pattern for labels. This is D3's [number format pattern](https://github.com/d3/d3-format#locale_format) for quantitative fields and D3's [time format pattern](https://github.com/d3/d3-time-format#locale_format) for time field.
    *
    * See the [format documentation](https://vega.github.io/vega-lite/docs/format.html) for more information.
    *
    * __Default value:__  derived from [numberFormat](https://vega.github.io/vega-lite/docs/config.html#format) config for quantitative fields and from [timeFormat](https://vega.github.io/vega-lite/docs/config.html#format) config for temporal fields.
    */
  var format: js.UndefOr[String] = js.undefined
}

object Guide {
  @scala.inline
  def apply(format: String = null, title: String = null): Guide = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Guide]
  }
}

