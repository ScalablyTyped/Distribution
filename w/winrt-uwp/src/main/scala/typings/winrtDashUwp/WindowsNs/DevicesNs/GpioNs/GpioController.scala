package typings.winrtDashUwp.WindowsNs.DevicesNs.GpioNs

import typings.winrtDashUwp.Anon_OpenStatus
import typings.winrtDashUwp.WindowsNs.DevicesNs.GpioNs.ProviderNs.IGpioProvider
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the default general-purpose I/O (GPIO) controller for the system. */
@JSGlobal("Windows.Devices.Gpio.GpioController")
@js.native
abstract class GpioController () extends js.Object {
  /** Gets the number of pins on the general-purpose I/O (GPIO) controller. */
  var pinCount: Double = js.native
  /**
    * Opens a connection to the specified general-purpose I/O (GPIO) pin in exclusive mode.
    * @param pinNumber The pin number of the GPIO pin that you want to open. Some pins may not be available in user mode. For information about how the pin numbers correspond to physical pins, see the documentation for your circuit board.
    * @return The opened GPIO pin.
    */
  def openPin(pinNumber: Double): GpioPin = js.native
  /**
    * Opens the specified general-purpose I/O (GPIO) pin in the specified mode.
    * @param pinNumber The pin number of the GPIO pin that you want to open. Some pins may not be available in user mode. For information about how the pin numbers correspond to physical pins, see the documentation for your circuit board.
    * @param sharingMode The mode in which you want to open the GPIO pin, which determines whether other connections to the pin can be opened while you have the pin open.
    * @return The opened GPIO pin.
    */
  def openPin(pinNumber: Double, sharingMode: GpioSharingMode): GpioPin = js.native
  /**
    * Opens the specified general-purpose I/O (GPIO) pin in the specified mode, and gets a status value that you can use to handle a failure to open the pin programmatically.
    * @param pinNumber The pin number of the GPIO pin that you want to open. Some pins may not be available in user mode. For information about how the pin numbers correspond to physical pins, see the documentation for your circuit board.
    * @param sharingMode The mode in which you want to open the GPIO pin, which determines whether other connections to the pin can be opened while you have the pin open.
    */
  def tryOpenPin(pinNumber: Double, sharingMode: GpioSharingMode): Anon_OpenStatus = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Gpio.GpioController")
@js.native
object GpioController extends js.Object {
  /**
    * Gets all the controllers that are connected to the system asynchronously.
    * @param provider The GPIO provider for the controllers on the system.
    * @return When the method completes successfully, it returns a list of values that represent the controllers available on the system.
    */
  def getControllersAsync(provider: IGpioProvider): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Gets the default general-purpose I/O (GPIO) controller for the system.
    * @return The default GPIO controller for the system, or null if the system has no GPIO controller.
    */
  def getDefault(): GpioController = js.native
  /**
    * Gets the default general-purpose I/O (GPIO) controller for the system.
    * @return The default GPIO controller for the system, or null if the system has no GPIO controller.
    */
  def getDefaultAsync(): IPromiseWithIAsyncOperation[GpioController] = js.native
}

