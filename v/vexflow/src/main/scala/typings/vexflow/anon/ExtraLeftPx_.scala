package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtraLeftPx_ extends js.Object {
  var extraLeftPx: Double = js.native
  var extraRightPx: Double = js.native
  var left_shift: Double = js.native
  var modLeftPx: Double = js.native
  var modRightPx: Double = js.native
  var noteWidth: Double = js.native
  var width: Double = js.native
}

object ExtraLeftPx_ {
  @scala.inline
  def apply(
    extraLeftPx: Double,
    extraRightPx: Double,
    left_shift: Double,
    modLeftPx: Double,
    modRightPx: Double,
    noteWidth: Double,
    width: Double
  ): ExtraLeftPx_ = {
    val __obj = js.Dynamic.literal(extraLeftPx = extraLeftPx.asInstanceOf[js.Any], extraRightPx = extraRightPx.asInstanceOf[js.Any], left_shift = left_shift.asInstanceOf[js.Any], modLeftPx = modLeftPx.asInstanceOf[js.Any], modRightPx = modRightPx.asInstanceOf[js.Any], noteWidth = noteWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraLeftPx_]
  }
  @scala.inline
  implicit class ExtraLeftPx_Ops[Self <: ExtraLeftPx_] (val x: Self) extends AnyVal {
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
    def setExtraLeftPx(value: Double): Self = this.set("extraLeftPx", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtraRightPx(value: Double): Self = this.set("extraRightPx", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft_shift(value: Double): Self = this.set("left_shift", value.asInstanceOf[js.Any])
    @scala.inline
    def setModLeftPx(value: Double): Self = this.set("modLeftPx", value.asInstanceOf[js.Any])
    @scala.inline
    def setModRightPx(value: Double): Self = this.set("modRightPx", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoteWidth(value: Double): Self = this.set("noteWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

