package typings.winrtDashUwp.Windows.Devices.Gpio

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GpioOpenStatus extends js.Object

/** Describes the possible results of opening a pin with the GpioPin.TryOpenPin method. */
@JSGlobal("Windows.Devices.Gpio.GpioOpenStatus")
@js.native
object GpioOpenStatus extends js.Object {
  /** The GPIO pin was successfully opened. */
  @js.native
  sealed trait pinOpened extends GpioOpenStatus
  
  /** The pin is reserved by the system and is not available to apps that run in user mode. */
  @js.native
  sealed trait pinUnavailable extends GpioOpenStatus
  
  /** The pin is currently open in an incompatible sharing mode. For example: */
  @js.native
  sealed trait sharingViolation extends GpioOpenStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GpioOpenStatus with Double] = js.native
  /* 0 */ @js.native
  object pinOpened extends TopLevel[pinOpened with Double]
  
  /* 1 */ @js.native
  object pinUnavailable extends TopLevel[pinUnavailable with Double]
  
  /* 2 */ @js.native
  object sharingViolation extends TopLevel[sharingViolation with Double]
  
}

