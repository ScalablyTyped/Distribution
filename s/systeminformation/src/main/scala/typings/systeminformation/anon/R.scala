package typings.systeminformation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait R extends js.Object {
  var r: Double = js.native
  var w: Double = js.native
}

object R {
  @scala.inline
  def apply(r: Double, w: Double): R = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[R]
  }
  @scala.inline
  implicit class ROps[Self <: R] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setR(value: Double): Self = this.set("r", value.asInstanceOf[js.Any])
    @scala.inline
    def setW(value: Double): Self = this.set("w", value.asInstanceOf[js.Any])
  }
  
}

