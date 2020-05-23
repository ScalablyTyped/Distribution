package typings.winrtUwp.Windows.Devices.Gpio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GpioPinEdge extends js.Object

/** Describes the possible types of change that can occur to the value of the general-purpose I/O (GPIO) pin for the GpioPin.ValueChanged event. */
@JSGlobal("Windows.Devices.Gpio.GpioPinEdge")
@js.native
object GpioPinEdge extends js.Object {
  /** The value of the GPIO pin changed from high to low. */
  @js.native
  sealed trait fallingEdge extends GpioPinEdge
  
  /** The value of the GPIO pin changed from low to high. */
  @js.native
  sealed trait risingEdge extends GpioPinEdge
  
}

