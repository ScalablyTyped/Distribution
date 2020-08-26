package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fillstyle extends js.Object {
  var fill_style: js.UndefOr[String] = js.native
  var glyph_spacing_px: js.UndefOr[Double] = js.native
  var num_lines: js.UndefOr[Double] = js.native
  var space_above_staff_ln: js.UndefOr[Double] = js.native
  var space_below_staff_ln: js.UndefOr[Double] = js.native
  var spacing_between_lines_px: js.UndefOr[Double] = js.native
  var top_text_position: js.UndefOr[Double] = js.native
  var vertical_bar_width: js.UndefOr[Double] = js.native
}

object Fillstyle {
  @scala.inline
  def apply(): Fillstyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fillstyle]
  }
  @scala.inline
  implicit class FillstyleOps[Self <: Fillstyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFill_style(value: String): Self = this.set("fill_style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill_style: Self = this.set("fill_style", js.undefined)
    @scala.inline
    def setGlyph_spacing_px(value: Double): Self = this.set("glyph_spacing_px", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlyph_spacing_px: Self = this.set("glyph_spacing_px", js.undefined)
    @scala.inline
    def setNum_lines(value: Double): Self = this.set("num_lines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNum_lines: Self = this.set("num_lines", js.undefined)
    @scala.inline
    def setSpace_above_staff_ln(value: Double): Self = this.set("space_above_staff_ln", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpace_above_staff_ln: Self = this.set("space_above_staff_ln", js.undefined)
    @scala.inline
    def setSpace_below_staff_ln(value: Double): Self = this.set("space_below_staff_ln", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpace_below_staff_ln: Self = this.set("space_below_staff_ln", js.undefined)
    @scala.inline
    def setSpacing_between_lines_px(value: Double): Self = this.set("spacing_between_lines_px", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpacing_between_lines_px: Self = this.set("spacing_between_lines_px", js.undefined)
    @scala.inline
    def setTop_text_position(value: Double): Self = this.set("top_text_position", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop_text_position: Self = this.set("top_text_position", js.undefined)
    @scala.inline
    def setVertical_bar_width(value: Double): Self = this.set("vertical_bar_width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical_bar_width: Self = this.set("vertical_bar_width", js.undefined)
  }
  
}

