package typings.winrtUwp.Windows.Devices.Spi

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the info about a SPI bus. */
@js.native
trait SpiBusInfo extends js.Object {
  /** Gets the number of chip select lines available on the bus. */
  var chipSelectLineCount: Double = js.native
  /** Maximum clock cycle frequency of the bus. */
  var maxClockFrequency: Double = js.native
  /** Minimum clock cycle frequency of the bus. */
  var minClockFrequency: Double = js.native
  /** Gets the bit lengths that can be used on the bus for transmitting data. */
  var supportedDataBitLengths: IVectorView[Double] = js.native
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
  @scala.inline
  implicit class SpiBusInfoOps[Self <: SpiBusInfo] (val x: Self) extends AnyVal {
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
    def setChipSelectLineCount(value: Double): Self = this.set("chipSelectLineCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxClockFrequency(value: Double): Self = this.set("maxClockFrequency", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinClockFrequency(value: Double): Self = this.set("minClockFrequency", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportedDataBitLengths(value: IVectorView[Double]): Self = this.set("supportedDataBitLengths", value.asInstanceOf[js.Any])
  }
  
}

