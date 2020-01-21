package typings.winrtUwp.Windows.Devices.Spi

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the info about a SPI bus. */
@JSGlobal("Windows.Devices.Spi.SpiBusInfo")
@js.native
abstract class SpiBusInfo () extends js.Object {
  /** Gets the number of chip select lines available on the bus. */
  var chipSelectLineCount: Double = js.native
  /** Maximum clock cycle frequency of the bus. */
  var maxClockFrequency: Double = js.native
  /** Minimum clock cycle frequency of the bus. */
  var minClockFrequency: Double = js.native
  /** Gets the bit lengths that can be used on the bus for transmitting data. */
  var supportedDataBitLengths: IVectorView[Double] = js.native
}

