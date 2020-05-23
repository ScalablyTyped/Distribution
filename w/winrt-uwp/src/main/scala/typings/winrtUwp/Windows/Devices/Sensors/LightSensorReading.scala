package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an ambient light–sensor reading. */
trait LightSensorReading extends js.Object {
  /** Gets the illuminance level in lux. */
  var illuminanceInLux: Double
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: Date
}

object LightSensorReading {
  @scala.inline
  def apply(illuminanceInLux: Double, timestamp: Date): LightSensorReading = {
    val __obj = js.Dynamic.literal(illuminanceInLux = illuminanceInLux.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightSensorReading]
  }
}

