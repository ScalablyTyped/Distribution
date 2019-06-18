package typings
package atWordpressRichDashTextLib.atWordpressRichDashTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var activeFormats: js.UndefOr[js.Array[Format]] = js.undefined
  var end: js.UndefOr[scala.Double] = js.undefined
  var formats: js.Array[js.UndefOr[js.Array[Format]]]
  var replacements: js.Array[js.UndefOr[js.Array[Format]]]
  var start: js.UndefOr[scala.Double] = js.undefined
  var text: java.lang.String
}

object Value {
  @scala.inline
  def apply(
    formats: js.Array[js.UndefOr[js.Array[Format]]],
    replacements: js.Array[js.UndefOr[js.Array[Format]]],
    text: java.lang.String,
    activeFormats: js.Array[Format] = null,
    end: scala.Int | scala.Double = null,
    start: scala.Int | scala.Double = null
  ): Value = {
    val __obj = js.Dynamic.literal(formats = formats, replacements = replacements, text = text)
    if (activeFormats != null) __obj.updateDynamic("activeFormats")(activeFormats)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

