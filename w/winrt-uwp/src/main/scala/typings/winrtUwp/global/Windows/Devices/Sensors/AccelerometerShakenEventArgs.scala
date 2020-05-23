package typings.winrtUwp.global.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the accelerometer-shaken event. */
@JSGlobal("Windows.Devices.Sensors.AccelerometerShakenEventArgs")
@js.native
abstract class AccelerometerShakenEventArgs ()
  extends typings.winrtUwp.Windows.Devices.Sensors.AccelerometerShakenEventArgs {
  /** Gets the time at which the sensor reported the shaken event. */
  /* CompleteClass */
  override var timestamp: Date = js.native
}

