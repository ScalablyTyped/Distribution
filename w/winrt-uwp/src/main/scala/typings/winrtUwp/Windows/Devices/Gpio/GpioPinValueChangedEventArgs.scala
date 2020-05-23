package typings.winrtUwp.Windows.Devices.Gpio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data about the GpioPin.ValueChanged event that occurs when the value of the general-purpose I/O (GPIO) pin changes, either because of an external stimulus when the pin is configured as an input, or when a value is written to the pin when the pin in configured as an output. */
trait GpioPinValueChangedEventArgs extends js.Object {
  /** Gets the type of change that occurred to the value of the general-purpose I/O (GPIO) pin for the GpioPin.ValueChanged event. */
  var edge: GpioPinEdge
}

object GpioPinValueChangedEventArgs {
  @scala.inline
  def apply(edge: GpioPinEdge): GpioPinValueChangedEventArgs = {
    val __obj = js.Dynamic.literal(edge = edge.asInstanceOf[js.Any])
    __obj.asInstanceOf[GpioPinValueChangedEventArgs]
  }
}

