package typings.winrtUwp.Windows.Devices.Gpio

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GpioPinDriveMode with Double] = js.native
  /* 0 */ @js.native
  object input extends TopLevel[input with Double]
  
  /* 3 */ @js.native
  object inputPullDown extends TopLevel[inputPullDown with Double]
  
  /* 2 */ @js.native
  object inputPullUp extends TopLevel[inputPullUp with Double]
  
  /* 1 */ @js.native
  object output extends TopLevel[output with Double]
  
  /* 4 */ @js.native
  object outputOpenDrain extends TopLevel[outputOpenDrain with Double]
  
  /* 5 */ @js.native
  object outputOpenDrainPullUp extends TopLevel[outputOpenDrainPullUp with Double]
  
  /* 6 */ @js.native
  object outputOpenSource extends TopLevel[outputOpenSource with Double]
  
  /* 7 */ @js.native
  object outputOpenSourcePullDown extends TopLevel[outputOpenSourcePullDown with Double]
  
}

