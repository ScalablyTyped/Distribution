package typings.victory.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndAngle extends js.Object {
  var data: js.UndefOr[js.Array[_]] = js.native
  var endAngle: js.UndefOr[Double] = js.native
  var padAngle: js.UndefOr[Double] = js.native
  var startAngle: js.UndefOr[Double] = js.native
}

object EndAngle {
  @scala.inline
  def apply(): EndAngle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndAngle]
  }
  @scala.inline
  implicit class EndAngleOps[Self <: EndAngle] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setEndAngle(value: Double): Self = this.set("endAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndAngle: Self = this.set("endAngle", js.undefined)
    @scala.inline
    def setPadAngle(value: Double): Self = this.set("padAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadAngle: Self = this.set("padAngle", js.undefined)
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
  }
  
}

