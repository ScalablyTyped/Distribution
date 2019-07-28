package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.BackgroundNs

import typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs.ISensorDataThreshold
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a trigger that responds when a threshold limit for a sensor is crossed. */
@JSGlobal("Windows.ApplicationModel.Background.SensorDataThresholdTrigger")
@js.native
class SensorDataThresholdTrigger protected () extends js.Object {
  /**
    * Initializes a new instance of the SensorDataThresholdTrigger class.
    * @param threshold The threshold for a sensor that indicates when it should be triggered.
    */
  def this(threshold: ISensorDataThreshold) = this()
}

