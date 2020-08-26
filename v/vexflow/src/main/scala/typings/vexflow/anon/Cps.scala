package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cps extends js.Object {
  var cps: js.UndefOr[js.Array[X]] = js.native
  var invert: Boolean = js.native
  var position: typings.vexflow.Vex.Flow.Curve.Position = js.native
  var spacing: js.UndefOr[Double] = js.native
  var thickness: js.UndefOr[Double] = js.native
  var x_shift: js.UndefOr[Double] = js.native
  var y_shift: Double = js.native
}

object Cps {
  @scala.inline
  def apply(invert: Boolean, position: typings.vexflow.Vex.Flow.Curve.Position, y_shift: Double): Cps = {
    val __obj = js.Dynamic.literal(invert = invert.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], y_shift = y_shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cps]
  }
  @scala.inline
  implicit class CpsOps[Self <: Cps] (val x: Self) extends AnyVal {
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
    def setInvert(value: Boolean): Self = this.set("invert", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: typings.vexflow.Vex.Flow.Curve.Position): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setY_shift(value: Double): Self = this.set("y_shift", value.asInstanceOf[js.Any])
    @scala.inline
    def setCpsVarargs(value: X*): Self = this.set("cps", js.Array(value :_*))
    @scala.inline
    def setCps(value: js.Array[X]): Self = this.set("cps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCps: Self = this.set("cps", js.undefined)
    @scala.inline
    def setSpacing(value: Double): Self = this.set("spacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
    @scala.inline
    def setThickness(value: Double): Self = this.set("thickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThickness: Self = this.set("thickness", js.undefined)
    @scala.inline
    def setX_shift(value: Double): Self = this.set("x_shift", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX_shift: Self = this.set("x_shift", js.undefined)
  }
  
}

