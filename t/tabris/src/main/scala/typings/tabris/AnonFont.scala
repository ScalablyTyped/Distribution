package typings.tabris

import typings.tabris.mod.FontValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFont extends js.Object {
  var font: FontValue
  var markupEnabled: js.UndefOr[Boolean] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var text: String
}

object AnonFont {
  @scala.inline
  def apply(
    text: String,
    font: FontValue = null,
    markupEnabled: js.UndefOr[Boolean] = js.undefined,
    maxWidth: Int | Double = null
  ): AnonFont = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(markupEnabled)) __obj.updateDynamic("markupEnabled")(markupEnabled.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFont]
  }
}

