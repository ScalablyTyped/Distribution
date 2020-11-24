package typings.winrtUwp.Windows.Devices.Gpio

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.valuechanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a general-purpose I/O (GPIO) pin. */
@js.native
trait GpioPin extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valuechanged(`type`: valuechanged, listener: TypedEventHandler[GpioPin, GpioPinValueChangedEventArgs]): Unit = js.native
  
  /** Closes the general-purpose I/O (GPIO) pin and releases the resources associated with it. */
  def close(): Unit = js.native
  
  /** Gets or sets the debounce timeout for the general-purpose I/O (GPIO) pin, which is an interval during which changes to the value of the pin are filtered out and do not generate ValueChanged events. */
  var debounceTimeout: Double = js.native
  
  /**
    * Gets the current drive mode for the general-purpose I/O (GPIO) pin. The drive mode specifies whether the pin is configured as an input or an output, and determines how values are driven onto the pin.
    * @return An enumeration value that indicates the current drive mode for the GPIO pin. The drive mode specifies whether the pin is configured as an input or an output, and determines how values are driven onto the pin.
    */
  def getDriveMode(): GpioPinDriveMode = js.native
  
  /**
    * Gets whether the general-purpose I/O (GPIO) pin supports the specified drive mode.
    * @param driveMode The drive mode that you want to check for support.
    * @return True if the GPIO pin supports the drive mode that driveMode specifies; otherwise false. If you specify a drive mode for which this method returns false when you call SetDriveMode , SetDriveMode generates an exception.
    */
  def isDriveModeSupported(driveMode: GpioPinDriveMode): Boolean = js.native
  
  /** Occurs when the value of the general-purpose I/O (GPIO) pin changes, either because of an external stimulus when the pin is configured as an input, or when a value is written to the pin when the pin in configured as an output. */
  def onvaluechanged(ev: GpioPinValueChangedEventArgs with WinRTEvent[GpioPin]): Unit = js.native
  /** Occurs when the value of the general-purpose I/O (GPIO) pin changes, either because of an external stimulus when the pin is configured as an input, or when a value is written to the pin when the pin in configured as an output. */
  @JSName("onvaluechanged")
  var onvaluechanged_Original: TypedEventHandler[GpioPin, GpioPinValueChangedEventArgs] = js.native
  
  /** Gets the pin number of the general-purpose I/O (GPIO) pin. */
  var pinNumber: Double = js.native
  
  /**
    * Reads the current value of the general-purpose I/O (GPIO) pin.
    * @return The current value of the GPIO pin. If the pin is configured as an output, this value is the last value written to the pin.
    */
  def read(): GpioPinValue = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_valuechanged(`type`: valuechanged, listener: TypedEventHandler[GpioPin, GpioPinValueChangedEventArgs]): Unit = js.native
  
  /**
    * Sets the drive mode of the general-purpose I/O (GPIO) pin. The drive mode specifies whether the pin is configured as an input or an output, and determines how values are driven onto the pin.
    * @param value An enumeration value that specifies drive mode to use for the GPIO pin. The drive mode specifies whether the pin is configured as an input or an output, and determines how values are driven onto the pin.
    */
  def setDriveMode(value: GpioPinDriveMode): Unit = js.native
  
  /** Gets the sharing mode in which the general-purpose I/O (GPIO) pin is open. */
  var sharingMode: GpioSharingMode = js.native
  
  /**
    * Drives the specified value onto the general purpose I/O (GPIO) pin according to the current drive mode for the pin if the pin is configured as an output, or updates the latched output value for the pin if the pin is configured as an input.
    * @param value The enumeration value to write to the GPIO pin.
    */
  def write(value: GpioPinValue): Unit = js.native
}
