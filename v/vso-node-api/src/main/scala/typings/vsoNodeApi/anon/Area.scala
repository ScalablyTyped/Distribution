package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Area extends js.Object {
  var area: scala.Double = js.native
  var iteration: scala.Double = js.native
}

object Area {
  @scala.inline
  def apply(area: scala.Double, iteration: scala.Double): Area = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], iteration = iteration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Area]
  }
  @scala.inline
  implicit class AreaOps[Self <: Area] (val x: Self) extends AnyVal {
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
    def setArea(value: scala.Double): Self = this.set("area", value.asInstanceOf[js.Any])
    @scala.inline
    def setIteration(value: scala.Double): Self = this.set("iteration", value.asInstanceOf[js.Any])
  }
  
}

