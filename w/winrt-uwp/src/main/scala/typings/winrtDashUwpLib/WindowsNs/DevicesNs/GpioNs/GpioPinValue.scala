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
  
  val high: high with java.lang.String = js.native
  val low: low with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.GpioNs.GpioPinValue with java.lang.String] = js.native
}

