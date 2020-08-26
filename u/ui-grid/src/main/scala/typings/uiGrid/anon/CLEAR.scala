package typings.uiGrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CLEAR extends js.Object {
  var CLEAR: Double = js.native
  var CLICK: Double = js.native
  var KEYDOWN: Double = js.native
}

object CLEAR {
  @scala.inline
  def apply(CLEAR: Double, CLICK: Double, KEYDOWN: Double): CLEAR = {
    val __obj = js.Dynamic.literal(CLEAR = CLEAR.asInstanceOf[js.Any], CLICK = CLICK.asInstanceOf[js.Any], KEYDOWN = KEYDOWN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CLEAR]
  }
  @scala.inline
  implicit class CLEAROps[Self <: CLEAR] (val x: Self) extends AnyVal {
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
    def setCLEAR(value: Double): Self = this.set("CLEAR", value.asInstanceOf[js.Any])
    @scala.inline
    def setCLICK(value: Double): Self = this.set("CLICK", value.asInstanceOf[js.Any])
    @scala.inline
    def setKEYDOWN(value: Double): Self = this.set("KEYDOWN", value.asInstanceOf[js.Any])
  }
  
}

