package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Customglyphcode extends js.Object {
  var custom_glyph_code: js.UndefOr[String] = js.undefined
  var displaced: js.UndefOr[Boolean] = js.undefined
  var duration: String
  var glyph_font_scale: js.UndefOr[Double] = js.undefined
  var line: Double
  var note_type: js.UndefOr[String] = js.undefined
  var slashed: js.UndefOr[Boolean] = js.undefined
  var stem_direction: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[String] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var x_shift: Double
  var y: js.UndefOr[Double] = js.undefined
}

object Anon_Customglyphcode {
  @scala.inline
  def apply(
    duration: String,
    line: Double,
    x_shift: Double,
    custom_glyph_code: String = null,
    displaced: js.UndefOr[Boolean] = js.undefined,
    glyph_font_scale: Int | Double = null,
    note_type: String = null,
    slashed: js.UndefOr[Boolean] = js.undefined,
    stem_direction: Int | Double = null,
    style: String = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): Anon_Customglyphcode = {
    val __obj = js.Dynamic.literal(duration = duration, line = line, x_shift = x_shift)
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

