package typings.winrtUwp.global.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a magnetic sensor. */
@JSGlobal("Windows.Devices.Sensors.Magnetometer")
@js.native
abstract class Magnetometer ()
  extends typings.winrtUwp.Windows.Devices.Sensors.Magnetometer
/* static members */
@JSGlobal("Windows.Devices.Sensors.Magnetometer")
@js.native
object Magnetometer extends js.Object {
  
  /**
    * Returns the default magnetometer.
    * @return The default magnetometer.
    */
  def getDefault(): typings.winrtUwp.Windows.Devices.Sensors.Magnetometer = js.native
}
