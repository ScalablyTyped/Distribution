package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.GpioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GpioPinValue extends js.Object

/** Describes the possible values for a general-purpose I/O (GPIO) pin. */
@JSGlobal("Windows.Devices.Gpio.GpioPinValue")
@js.native
object GpioPinValue extends js.Object {
  /** The value of the GPIO pin is high. */
  @js.native
  sealed trait high
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GpioNs.GpioPinValue
  
  /** The value of the GPIO pin is low. */
  @js.native
  sealed trait low
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GpioNs.GpioPinValue
  
  /* 1 */ val high: high with scala.Double = js.native
  /* 0 */ val low: low with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.GpioNs.GpioPinValue with scala.Double] = js.native
}

