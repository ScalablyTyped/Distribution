package typings.wordpressRichText.mod

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
    end: js.UndefOr[Double] = js.undefined,
    start: js.UndefOr[Double] = js.undefined
  ): Value = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], replacements = replacements.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (activeFormats != null) __obj.updateDynamic("activeFormats")(activeFormats.asInstanceOf[js.Any])
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

