package typings.winrtUwp.global.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the ambient-light sensor reading-changed event. */
@JSGlobal("Windows.Devices.Sensors.LightSensorReadingChangedEventArgs")
@js.native
abstract class LightSensorReadingChangedEventArgs ()
  extends typings.winrtUwp.Windows.Devices.Sensors.LightSensorReadingChangedEventArgs {
  /** Gets the current ambient light-sensor reading. */
  /* CompleteClass */
  override var reading: typings.winrtUwp.Windows.Devices.Sensors.LightSensorReading = js.native
}

