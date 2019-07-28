package typings.suncalc.suncalcMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMoonTimes extends js.Object {
  var alwaysDown: Boolean
  var alwaysUp: Boolean
  var rise: Date
  var set: Date
}

object GetMoonTimes {
  @scala.inline
  def apply(alwaysDown: Boolean, alwaysUp: Boolean, rise: Date, set: Date): GetMoonTimes = {
    val __obj = js.Dynamic.literal(alwaysDown = alwaysDown, alwaysUp = alwaysUp, rise = rise, set = set)
  
    __obj.asInstanceOf[GetMoonTimes]
  }
}

