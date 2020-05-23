package typings.winrtUwp.global.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a gyrometer reading. */
@JSGlobal("Windows.Devices.Sensors.GyrometerReading")
@js.native
abstract class GyrometerReading ()
  extends typings.winrtUwp.Windows.Devices.Sensors.GyrometerReading {
  /** Gets the angular velocity, in degrees per second, about the x-axis. */
  /* CompleteClass */
  override var angularVelocityX: Double = js.native
  /** Gets the angular velocity, in degrees per second, about the y-axis. */
  /* CompleteClass */
  override var angularVelocityY: Double = js.native
  /** Gets the angular velocity, in degrees per second, about the z-axis. */
  /* CompleteClass */
  override var angularVelocityZ: Double = js.native
  /** Gets the time at which the sensor reported the reading. */
  /* CompleteClass */
  override var timestamp: Date = js.native
}

