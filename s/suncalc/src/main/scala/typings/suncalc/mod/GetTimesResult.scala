package typings.suncalc.mod

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
    val __obj = js.Dynamic.literal(dawn = dawn.asInstanceOf[js.Any], dusk = dusk.asInstanceOf[js.Any], goldenHour = goldenHour.asInstanceOf[js.Any], goldenHourEnd = goldenHourEnd.asInstanceOf[js.Any], nadir = nadir.asInstanceOf[js.Any], nauticalDawn = nauticalDawn.asInstanceOf[js.Any], nauticalDusk = nauticalDusk.asInstanceOf[js.Any], night = night.asInstanceOf[js.Any], nightEnd = nightEnd.asInstanceOf[js.Any], solarNoon = solarNoon.asInstanceOf[js.Any], sunrise = sunrise.asInstanceOf[js.Any], sunriseEnd = sunriseEnd.asInstanceOf[js.Any], sunset = sunset.asInstanceOf[js.Any], sunsetStart = sunsetStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTimesResult]
  }
}

