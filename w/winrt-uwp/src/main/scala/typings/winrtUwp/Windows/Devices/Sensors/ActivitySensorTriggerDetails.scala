package typings.winrtUwp.Windows.Devices.Sensors

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents details about the sensor triggering. */
@js.native
trait ActivitySensorTriggerDetails extends js.Object {
  /**
    * Reads reports about the sensor triggering.
    * @return Returns a list of ActivitySensorReadingChangeReport objects that provides data for the sensor trigger.
    */
  def readReports(): IVectorView[ActivitySensorReadingChangeReport] = js.native
}

object ActivitySensorTriggerDetails {
  @scala.inline
  def apply(readReports: () => IVectorView[ActivitySensorReadingChangeReport]): ActivitySensorTriggerDetails = {
    val __obj = js.Dynamic.literal(readReports = js.Any.fromFunction0(readReports))
    __obj.asInstanceOf[ActivitySensorTriggerDetails]
  }
  @scala.inline
  implicit class ActivitySensorTriggerDetailsOps[Self <: ActivitySensorTriggerDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReadReports(value: () => IVectorView[ActivitySensorReadingChangeReport]): Self = this.set("readReports", js.Any.fromFunction0(value))
  }
  
}

