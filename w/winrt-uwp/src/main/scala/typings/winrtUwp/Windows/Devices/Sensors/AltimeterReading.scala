package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an altimeter reading. */
@js.native
trait AltimeterReading extends js.Object {
  /** Gets the current altitude determined by the altimeter sensor. */
  var altitudeChangeInMeters: Double = js.native
  /** Gets the time for the most recent altimeter reading. */
  var timestamp: Date = js.native
}

object AltimeterReading {
  @scala.inline
  def apply(altitudeChangeInMeters: Double, timestamp: Date): AltimeterReading = {
    val __obj = js.Dynamic.literal(altitudeChangeInMeters = altitudeChangeInMeters.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AltimeterReading]
  }
  @scala.inline
  implicit class AltimeterReadingOps[Self <: AltimeterReading] (val x: Self) extends AnyVal {
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
    def setAltitudeChangeInMeters(value: Double): Self = this.set("altitudeChangeInMeters", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

