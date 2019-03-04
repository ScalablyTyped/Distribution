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
    val __obj = js.Dynamic.literal(alwaysDown = alwaysDown, alwaysUp = alwaysUp, rise = rise, set = set)
  
    __obj.asInstanceOf[GetMoonTimes]
  }
}

