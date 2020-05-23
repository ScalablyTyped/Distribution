package typings.winrtUwp.Windows.Devices.Spi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a device connected through the SPI bus. */
trait SpiDevice extends js.Object {
  /** Gets the connection settings for the device. */
  var connectionSettings: SpiConnectionSettings
  /** Gets the unique ID associated with the device. */
  var deviceId: String
  /** Closes the connection to the device. */
  def close(): Unit
  /**
    * Reads from the connected device.
    * @return Array containing data read from the device.
    */
  def read(): js.Array[Double]
  /**
    * Transfer data using a full duplex communication system. Full duplex allows both the master and the slave to communicate simultaneously.
    * @param writeBuffer Array containing data to write to the device.
    * @return Array containing data read from the device.
    */
  def transferFullDuplex(writeBuffer: js.Array[Double]): js.Array[Double]
  /**
    * Transfer data sequentially to the device.
    * @param writeBuffer Array containing data to write to the device.
    * @return Array containing data read from the device.
    */
  def transferSequential(writeBuffer: js.Array[Double]): js.Array[Double]
  /**
    * Writes to the connected device.
    * @param buffer Array containing the data to write to the device.
    */
  def write(buffer: js.Array[Double]): Unit
}

object SpiDevice {
  @scala.inline
  def apply(
    close: () => Unit,
    connectionSettings: SpiConnectionSettings,
    deviceId: String,
    read: () => js.Array[Double],
    transferFullDuplex: js.Array[Double] => js.Array[Double],
    transferSequential: js.Array[Double] => js.Array[Double],
    write: js.Array[Double] => Unit
  ): SpiDevice = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), connectionSettings = connectionSettings.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], read = js.Any.fromFunction0(read), transferFullDuplex = js.Any.fromFunction1(transferFullDuplex), transferSequential = js.Any.fromFunction1(transferSequential), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[SpiDevice]
  }
}

