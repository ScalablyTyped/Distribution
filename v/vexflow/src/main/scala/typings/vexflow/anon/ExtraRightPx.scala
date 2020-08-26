package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtraRightPx extends js.Object {
  var extraLeftPx: Double = js.native
  var extraRightPx: Double = js.native
  var notePx: Double = js.native
  var width: Double = js.native
}

object ExtraRightPx {
  @scala.inline
  def apply(extraLeftPx: Double, extraRightPx: Double, notePx: Double, width: Double): ExtraRightPx = {
    val __obj = js.Dynamic.literal(extraLeftPx = extraLeftPx.asInstanceOf[js.Any], extraRightPx = extraRightPx.asInstanceOf[js.Any], notePx = notePx.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraRightPx]
  }
  @scala.inline
  implicit class ExtraRightPxOps[Self <: ExtraRightPx] (val x: Self) extends AnyVal {
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
    def setNotePx(value: Double): Self = this.set("notePx", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

