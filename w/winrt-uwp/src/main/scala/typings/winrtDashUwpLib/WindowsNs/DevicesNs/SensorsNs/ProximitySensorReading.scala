package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a reading from the proximity sensor. */
@JSGlobal("Windows.Devices.Sensors.ProximitySensorReading")
@js.native
abstract class ProximitySensorReading () extends js.Object {
  /** Gets the distance from the proximity sensor to the detected object. */
  var distanceInMillimeters: scala.Double = js.native
  /** Gets whether or not an object is detected by the proximity sensor. */
  var isDetected: scala.Boolean = js.native
  /** Gets the time for the most recent proximity sensor reading. */
  var timestamp: stdLib.Date = js.native
}

