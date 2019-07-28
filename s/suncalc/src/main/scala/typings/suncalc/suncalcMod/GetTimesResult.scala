package typings.suncalc.suncalcMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTimesResult extends js.Object {
  var dawn: Date
  var dusk: Date
  var goldenHour: Date
  var goldenHourEnd: Date
  var nadir: Date
  var nauticalDawn: Date
  var nauticalDusk: Date
  var night: Date
  var nightEnd: Date
  var solarNoon: Date
  var sunrise: Date
  var sunriseEnd: Date
  var sunset: Date
  var sunsetStart: Date
}

object GetTimesResult {
  @scala.inline
  def apply(
    dawn: Date,
    dusk: Date,
    goldenHour: Date,
    goldenHourEnd: Date,
    nadir: Date,
    nauticalDawn: Date,
    nauticalDusk: Date,
    night: Date,
    nightEnd: Date,
    solarNoon: Date,
    sunrise: Date,
    sunriseEnd: Date,
    sunset: Date,
    sunsetStart: Date
  ): GetTimesResult = {
    val __obj = js.Dynamic.literal(dawn = dawn, dusk = dusk, goldenHour = goldenHour, goldenHourEnd = goldenHourEnd, nadir = nadir, nauticalDawn = nauticalDawn, nauticalDusk = nauticalDusk, night = night, nightEnd = nightEnd, solarNoon = solarNoon, sunrise = sunrise, sunriseEnd = sunriseEnd, sunset = sunset, sunsetStart = sunsetStart)
  
    __obj.asInstanceOf[GetTimesResult]
  }
}

