package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.GpioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GpioPinDriveMode extends js.Object

/** Describes whether a general-purpose I/O (GPIO) pin is configured as an input or an output, and how values are driven onto the pin. */
@JSGlobal("Windows.Devices.Gpio.GpioPinDriveMode")
@js.native
object GpioPinDriveMode extends js.Object {
  /** Configures the GPIO pin in floating mode, with high impedance. */
  @js.native
  sealed trait input
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GpioNs.GpioPinDriveMode
  
  /** Configures the GPIO pin as high impedance with a pull-down resistor to ground. */
  @js.native
  sealed trait inputPullDown
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GpioNs.GpioPinDriveMode
  
  /** Configures the GPIO pin as high impedance with a pull-up resistor to the voltage charge connection (VCC). */
  @js.native
  sealed trait inputPullUp
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GpioNs.GpioPinDriveMode
  
  /** Configures the GPIO pin in strong drive mode, with low impedance. */
  @js.native
  sealed trait output
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GpioNs.GpioPinDriveMode
  
  /** Configures the GPIO in open drain mode. */
  @js.native
  sealed trait outputOpenDrain
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GpioNs.GpioPinDriveMode
  
  /** Configures the GPIO pin in open drain mode with resistive pull-up mode. */
  @js.native
  sealed trait outputOpenDrainPullUp
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GpioNs.GpioPinDriveMode
  
  /** Configures the GPIO pin in open collector mode. */
  @js.native
  sealed trait outputOpenSource
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GpioNs.GpioPinDriveMode
  
  /** Configures the GPIO pin in open collector mode with resistive pull-down mode. */
  @js.native
  sealed trait outputOpenSourcePullDown
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GpioNs.GpioPinDriveMode
  
  val input: input with java.lang.String = js.native
  val inputPullDown: inputPullDown with java.lang.String = js.native
  val inputPullUp: inputPullUp with java.lang.String = js.native
  val output: output with java.lang.String = js.native
  val outputOpenDrain: outputOpenDrain with java.lang.String = js.native
  val outputOpenDrainPullUp: outputOpenDrainPullUp with java.lang.String = js.native
  val outputOpenSource: outputOpenSource with java.lang.String = js.native
  val outputOpenSourcePullDown: outputOpenSourcePullDown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.GpioNs.GpioPinDriveMode with java.lang.String
  ] = js.native
}

