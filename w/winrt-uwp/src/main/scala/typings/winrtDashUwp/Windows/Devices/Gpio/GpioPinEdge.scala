package typings.winrtDashUwp.Windows.Devices.Gpio

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.Gpio.GpioPinEdge.fallingEdge
import typings.winrtDashUwp.Windows.Devices.Gpio.GpioPinEdge.risingEdge
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GpioPinEdge with Double] = js.native
  /* 0 */ @js.native
  object fallingEdge extends TopLevel[fallingEdge with Double]
  
  /* 1 */ @js.native
  object risingEdge extends TopLevel[risingEdge with Double]
  
}

