package typings.suncalc.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTimesResult extends js.Object {
  var dawn: Date = js.native
  var dusk: Date = js.native
  var goldenHour: Date = js.native
  var goldenHourEnd: Date = js.native
  var nadir: Date = js.native
  var nauticalDawn: Date = js.native
  var nauticalDusk: Date = js.native
  var night: Date = js.native
  var nightEnd: Date = js.native
  var solarNoon: Date = js.native
  var sunrise: Date = js.native
  var sunriseEnd: Date = js.native
  var sunset: Date = js.native
  var sunsetStart: Date = js.native
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
  @scala.inline
  implicit class GetTimesResultOps[Self <: GetTimesResult] (val x: Self) extends AnyVal {
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
    def setDawn(value: Date): Self = this.set("dawn", value.asInstanceOf[js.Any])
    @scala.inline
    def setDusk(value: Date): Self = this.set("dusk", value.asInstanceOf[js.Any])
    @scala.inline
    def setGoldenHour(value: Date): Self = this.set("goldenHour", value.asInstanceOf[js.Any])
    @scala.inline
    def setGoldenHourEnd(value: Date): Self = this.set("goldenHourEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setNadir(value: Date): Self = this.set("nadir", value.asInstanceOf[js.Any])
    @scala.inline
    def setNauticalDawn(value: Date): Self = this.set("nauticalDawn", value.asInstanceOf[js.Any])
    @scala.inline
    def setNauticalDusk(value: Date): Self = this.set("nauticalDusk", value.asInstanceOf[js.Any])
    @scala.inline
    def setNight(value: Date): Self = this.set("night", value.asInstanceOf[js.Any])
    @scala.inline
    def setNightEnd(value: Date): Self = this.set("nightEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setSolarNoon(value: Date): Self = this.set("solarNoon", value.asInstanceOf[js.Any])
    @scala.inline
    def setSunrise(value: Date): Self = this.set("sunrise", value.asInstanceOf[js.Any])
    @scala.inline
    def setSunriseEnd(value: Date): Self = this.set("sunriseEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setSunset(value: Date): Self = this.set("sunset", value.asInstanceOf[js.Any])
    @scala.inline
    def setSunsetStart(value: Date): Self = this.set("sunsetStart", value.asInstanceOf[js.Any])
  }
  
}

