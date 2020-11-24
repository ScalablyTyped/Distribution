package typings.winrtUwp.Windows.Devices.Gpio

import typings.winrtUwp.anon.OpenStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the default general-purpose I/O (GPIO) controller for the system. */
@js.native
trait GpioController extends js.Object {
  
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
  
  /** Gets the number of pins on the general-purpose I/O (GPIO) controller. */
  var pinCount: Double = js.native
  
  /**
    * Opens the specified general-purpose I/O (GPIO) pin in the specified mode, and gets a status value that you can use to handle a failure to open the pin programmatically.
    * @param pinNumber The pin number of the GPIO pin that you want to open. Some pins may not be available in user mode. For information about how the pin numbers correspond to physical pins, see the documentation for your circuit board.
    * @param sharingMode The mode in which you want to open the GPIO pin, which determines whether other connections to the pin can be opened while you have the pin open.
    */
  def tryOpenPin(pinNumber: Double, sharingMode: GpioSharingMode): OpenStatus = js.native
}
