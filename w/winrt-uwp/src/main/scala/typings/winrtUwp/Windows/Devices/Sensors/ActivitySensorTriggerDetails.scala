package typings.winrtUwp.Windows.Devices.Sensors

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents details about the sensor triggering. */
trait ActivitySensorTriggerDetails extends js.Object {
  /**
    * Reads reports about the sensor triggering.
    * @return Returns a list of ActivitySensorReadingChangeReport objects that provides data for the sensor trigger.
    */
  def readReports(): IVectorView[ActivitySensorReadingChangeReport]
}

object ActivitySensorTriggerDetails {
  @scala.inline
  def apply(readReports: () => IVectorView[ActivitySensorReadingChangeReport]): ActivitySensorTriggerDetails = {
    val __obj = js.Dynamic.literal(readReports = js.Any.fromFunction0(readReports))
    __obj.asInstanceOf[ActivitySensorTriggerDetails]
  }
}

