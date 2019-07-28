package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FillstyleGlyphspacingpx extends js.Object {
  var fill_style: js.UndefOr[String] = js.undefined
  var glyph_spacing_px: js.UndefOr[Double] = js.undefined
  var left_bar: js.UndefOr[Boolean] = js.undefined
  var num_lines: js.UndefOr[Double] = js.undefined
  var right_bar: js.UndefOr[Boolean] = js.undefined
  var space_above_staff_ln: js.UndefOr[Double] = js.undefined
  var space_below_staff_ln: js.UndefOr[Double] = js.undefined
  var spacing_between_lines_px: js.UndefOr[Double] = js.undefined
  var top_text_position: js.UndefOr[Double] = js.undefined
  var vertical_bar_width: js.UndefOr[Double] = js.undefined
}

object Anon_FillstyleGlyphspacingpx {
  @scala.inline
  def apply(
    fill_style: String = null,
    glyph_spacing_px: Int | Double = null,
    left_bar: js.UndefOr[Boolean] = js.undefined,
    num_lines: Int | Double = null,
    right_bar: js.UndefOr[Boolean] = js.undefined,
    space_above_staff_ln: Int | Double = null,
    space_below_staff_ln: Int | Double = null,
    spacing_between_lines_px: Int | Double = null,
    top_text_position: Int | Double = null,
    vertical_bar_width: Int | Double = null
  ): Anon_FillstyleGlyphspacingpx = {
    val __obj = js.Dynamic.literal()
    if (fill_style != null) __obj.updateDynamic("fill_style")(fill_style)
    if (glyph_spacing_px != null) __obj.updateDynamic("glyph_spacing_px")(glyph_spacing_px.asInstanceOf[js.Any])
    if (!js.isUndefined(left_bar)) __obj.updateDynamic("left_bar")(left_bar)
    if (num_lines != null) __obj.updateDynamic("num_lines")(num_lines.asInstanceOf[js.Any])
    if (!js.isUndefined(right_bar)) __obj.updateDynamic("right_bar")(right_bar)
    if (space_above_staff_ln != null) __obj.updateDynamic("space_above_staff_ln")(space_above_staff_ln.asInstanceOf[js.Any])
    if (space_below_staff_ln != null) __obj.updateDynamic("space_below_staff_ln")(space_below_staff_ln.asInstanceOf[js.Any])
    if (spacing_between_lines_px != null) __obj.updateDynamic("spacing_between_lines_px")(spacing_between_lines_px.asInstanceOf[js.Any])
    if (top_text_position != null) __obj.updateDynamic("top_text_position")(top_text_position.asInstanceOf[js.Any])
    if (vertical_bar_width != null) __obj.updateDynamic("vertical_bar_width")(vertical_bar_width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FillstyleGlyphspacingpx]
  }
}

