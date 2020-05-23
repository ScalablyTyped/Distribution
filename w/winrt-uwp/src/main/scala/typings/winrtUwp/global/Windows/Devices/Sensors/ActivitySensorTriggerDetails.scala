package typings.winrtUwp.global.Windows.Devices.Sensors

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents details about the sensor triggering. */
@JSGlobal("Windows.Devices.Sensors.ActivitySensorTriggerDetails")
@js.native
abstract class ActivitySensorTriggerDetails ()
  extends typings.winrtUwp.Windows.Devices.Sensors.ActivitySensorTriggerDetails {
  /**
    * Reads reports about the sensor triggering.
    * @return Returns a list of ActivitySensorReadingChangeReport objects that provides data for the sensor trigger.
    */
  /* CompleteClass */
  override def readReports(): IVectorView[typings.winrtUwp.Windows.Devices.Sensors.ActivitySensorReadingChangeReport] = js.native
}

