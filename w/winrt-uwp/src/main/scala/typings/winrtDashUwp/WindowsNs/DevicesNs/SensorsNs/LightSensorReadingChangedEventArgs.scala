package typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the ambient-light sensor reading-changed event. */
@JSGlobal("Windows.Devices.Sensors.LightSensorReadingChangedEventArgs")
@js.native
abstract class LightSensorReadingChangedEventArgs () extends js.Object {
  /** Gets the current ambient light-sensor reading. */
  var reading: LightSensorReading = js.native
}

