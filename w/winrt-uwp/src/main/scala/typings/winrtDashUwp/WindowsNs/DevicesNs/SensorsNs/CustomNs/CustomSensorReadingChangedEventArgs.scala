package typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs.CustomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents data for the reading–changed event of the custom sensor. */
@JSGlobal("Windows.Devices.Sensors.Custom.CustomSensorReadingChangedEventArgs")
@js.native
abstract class CustomSensorReadingChangedEventArgs () extends js.Object {
  /** Gets the most recent sensor reading. */
  var reading: CustomSensorReading = js.native
}

