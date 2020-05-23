package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a barometer reading. */
trait BarometerReading extends js.Object {
  /** Gets the barometric pressure determined by the barometer sensor. */
  var stationPressureInHectopascals: Double
  /** Gets the time for the most recent barometer reading. */
  var timestamp: Date
}

object BarometerReading {
  @scala.inline
  def apply(stationPressureInHectopascals: Double, timestamp: Date): BarometerReading = {
    val __obj = js.Dynamic.literal(stationPressureInHectopascals = stationPressureInHectopascals.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarometerReading]
  }
}

