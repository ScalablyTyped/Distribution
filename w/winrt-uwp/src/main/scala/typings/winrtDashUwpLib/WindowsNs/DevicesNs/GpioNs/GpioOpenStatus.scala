package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.GpioNs

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
  sealed trait pinOpened
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GpioNs.GpioOpenStatus
  
  /** The pin is reserved by the system and is not available to apps that run in user mode. */
  @js.native
  sealed trait pinUnavailable
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GpioNs.GpioOpenStatus
  
  /** The pin is currently open in an incompatible sharing mode. For example: */
  @js.native
  sealed trait sharingViolation
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GpioNs.GpioOpenStatus
  
  val pinOpened: pinOpened with java.lang.String = js.native
  val pinUnavailable: pinUnavailable with java.lang.String = js.native
  val sharingViolation: sharingViolation with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.GpioNs.GpioOpenStatus with java.lang.String] = js.native
}

