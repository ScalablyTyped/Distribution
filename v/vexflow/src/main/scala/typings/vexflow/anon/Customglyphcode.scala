package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Customglyphcode extends js.Object {
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

object Customglyphcode {
  @scala.inline
  def apply(
    duration: String,
    line: Double,
    x_shift: Double,
    custom_glyph_code: String = null,
    displaced: js.UndefOr[Boolean] = js.undefined,
    glyph_font_scale: js.UndefOr[Double] = js.undefined,
    note_type: String = null,
    slashed: js.UndefOr[Boolean] = js.undefined,
    stem_direction: js.UndefOr[Double] = js.undefined,
    style: String = null,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): Customglyphcode = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], x_shift = x_shift.asInstanceOf[js.Any])
    if (custom_glyph_code != null) __obj.updateDynamic("custom_glyph_code")(custom_glyph_code.asInstanceOf[js.Any])
    if (!js.isUndefined(displaced)) __obj.updateDynamic("displaced")(displaced.get.asInstanceOf[js.Any])
    if (!js.isUndefined(glyph_font_scale)) __obj.updateDynamic("glyph_font_scale")(glyph_font_scale.get.asInstanceOf[js.Any])
    if (note_type != null) __obj.updateDynamic("note_type")(note_type.asInstanceOf[js.Any])
    if (!js.isUndefined(slashed)) __obj.updateDynamic("slashed")(slashed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stem_direction)) __obj.updateDynamic("stem_direction")(stem_direction.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Customglyphcode]
  }
}

