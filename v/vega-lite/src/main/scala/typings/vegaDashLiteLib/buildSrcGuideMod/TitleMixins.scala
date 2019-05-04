package typings
package vegaDashLiteLib.buildSrcGuideMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TitleMixins extends js.Object {
  /**
    * A title for the field. If `null`, the title will be removed.
    *
    * __Default value:__  derived from the field's name and transformation function (`aggregate`, `bin` and `timeUnit`).  If the field has an aggregate function, the function is displayed as part of the title (e.g., `"Sum of Profit"`). If the field is binned or has a time unit applied, the applied function is shown in parentheses (e.g., `"Profit (binned)"`, `"Transaction Date (year-month)"`).  Otherwise, the title is simply the field name.
    *
    * __Notes__:
    *
    * 1) You can customize the default field title format by providing the [`fieldTitle` property in the [config](https://vega.github.io/vega-lite/docs/config.html) or [`fieldTitle` function via the `compile` function's options](https://vega.github.io/vega-lite/docs/compile.html#field-title).
    *
    * 2) If both field definition's `title` and axis, header, or legend `title` are defined, axis/header/legend title will be used.
    */
  var title: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object TitleMixins {
  @scala.inline
  def apply(title: java.lang.String = null): TitleMixins = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[TitleMixins]
  }
}

