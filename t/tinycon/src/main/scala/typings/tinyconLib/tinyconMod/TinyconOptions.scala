package typings
package tinyconLib.tinyconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TinyconOptions extends js.Object {
  var abbreviate: js.UndefOr[scala.Boolean] = js.undefined
  var background: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var fallback: js.UndefOr[scala.Boolean | tinyconLib.tinyconLibStrings.force] = js.undefined
  var font: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object TinyconOptions {
  @scala.inline
  def apply(
    abbreviate: js.UndefOr[scala.Boolean] = js.undefined,
    background: java.lang.String = null,
    color: java.lang.String = null,
    fallback: scala.Boolean | tinyconLib.tinyconLibStrings.force = null,
    font: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): TinyconOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abbreviate)) __obj.updateDynamic("abbreviate")(abbreviate)
    if (background != null) __obj.updateDynamic("background")(background)
    if (color != null) __obj.updateDynamic("color")(color)
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TinyconOptions]
  }
}

