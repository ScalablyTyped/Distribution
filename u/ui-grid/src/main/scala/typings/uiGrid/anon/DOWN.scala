package typings.uiGrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOWN extends js.Object {
  var DOWN: String = js.native
  var LEFT: String = js.native
  var NONE: String = js.native
  var RIGHT: String = js.native
  var UP: String = js.native
}

object DOWN {
  @scala.inline
  def apply(DOWN: String, LEFT: String, NONE: String, RIGHT: String, UP: String): DOWN = {
    val __obj = js.Dynamic.literal(DOWN = DOWN.asInstanceOf[js.Any], LEFT = LEFT.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], RIGHT = RIGHT.asInstanceOf[js.Any], UP = UP.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOWN]
  }
  @scala.inline
  implicit class DOWNOps[Self <: DOWN] (val x: Self) extends AnyVal {
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
    def setDOWN(value: String): Self = this.set("DOWN", value.asInstanceOf[js.Any])
    @scala.inline
    def setLEFT(value: String): Self = this.set("LEFT", value.asInstanceOf[js.Any])
    @scala.inline
    def setNONE(value: String): Self = this.set("NONE", value.asInstanceOf[js.Any])
    @scala.inline
    def setRIGHT(value: String): Self = this.set("RIGHT", value.asInstanceOf[js.Any])
    @scala.inline
    def setUP(value: String): Self = this.set("UP", value.asInstanceOf[js.Any])
  }
  
}

