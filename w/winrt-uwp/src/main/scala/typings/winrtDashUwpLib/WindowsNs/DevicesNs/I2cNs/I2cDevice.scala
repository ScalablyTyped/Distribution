package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.I2cNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a communications channel to a device on an inter-integrated circuit (I²C) bus. */
@JSGlobal("Windows.Devices.I2c.I2cDevice")
@js.native
abstract class I2cDevice () extends js.Object {
  /** Gets the connection settings used for communication with the inter-integrated circuit (I²C) device. */
  var connectionSettings: I2cConnectionSettings = js.native
  /** Gets the plug and play device identifier of the inter-integrated circuit (I²C) bus controller for the device. */
  var deviceId: java.lang.String = js.native
  /** Closes the connection to the inter-integrated circuit (I²C) device. */
  def close(): scala.Unit = js.native
  /**
    * Reads data from the inter-integrated circuit (I²C) bus on which the device is connected into the specified buffer.
    * @param buffer The buffer to which you want to read the data from the I²C bus. The length of the buffer determines how much data to request from the device.
    */
  def read(buffer: js.Array[scala.Double]): scala.Unit = js.native
  /**
    * Reads data from the inter-integrated circuit (I²C) bus on which the device is connected into the specified buffer, and returns information about the success of the operation that you can use for error handling.
    * @param buffer The buffer to which you want to read the data from the I²C bus. The length of the buffer determines how much data to request from the device.
    * @return A structure that contains information about the success of the read operation and the actual number of bytes that the operation read into the buffer.
    */
  def readPartial(buffer: js.Array[scala.Double]): I2cTransferResult = js.native
  /**
    * Writes data to the inter-integrated circuit (I²C) bus on which the device is connected, based on the bus address specified in the I2cConnectionSetting s object that you used to create the I2cDevice object.
    * @param buffer A buffer that contains the data that you want to write to the I²C device. This data should not include the bus address.
    */
  def write(buffer: js.Array[scala.Double]): scala.Unit = js.native
  /**
    * Writes data to the inter-integrated circuit (I²C) bus on which the device is connected, and returns information about the success of the operation that you can use for error handling.
    * @param buffer A buffer that contains the data that you want to write to the I²C device. This data should not include the bus address.
    * @return A structure that contains information about the success of the write operation and the actual number of bytes that the operation wrote into the buffer.
    */
  def writePartial(buffer: js.Array[scala.Double]): I2cTransferResult = js.native
  /**
    * Performs an atomic operation to write data to and then read data from the inter-integrated circuit (I²C) bus on which the device is connected, and sends a restart condition between the write and read operations.
    * @param writeBuffer A buffer that contains the data that you want to write to the I²C device. This data should not include the bus address.
    * @param readBuffer The buffer to which you want to read the data from the I²C bus. The length of the buffer determines how much data to request from the device.
    */
  def writeRead(writeBuffer: js.Array[scala.Double], readBuffer: js.Array[scala.Double]): scala.Unit = js.native
  /**
    * Performs an atomic operation to write data to and then read data from the inter-integrated circuit (I²C) bus on which the device is connected, and returns information about the success of the operation that you can use for error handling.
    * @param writeBuffer A buffer that contains the data that you want to write to the I²C device. This data should not include the bus address.
    * @param readBuffer The buffer to which you want to read the data from the I²C bus. The length of the buffer determines how much data to request from the device.
    * @return A structure that contains information about whether both the read and write parts of the operation succeeded and the sum of the actual number of bytes that the operation wrote and the actual number of bytes that the operation read.
    */
  def writeReadPartial(writeBuffer: js.Array[scala.Double], readBuffer: js.Array[scala.Double]): I2cTransferResult = js.native
}

/** Represents a communications channel to a device on an inter-integrated circuit (I²C) bus. */
@JSGlobal("Windows.Devices.I2c.I2cDevice")
@js.native
object I2cDevice extends js.Object {
  /**
    * Retrieves an I2cDevice object asynchronously for the inter-integrated circuit (I²C) bus controller that has the specified plug and play device identifier, using the specified connection settings.
    * @param deviceId The plug and play device identifier of the I²C bus controller for which you want to create an I2cDevice object.
    * @param settings The connection settings to use for communication with the I²C bus controller that deviceId specifies.
    * @return An asynchronous operation that returns the I2cDevice object.
    */
  def fromIdAsync(
    deviceId: java.lang.String,
    settings: winrtDashUwpLib.WindowsNs.DevicesNs.I2cNs.I2cConnectionSettings
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.I2cNs.I2cDevice] = js.native
  /**
    * Retrieves an Advanced Query Syntax (AQS) string for all of the inter-integrated circuit (I²C) bus controllers on the system. You can use this string with the DeviceInformation.FindAllAsync method to get DeviceInformation objects for those bus controllers.
    * @return An AQS string for all of the I²C bus controllers on the system, which you can use with the DeviceInformation.FindAllAsync method to get DeviceInformation objects for those bus controllers.
    */
  def getDeviceSelector(): java.lang.String = js.native
  /**
    * Retrieves an Advanced Query Syntax (AQS) string for the inter-integrated circuit (I²C) bus that has the specified friendly name. You can use this string with the DeviceInformation.FindAllAsync method to get a DeviceInformation object for that bus.
    * @param friendlyName A friendly name for the particular I²C bus on a particular hardware platform for which you want to get the AQS string.
    * @return An AQS string for the I²C bus that friendlyName specifies, which you can use with the DeviceInformation.FindAllAsync method to get a DeviceInformation object for that bus.
    */
  def getDeviceSelector(friendlyName: java.lang.String): java.lang.String = js.native
}

