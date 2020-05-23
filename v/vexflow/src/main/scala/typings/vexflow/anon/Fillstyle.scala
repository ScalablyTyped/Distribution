package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fillstyle extends js.Object {
  var fill_style: js.UndefOr[String] = js.undefined
  var glyph_spacing_px: js.UndefOr[Double] = js.undefined
  var num_lines: js.UndefOr[Double] = js.undefined
  var space_above_staff_ln: js.UndefOr[Double] = js.undefined
  var space_below_staff_ln: js.UndefOr[Double] = js.undefined
  var spacing_between_lines_px: js.UndefOr[Double] = js.undefined
  var top_text_position: js.UndefOr[Double] = js.undefined
  var vertical_bar_width: js.UndefOr[Double] = js.undefined
}

object Fillstyle {
  @scala.inline
  def apply(
    fill_style: String = null,
    glyph_spacing_px: js.UndefOr[Double] = js.undefined,
    num_lines: js.UndefOr[Double] = js.undefined,
    space_above_staff_ln: js.UndefOr[Double] = js.undefined,
    space_below_staff_ln: js.UndefOr[Double] = js.undefined,
    spacing_between_lines_px: js.UndefOr[Double] = js.undefined,
    top_text_position: js.UndefOr[Double] = js.undefined,
    vertical_bar_width: js.UndefOr[Double] = js.undefined
  ): Fillstyle = {
    val __obj = js.Dynamic.literal()
    if (fill_style != null) __obj.updateDynamic("fill_style")(fill_style.asInstanceOf[js.Any])
    if (!js.isUndefined(glyph_spacing_px)) __obj.updateDynamic("glyph_spacing_px")(glyph_spacing_px.get.asInstanceOf[js.Any])
    if (!js.isUndefined(num_lines)) __obj.updateDynamic("num_lines")(num_lines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(space_above_staff_ln)) __obj.updateDynamic("space_above_staff_ln")(space_above_staff_ln.get.asInstanceOf[js.Any])
    if (!js.isUndefined(space_below_staff_ln)) __obj.updateDynamic("space_below_staff_ln")(space_below_staff_ln.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spacing_between_lines_px)) __obj.updateDynamic("spacing_between_lines_px")(spacing_between_lines_px.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top_text_position)) __obj.updateDynamic("top_text_position")(top_text_position.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical_bar_width)) __obj.updateDynamic("vertical_bar_width")(vertical_bar_width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fillstyle]
  }
}

