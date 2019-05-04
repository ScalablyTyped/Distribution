package typings
package vegaDashLiteLib.buildSrcDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataFormatBase extends js.Object {
  /**
    * If set to `"auto"` (the default), perform automatic type inference to determine the desired data types.
    * If set to `null`, disable type inference based on the spec and only use type inference based on the data.
    * Alternatively, a parsing directive object can be provided for explicit data types. Each property of the object corresponds to a field name, and the value to the desired data type (one of `"number"`, `"boolean"`, `"date"`, or null (do not parse the field)).
    * For example, `"parse": {"modified_on": "date"}` parses the `modified_on` field in each input record a Date value.
    *
    * For `"date"`, we parse data based using Javascript's [`Date.parse()`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/parse).
    * For Specific date formats can be provided (e.g., `{foo: 'date:"%m%d%Y"'}`), using the [d3-time-format syntax](https://github.com/d3/d3-time-format#locale_format). UTC date format parsing is supported similarly (e.g., `{foo: 'utc:"%m%d%Y"'}`). See more about [UTC time](https://vega.github.io/vega-lite/docs/timeunit.html#utc)
    */
  var parse: js.UndefOr[vegaDashLiteLib.vegaDashLiteLibStrings.auto | Parse | scala.Null] = js.undefined
}

object DataFormatBase {
  @scala.inline
  def apply(parse: vegaDashLiteLib.vegaDashLiteLibStrings.auto | Parse = null): DataFormatBase = {
    val __obj = js.Dynamic.literal()
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataFormatBase]
  }
}

