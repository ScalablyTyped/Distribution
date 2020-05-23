package typings.winrtUwp.Windows.Devices.Spi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the settings for the connection with a device. */
trait SpiConnectionSettings extends js.Object {
  /** Gets or sets the chip select line for the connection to the SPI device. */
  var chipSelectLine: Double
  /** Gets or sets the clock frequency for the connection. */
  var clockFrequency: Double
  /** Gets or sets the bit length for data on this connection. */
  var dataBitLength: Double
  /** Gets or sets the SpiMode for this connection. */
  var mode: SpiMode
  /** Gets or sets the sharing mode for the SPI connection. */
  var sharingMode: SpiSharingMode
}

object SpiConnectionSettings {
  @scala.inline
  def apply(
    chipSelectLine: Double,
    clockFrequency: Double,
    dataBitLength: Double,
    mode: SpiMode,
    sharingMode: SpiSharingMode
  ): SpiConnectionSettings = {
    val __obj = js.Dynamic.literal(chipSelectLine = chipSelectLine.asInstanceOf[js.Any], clockFrequency = clockFrequency.asInstanceOf[js.Any], dataBitLength = dataBitLength.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], sharingMode = sharingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpiConnectionSettings]
  }
}

