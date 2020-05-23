package typings.winrtUwp.Windows.Devices.I2c

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the connection settings you want to use for an inter-integrated circuit (I²C) device. */
trait I2cConnectionSettings extends js.Object {
  /** Gets or sets the bus speed to use for connecting to an inter-integrated circuit (I²C) device. The bus speed is the frequency at which to clock the I²C bus when accessing the device. */
  var busSpeed: I2cBusSpeed
  /** Gets or sets the sharing mode to use to connect to the inter-integrated circuit (I²C) bus address. This mode determines whether other connections to the I²C bus address can be opened while you are connect to the I²C bus address. */
  var sharingMode: I2cSharingMode
  /** Gets or sets the bus address of the inter-integrated circuit (I²C) device. */
  var slaveAddress: Double
}

object I2cConnectionSettings {
  @scala.inline
  def apply(busSpeed: I2cBusSpeed, sharingMode: I2cSharingMode, slaveAddress: Double): I2cConnectionSettings = {
    val __obj = js.Dynamic.literal(busSpeed = busSpeed.asInstanceOf[js.Any], sharingMode = sharingMode.asInstanceOf[js.Any], slaveAddress = slaveAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[I2cConnectionSettings]
  }
}

