package typings.winrtUwp.global.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an accelerometer sensor. */
@JSGlobal("Windows.Devices.Sensors.Accelerometer")
@js.native
abstract class Accelerometer ()
  extends typings.winrtUwp.Windows.Devices.Sensors.Accelerometer

/* static members */
@JSGlobal("Windows.Devices.Sensors.Accelerometer")
@js.native
object Accelerometer extends js.Object {
  /**
    * Returns the default accelerometer.
    * @return The default accelerometer or null if no integrated accelerometers are found.
    */
  def getDefault(): typings.winrtUwp.Windows.Devices.Sensors.Accelerometer = js.native
}

