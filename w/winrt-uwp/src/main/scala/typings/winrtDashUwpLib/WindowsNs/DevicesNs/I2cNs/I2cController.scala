package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.I2cNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the I²C controller for the system. */
@JSGlobal("Windows.Devices.I2c.I2cController")
@js.native
abstract class I2cController () extends js.Object {
  /**
    * Gets the I²C device with the specified settings.
    * @param settings The desired connection settings.
    * @return The I²C device.
    */
  def getDevice(settings: I2cConnectionSettings): I2cDevice = js.native
}

/* static members */
@JSGlobal("Windows.Devices.I2c.I2cController")
@js.native
object I2cController extends js.Object {
  /**
    * Gets all the I²C controllers that are on the system.
    * @param provider The I²C provider for the controllers on the system.
    * @return When the method completes successfully, it returns a list of values that represent the available I²C controllers on the system.
    */
  def getControllersAsync(provider: winrtDashUwpLib.WindowsNs.DevicesNs.I2cNs.ProviderNs.II2cProvider): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
    * Gets the default I²C controller on the system.
    * @return The default I²C controller on the system, or null if the system has no I²C controller.
    */
  def getDefaultAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.I2cNs.I2cController] = js.native
}

