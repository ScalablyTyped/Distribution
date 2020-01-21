package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCustomglyphcode extends js.Object {
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

object AnonCustomglyphcode {
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
  ): AnonCustomglyphcode = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], x_shift = x_shift.asInstanceOf[js.Any])
    if (custom_glyph_code != null) __obj.updateDynamic("custom_glyph_code")(custom_glyph_code.asInstanceOf[js.Any])
    if (!js.isUndefined(displaced)) __obj.updateDynamic("displaced")(displaced.asInstanceOf[js.Any])
    if (glyph_font_scale != null) __obj.updateDynamic("glyph_font_scale")(glyph_font_scale.asInstanceOf[js.Any])
    if (note_type != null) __obj.updateDynamic("note_type")(note_type.asInstanceOf[js.Any])
    if (!js.isUndefined(slashed)) __obj.updateDynamic("slashed")(slashed.asInstanceOf[js.Any])
    if (stem_direction != null) __obj.updateDynamic("stem_direction")(stem_direction.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCustomglyphcode]
  }
}

