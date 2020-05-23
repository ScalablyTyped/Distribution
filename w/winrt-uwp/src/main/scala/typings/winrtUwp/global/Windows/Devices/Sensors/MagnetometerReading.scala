package typings.winrtUwp.global.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a magnetometer reading. */
@JSGlobal("Windows.Devices.Sensors.MagnetometerReading")
@js.native
abstract class MagnetometerReading ()
  extends typings.winrtUwp.Windows.Devices.Sensors.MagnetometerReading {
  /** Gets the magnetometer's directional accuracy. */
  /* CompleteClass */
  override var directionalAccuracy: typings.winrtUwp.Windows.Devices.Sensors.MagnetometerAccuracy = js.native
  /** Gets the magnetic field strength in microteslas along the X axis. */
  /* CompleteClass */
  override var magneticFieldX: Double = js.native
  /** Gets the magnetic field strength in microteslas along the Y axis. */
  /* CompleteClass */
  override var magneticFieldY: Double = js.native
  /** Gets the magnetic field strength in microteslas along the Z axis. */
  /* CompleteClass */
  override var magneticFieldZ: Double = js.native
  /** Gets the time at which the sensor reported the reading. */
  /* CompleteClass */
  override var timestamp: Date = js.native
}

