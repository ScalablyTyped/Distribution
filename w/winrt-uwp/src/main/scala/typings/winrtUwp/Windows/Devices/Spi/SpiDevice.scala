package typings.winrtUwp.Windows.Devices.Spi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a device connected through the SPI bus. */
@js.native
trait SpiDevice extends js.Object {
  /** Gets the connection settings for the device. */
  var connectionSettings: SpiConnectionSettings = js.native
  /** Gets the unique ID associated with the device. */
  var deviceId: String = js.native
  /** Closes the connection to the device. */
  def close(): Unit = js.native
  /**
    * Reads from the connected device.
    * @return Array containing data read from the device.
    */
  def read(): js.Array[Double] = js.native
  /**
    * Transfer data using a full duplex communication system. Full duplex allows both the master and the slave to communicate simultaneously.
    * @param writeBuffer Array containing data to write to the device.
    * @return Array containing data read from the device.
    */
  def transferFullDuplex(writeBuffer: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Transfer data sequentially to the device.
    * @param writeBuffer Array containing data to write to the device.
    * @return Array containing data read from the device.
    */
  def transferSequential(writeBuffer: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Writes to the connected device.
    * @param buffer Array containing the data to write to the device.
    */
  def write(buffer: js.Array[Double]): Unit = js.native
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
  @scala.inline
  implicit class SpiDeviceOps[Self <: SpiDevice] (val x: Self) extends AnyVal {
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
    def setConnectionSettings(value: SpiConnectionSettings): Self = this.set("connectionSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRead(value: () => js.Array[Double]): Self = this.set("read", js.Any.fromFunction0(value))
    @scala.inline
    def setTransferFullDuplex(value: js.Array[Double] => js.Array[Double]): Self = this.set("transferFullDuplex", js.Any.fromFunction1(value))
    @scala.inline
    def setTransferSequential(value: js.Array[Double] => js.Array[Double]): Self = this.set("transferSequential", js.Any.fromFunction1(value))
    @scala.inline
    def setWrite(value: js.Array[Double] => Unit): Self = this.set("write", js.Any.fromFunction1(value))
  }
  
}

