package typings.suncalc.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMoonTimes_ extends js.Object {
  var alwaysDown: Boolean = js.native
  var alwaysUp: Boolean = js.native
  var rise: Date = js.native
  var set: Date = js.native
}

object GetMoonTimes_ {
  @scala.inline
  def apply(alwaysDown: Boolean, alwaysUp: Boolean, rise: Date, set: Date): GetMoonTimes_ = {
    val __obj = js.Dynamic.literal(alwaysDown = alwaysDown.asInstanceOf[js.Any], alwaysUp = alwaysUp.asInstanceOf[js.Any], rise = rise.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMoonTimes_]
  }
  @scala.inline
  implicit class GetMoonTimes_Ops[Self <: GetMoonTimes_] (val x: Self) extends AnyVal {
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
    def setAlwaysDown(value: Boolean): Self = this.set("alwaysDown", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlwaysUp(value: Boolean): Self = this.set("alwaysUp", value.asInstanceOf[js.Any])
    @scala.inline
    def setRise(value: Date): Self = this.set("rise", value.asInstanceOf[js.Any])
    @scala.inline
    def setSet(value: Date): Self = this.set("set", value.asInstanceOf[js.Any])
  }
  
}

