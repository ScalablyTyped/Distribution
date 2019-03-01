package typings
package suncalcLib.suncalcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMoonTimes extends js.Object {
  var alwaysDown: scala.Boolean
  var alwaysUp: scala.Boolean
  var rise: stdLib.Date
  var set: stdLib.Date
}

object GetMoonTimes {
  @scala.inline
  def apply(alwaysDown: scala.Boolean, alwaysUp: scala.Boolean, rise: stdLib.Date, set: stdLib.Date): GetMoonTimes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alwaysDown")(alwaysDown)
    __obj.updateDynamic("alwaysUp")(alwaysUp)
    __obj.updateDynamic("rise")(rise)
    __obj.updateDynamic("set")(set)
    __obj.asInstanceOf[GetMoonTimes]
  }
}

