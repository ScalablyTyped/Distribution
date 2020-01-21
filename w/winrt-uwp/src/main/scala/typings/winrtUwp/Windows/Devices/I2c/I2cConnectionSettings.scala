package typings.winrtUwp.Windows.Devices.I2c

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the connection settings you want to use for an inter-integrated circuit (I²C) device. */
@JSGlobal("Windows.Devices.I2c.I2cConnectionSettings")
@js.native
class I2cConnectionSettings protected () extends js.Object {
  /**
    * Creates and initializes a new instance of the I2cConnectionSettings class for inter-integrated circuit (I²C) device with specified bus address, using the default settings of the standard mode for the bus speed and exclusive sharing mode.
    * @param slaveAddress The bus address of the inter-integrated circuit (I²C) device to which the settings of the I2cConnectionSettings should apply. Only 7-bit addressing is supported, so the range of values that are valid is from 8 to 119.
    */
  def this(slaveAddress: Double) = this()
  /** Gets or sets the bus speed to use for connecting to an inter-integrated circuit (I²C) device. The bus speed is the frequency at which to clock the I²C bus when accessing the device. */
  var busSpeed: I2cBusSpeed = js.native
  /** Gets or sets the sharing mode to use to connect to the inter-integrated circuit (I²C) bus address. This mode determines whether other connections to the I²C bus address can be opened while you are connect to the I²C bus address. */
  var sharingMode: I2cSharingMode = js.native
  /** Gets or sets the bus address of the inter-integrated circuit (I²C) device. */
  var slaveAddress: Double = js.native
}

