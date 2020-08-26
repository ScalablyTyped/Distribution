package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Customglyphcode extends js.Object {
  var custom_glyph_code: js.UndefOr[String] = js.native
  var displaced: js.UndefOr[Boolean] = js.native
  var duration: String = js.native
  var glyph_font_scale: js.UndefOr[Double] = js.native
  var line: Double = js.native
  var note_type: js.UndefOr[String] = js.native
  var slashed: js.UndefOr[Boolean] = js.native
  var stem_direction: js.UndefOr[Double] = js.native
  var style: js.UndefOr[String] = js.native
  var x: js.UndefOr[Double] = js.native
  var x_shift: Double = js.native
  var y: js.UndefOr[Double] = js.native
}

object Customglyphcode {
  @scala.inline
  def apply(duration: String, line: Double, x_shift: Double): Customglyphcode = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], x_shift = x_shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[Customglyphcode]
  }
  @scala.inline
  implicit class CustomglyphcodeOps[Self <: Customglyphcode] (val x: Self) extends AnyVal {
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
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def setX_shift(value: Double): Self = this.set("x_shift", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustom_glyph_code(value: String): Self = this.set("custom_glyph_code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom_glyph_code: Self = this.set("custom_glyph_code", js.undefined)
    @scala.inline
    def setDisplaced(value: Boolean): Self = this.set("displaced", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplaced: Self = this.set("displaced", js.undefined)
    @scala.inline
    def setGlyph_font_scale(value: Double): Self = this.set("glyph_font_scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlyph_font_scale: Self = this.set("glyph_font_scale", js.undefined)
    @scala.inline
    def setNote_type(value: String): Self = this.set("note_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNote_type: Self = this.set("note_type", js.undefined)
    @scala.inline
    def setSlashed(value: Boolean): Self = this.set("slashed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlashed: Self = this.set("slashed", js.undefined)
    @scala.inline
    def setStem_direction(value: Double): Self = this.set("stem_direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStem_direction: Self = this.set("stem_direction", js.undefined)
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

