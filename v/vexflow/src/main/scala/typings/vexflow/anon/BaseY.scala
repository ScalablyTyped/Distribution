package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseY extends js.Object {
  var baseY: Double = js.native
  var topY: Double = js.native
}

object BaseY {
  @scala.inline
  def apply(baseY: Double, topY: Double): BaseY = {
    val __obj = js.Dynamic.literal(baseY = baseY.asInstanceOf[js.Any], topY = topY.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseY]
  }
  @scala.inline
  implicit class BaseYOps[Self <: BaseY] (val x: Self) extends AnyVal {
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
    def setBaseY(value: Double): Self = this.set("baseY", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopY(value: Double): Self = this.set("topY", value.asInstanceOf[js.Any])
  }
  
}

