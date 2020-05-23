package typings.winrtUwp.Windows.Devices.I2c

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the I²C controller for the system. */
trait I2cController extends js.Object {
  /**
    * Gets the I²C device with the specified settings.
    * @param settings The desired connection settings.
    * @return The I²C device.
    */
  def getDevice(settings: I2cConnectionSettings): I2cDevice
}

object I2cController {
  @scala.inline
  def apply(getDevice: I2cConnectionSettings => I2cDevice): I2cController = {
    val __obj = js.Dynamic.literal(getDevice = js.Any.fromFunction1(getDevice))
    __obj.asInstanceOf[I2cController]
  }
}

