package typings.winrtUwp.global.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a simple orientation sensor. */
@JSGlobal("Windows.Devices.Sensors.SimpleOrientationSensor")
@js.native
abstract class SimpleOrientationSensor ()
  extends typings.winrtUwp.Windows.Devices.Sensors.SimpleOrientationSensor

/* static members */
@JSGlobal("Windows.Devices.Sensors.SimpleOrientationSensor")
@js.native
object SimpleOrientationSensor extends js.Object {
  /**
    * Gets the default simple orientation sensor.
    * @return The default simple orientation sensor or null if no simple orientation sensors are found.
    */
  def getDefault(): typings.winrtUwp.Windows.Devices.Sensors.SimpleOrientationSensor = js.native
}

