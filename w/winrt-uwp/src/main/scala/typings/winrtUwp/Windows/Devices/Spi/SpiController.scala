package typings.winrtUwp.Windows.Devices.Spi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the SPI controller on the system. */
trait SpiController extends js.Object {
  /**
    * Gets the SPI device with the specified settings.
    * @param settings The desired connection settings.
    * @return The SPI device.
    */
  def getDevice(settings: SpiConnectionSettings): SpiDevice
}

object SpiController {
  @scala.inline
  def apply(getDevice: SpiConnectionSettings => SpiDevice): SpiController = {
    val __obj = js.Dynamic.literal(getDevice = js.Any.fromFunction1(getDevice))
    __obj.asInstanceOf[SpiController]
  }
}

