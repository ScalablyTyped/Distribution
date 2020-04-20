package typings.suncalc.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMoonTimes_ extends js.Object {
  var alwaysDown: Boolean
  var alwaysUp: Boolean
  var rise: Date
  var set: Date
}

object GetMoonTimes_ {
  @scala.inline
  def apply(alwaysDown: Boolean, alwaysUp: Boolean, rise: Date, set: Date): GetMoonTimes_ = {
    val __obj = js.Dynamic.literal(alwaysDown = alwaysDown.asInstanceOf[js.Any], alwaysUp = alwaysUp.asInstanceOf[js.Any], rise = rise.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMoonTimes_]
  }
}

