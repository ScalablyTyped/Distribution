package typings.atWordpressRichDashText.atWordpressRichDashTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var activeFormats: js.UndefOr[js.Array[Format]] = js.undefined
  var end: js.UndefOr[Double] = js.undefined
  var formats: js.Array[js.UndefOr[js.Array[Format]]]
  var replacements: js.Array[js.UndefOr[js.Array[Format]]]
  var start: js.UndefOr[Double] = js.undefined
  var text: String
}

object Value {
  @scala.inline
  def apply(
    formats: js.Array[js.UndefOr[js.Array[Format]]],
    replacements: js.Array[js.UndefOr[js.Array[Format]]],
    text: String,
    activeFormats: js.Array[Format] = null,
    end: Int | Double = null,
    start: Int | Double = null
  ): Value = {
    val __obj = js.Dynamic.literal(formats = formats, replacements = replacements, text = text)
    if (activeFormats != null) __obj.updateDynamic("activeFormats")(activeFormats)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

