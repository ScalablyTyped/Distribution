package typings.winrtDashUwp.Windows.Devices.Gpio

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
  sealed trait high extends GpioPinValue
  
  /** The value of the GPIO pin is low. */
  @js.native
  sealed trait low extends GpioPinValue
  
  /* 1 */ val high: typings.winrtDashUwp.Windows.Devices.Gpio.GpioPinValue.high with Double = js.native
  /* 0 */ val low: typings.winrtDashUwp.Windows.Devices.Gpio.GpioPinValue.low with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GpioPinValue with Double] = js.native
}

