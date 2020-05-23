package typings.winrtUwp.Windows.Devices.I2c

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a communications channel to a device on an inter-integrated circuit (I²C) bus. */
trait I2cDevice extends js.Object {
  /** Gets the connection settings used for communication with the inter-integrated circuit (I²C) device. */
  var connectionSettings: I2cConnectionSettings
  /** Gets the plug and play device identifier of the inter-integrated circuit (I²C) bus controller for the device. */
  var deviceId: String
  /** Closes the connection to the inter-integrated circuit (I²C) device. */
  def close(): Unit
  /**
    * Reads data from the inter-integrated circuit (I²C) bus on which the device is connected into the specified buffer.
    * @param buffer The buffer to which you want to read the data from the I²C bus. The length of the buffer determines how much data to request from the device.
    */
  def read(buffer: js.Array[Double]): Unit
  /**
    * Reads data from the inter-integrated circuit (I²C) bus on which the device is connected into the specified buffer, and returns information about the success of the operation that you can use for error handling.
    * @param buffer The buffer to which you want to read the data from the I²C bus. The length of the buffer determines how much data to request from the device.
    * @return A structure that contains information about the success of the read operation and the actual number of bytes that the operation read into the buffer.
    */
  def readPartial(buffer: js.Array[Double]): I2cTransferResult
  /**
    * Writes data to the inter-integrated circuit (I²C) bus on which the device is connected, based on the bus address specified in the I2cConnectionSetting s object that you used to create the I2cDevice object.
    * @param buffer A buffer that contains the data that you want to write to the I²C device. This data should not include the bus address.
    */
  def write(buffer: js.Array[Double]): Unit
  /**
    * Writes data to the inter-integrated circuit (I²C) bus on which the device is connected, and returns information about the success of the operation that you can use for error handling.
    * @param buffer A buffer that contains the data that you want to write to the I²C device. This data should not include the bus address.
    * @return A structure that contains information about the success of the write operation and the actual number of bytes that the operation wrote into the buffer.
    */
  def writePartial(buffer: js.Array[Double]): I2cTransferResult
  /**
    * Performs an atomic operation to write data to and then read data from the inter-integrated circuit (I²C) bus on which the device is connected, and sends a restart condition between the write and read operations.
    * @param writeBuffer A buffer that contains the data that you want to write to the I²C device. This data should not include the bus address.
    * @param readBuffer The buffer to which you want to read the data from the I²C bus. The length of the buffer determines how much data to request from the device.
    */
  def writeRead(writeBuffer: js.Array[Double], readBuffer: js.Array[Double]): Unit
  /**
    * Performs an atomic operation to write data to and then read data from the inter-integrated circuit (I²C) bus on which the device is connected, and returns information about the success of the operation that you can use for error handling.
    * @param writeBuffer A buffer that contains the data that you want to write to the I²C device. This data should not include the bus address.
    * @param readBuffer The buffer to which you want to read the data from the I²C bus. The length of the buffer determines how much data to request from the device.
    * @return A structure that contains information about whether both the read and write parts of the operation succeeded and the sum of the actual number of bytes that the operation wrote and the actual number of bytes that the operation read.
    */
  def writeReadPartial(writeBuffer: js.Array[Double], readBuffer: js.Array[Double]): I2cTransferResult
}

object I2cDevice {
  @scala.inline
  def apply(
    close: () => Unit,
    connectionSettings: I2cConnectionSettings,
    deviceId: String,
    read: js.Array[Double] => Unit,
    readPartial: js.Array[Double] => I2cTransferResult,
    write: js.Array[Double] => Unit,
    writePartial: js.Array[Double] => I2cTransferResult,
    writeRead: (js.Array[Double], js.Array[Double]) => Unit,
    writeReadPartial: (js.Array[Double], js.Array[Double]) => I2cTransferResult
  ): I2cDevice = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), connectionSettings = connectionSettings.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], read = js.Any.fromFunction1(read), readPartial = js.Any.fromFunction1(readPartial), write = js.Any.fromFunction1(write), writePartial = js.Any.fromFunction1(writePartial), writeRead = js.Any.fromFunction2(writeRead), writeReadPartial = js.Any.fromFunction2(writeReadPartial))
    __obj.asInstanceOf[I2cDevice]
  }
}

