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
    val __obj = js.Dynamic.literal(dawn = dawn, dusk = dusk, goldenHour = goldenHour, goldenHourEnd = goldenHourEnd, nadir = nadir, nauticalDawn = nauticalDawn, nauticalDusk = nauticalDusk, night = night, nightEnd = nightEnd, solarNoon = solarNoon, sunrise = sunrise, sunriseEnd = sunriseEnd, sunset = sunset, sunsetStart = sunsetStart)
  
    __obj.asInstanceOf[GetTimesResult]
  }
}

