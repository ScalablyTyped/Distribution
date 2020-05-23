package typings.winrtUwp.Windows.Devices.Spi

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the info about a SPI bus. */
trait SpiBusInfo extends js.Object {
  /** Gets the number of chip select lines available on the bus. */
  var chipSelectLineCount: Double
  /** Maximum clock cycle frequency of the bus. */
  var maxClockFrequency: Double
  /** Minimum clock cycle frequency of the bus. */
  var minClockFrequency: Double
  /** Gets the bit lengths that can be used on the bus for transmitting data. */
  var supportedDataBitLengths: IVectorView[Double]
}

object SpiBusInfo {
  @scala.inline
  def apply(
    chipSelectLineCount: Double,
    maxClockFrequency: Double,
    minClockFrequency: Double,
    supportedDataBitLengths: IVectorView[Double]
  ): SpiBusInfo = {
    val __obj = js.Dynamic.literal(chipSelectLineCount = chipSelectLineCount.asInstanceOf[js.Any], maxClockFrequency = maxClockFrequency.asInstanceOf[js.Any], minClockFrequency = minClockFrequency.asInstanceOf[js.Any], supportedDataBitLengths = supportedDataBitLengths.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpiBusInfo]
  }
}

