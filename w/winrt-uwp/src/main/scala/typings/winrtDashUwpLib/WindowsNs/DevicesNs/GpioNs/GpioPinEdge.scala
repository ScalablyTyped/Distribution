package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.GpioNs

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
  sealed trait fallingEdge
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GpioNs.GpioPinEdge
  
  /** The value of the GPIO pin changed from low to high. */
  @js.native
  sealed trait risingEdge
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GpioNs.GpioPinEdge
  
  /* 0 */ val fallingEdge: fallingEdge with scala.Double = js.native
  /* 1 */ val risingEdge: risingEdge with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.GpioNs.GpioPinEdge with scala.Double] = js.native
}

