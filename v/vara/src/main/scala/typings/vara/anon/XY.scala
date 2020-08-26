package typings.vara.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XY extends js.Object {
  var x: Boolean = js.native
  var y: Boolean = js.native
}

object XY {
  @scala.inline
  def apply(x: Boolean, y: Boolean): XY = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[XY]
  }
  @scala.inline
  implicit class XYOps[Self <: XY] (val x: Self) extends AnyVal {
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
    def setX(value: Boolean): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Boolean): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

