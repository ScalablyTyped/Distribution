package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DurationFont extends js.Object {
  var duration: java.lang.String
  var font: js.UndefOr[Anon_FamilySize] = js.undefined
  var glyph: js.UndefOr[java.lang.String] = js.undefined
  var ignore_ticks: js.UndefOr[scala.Boolean] = js.undefined
  var line: js.UndefOr[scala.Double] = js.undefined
  var smooth: js.UndefOr[scala.Boolean] = js.undefined
  var subscript: js.UndefOr[scala.Boolean] = js.undefined
  var superscript: js.UndefOr[scala.Boolean] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DurationFont {
  @scala.inline
  def apply(
    duration: java.lang.String,
    font: Anon_FamilySize = null,
    glyph: java.lang.String = null,
    ignore_ticks: js.UndefOr[scala.Boolean] = js.undefined,
    line: scala.Int | scala.Double = null,
    smooth: js.UndefOr[scala.Boolean] = js.undefined,
    subscript: js.UndefOr[scala.Boolean] = js.undefined,
    superscript: js.UndefOr[scala.Boolean] = js.undefined,
    text: java.lang.String = null
  ): Anon_DurationFont = {
    val __obj = js.Dynamic.literal(duration = duration)
    if (font != null) __obj.updateDynamic("font")(font)
    if (glyph != null) __obj.updateDynamic("glyph")(glyph)
    if (!js.isUndefined(ignore_ticks)) __obj.updateDynamic("ignore_ticks")(ignore_ticks)
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (!js.isUndefined(smooth)) __obj.updateDynamic("smooth")(smooth)
    if (!js.isUndefined(subscript)) __obj.updateDynamic("subscript")(subscript)
    if (!js.isUndefined(superscript)) __obj.updateDynamic("superscript")(superscript)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_DurationFont]
  }
}

