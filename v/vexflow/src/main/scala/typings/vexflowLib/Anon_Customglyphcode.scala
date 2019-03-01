package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Customglyphcode extends js.Object {
  var custom_glyph_code: js.UndefOr[java.lang.String] = js.undefined
  var displaced: js.UndefOr[scala.Boolean] = js.undefined
  var duration: java.lang.String
  var glyph_font_scale: js.UndefOr[scala.Double] = js.undefined
  var line: scala.Double
  var note_type: js.UndefOr[java.lang.String] = js.undefined
  var slashed: js.UndefOr[scala.Boolean] = js.undefined
  var stem_direction: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[java.lang.String] = js.undefined
  var x: js.UndefOr[scala.Double] = js.undefined
  var x_shift: scala.Double
  var y: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Customglyphcode {
  @scala.inline
  def apply(
    duration: java.lang.String,
    line: scala.Double,
    x_shift: scala.Double,
    custom_glyph_code: java.lang.String = null,
    displaced: js.UndefOr[scala.Boolean] = js.undefined,
    glyph_font_scale: scala.Int | scala.Double = null,
    note_type: java.lang.String = null,
    slashed: js.UndefOr[scala.Boolean] = js.undefined,
    stem_direction: scala.Int | scala.Double = null,
    style: java.lang.String = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): Anon_Customglyphcode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("x_shift")(x_shift)
    if (custom_glyph_code != null) __obj.updateDynamic("custom_glyph_code")(custom_glyph_code)
    if (!js.isUndefined(displaced)) __obj.updateDynamic("displaced")(displaced)
    if (glyph_font_scale != null) __obj.updateDynamic("glyph_font_scale")(glyph_font_scale.asInstanceOf[js.Any])
    if (note_type != null) __obj.updateDynamic("note_type")(note_type)
    if (!js.isUndefined(slashed)) __obj.updateDynamic("slashed")(slashed)
    if (stem_direction != null) __obj.updateDynamic("stem_direction")(stem_direction.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Customglyphcode]
  }
}

