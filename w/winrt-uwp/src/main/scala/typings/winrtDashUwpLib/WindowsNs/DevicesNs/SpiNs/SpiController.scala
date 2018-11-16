package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SpiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the SPI controller on the system. */
@JSGlobal("Windows.Devices.Spi.SpiController")
@js.native
abstract class SpiController () extends js.Object {
  /**
                   * Gets the SPI device with the specified settings.
                   * @param settings The desired connection settings.
                   * @return The SPI device.
                   */
  def getDevice(settings: SpiConnectionSettings): SpiDevice = js.native
}

/** Represents the SPI controller on the system. */
@JSGlobal("Windows.Devices.Spi.SpiController")
@js.native
object SpiController extends js.Object {
  /**
                   * Gets all the SPI controllers that are on the system.
                   * @param provider The SPI provider for the controllers on the system.
                   * @return When the method completes successfully, it returns a list of values that represent the available SPI controllers on the system.
                   */
  def getControllersAsync(provider: winrtDashUwpLib.WindowsNs.DevicesNs.SpiNs.ProviderNs.ISpiProvider): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
                   * Gets the default SPI controller on the system.
                   * @return The default SPI controller on the system, or null if the system has no SPI controller.
                   */
  def getDefaultAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.SpiNs.SpiController] = js.native
}

