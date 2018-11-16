package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.GpioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data about the GpioPin.ValueChanged event that occurs when the value of the general-purpose I/O (GPIO) pin changes, either because of an external stimulus when the pin is configured as an input, or when a value is written to the pin when the pin in configured as an output. */
@JSGlobal("Windows.Devices.Gpio.GpioPinValueChangedEventArgs")
@js.native
abstract class GpioPinValueChangedEventArgs () extends js.Object {
  /** Gets the type of change that occurred to the value of the general-purpose I/O (GPIO) pin for the GpioPin.ValueChanged event. */
  var edge: GpioPinEdge = js.native
}

