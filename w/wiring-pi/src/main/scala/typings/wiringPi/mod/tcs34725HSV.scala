package typings.wiringPi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait tcs34725HSV extends js.Object {
  var h: Double = js.native
  var s: Double = js.native
  var v: Double = js.native
}

object tcs34725HSV {
  @scala.inline
  def apply(h: Double, s: Double, v: Double): tcs34725HSV = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[tcs34725HSV]
  }
  @scala.inline
  implicit class tcs34725HSVOps[Self <: tcs34725HSV] (val x: Self) extends AnyVal {
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
    def setH(value: Double): Self = this.set("h", value.asInstanceOf[js.Any])
    @scala.inline
    def setS(value: Double): Self = this.set("s", value.asInstanceOf[js.Any])
    @scala.inline
    def setV(value: Double): Self = this.set("v", value.asInstanceOf[js.Any])
  }
  
}

