package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A threshold for the Pedometer sensor. When the threshold conditions are met, the sensor trigger will activate. */
@JSGlobal("Windows.Devices.Sensors.PedometerDataThreshold")
@js.native
class PedometerDataThreshold protected () extends js.Object {
  /**
    * Creates a PedometerDataThreshold object.
    * @param sensor The pedometer sensor.
    * @param stepGoal The number of steps before the threshold is exceeded and the background task is activated.
    */
  def this(sensor: Pedometer, stepGoal: scala.Double) = this()
}

