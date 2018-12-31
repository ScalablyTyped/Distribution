package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents details about the sensor triggering. */
@JSGlobal("Windows.Devices.Sensors.ActivitySensorTriggerDetails")
@js.native
abstract class ActivitySensorTriggerDetails () extends js.Object {
  /**
    * Reads reports about the sensor triggering.
    * @return Returns a list of ActivitySensorReadingChangeReport objects that provides data for the sensor trigger.
    */
  def readReports(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ActivitySensorReadingChangeReport] = js.native
}

