package typings.winrtUwp.global.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the sensor reading–changed event. */
@JSGlobal("Windows.Devices.Sensors.SimpleOrientationSensorOrientationChangedEventArgs")
@js.native
abstract class SimpleOrientationSensorOrientationChangedEventArgs ()
  extends typings.winrtUwp.Windows.Devices.Sensors.SimpleOrientationSensorOrientationChangedEventArgs {
  /** Gets the current sensor orientation. */
  /* CompleteClass */
  override var orientation: typings.winrtUwp.Windows.Devices.Sensors.SimpleOrientation = js.native
  /** Gets the time of the current sensor reading. */
  /* CompleteClass */
  override var timestamp: Date = js.native
}

