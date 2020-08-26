package typings.winrtUwp.Windows.Devices.I2c

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a communications channel to a device on an inter-integrated circuit (I²C) bus. */
@js.native
trait I2cDevice extends js.Object {
  /** Gets the connection settings used for communication with the inter-integrated circuit (I²C) device. */
  var connectionSettings: I2cConnectionSettings = js.native
  /** Gets the plug and play device identifier of the inter-integrated circuit (I²C) bus controller for the device. */
  var deviceId: String = js.native
  /** Closes the connection to the inter-integrated circuit (I²C) device. */
  def close(): Unit = js.native
  /**
    * Reads data from the inter-integrated circuit (I²C) bus on which the device is connected into the specified buffer.
    * @param buffer The buffer to which you want to read the data from the I²C bus. The length of the buffer determines how much data to request from the device.
    */
  def read(buffer: js.Array[Double]): Unit = js.native
  /**
    * Reads data from the inter-integrated circuit (I²C) bus on which the device is connected into the specified buffer, and returns information about the success of the operation that you can use for error handling.
    * @param buffer The buffer to which you want to read the data from the I²C bus. The length of the buffer determines how much data to request from the device.
    * @return A structure that contains information about the success of the read operation and the actual number of bytes that the operation read into the buffer.
    */
  def readPartial(buffer: js.Array[Double]): I2cTransferResult = js.native
  /**
    * Writes data to the inter-integrated circuit (I²C) bus on which the device is connected, based on the bus address specified in the I2cConnectionSetting s object that you used to create the I2cDevice object.
    * @param buffer A buffer that contains the data that you want to write to the I²C device. This data should not include the bus address.
    */
  def write(buffer: js.Array[Double]): Unit = js.native
  /**
    * Writes data to the inter-integrated circuit (I²C) bus on which the device is connected, and returns information about the success of the operation that you can use for error handling.
    * @param buffer A buffer that contains the data that you want to write to the I²C device. This data should not include the bus address.
    * @return A structure that contains information about the success of the write operation and the actual number of bytes that the operation wrote into the buffer.
    */
  def writePartial(buffer: js.Array[Double]): I2cTransferResult = js.native
  /**
    * Performs an atomic operation to write data to and then read data from the inter-integrated circuit (I²C) bus on which the device is connected, and sends a restart condition between the write and read operations.
    * @param writeBuffer A buffer that contains the data that you want to write to the I²C device. This data should not include the bus address.
    * @param readBuffer The buffer to which you want to read the data from the I²C bus. The length of the buffer determines how much data to request from the device.
    */
  def writeRead(writeBuffer: js.Array[Double], readBuffer: js.Array[Double]): Unit = js.native
  /**
    * Performs an atomic operation to write data to and then read data from the inter-integrated circuit (I²C) bus on which the device is connected, and returns information about the success of the operation that you can use for error handling.
    * @param writeBuffer A buffer that contains the data that you want to write to the I²C device. This data should not include the bus address.
    * @param readBuffer The buffer to which you want to read the data from the I²C bus. The length of the buffer determines how much data to request from the device.
    * @return A structure that contains information about whether both the read and write parts of the operation succeeded and the sum of the actual number of bytes that the operation wrote and the actual number of bytes that the operation read.
    */
  def writeReadPartial(writeBuffer: js.Array[Double], readBuffer: js.Array[Double]): I2cTransferResult = js.native
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
  @scala.inline
  implicit class I2cDeviceOps[Self <: I2cDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setConnectionSettings(value: I2cConnectionSettings): Self = this.set("connectionSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRead(value: js.Array[Double] => Unit): Self = this.set("read", js.Any.fromFunction1(value))
    @scala.inline
    def setReadPartial(value: js.Array[Double] => I2cTransferResult): Self = this.set("readPartial", js.Any.fromFunction1(value))
    @scala.inline
    def setWrite(value: js.Array[Double] => Unit): Self = this.set("write", js.Any.fromFunction1(value))
    @scala.inline
    def setWritePartial(value: js.Array[Double] => I2cTransferResult): Self = this.set("writePartial", js.Any.fromFunction1(value))
    @scala.inline
    def setWriteRead(value: (js.Array[Double], js.Array[Double]) => Unit): Self = this.set("writeRead", js.Any.fromFunction2(value))
    @scala.inline
    def setWriteReadPartial(value: (js.Array[Double], js.Array[Double]) => I2cTransferResult): Self = this.set("writeReadPartial", js.Any.fromFunction2(value))
  }
  
}

