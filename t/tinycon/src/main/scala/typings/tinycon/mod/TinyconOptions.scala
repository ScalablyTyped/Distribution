package typings.tinycon.mod

import typings.tinycon.tinyconStrings.force
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TinyconOptions extends js.Object {
  var abbreviate: js.UndefOr[Boolean] = js.undefined
  var background: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var fallback: js.UndefOr[Boolean | force] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object TinyconOptions {
  @scala.inline
  def apply(
    abbreviate: js.UndefOr[Boolean] = js.undefined,
    background: String = null,
    color: String = null,
    fallback: Boolean | force = null,
    font: String = null,
    height: Int | Double = null,
    width: Int | Double = null
  ): TinyconOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abbreviate)) __obj.updateDynamic("abbreviate")(abbreviate.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TinyconOptions]
  }
}

