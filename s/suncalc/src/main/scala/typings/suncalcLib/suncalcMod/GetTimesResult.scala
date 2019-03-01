package typings
package suncalcLib.suncalcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTimesResult extends js.Object {
  var dawn: stdLib.Date
  var dusk: stdLib.Date
  var goldenHour: stdLib.Date
  var goldenHourEnd: stdLib.Date
  var nadir: stdLib.Date
  var nauticalDawn: stdLib.Date
  var nauticalDusk: stdLib.Date
  var night: stdLib.Date
  var nightEnd: stdLib.Date
  var solarNoon: stdLib.Date
  var sunrise: stdLib.Date
  var sunriseEnd: stdLib.Date
  var sunset: stdLib.Date
  var sunsetStart: stdLib.Date
}

object GetTimesResult {
  @scala.inline
  def apply(
    dawn: stdLib.Date,
    dusk: stdLib.Date,
    goldenHour: stdLib.Date,
    goldenHourEnd: stdLib.Date,
    nadir: stdLib.Date,
    nauticalDawn: stdLib.Date,
    nauticalDusk: stdLib.Date,
    night: stdLib.Date,
    nightEnd: stdLib.Date,
    solarNoon: stdLib.Date,
    sunrise: stdLib.Date,
    sunriseEnd: stdLib.Date,
    sunset: stdLib.Date,
    sunsetStart: stdLib.Date
  ): GetTimesResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dawn")(dawn)
    __obj.updateDynamic("dusk")(dusk)
    __obj.updateDynamic("goldenHour")(goldenHour)
    __obj.updateDynamic("goldenHourEnd")(goldenHourEnd)
    __obj.updateDynamic("nadir")(nadir)
    __obj.updateDynamic("nauticalDawn")(nauticalDawn)
    __obj.updateDynamic("nauticalDusk")(nauticalDusk)
    __obj.updateDynamic("night")(night)
    __obj.updateDynamic("nightEnd")(nightEnd)
    __obj.updateDynamic("solarNoon")(solarNoon)
    __obj.updateDynamic("sunrise")(sunrise)
    __obj.updateDynamic("sunriseEnd")(sunriseEnd)
    __obj.updateDynamic("sunset")(sunset)
    __obj.updateDynamic("sunsetStart")(sunsetStart)
    __obj.asInstanceOf[GetTimesResult]
  }
}

