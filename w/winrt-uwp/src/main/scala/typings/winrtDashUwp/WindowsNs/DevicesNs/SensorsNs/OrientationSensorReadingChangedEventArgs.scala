package typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the orientation-sensor reading-changed event. */
@JSGlobal("Windows.Devices.Sensors.OrientationSensorReadingChangedEventArgs")
@js.native
abstract class OrientationSensorReadingChangedEventArgs () extends js.Object {
  /** Gets the current reading which includes a Quaternion, a RotationMatrix, and a timestamp. */
  var reading: OrientationSensorReading = js.native
}

