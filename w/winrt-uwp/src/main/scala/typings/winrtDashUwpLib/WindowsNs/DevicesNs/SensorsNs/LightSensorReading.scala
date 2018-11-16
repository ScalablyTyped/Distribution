package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an ambient light–sensor reading. */
@JSGlobal("Windows.Devices.Sensors.LightSensorReading")
@js.native
abstract class LightSensorReading () extends js.Object {
  /** Gets the illuminance level in lux. */
  var illuminanceInLux: scala.Double = js.native
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: stdLib.Date = js.native
}

