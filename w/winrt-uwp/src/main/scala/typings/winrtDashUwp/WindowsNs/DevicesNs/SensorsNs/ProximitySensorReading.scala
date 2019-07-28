package typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a reading from the proximity sensor. */
@JSGlobal("Windows.Devices.Sensors.ProximitySensorReading")
@js.native
abstract class ProximitySensorReading () extends js.Object {
  /** Gets the distance from the proximity sensor to the detected object. */
  var distanceInMillimeters: Double = js.native
  /** Gets whether or not an object is detected by the proximity sensor. */
  var isDetected: Boolean = js.native
  /** Gets the time for the most recent proximity sensor reading. */
  var timestamp: Date = js.native
}

