package typings.winrtUwp.global.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an ambient light–sensor reading. */
@JSGlobal("Windows.Devices.Sensors.LightSensorReading")
@js.native
abstract class LightSensorReading ()
  extends typings.winrtUwp.Windows.Devices.Sensors.LightSensorReading {
  /** Gets the illuminance level in lux. */
  /* CompleteClass */
  override var illuminanceInLux: Double = js.native
  /** Gets the time at which the sensor reported the reading. */
  /* CompleteClass */
  override var timestamp: Date = js.native
}

