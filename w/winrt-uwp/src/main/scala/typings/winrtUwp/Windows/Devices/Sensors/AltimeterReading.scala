package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an altimeter reading. */
trait AltimeterReading extends js.Object {
  /** Gets the current altitude determined by the altimeter sensor. */
  var altitudeChangeInMeters: Double
  /** Gets the time for the most recent altimeter reading. */
  var timestamp: Date
}

object AltimeterReading {
  @scala.inline
  def apply(altitudeChangeInMeters: Double, timestamp: Date): AltimeterReading = {
    val __obj = js.Dynamic.literal(altitudeChangeInMeters = altitudeChangeInMeters.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AltimeterReading]
  }
}

