package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the accelerometer-shaken event. */
@JSGlobal("Windows.Devices.Sensors.AccelerometerShakenEventArgs")
@js.native
abstract class AccelerometerShakenEventArgs () extends js.Object {
  /** Gets the time at which the sensor reported the shaken event. */
  var timestamp: stdLib.Date = js.native
}

