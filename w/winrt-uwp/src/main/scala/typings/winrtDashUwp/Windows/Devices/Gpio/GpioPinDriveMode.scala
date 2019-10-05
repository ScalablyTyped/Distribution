package typings.winrtDashUwp.Windows.Devices.Gpio

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
  sealed trait input extends GpioPinDriveMode
  
  /** Configures the GPIO pin as high impedance with a pull-down resistor to ground. */
  @js.native
  sealed trait inputPullDown extends GpioPinDriveMode
  
  /** Configures the GPIO pin as high impedance with a pull-up resistor to the voltage charge connection (VCC). */
  @js.native
  sealed trait inputPullUp extends GpioPinDriveMode
  
  /** Configures the GPIO pin in strong drive mode, with low impedance. */
  @js.native
  sealed trait output extends GpioPinDriveMode
  
  /** Configures the GPIO in open drain mode. */
  @js.native
  sealed trait outputOpenDrain extends GpioPinDriveMode
  
  /** Configures the GPIO pin in open drain mode with resistive pull-up mode. */
  @js.native
  sealed trait outputOpenDrainPullUp extends GpioPinDriveMode
  
  /** Configures the GPIO pin in open collector mode. */
  @js.native
  sealed trait outputOpenSource extends GpioPinDriveMode
  
  /** Configures the GPIO pin in open collector mode with resistive pull-down mode. */
  @js.native
  sealed trait outputOpenSourcePullDown extends GpioPinDriveMode
  
  /* 0 */ val input: typings.winrtDashUwp.Windows.Devices.Gpio.GpioPinDriveMode.input with Double = js.native
  /* 3 */ val inputPullDown: typings.winrtDashUwp.Windows.Devices.Gpio.GpioPinDriveMode.inputPullDown with Double = js.native
  /* 2 */ val inputPullUp: typings.winrtDashUwp.Windows.Devices.Gpio.GpioPinDriveMode.inputPullUp with Double = js.native
  /* 1 */ val output: typings.winrtDashUwp.Windows.Devices.Gpio.GpioPinDriveMode.output with Double = js.native
  /* 4 */ val outputOpenDrain: typings.winrtDashUwp.Windows.Devices.Gpio.GpioPinDriveMode.outputOpenDrain with Double = js.native
  /* 5 */ val outputOpenDrainPullUp: typings.winrtDashUwp.Windows.Devices.Gpio.GpioPinDriveMode.outputOpenDrainPullUp with Double = js.native
  /* 6 */ val outputOpenSource: typings.winrtDashUwp.Windows.Devices.Gpio.GpioPinDriveMode.outputOpenSource with Double = js.native
  /* 7 */ val outputOpenSourcePullDown: typings.winrtDashUwp.Windows.Devices.Gpio.GpioPinDriveMode.outputOpenSourcePullDown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GpioPinDriveMode with Double] = js.native
}

