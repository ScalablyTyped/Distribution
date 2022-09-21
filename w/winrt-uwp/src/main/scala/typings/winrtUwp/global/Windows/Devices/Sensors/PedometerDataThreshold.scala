package typings.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A threshold for the Pedometer sensor. When the threshold conditions are met, the sensor trigger will activate. */
@JSGlobal("Windows.Devices.Sensors.PedometerDataThreshold")
@js.native
open class PedometerDataThreshold protected ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Sensors.PedometerDataThreshold {
  /**
    * Creates a PedometerDataThreshold object.
    * @param sensor The pedometer sensor.
    * @param stepGoal The number of steps before the threshold is exceeded and the background task is activated.
    */
  def this(sensor: typings.winrtUwp.Windows.Devices.Sensors.Pedometer, stepGoal: Double) = this()
}
