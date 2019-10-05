package typings.winrtDashUwp.Windows.Devices.Spi

import typings.winrtDashUwp.Windows.Devices.Spi.Provider.ISpiProvider
import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
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

/* static members */
@JSGlobal("Windows.Devices.Spi.SpiController")
@js.native
object SpiController extends js.Object {
  /**
    * Gets all the SPI controllers that are on the system.
    * @param provider The SPI provider for the controllers on the system.
    * @return When the method completes successfully, it returns a list of values that represent the available SPI controllers on the system.
    */
  def getControllersAsync(provider: ISpiProvider): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Gets the default SPI controller on the system.
    * @return The default SPI controller on the system, or null if the system has no SPI controller.
    */
  def getDefaultAsync(): IPromiseWithIAsyncOperation[SpiController] = js.native
}

