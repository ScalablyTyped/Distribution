package typings.winrtUwp.global.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an ambient-light sensor. */
@JSGlobal("Windows.Devices.Sensors.LightSensor")
@js.native
abstract class LightSensor ()
  extends typings.winrtUwp.Windows.Devices.Sensors.LightSensor
/* static members */
@JSGlobal("Windows.Devices.Sensors.LightSensor")
@js.native
object LightSensor extends js.Object {
  
  /**
    * Returns the default ambient-light sensor.
    * @return The default ambient-light sensor or null if no integrated light sensors are found.
    */
  def getDefault(): typings.winrtUwp.Windows.Devices.Sensors.LightSensor = js.native
}
